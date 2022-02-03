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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.google.co.th/search?q=calculator&sxsrf=APq-WBu0bAnDBLMw-Sm9ReDNbqGgWVV-nQ%3A1643879066507&source=hp&ei=mpr7YfS1HJDs-QbDpqbABg&iflsig=AHkkrS4AAAAAYfuoqtSJkal5QaaHdwqob673fqCRthxs&oq=calc&gs_lcp=Cgdnd3Mtd2l6EAEYADIICAAQgAQQsQMyCAgAEIAEELEDMggIABCABBCxAzIICAAQgAQQsQMyBQgAEIAEMgUIABCABDIICAAQgAQQsQMyBQgAEIAEMgUIABCABDIFCAAQgAQ6BwgjEOoCECc6DQguEMcBENEDEOoCECc6BAgjECc6DgguEIAEELEDEMcBENEDOgUILhCABDoICC4QgAQQsQM6BQgAELEDUNkFWPsKYLwVaAFwAHgAgAFjiAHoApIBATSYAQCgAQGwAQo&sclient=gws-wiz')

'input 9'
WebUI.click(findTestObject('Page_calculator -  Google/num_9'))

'input 8'
WebUI.click(findTestObject('Page_calculator -  Google/num_8'))

'input 7'
WebUI.click(findTestObject('Page_calculator -  Google/num_7'))

'input 6'
WebUI.click(findTestObject('Page_calculator -  Google/num_6'))

'input 5'
WebUI.click(findTestObject('Page_calculator -  Google/num_5'))

'minus'
WebUI.click(findTestObject('Page_calculator -  Google/button_minus'))

'input 4'
WebUI.click(findTestObject('Page_calculator -  Google/num_4'))

'input 3'
WebUI.click(findTestObject('Page_calculator -  Google/num_3'))

'input 2'
WebUI.click(findTestObject('Page_calculator -  Google/num_2'))

'input 1'
WebUI.click(findTestObject('Page_calculator -  Google/num_1'))

'input 0'
WebUI.click(findTestObject('Page_calculator -  Google/num_0'))

'='
WebUI.click(findTestObject('Page_calculator -  Google/button_result'))

'result'
WebUI.click(findTestObject('Page_calculator -  Google/number_input'))

