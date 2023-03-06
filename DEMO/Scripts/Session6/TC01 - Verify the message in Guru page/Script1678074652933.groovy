import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

'1.Open Guru demo'

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://demo.guru99.com/v4/')

'2. Click here at the bottom of the page'
WebUI.click(findTestObject('Object Repository/Session6/Bai1/href_here'))

'3. Input email ID'
WebUI.setText(findTestObject('Object Repository/Session6/Bai1/txt_emailID'), 'test@gmail.com')

'4. CLick SUbmit button'

WebUI.click(findTestObject('Object Repository/Session6/Bai1/btn_submit'))

WebUI.takeScreenshot()

'5. Get UserID and password'
String userID = WebUI.getText(findTestObject('Object Repository/Session6/Bai1/text_userID'))
String password = WebUI.getText(findTestObject('Object Repository/Session6/Bai1/text_pass'))

//WebUI.getText(findTestObject('Object Repository/Session6/Bai1/text_userID'))
//WebUI.getText(findTestObject('Object Repository/Session6/Bai1/text_pass'))


'6. Navigate to url guru again'

WebUI.navigateToUrl('https://demo.guru99.com/v4/')

'7. Input userId and pass at step 5'
WebUI.setText(findTestObject('Object Repository/Session6/Bai1/txt_username'), userID)

WebUI.setText(findTestObject('Object Repository/Session6/Bai1/txt_password'), password)

WebUI.click(findTestObject('Object Repository/Session6/Bai1/btn_Login'))

'8. Verify message display'

WebUI.verifyElementText(findTestObject('Object Repository/Session6/Bai1/text_title'), "Welcome To Manager's Page of Guru99 Bank")
	
'9. Close browers'

WebUI.closeBrowser()
