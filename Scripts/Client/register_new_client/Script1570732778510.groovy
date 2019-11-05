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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://app.staging.gurucan.ru/admin/')

WebUI.click(findTestObject('Admin Login Page/login_signup_link'))

WebUI.setText(findTestObject('Admin Signup Page 1/signup_user_name_field'), 'Юзер')

WebUI.setText(findTestObject('Admin Signup Page 1/signup_email_field'), 'unkle@ukr.net')

WebUI.setEncryptedText(findTestObject('Admin Signup Page 1/signup_pass_field'), '8chwvGYzQjDjBqJR/GXC+g==')

WebUI.click(findTestObject('Admin Signup Page 1/signup_agreement_checkbox'))

WebUI.click(findTestObject('Admin Signup Page 1/signup_creata_scool_btn'))

WebUI.waitForPageLoad(1)

WebUI.setText(findTestObject('Admin Signup Page 2/signup_scool_name_field'), 'Scool2')

WebUI.click(findTestObject('Admin Signup Page 2/signup_sign_button'))

WebUI.waitForPageLoad(1)

