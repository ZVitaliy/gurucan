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

'Создать свой первый курс'
WebUI.click(findTestObject('Admin/Welcome Page/wlcm_first_course'))

'Создать курс'
WebUI.click(findTestObject('Admin/Admin Sidebar Elements/Content Management/Courses/create_course_btn'))

'Подсказки по созданию курса'
WebUI.click(findTestObject('Admin/First Login hints/hint_next_btn'))

'Загрузить изображение'
WebUI.uploadFile(findTestObject('Admin/Admin Sidebar Elements/Content Management/Courses/course_image_uploader'), '/Users/macbookpro/Documents/gurucan/katalon/Gurucan Web/Files/announce_big_7.png')

'Название курса'
WebUI.setText(findTestObject('Admin/Admin Sidebar Elements/Content Management/Courses/course_name_field'), 'New course')

'Далее'
WebUI.click(findTestObject('Admin/First Login hints/hint_next_btn'))

'Описание курса'
WebUI.sendKeys(findTestObject('Admin/Admin Sidebar Elements/Content Management/Courses/course_description'), 'Some text')

WebUI.click(findTestObject('Admin/First Login hints/hint_next_btn'))

WebUI.click(findTestObject('Admin/First Login hints/hint_next_btn'))

'Подробное описание'
WebUI.sendKeys(findTestObject('Admin/Admin Sidebar Elements/Content Management/Courses/course_description_detailed'), 'Detailed description')

WebUI.click(findTestObject('Admin/First Login hints/hint_next_btn'))

WebUI.click(findTestObject('Admin/First Login hints/hint_next_btn'))

WebUI.click(findTestObject('Admin/First Login hints/hint_next_btn'))

WebUI.click(findTestObject('Admin/First Login hints/hint_next_btn'))

'Определить селектор!!! Создать новое задание'
WebUI.click(findTestObject('Admin/Admin Sidebar Elements/Content Management/Courses/course_create_new_task_btn'))

'Сохранить курс'
WebUI.click(findTestObject('Admin/Admin Sidebar Elements/Content Management/Courses/course_save_btn_bottom'))

WebUI.click(findTestObject('Admin/Admin Sidebar Elements/Content Management/Courses/course_done_btn'))

