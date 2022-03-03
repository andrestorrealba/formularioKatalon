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

WebUI.openBrowser(' http://10.1.0.18:3000/')

WebUI.maximizeWindow()

WebUI.waitForPageLoad(3)

WebUI.scrollToPosition(0, 400)

WebUI.selectOptionByIndex(findTestObject('URL/Formulario BoPe/SELECT_provincia'), 7)

WebUI.selectOptionByIndex(findTestObject('URL/Formulario BoPe/SELECT_cel'), 1)

WebUI.setText(findTestObject('URL/Formulario BoPe/SET_nombre'), 'Daniel')

WebUI.setText(findTestObject('URL/Formulario BoPe/SET_apellidos'), 'Poveda')

WebUI.scrollToPosition(0, 600)

WebUI.selectOptionByIndex(findTestObject('URL/Formulario BoPe/SELECT_sexo'), 1)

WebUI.selectOptionByIndex(findTestObject('URL/Formulario BoPe/SELECT_tipoDOC'), 2)

WebUI.setText(findTestObject('URL/Formulario BoPe/SET_numeroDOC'), '94344545')

WebUI.setText(findTestObject('URL/Formulario BoPe/SET_email'), 'daniel@cc.com')

WebUI.click(findTestObject('URL/Formulario BoPe/BOTON_generar'))

WebUI.scrollToPosition(0, 300)

SC = WebUI.takeScreenshot()

WebUI.takeScreenshot('C:\\Users\\Andres Torrealba\\OneDrive\\Escritorio\\KEYLAB\\EVIDENCIA\\1.0SC-Generar-BoPe.png')

WebUI.delay(3)

WebUI.closeBrowser()

