
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CssXPath {
    WebDriver wd =new ChromeDriver();

    @Test
    public void fromCssToxPath(){
        wd.findElement(By.cssSelector("div#root"));
        wd.findElement(By.xpath("//div[@id='root']"));

        ///
        wd.findElement(By.cssSelector("a[href]"));
        wd.findElement(By.xpath("//[@href]"));

        wd.findElement(By.cssSelector("[href ^='/ho']"));
        wd.findElement(By.xpath("//*[starts-with(@href,'ho')]"));

        wd.findElement(By.cssSelector("div.focus"));
        wd.findElement(By.xpath("//div[@class='focus']"));

        wd.findElement(By.cssSelector("input[type='text']"));
        wd.findElement(By.xpath("//input[@type='text']"));

        wd.findElement(By.cssSelector("div #host"));
        wd.findElement(By.xpath("//div[@id=’host’]"));

        wd.findElement(By.cssSelector("div.sort>div:nth-child(2)"));
        wd.findElement(By.xpath("//div[@class=’sort’]/div[2]"));

    }
    @Test
    public void fromxPathToCss(){
        wd.findElement(By.xpath("//*[@id='host"));
        wd.findElement(By.cssSelector("#host"));

        wd.findElement(By.xpath("//button[@class='submit']"));
        wd.findElement(By.cssSelector("button[class='submit']"));

        wd.findElement(By.xpath("//div/div/img[@src='paris.jpg']"));

        wd.findElement(By.xpath("//div[@class='first' and @class='list']"));
        wd.findElement(By.cssSelector("div[class='first'][class='list']"));

        wd.findElement(By.xpath("//div[contains(@class,'st']"));
        wd.findElement(By.cssSelector("div[class $='st']"));

        wd.findElement(By.xpath("//div[@id=’idName’]//h1[last()]"));
        wd.findElement(By.cssSelector("div[#idName h1:last-child]"));

        wd.findElement(By.xpath("//table[@id]//tr[last()]"));
        wd.findElement(By.cssSelector("table[#id tr:last-child]"));

        wd.findElement(By.xpath("//a[starts-with(@id,'ret')]"));
        wd.findElement(By.cssSelector("a[id ^='ret']"));

    }
}


