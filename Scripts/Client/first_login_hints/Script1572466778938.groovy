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

WebUI.click(findTestObject('Admin/Admin Sidebar Elements/wlcm_menu_link'))

WebUI.switchToFrame(findTestObject('Admin/First Login hints/intercom_tour_frame'), 0)

WebUI.click(findTestObject('Admin/First Login hints/hint_next_btn'))

WebUI.switchToFrame(findTestObject('Admin/First Login hints/intercom_tour_frame'), 0)

WebUI.click(findTestObject('Admin/First Login hints/hint_next_btn'))

WebUI.switchToFrame(findTestObject('Admin/First Login hints/intercom_tour_frame'), 0)

WebUI.click(findTestObject('Admin/First Login hints/hint_next_btn'))

WebUI.switchToFrame(findTestObject('Admin/First Login hints/intercom_tour_frame'), 0)

WebUI.click(findTestObject('Admin/First Login hints/hint_next_btn'))

WebUI.click(findTestObject('Admin/Welcome Page/wlcm_first_course'))

