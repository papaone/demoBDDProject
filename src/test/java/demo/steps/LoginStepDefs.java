package demo.steps;

import demo.pages.LoginPage;
import demo.pages.MainPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class LoginStepDefs {

    WebDriver driver = BaseHook.setUp();
    LoginPage loginPage = new LoginPage(driver);
    MainPage mainPage = new MainPage(driver);

    @Given("User is in Login page")
    public void userIsInLoginPage() {
        mainPage.goToMainPage();
        mainPage.clickLoginButton();
    }

    @When("User submit {string} and {string}")
    public void userSubmitAnd(String arg0, String arg1) {
        loginPage.enterEmailValue(arg0);
        loginPage.enterPasswordValue(arg1);
        loginPage.clickEnterButton();
    }

    @Then("User successfully logged in")
    public void userSuccessfullyLoggedIn() {

    }

    @Then("User not logged in")
    public void userNotLoggedIn() {
        loginPage.checkLoginPageIsDisplayed();
    }

    @Then("{string} is displayed in Main Page")
    public void usernameIsDisplayedInMainPage(String arg0) {
        mainPage.verifyUserNameIsDisplayed(arg0);
    }
}
