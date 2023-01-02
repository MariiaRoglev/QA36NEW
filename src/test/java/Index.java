import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class Index
{
    WebDriver wd;

    @BeforeMethod
    public void start() {
        wd = new ChromeDriver();
        wd.get("file:///C:/Users/winte/Downloads/index.html");
        wd.manage().window().maximize();
    }

    @Test
    public void itemsTests()
    {
        // find Item1 & click() ===> assert that "div-alert" contains message  "Clicked by Item 1"
        WebElement item1 = wd.findElement(By.cssSelector("[href='#item1']"));
        item1.click();

        WebElement element1 = wd.findElement(By.cssSelector("div[id='alert']"));
        String text1 = element1.getText();
        Assert.assertTrue(text1.contains("Clicked by Item 1"));


        // find Item3 & click() ===> assert that "div-alert" contains message  "Clicked by Item 3"
        WebElement item2 = wd.findElement(By.cssSelector("[href='#item3']"));
        item2.click();

        WebElement element2 = wd.findElement(By.cssSelector("div[id='alert']"));
        String text2 = element2.getText();
        Assert.assertTrue(text2.contains("Clicked by Item 3"));
    }


    @Test
    public void formTests() {
        // fill name & fill surename & click send
        WebElement element1 = wd.findElement(By.cssSelector("[placeholder ='Type your name']"));
        wd.findElement(By.cssSelector("[placeholder ='Type your name']")).click();
        element1.sendKeys("Masha");

        WebElement element2 = wd.findElement(By.cssSelector("[placeholder ='Type your surename']"));
        wd.findElement(By.cssSelector("[placeholder ='Type your surename']")).click();
        element2.sendKeys("Kasha");

        wd.findElement(By.cssSelector("[class='btn']"));
        wd.findElement(By.cssSelector("[class='btn']")).click();


        // Assert that "div-alert" contains text with name + surename

        WebElement element3 = wd.findElement(By.cssSelector("div[id='alert']"));
        String text3 = element3.getText();
        Assert.assertTrue(text3.contains("Masha Kasha"));
    }
        @Test
        public void tableTest ()
        {
            List<WebElement> rows = wd.findElements(By.cssSelector("tr"));
            Assert.assertEquals(rows.size(), 4);

            WebElement lastRow = wd.findElement(By.cssSelector("tr:last-child"));

            String text = lastRow.getText();
            System.out.println();

            Assert.assertTrue(text.contains("Mexico"));

            WebElement lastCell = wd.findElement(By.cssSelector("tr:last-child td:last-child"));
            String str = lastCell.getText();
            boolean res = str.contains("Mexico");
            Assert.assertTrue(str.contains("Mexico"));
            Assert.assertTrue(res);
        }

    }

