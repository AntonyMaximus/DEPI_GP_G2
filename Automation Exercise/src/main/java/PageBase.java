import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class PageBase {
    WebDriver driver;
    public PageBase(WebDriver driver){
        this.driver = driver;
    }
    public void Enter_Text(By elementLocator,String text){
        driver.findElement(elementLocator).sendKeys(text);
    }
    public void Click_on_button(By elementLocator){
        driver.findElement(elementLocator).click();
    }
    public void wait(By elementLocator){
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.presenceOfElementLocated(elementLocator));

    }
    public void select_by_index(By elementLocator , int index){
        Select select = new Select(driver.findElement(elementLocator));
        select.selectByIndex(index);
    }
    public void select_by_value(By elementLocator , String value){
        Select select = new Select(driver.findElement(elementLocator));
        select.selectByValue(value);
    }
    public void select_by_visibleText(By elementLocator , String visibleText){
        Select select = new Select(driver.findElement(elementLocator));
        select.selectByVisibleText(visibleText);
    }
}
