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

'Выбрать Тарифный план с именем tarif'
WebUI.click(findTestObject('Customer/Main page/Settings/select_paid_plan_name_tarif'))

'Подписаться'
WebUI.click(findTestObject('Customer/Main page/Settings/settings_subscribe_btn'))

'Номер карты'
WebUI.setText(findTestObject('Customer/Main page/Settings/Tinkoff/tinkoff_cc_number_field'), '4300000000000777')

'Дата окончания карты'
WebUI.setText(findTestObject('Customer/Main page/Settings/Tinkoff/tinkoff_exp_date_field'), '1221')

'CVV код'
WebUI.setText(findTestObject('Customer/Main page/Settings/Tinkoff/tinkoff_cvc_field'), '111')

'Оплатить'
WebUI.click(findTestObject('Customer/Main page/Settings/Tinkoff/tinkoff_pay_btn'))

'Проверить наличие ссылки на appstore'
WebUI.verifyElementVisible(findTestObject('Customer/Main page/Settings/successful_payment_appstore_btn'))

'Проверить наличие ссылки на play market'
WebUI.verifyElementVisible(findTestObject('Customer/Main page/Settings/successful_payment_android_btn'))

'Вернуться в школу'
WebUI.click(findTestObject('Customer/Main page/Settings/successful_payment_open_scool_btn'))

