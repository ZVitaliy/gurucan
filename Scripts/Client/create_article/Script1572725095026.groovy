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
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

WebUI.click(findTestObject('Admin/Admin Sidebar Elements/wlcm_menu_link'))

WebUI.click(findTestObject('Admin/Admin Sidebar Elements/Content Management/Articles/submenu_articles'))

WebUI.click(findTestObject('Admin/Admin Sidebar Elements/Content Management/Articles/article_add_btn'))

WebUI.setText(findTestObject('Admin/Admin Sidebar Elements/Content Management/Articles/article_name_field'), 'New article')

WebUI.click(findTestObject('Admin/Admin Sidebar Elements/Content Management/Articles/article_add_block_btn'))

WebUI.click(findTestObject('Admin/Admin Sidebar Elements/Content Management/Articles/article_block_add_youtube_btn'))

WebUI.setText(findTestObject('Admin/Admin Sidebar Elements/Content Management/Articles/article_block_youtube_link'), 'https://www.youtube.com/watch?v=xf6lhjW21gU')

WebUI.click(findTestObject('Admin/Admin Sidebar Elements/Content Management/Articles/article_block_youtube_save_btn'))

WebUI.click(findTestObject('Admin/Admin Sidebar Elements/Content Management/Articles/article_save_btn'))

