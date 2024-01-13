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

Mobile.startApplication('C:\\Users\\nmohamed\\AppData\\Local\\Microsoft\\Windows\\INetCache\\IE\\PVJG35F3\\General-Store[1].apk', 
    true)

Mobile.scrollToText('Andorra')

Mobile.tap(findTestObject('Object Repository/Andorra/android.widget.TextView - Andorra'), 0)

Mobile.setText(findTestObject('Object Repository/Andorra/android.widget.EditText - Enter name here'), 'Nayera', 0)

Mobile.tap(findTestObject('Object Repository/Andorra/android.widget.RadioButton - Female'), 0)

Mobile.pressBack()

Mobile.tap(findTestObject('Object Repository/Andorra/android.widget.Button - Lets  Shop'), 0)

Mobile.tap(findTestObject('Object Repository/Andorra/android.widget.TextView - ADD TO CART'), 0)

Mobile.getText(findTestObject('Object Repository/Andorra/android.widget.TextView - Air Jordan 4 Retro'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/Andorra/android.widget.TextView - Air Jordan 4 Retro'), 'Air Jordan 4 Retro')

Mobile.closeApplication()

