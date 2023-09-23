package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.MethodHandles;


public class LoginPage  extends MethodHandles {
    public LoginPage(WebDriver driver) {
        super(driver);

    }

    private By emailfield=By.id("Email");
    private By password=By.id("Password");

    private By loginbutton=By.cssSelector(".button-1.login-button");
    public void insertemail(String text){

        sendKeys(emailfield,text);
    }
    public void inserpassword(String text){
        sendKeys(password,text);
    }

    public void clickonloginbutton(){
        click(loginbutton);
    }

}
