import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class UserRegisteration extends TestBase {

//    SignUpPage signUpPage;
//    HomePage homePage;
//    @BeforeMethod
//    public void setUpPage() {
//        signUpPage = new SignUpPage(driver);
//        homePage = new HomePage(driver);
//    }

    @Test
    public void testUserRegistration() {
        HomePage home = new HomePage(driver);
        home.signUpLogin();
        SignUpPage signUpPage = new SignUpPage(driver);
        signUpPage.enterName("Antony");
        signUpPage.enterEmail("Antony1@gmail.com");
        signUpPage.clickSignUpBtn();
    }
}