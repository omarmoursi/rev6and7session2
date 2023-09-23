package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import pages.HomePage;
import reader.ReadDataDrivenFromJson;
import reader.ReadDataFromJson;

import java.io.FileNotFoundException;

public class BaseTest {
    WebDriver driver;
    protected HomePage homePage;
    protected ReadDataFromJson readDataFromJson;

    @BeforeClass
    public void setup() throws FileNotFoundException {
        readDataFromJson=new ReadDataFromJson();
        driver=new ChromeDriver();
        homePage=new HomePage(driver);
        driver.get(readDataFromJson.readJsonFile().URL);


    }
    @AfterClass
    public void teardown(){
        driver.quit();
    }
}
