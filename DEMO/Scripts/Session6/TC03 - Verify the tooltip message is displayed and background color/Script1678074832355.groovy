import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import common.Color


'1. Navigate to url: https://atlassian.design/components/tooltip/examples'
WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://atlassian.design/components/tooltip/examples')

'2. Hovering to button'

WebUI.mouseOver(findTestObject('Object Repository/Session6/Bai3/btn_hover'))


'3. Verify the tooltip"s message is displayed'

id = WebUI.getAttribute(findTestObject('Object Repository/Session6/Bai3/btn_hover'), 'aria-describedby')

println id

WebUI.verifyElementText(findTestObject('Object Repository/Session6/Bai3/text_tooltips',['idOfTooltip':id]), 'Hello World')

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


WebUI.wait

