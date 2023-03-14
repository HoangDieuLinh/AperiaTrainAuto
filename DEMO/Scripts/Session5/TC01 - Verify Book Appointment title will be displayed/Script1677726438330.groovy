import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://katalon-demo-cura.herokuapp.com/profile.php#login')

WebUI.setText(findTestObject('Session5/Login_TC01/txt_username'), 'John Doe')

WebUI.setText(findTestObject('Session5/Login_TC01/txt_password'), 'ThisIsNotAPassword')

WebUI.click(findTestObject('Session5/Login_TC01/btn_login'))

WebUI.verifyTextPresent('Book Appointment', false)

WebUI.closeBrowser()

