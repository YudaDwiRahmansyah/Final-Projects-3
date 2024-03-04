import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

def testData = findTestData('Data Files/DataExcel')
def gmail = testData.getObjectValue('Gmail', 1)
def password = testData.getObjectValue('Password', 1)
WebUI.comment(gmail)
WebUI.comment(password)

System.out.println(gmail)
System.out.println(password)

WebUI.openBrowser('')

WebUI.navigateToUrl('https://sepatucompass.com/')

WebUI.click(findTestObject('Web Testing Compass/Homepage/i__ail ai-times'))

WebUI.click(findTestObject('Web Testing Compass/Homepage/Button_Profile'))

WebUI.setText(findTestObject('Object Repository/Web Testing Compass/Page_Login/textField_E-mail'), gmail)

WebUI.setText(findTestObject('Object Repository/Web Testing Compass/Page_Login/textField_Password'), password)

WebUI.click(findTestObject('Object Repository/Web Testing Compass/Page_Login/button_Login'))

WebUI.click(findTestObject('Web Testing Compass/Homepage/i__ail ai-times'))

WebUI.click(findTestObject('Web Testing Compass/Page_Shop/a_Shop'))

WebUI.click(findTestObject('Object Repository/Web Testing Compass/Page_Shop/Sepatu_Retrograde Low Triple Black'))

WebUI.click(findTestObject('Web Testing Compass/Page_Sepatu/button_Ukuran'))

WebUI.click(findTestObject('Web Testing Compass/Page_Sepatu/button_Add to Bag'))

WebUI.click(findTestObject('Web Testing Compass/Page_Sepatu/i_Log Out_ail ai-times'))

WebUI.click(findTestObject('Web Testing Compass/Page_Sepatu/button_Keranjang'))

