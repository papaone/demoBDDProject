package demo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LoginPage extends BasePage {

    private final By
            emailField = By.xpath("//input[contains(@class,'js-email-input')]"),
            passwordField = By.xpath("//input[contains(@class,'js-psw-input')]"),
            submitButton = By.xpath("//div//button[contains(text(),'Войти')]");

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void enterEmailValue(String login) {
        waitForElementToAppear(emailField);
        driver.findElement(emailField).sendKeys(login);
    }

    public void enterPasswordValue(String password) {
        driver.findElement(passwordField).sendKeys(password);
    }

    public void clickEnterButton() {
        driver.findElement(submitButton).click();
    }

    public void checkLoginPageIsDisplayed()
    {
        ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//span[contains(text(),'Войдите в свой аккаунт')]")));
    }
}
