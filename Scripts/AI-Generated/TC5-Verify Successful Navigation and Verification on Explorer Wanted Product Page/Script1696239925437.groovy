import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.model.FailureHandling
import internal.GlobalVariable as GlobalVariable

'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 1080)	
}

'step 1: Navigate to Page category chekhly-na-iphone'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/category/chekhly-na-iphone')

'step 2: At Page category chekhly-na-iphone click on hyperlink category iphone --> navigate to Page category iphone-6'

testObj = findTestObject('Object Repository/Page_category_chekhly-na-iphone/hyperlink_category_iphone')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), '.*/category/chekhly-na-iphone(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(testObj)

'step 3: At Page category iphone-6 click on hyperlink product chekhol explorer wanted --> navigate to Page product chekhol-explorer-wanted'

testObj = findTestObject('Object Repository/Page_category/hyperlink_product_chekhol_explorer_wanted')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), '.*/category/.*(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(testObj)

'step 4: At Page product chekhol-explorer-wanted click on button object'

testObj = findTestObject('Object Repository/Page_product_chekhol-explorer-wanted/button_object')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), '.*/product/chekhol-explorer-wanted(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(testObj)

'step 5: At Page product chekhol-explorer-wanted click on label object'

testObj = findTestObject('Object Repository/Page_product_chekhol-explorer-wanted/label_object')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), '.*/product/chekhol-explorer-wanted(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(testObj)

'step 6: At Page product chekhol-explorer-wanted click on button object'

testObj = findTestObject('Object Repository/Page_product_chekhol-explorer-wanted/button_object')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), '.*/product/chekhol-explorer-wanted(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(testObj)

'step 7: Add visual checkpoint at Page product chekhol-explorer-wanted'

WebUI.takeFullPageScreenshotAsCheckpoint('TC5-Verify Successful Navigation and Verification on Explorer Wanted Product Page_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}
