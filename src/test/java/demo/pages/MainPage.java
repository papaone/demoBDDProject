package demo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class MainPage extends BasePage {
    String url = "https://otus.ru/";

    private final By
            loginButton = By.xpath("//button[contains(text(),'Вход')]");

    public MainPage(WebDriver driver) {
        super(driver);
    }

    public void goToMainPage() {
        driver.get(url);
    }

    public void clickLoginButton() {
        driver.findElement(loginButton).click();
    }

    public void verifyLoginButtonIsNotDisplayed()
    {
        ExpectedConditions.invisibilityOf(driver.findElement(loginButton));
    }

    public void verifyUserNameIsDisplayed(String userName)
    {
        ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//p[contains(text(),'"+ userName +"')]")));
    }
}
