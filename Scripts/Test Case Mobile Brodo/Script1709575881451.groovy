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

Mobile.startApplication('C:\\Users\\katob\\Downloads\\Brodo_4.1_apkcombo.com.apk', true)

Mobile.tap(findTestObject('Object Repository/Mobile Testing Brodo/Homepage Brodo/android.widget.ImageButton'), 0)

Mobile.tap(findTestObject('Object Repository/Mobile Testing Brodo/Homepage Brodo/android.widget.TextView - ACCOUNT'), 0)

Mobile.setText(findTestObject('Object Repository/Mobile Testing Brodo/Page Sign in/android.widget.TextView - Email'), 'ydwirahmansyah@gmail.com', 0)

Mobile.setText(findTestObject('Object Repository/Mobile Testing Brodo/Page Sign in/android.widget.TextView - Kata Sandi'), 'yud4061001', 0)

Mobile.tap(findTestObject('Object Repository/Mobile Testing Brodo/Page Sign in/android.widget.TextView - Sign In'), 0)

Mobile.tap(findTestObject('Object Repository/Mobile Testing Brodo/Page Sign in/android.widget.ImageButton'), 0)

Mobile.tap(findTestObject('Object Repository/Mobile Testing Brodo/Page Sign in/android.widget.TextView - HOME'), 0)

Mobile.tap(findTestObject('Object Repository/Mobile Testing Brodo/Page Sneakers/android.widget.TextView - Sneakers'), 0)

Mobile.tap(findTestObject('Object Repository/Mobile Testing Brodo/Page Sneakers/android.widget.TextView - Corado Heritage White Olive OWS'), 0)

Mobile.tap(findTestObject('Object Repository/Mobile Testing Brodo/Page Sneakers/android.widget.Button - TAMBAH KE TAS'), 0)

Mobile.tap(findTestObject('Object Repository/Mobile Testing Brodo/Page Sneakers/android.widget.ImageButton'), 0)

Mobile.tap(findTestObject('Object Repository/Mobile Testing Brodo/Page Sneakers/android.widget.ImageView'), 0)




