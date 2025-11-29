import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignUpPage extends PageBase{

    public SignUpPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(css = "input[data-qa='signup-name']")
    private By signupNameInput;

    @FindBy(css = "input[data-qa='signup-email']")
    private By signupEmailInput;

    @FindBy(css = "button[data-qa='signup-button']")
    private By signupButton;

    public void enterName(String name){
        Enter_Text(signupNameInput,name);
    }
    public void enterEmail(String email){
        Enter_Text(signupEmailInput,email);
    }
    public void clickSignUpBtn(){
        Click_on_button(signupButton);
    }
}
