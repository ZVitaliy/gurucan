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

'Развернуть меню "Управление контентом"'
WebUI.click(findTestObject('Admin/Admin Sidebar Elements/Content Management/expand_collaps_menu'))

'Субменю "Курсы"'
WebUI.click(findTestObject('Admin/Admin Sidebar Elements/Content Management/Courses/submenu_courses'))

'Поиск курса по названию "Test course"'
WebUI.click(findTestObject('Admin/Admin Sidebar Elements/Content Management/Courses/course_search_course_by_name_test_course'))

'Удалить курс'
WebUI.click(findTestObject('Admin/Admin Sidebar Elements/Content Management/Courses/course_delete_btn'))

'Подтвердить удаление'
WebUI.click(findTestObject('Admin/Admin Sidebar Elements/Content Management/Courses/course_modal_confirm_delete_btn'))

