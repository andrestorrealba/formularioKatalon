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

WebUI.openBrowser('http://10.1.0.18:3000/')

WebUI.maximizeWindow()

WebUI.waitForPageLoad(3)

WebUI.selectOptionByIndex(findTestObject('URL/Formulario BoPe/SELECT_provincia'), 16)

WebUI.selectOptionByIndex(findTestObject('URL/Formulario BoPe/SELECT_cel'), 2)

WebUI.setText(findTestObject('URL/Formulario BoPe/SET_nombre'), 'Juan')

WebUI.setText(findTestObject('URL/Formulario BoPe/SET_apellidos'), 'Rosello')

WebUI.scrollToPosition(0, 600)

WebUI.selectOptionByIndex(findTestObject('URL/Formulario BoPe/SELECT_sexo'), 1)

WebUI.selectOptionByIndex(findTestObject('URL/Formulario BoPe/SELECT_tipoDOC'), 2)

WebUI.setText(findTestObject('URL/Formulario BoPe/SET_numeroDOC'), '38914591')

WebUI.setText(findTestObject('URL/Formulario BoPe/SET_email'), 'juan@cc.com')

WebUI.click(findTestObject('URL/Formulario BoPe/BOTON_generar'))

WebUI.waitForElementPresent(findTestObject('URL/Formulario BoPe/BOTON_VOLVER'), 4)

WebUI.click(findTestObject('URL/Formulario BoPe/BOTON_VOLVER'))

WebUI.waitForElementPresent(findTestObject('URL/Formulario BoPe/BOTON_ACEPTAR'), 3)

WebUI.click(findTestObject('URL/Formulario BoPe/BOTON_CANCELAR'))

SC = WebUI.takeScreenshot()

WebUI.takeScreenshot('C:\\Users\\Andres Torrealba\\OneDrive\\Escritorio\\KEYLAB\\EVIDENCIA\\14.2SC-Boton-Volver-Cancelar.png')

WebUI.delay(2)

WebUI.closeBrowser()

