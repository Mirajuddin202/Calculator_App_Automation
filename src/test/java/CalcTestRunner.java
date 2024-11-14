import org.testng.Assert;
import org.testng.annotations.Test;

public class CalcTestRunner extends Setup{
    @Test

    public void doSum(){
        CalcScreen calcScreen=new CalcScreen(driver);
        int res=calcScreen.doSum(8,6);
        System.out.println(res);
        Assert.assertEquals(res,"14");
    }
}
