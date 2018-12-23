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

WebUI.openBrowser('')

WebUI.click(findTestObject('Object Repository/testsubexpert/Page_Subject Expert/a_Login'))

WebUI.setText(findTestObject('Object Repository/testsubexpert/Page_Subject Expert/input_User Name_UserName'), 'qasimkhan')

WebUI.setEncryptedText(findTestObject('Object Repository/testsubexpert/Page_Subject Expert/input_Password_Password'), 'oj0MJgtjbwJPbPub/UXb6Q==')

WebUI.click(findTestObject('Object Repository/testsubexpert/Page_Subject Expert/input_Remember Me_w3-btn w3-pa'))

WebUI.click(findTestObject('Object Repository/testsubexpert/Page_/input_Remember Me_w3-btn w3-pa'))

WebUI.click(findTestObject('Object Repository/testsubexpert/Page_/input_Password_w3-check'))

WebUI.click(findTestObject('Object Repository/testsubexpert/Page_/input_Remember Me_w3-btn w3-pa'))

WebUI.setText(findTestObject('Object Repository/testsubexpert/Page_/input_User Name_UserName'), 'dasdasdasdwsws')

WebUI.click(findTestObject('Object Repository/testsubexpert/Page_/input_Remember Me_w3-btn w3-pa'))

