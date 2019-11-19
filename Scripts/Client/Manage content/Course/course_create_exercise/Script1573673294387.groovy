import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable

'Навести курсор Создать задание'
WebUI.mouseOver(findTestObject('Admin/Admin Sidebar Elements/Content Management/Courses/course_create_new_task_btn'))

'Кнопка Урок'
WebUI.click(findTestObject('Admin/Admin Sidebar Elements/Content Management/Courses/Lesson/course_add_lesson_btn'))

'Название урока'
WebUI.setText(findTestObject('Admin/Admin Sidebar Elements/Content Management/Courses/Lesson/lesson_name_field'), 'Exercise')

'Добавить блок'
WebUI.click(findTestObject('Admin/Admin Sidebar Elements/Content Management/Courses/Lesson/lesson_add_block'))

'Блок Ютуб видео'
WebUI.click(findTestObject('Admin/Admin Sidebar Elements/Content Management/Courses/Lesson/lesson_add_block_youtube_btn'))

'Вставить ссылку на ютуб видео'
WebUI.setText(findTestObject('Admin/Admin Sidebar Elements/Content Management/Courses/Lesson/lesson_block_youtube_link_field'), 
    'https://www.youtube.com/watch?v=z5vA9CwZKNY')

'Сохранить ссылку на видео'
WebUI.click(findTestObject('Admin/Admin Sidebar Elements/Content Management/Courses/Lesson/lesson_block_youtube_save_btn'))

'Опубликовать урок'
WebUI.click(findTestObject('Admin/Admin Sidebar Elements/Content Management/Courses/Lesson/lesson_publish_btn'))

'Вернуться на страницу курса по хлебным крошкам'
WebUI.click(findTestObject('Admin/Admin Sidebar Elements/Content Management/Courses/Lesson/lesson_breadcrumbs_back_to_course'))

'Сделать курс платным'
WebUI.click(findTestObject('Admin/Admin Sidebar Elements/Content Management/Courses/course_free_paid_switcher'))

'Опубликовать курс'
WebUI.click(findTestObject('Admin/Admin Sidebar Elements/Content Management/Courses/course_publish_btn'))

