import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.webui.common.WebUiCommonHelper
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import common.Utilities


//Open browser

WebUI.openBrowser('https://automationfc.github.io/multiple-fields/')

WebUI.maximizeWindow()

//Get total size
total = WebUiCommonHelper.findWebElements(findTestObject("Session7/Bai1/chk_all"), 10).size()

//get some random item
List <String> LstRandom = Utilities.getRandom(total, 4)

//Check random checkbox
for (String index in LstRandom)
WebUI.check(findTestObject("Session7/Bai1/chk_AllByIndex", ['index': index]))


//close browser
WebUI.closeBrowser()