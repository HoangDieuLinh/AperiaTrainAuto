import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

//Open browser
WebUI.openBrowser('https://demos.telerik.com/kendo-ui/dropdownlist/index')

WebUI.maximizeWindow()

//Click on dropdown list
WebUI.click(findTestObject("Object Repository/Session7/Bai2/dropd_SelectCategory"))

//Select value in dropdown

WebUI.click(findTestObject("Object Repository/Session7/Bai2/value_ByText", ['text' : 'Condiments']))

//Close browser

WebUI.closeBrowser()