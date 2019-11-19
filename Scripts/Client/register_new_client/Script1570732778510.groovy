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

'Открыть браузер'
WebUI.openBrowser('')

'Перейти по ссылке'
WebUI.navigateToUrl('https://app.staging.gurucan.ru/admin/')

'Регистрация'
WebUI.click(findTestObject('Admin/Admin Login Page/login_signup_link'))

'Имя пользователя'
WebUI.setText(findTestObject('Admin/Admin Signup Page 1/signup_user_name_field'), 'Юзер')

'Имейл'
WebUI.setText(findTestObject('Admin/Admin Signup Page 1/signup_email_field'), 'unkle@ukr.net')

'Пароль'
WebUI.setEncryptedText(findTestObject('Admin/Admin Signup Page 1/signup_pass_field'), '8chwvGYzQjDjBqJR/GXC+g==')

'Пользовательское соглашение'
WebUI.click(findTestObject('Admin/Admin Signup Page 1/signup_agreement_checkbox'))

'Создать школу'
WebUI.click(findTestObject('Admin/Admin Signup Page 1/signup_creata_scool_btn'))

'Ожидание загрузки страницы'
WebUI.waitForPageLoad(1)

'Название школы'
WebUI.setText(findTestObject('Admin/Admin Signup Page 2/signup_scool_name_field'), 'Scool2')

'Зарегистрироваться'
WebUI.click(findTestObject('Admin/Admin Signup Page 2/signup_sign_button'))

'Ожидание загрузки страницы'
WebUI.waitForPageLoad(1)

