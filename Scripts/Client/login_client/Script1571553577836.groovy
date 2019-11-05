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

'Запуск браузера'
WebUI.openBrowser('https://app.staging.gurucan.ru/admin/login')

'Открыть на весь экран'
WebUI.maximizeWindow()

'Переход по ссылке'
WebUI.navigateToUrl('https://app.staging.gurucan.ru/admin/login')

'Логин юзера'
WebUI.setText(findTestObject('Admin/Admin Login Page/login_email_field'), 'tigobi4500@dmailpro.net')

'Пароль'
WebUI.setEncryptedText(findTestObject('Admin/Admin Login Page/login_pass_field'), '8chwvGYzQjDjBqJR/GXC+g==')

'Домен'
WebUI.setText(findTestObject('Admin/Admin Login Page/login_domain_field'), 'tigobi')

'Кнопка вход'
WebUI.click(findTestObject('Admin/Admin Login Page/login_button'))

