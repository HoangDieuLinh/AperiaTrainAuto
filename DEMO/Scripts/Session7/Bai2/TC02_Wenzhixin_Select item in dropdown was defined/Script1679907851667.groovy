import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

//Open browser

WebUI.openBrowser('https://multiple-select.wenzhixin.net.cn/templates/template.html?v=189&url=basic.html')
WebUI.maximizeWindow()

//Prepare some item
List <String> LstItems = ["January", "February", "April"]

//Click on multiple select dropdown control on Basic selection item
WebUI.click(findTestObject("Object Repository/Session7/Bai2/dropd_MultipleSelect"))

//Select item in dropdown base on prepared data at step2
for(String item in LstItems)

WebUI.click(findTestObject("Object Repository/Session7/Bai2/span_ByText", ['text': item]))

//Close browser
WebUI.closeBrowser()