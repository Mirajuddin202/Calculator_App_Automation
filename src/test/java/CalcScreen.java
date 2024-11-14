import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CalcScreen {
    @FindBy(id="com.google.android.calculator:id/op_add")
    WebElement btnAdd;

    @FindBy(id="com.google.android.calculator:id/op_sub")
    WebElement btnSub;

    @FindBy(id="com.google.android.calculator:id/eq")
    WebElement btnEqual;

    @FindBy(id="com.google.android.calculator:id/result_final")
    WebElement txtResult;

    @FindBy(id="com.google.android.calculator:id/clr")
    WebElement btnClear;

    AndroidDriver driver;

    public CalcScreen(AndroidDriver driver){
        this.driver=driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver),this);
    }
    public int doSum(int num1,int num2){
        driver.findElement(By.id("com.google.android.calculator:id/digit_"+num1)).click();
        btnSub.click();
        driver.findElement(By.id("com.google.android.calculator:id/digit_"+num2)).click();
        btnEqual.click();
        return Integer.parseInt(txtResult.getText());

    }


}
