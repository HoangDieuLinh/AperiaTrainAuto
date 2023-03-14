import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://the-internet.herokuapp.com/login')

WebUI.setText(findTestObject('Session5/Login_TC02/txt_username'), 'tomsmith')

WebUI.setText(findTestObject('Session5/Login_TC02/txt_password'), 'SuperSecretPassword!')

WebUI.click(findTestObject('Session5/Login_TC02/btn_Login'))

WebUI.verifyTextPresent('Welcome to the Secure Area. When you are done click logout below', false)

WebUI.closeBrowser()

