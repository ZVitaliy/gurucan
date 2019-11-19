import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

'Развернуть меню'
WebUI.click(findTestObject('Admin/Admin Sidebar Elements/Content Management/expand_collaps_menu'))

'Меню Марафоны'
WebUI.click(findTestObject('Admin/Admin Sidebar Elements/Content Management/Marathons/submenu_marathons'))

'Создать марафон'
WebUI.click(findTestObject('Admin/Admin Sidebar Elements/Content Management/Marathons/marathon_create_btn'))

'Название марафона'
WebUI.setText(findTestObject('Admin/Admin Sidebar Elements/Content Management/Marathons/marathon_name_field'), 'New Marathon')

'Добавить задание'
WebUI.mouseOver(findTestObject('Admin/Admin Sidebar Elements/Content Management/Marathons/marathon_add_task_btn'))

'Добавить урок'
WebUI.click(findTestObject('Admin/Admin Sidebar Elements/Content Management/Marathons/Lesson/marathon_add_lesson_btn'))

'Название урока'
WebUI.setText(findTestObject('Admin/Admin Sidebar Elements/Content Management/Marathons/Lesson/marathon_lesson_name_field'), 
    'Exercise 1')

'Добавить блок'
WebUI.click(findTestObject('Admin/Admin Sidebar Elements/Content Management/Marathons/Lesson/marathon_lesson_add_block_btn'))

'Ютуб блок'
WebUI.click(findTestObject('Admin/Admin Sidebar Elements/Content Management/Marathons/Lesson/marathon_lesson_block_add_youtube_btn'))

'Ссылка на ютуб видео'
WebUI.setText(findTestObject('Admin/Admin Sidebar Elements/Content Management/Marathons/Lesson/marathon_lesson_block_add_youtube_link'), 
    'https://www.youtube.com/watch?v=fU2-ZJAtByg')

'Сохранить блок'
WebUI.click(findTestObject('Admin/Admin Sidebar Elements/Content Management/Marathons/Lesson/marathon_lesson_block_youtube_save_btn'))

'Сохранить Марафон'
WebUI.click(findTestObject('Admin/Admin Sidebar Elements/Content Management/Marathons/Lesson/marathon_lesson_save_btn'))

'Вернуться на страницу Марафона'
WebUI.click(findTestObject('Admin/Admin Sidebar Elements/Content Management/Marathons/marathon_breadcrumbs_link'))

'Сохранить Марафон'
WebUI.click(findTestObject('Admin/Admin Sidebar Elements/Content Management/Marathons/marathon_save_btn'))

