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

'Меню подписки'
WebUI.click(findTestObject('Admin/Admin Sidebar Elements/Subscribtions/subscription_menu'))

'Создать тарифный план'
WebUI.click(findTestObject('Admin/Admin Sidebar Elements/Subscribtions/create_subscription_btn'))

'Название тарифа'
WebUI.setText(findTestObject('Admin/Admin Sidebar Elements/Subscribtions/subscription_tarif_name_field'), 'Tarif')

'Активировать тарифный план'
WebUI.click(findTestObject('Admin/Admin Sidebar Elements/Subscribtions/subscription_active_inactive_switcher'))

'Сохранить тариф'
WebUI.click(findTestObject('Admin/Admin Sidebar Elements/Subscribtions/subscription_tarif_save_btn'))

