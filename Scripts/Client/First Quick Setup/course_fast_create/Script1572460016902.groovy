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
import org.openqa.selenium.Keys as Keys
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

'Кнопка "Добро пожаловать"'
WebUI.click(findTestObject('Admin/Admin Sidebar Elements/wlcm_menu_link'))

'Создать свой первый курс'
WebUI.click(findTestObject('Admin/Welcome Page/wlcm_first_course'))

'Создать курс'
WebUI.click(findTestObject('Admin/Admin Sidebar Elements/Content Management/Courses/create_course_btn'))

'Название курса'
WebUI.setText(findTestObject('Admin/Admin Sidebar Elements/Content Management/Courses/course_name_field'), 'Free course')

'Сохранить курс'
WebUI.click(findTestObject('Admin/Admin Sidebar Elements/Content Management/Courses/course_save_btn'))

