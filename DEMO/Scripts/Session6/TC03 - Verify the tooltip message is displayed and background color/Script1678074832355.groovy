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

import common.Color
import internal.GlobalVariable as GlobalVariable


'1. Navigate to url: https://atlassian.design/components/tooltip/examples'
WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://atlassian.design/components/tooltip/examples')

'2. Hovering to button'

WebUI.mouseOver(findTestObject('Object Repository/Session6/Bai3/btn_hover'))

'3. Verify the tooltip"s message is displayed'

WebUI.verifyElementVisible(findTestObject('Object Repository/Session6/Bai3/text_tooltips'), FailureHandling.STOP_ON_FAILURE)

'4. Get background of button when hovering'

String backgroundColor = WebUI.getCSSValue(findTestObject('Object Repository/Session6/Bai3/btn_hover'), 'background')
println backgroundColor

//Convert baclground color
String newbackgroundColor = Color.convertRGBAToHex(backgroundColor)
println newbackgroundColor

'5. Verify background after hover is displayed correctly'

WebUI.verifyEqual(newbackgroundColor, '#0065ff')

WebUI.delay(5)

//close browser

WebUI.closeBrowser()

