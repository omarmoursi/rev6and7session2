//package logintest;
//
//import base.BaseTest;
//import org.testng.annotations.Test;
//import pages.LoginPage;
//import reader.ReadDataFromJson;
//
//import java.io.FileNotFoundException;
//
//public class LoginTest extends BaseTest {
//
////@Test
////    public void t1() throws FileNotFoundException {
////    readDataFromJson=new ReadDataFromJson();
////    LoginPage loginPage=homePage.ClickOnloginlink();
////     loginPage.insertemail(readDataFromJson.readJsonFile().Login.ValidCredentials.Username);
////      loginPage.inserpassword(readDataFromJson.readJsonFile().Login.ValidCredentials.Password);
////         loginPage.clickonloginbutton();
////
////
////}
//
//
//
//}


package logintest;

import base.BaseTest;
import org.json.simple.parser.ParseException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.LoginPage;
import reader.ReadDataDrivenFromJson;

import java.io.IOException;

public class LoginTest extends BaseTest{
    ReadDataDrivenFromJson readDataDrivenFromJson;

    @DataProvider
    public Object[] testDataForSuccessfulLogin() throws IOException, ParseException {
        readDataDrivenFromJson = new ReadDataDrivenFromJson();
        return readDataDrivenFromJson.testDataForSuccessfulLogin();
    }

    // Omar,123
    // Mohamed,456


    @Test(dataProvider = "testDataForSuccessfulLogin")
    public void t(String data) throws InterruptedException {
        String users[]=data.split(",");

        LoginPage loginPage =homePage.ClickOnloginlink();
        loginPage.insertemail(users[0]);
        loginPage.inserpassword(users[1]);
       // loginPage.clickonloginbutton();
        Thread.sleep(3000);
    }
    @DataProvider
    public Object[] testInvalidLogin() throws IOException, ParseException {
        readDataDrivenFromJson = new ReadDataDrivenFromJson();
        return readDataDrivenFromJson.testInvalidLogin();
    }

    // Omar,123
    // Mohamed,456


    @Test(dataProvider = "testInvalidLogin")
    public void t2(String data) throws InterruptedException {
        String users[]=data.split(",");

        LoginPage loginPage =homePage.ClickOnloginlink();
        loginPage.insertemail(users[0]);
        loginPage.inserpassword(users[1]);
        // loginPage.clickonloginbutton();
        Thread.sleep(3000);
    }





}

