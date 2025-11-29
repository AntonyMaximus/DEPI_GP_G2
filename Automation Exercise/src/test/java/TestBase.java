import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestBase {
    static By loginIcon = By.className("fa-lock");
    static By signupNameInput = By.cssSelector("input[data-qa='signup-name']");
    static By signupEmailInput = By.cssSelector("input[data-qa='signup-email']");
    static By passwordNameInput = By.cssSelector("input[data-qa='login-password']");
    static By loginEmailInput = By.cssSelector("input[data-qa='login-email']");
    static By signupButton = By.cssSelector("button[data-qa='signup-button']");
    static By genderMaleRadio = By.id("id_gender1");
    static By genderFemaleRadio = By.id("id_gender2");
    static By nameInput = By.id("name");
    static By emailInput = By.id("email");
    static By passwordInput = By.id("password");
    static By daysDropdown = By.id("days");
    static By monthsDropdown = By.id("months");
    static By yearsDropdown = By.id("years");
    static By newsletterCheckbox = By.id("newsletter");
    static By specialOffersCheckbox = By.id("optin");
    static By firstNameInput = By.id("first_name");
    static By lastNameInput = By.id("last_name");
    static By companyInput = By.id("company");
    static By address1Input = By.id("address1");
    static By address2Input = By.id("address2");
    static By countryDropdown = By.id("country");
    static By stateInput = By.id("state");
    static By cityInput = By.id("city");
    static By zipcodeInput = By.id("zipcode");
    static By mobileNumberInput = By.id("mobile_number");
    static By createAccountButton = By.cssSelector("button[data-qa='create-account']");
    static By continueAccountButton = By.cssSelector("a[data-qa='continue-button']");
    static By logoutBtn = By.cssSelector("a[href='/logout']");
    static By loginBtn = By.cssSelector("button[data-qa='login-button']");

    WebDriver driver;

    @BeforeMethod
    public void before() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://automationexercise.com/");
    }

    @AfterMethod
    public void after() throws InterruptedException {
        Thread.sleep(6000);
        driver.quit();
    }
}