import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.webui.common.WebUiCommonHelper
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

//Open URL
WebUI.openBrowser('')
WebUI.maximizeWindow()

WebUI.navigateToUrl('https://automationfc.github.io/multiple-fields/')

//Get total checkbox to check

total = WebUiCommonHelper.findWebElements(findTestObject("Session7/Bai1/chk_all"), 10).size()

//Check all checkbox
for (int i=1; i<=total; i++)

WebUI.check(findTestObject("Session7/Bai1/chk_AllByIndex", ['index':i]))

//Delay 2 seconds
WebUI.delay(2)

//Uncheck all checkbox
for (int i=1; i<=total; i++)

WebUI.uncheck(findTestObject("Session7/Bai1/chk_AllByIndex", ['index':i]))

//Close browser
WebUI.closeBrowser()
