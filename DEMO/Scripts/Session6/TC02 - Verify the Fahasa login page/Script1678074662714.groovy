import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

'1.Login page'

WebUI.openBrowser('')
WebUI.maximizeWindow()
WebUI.navigateToUrl('https://www.fahasa.com/customer/account/create')

'2. Click to tab Đăng Nhập'
WebUI.click(findTestObject('Session6/Bai2/tab_DangNhap'))

'3. Verify button Đăng Nhập disabled'

WebUI.verifyElementNotClickable(findTestObject('Session6/Bai2/btn_dangnhap'))

'4. Input invalid “Số điện thoại/Email” và “Mật khẩu” '
WebUI.setText(findTestObject('Session6/Bai2/txt_sodienthoai'), '0123456789')

WebUI.setText(findTestObject('Session6/Bai2/txt_matkhau'), 'password123')

'5. Verify button “Đăng nhập” enabled'
WebUI.verifyElementClickable(findTestObject('Session6/Bai2/btn_dangnhap'))

'6. Click to button “Đăng nhập” '
WebUI.click(findTestObject('Session6/Bai2/btn_dangnhap'))

'7. Verify message: Số điện thoại/Email hoặc Mật khẩu sai!'

WebUI.verifyElementText(findTestObject('Session6/Bai2/txt_message'), 'Số điện thoại/Email hoặc Mật khẩu sai!')

'Close browser'
WebUI.closeBrowser()