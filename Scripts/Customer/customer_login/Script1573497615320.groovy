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

'Открыть браузер'
WebUI.openBrowser('')

'Развернуть окно'
WebUI.maximizeWindow()

'Перейти по ссылке'
WebUI.navigateToUrl('https://fibe.staging.gurucan.ru/')

'Логин'
WebUI.click(findTestObject('Customer/Lending page/lending_login_btn'))

'Имейл'
WebUI.setText(findTestObject('Customer/Lending page/login_page_email_field'), 'tahas40604@mailhub24.com')

'Пароль'
WebUI.setEncryptedText(findTestObject('Customer/Lending page/login_page_password_field'), 'nbPRAawFRnE=')

'Войти'
WebUI.click(findTestObject('Customer/Lending page/login_page_login_btn'))

