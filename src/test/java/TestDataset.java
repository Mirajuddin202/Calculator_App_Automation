import org.testng.annotations.DataProvider;

public class TestDataset {
    @DataProvider(name = "TestData")
    public Object[][] getData(){
        return new Object[][]{
                {6, 3, 9},
                {8, 7, 15},
                {9, 7, 16}
        };

    }
}
