package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.MethodHandles;

public class HomePage extends MethodHandles {


    public HomePage(WebDriver driver) {

        super(driver);
    }

     private By loginlink=By.cssSelector(".ico-login");


    public LoginPage ClickOnloginlink()
    {
        click(loginlink);
        return new LoginPage(driver);
    }
}
