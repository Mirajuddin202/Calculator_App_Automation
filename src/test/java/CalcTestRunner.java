import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class CalcTestRunner extends Setup{
    @Test(priority = 1,description = "Do Add",dataProvider = "TestData", dataProviderClass = TestDataset.class)

    public void doSum(int num1, int num2, int resExpected){
        CalcScreen calcScreen=new CalcScreen(driver);
        int resActual=calcScreen.doSum(num1,num2);
        System.out.println(resActual);
        Assert.assertEquals(resActual,resExpected);
    }
    @Test(priority = 2,description = "Do Sub")
    public void doSub(){
        CalcScreen calcScreen=new CalcScreen(driver);
        int res=calcScreen.doSum(8,6);
        System.out.println(res);
        Assert.assertEquals(res,"2");

    }
    @AfterMethod
    public void clearScreen(){
        CalcScreen calcScreen=new CalcScreen(driver);
        calcScreen.btnClear.click();
    }
}
