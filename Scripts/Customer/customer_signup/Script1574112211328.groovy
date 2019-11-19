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

'Перейти по ссылке'
WebUI.navigateToUrl('https://fibe.staging.gurucan.ru')

'Развернуть окно'
WebUI.maximizeWindow()

'Логин кнопка'
WebUI.click(findTestObject('Customer/Lending page/lending_login_btn'))

'Перейти на вкладку регистрации'
WebUI.click(findTestObject('Customer/Main page/Login page/signup_page_signup_tab'))

'Имя пользователя'
WebUI.setText(findTestObject('Customer/Main page/Login page/signup_tab_name_field'), 'User')

'Имейл'
WebUI.setText(findTestObject('Customer/Main page/Login page/signup_tab_email_field'), 'autouser@mail.com')

'Пароль'
WebUI.setEncryptedText(findTestObject('Customer/Main page/Login page/signup_tab_password_field'), 'nbPRAawFRnE=')

'Зарегистрироваться'
WebUI.click(findTestObject('Customer/Main page/Login page/signup_tab_signup_btn'))

