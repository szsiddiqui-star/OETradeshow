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
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://staging.orderease.show/')

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Tradeshow/Page_OrderEase Demo Trade Show - Staging/input_username'), 'tradeshowsupport71@orderease.com')

WebUI.click(findTestObject('Object Repository/Tradeshow/Page_OrderEase Demo Trade Show - Staging/button_Next'))

WebUI.setEncryptedText(findTestObject('Tradeshow/Page_OrderEase Demo Trade Show - Staging/input_password'), 'au+44PZCuB6jD3j2/4O4cQ==')

WebUI.click(findTestObject('Object Repository/Tradeshow/Page_OrderEase Demo Trade Show - Staging/button_Login'))

WebUI.click(findTestObject('Tradeshow/TS_Page_Navigation/img_Go to Tradeshow'))

not_run: WebUI.navigateToUrl('https://app.staging.orderease.show/tradeshow/dashboard')

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Tradeshow/Page_OrderEase/ion-item_5 Hour Energy'))

not_run: WebUI.click(findTestObject('Object Repository/Tradeshow/Page_OrderEase/ion-label_Booth Map'))

WebUI.click(findTestObject('Tradeshow/Page_OrderEase/ion-button_exist'))

WebUI.click(findTestObject('Tradeshow/TS_Page_Navigation/a_Log out'))

WebUI.closeBrowser()

