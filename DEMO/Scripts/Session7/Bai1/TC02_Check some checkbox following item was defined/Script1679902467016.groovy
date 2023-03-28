import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI


//prepare list data to check
List <String> listcheckbox = ["Anemia", "Emotional Disorder", "Digestive Problems"]

//Open URL

WebUI.openBrowser('https://automationfc.github.io/multiple-fields/')
WebUI.maximizeWindow()

//Check all checkbox
for (String item in listcheckbox)

WebUI.check(findTestObject("Session7/Bai1/chk_ByText", ['text': item ]))

//Delay 2 seconds
WebUI.delay(2)

//Close browser
WebUI.closeBrowser()