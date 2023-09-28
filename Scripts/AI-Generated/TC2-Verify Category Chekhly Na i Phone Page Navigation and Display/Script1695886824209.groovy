import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.model.FailureHandling
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 1080)	
}

'step 1: Navigate to Page category chekhly-na-iphone'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/category/chekhly-na-iphone')

'step 2: At Page category chekhly-na-iphone click on button object'

testObj = findTestObject('Object Repository/Page_category_chekhly-na-iphone/button_object')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), '.*/category/chekhly-na-iphone(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(testObj)

'step 3: At Page category chekhly-na-iphone click on label object'

testObj = findTestObject('Object Repository/Page_category_chekhly-na-iphone/label_object')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), '.*/category/chekhly-na-iphone(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(testObj)

'step 4: At Page category chekhly-na-iphone click on button object'

testObj = findTestObject('Object Repository/Page_category_chekhly-na-iphone/button_object_1')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), '.*/category/chekhly-na-iphone(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(testObj)

'step 5: At Page category chekhly-na-iphone click on button object'

testObj = findTestObject('Object Repository/Page_category_chekhly-na-iphone/button_object_2')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), '.*/category/chekhly-na-iphone(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(testObj)

'step 6: At Page category chekhly-na-iphone click on button object'

testObj = findTestObject('Object Repository/Page_category_chekhly-na-iphone/button_object_3')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), '.*/category/chekhly-na-iphone(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(testObj)

'step 7: Add visual checkpoint at Page category chekhly-na-iphone'

WebUI.takeFullPageScreenshotAsCheckpoint('TC2-Verify Category Chekhly Na i Phone Page Navigation and Display_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}
