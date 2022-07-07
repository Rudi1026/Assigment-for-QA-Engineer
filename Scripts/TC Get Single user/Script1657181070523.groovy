import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.logging.KeywordLogger as KeywordLogger
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.util.CryptoUtil as CryptoUtil
import internal.GlobalVariable as GlobalVariable
import static org.assertj.core.api.Assertions.*
import groovy.json.JsonSlurper as JsonSlurper
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

def slurper = new JsonSlurper()

Singleuser = WS.sendRequest(findTestObject('Object Repository/GET Single user'))

def resSingleuser = slurper.parseText(Singleuser.getResponseBodyContent())
println resSingleuser
WS.verifyResponseStatusCode(Singleuser, 200)

//WS.verifyEqual(resSingleuser.data[0].email,"george.bluth@reqres.in")
//GlobalVariable.id= resSingleuser.data[0].id
