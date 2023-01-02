import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;


public class Login {

    WebDriver wd;
    @BeforeMethod
    public void preCondition(){
        // open browser
        wd = new ChromeDriver();
        // open site
        wd.get("https://telranedu.web.app");
    }

    @Test
    public void findElementsOnPage() {
        // by tagName
        WebElement element = wd.findElement(By.tagName("div"));
        List<WebElement> divs = wd.findElements(By.tagName("div"));

        // By id
        WebElement el1 = wd.findElement(By.id("root"));
        // By class
        WebElement el2 = wd.findElement(By.className("container"));
        // By name
        //wd.findElement(By.name("name"));

        // By link text a href
        wd.findElement(By.linkText("HOME"));
        wd.findElement(By.linkText("ABOUT"));
        wd.findElement(By.partialLinkText("HO"));

    }

    @Test
    public void loginSuccess(){
        // open form
        // wd find item + click

        WebElement itemLogin = wd.findElement(By.linkText("LOGIN"));
        itemLogin.click();

        // fill form
        // find email + click + clear + type
        WebElement email = wd.findElement(By.name("email"));
        email.click();
        email.clear();
        email.sendKeys("noa@gmail.com");

        // find password + click +clear + type
        WebElement password = wd.findElement(By.name("password"));
        password.click();
        password.clear();
        password.sendKeys("Nnoa12345$");

        // submit  form
        // find button login + click
        List<WebElement> buttons = wd.findElements(By.tagName("button"));
        WebElement buttonLogin = buttons.get(0);
        buttonLogin.click();

        Assert.assertEquals("","");
        // ac ==exp
    }

    @Test
    public void registrationSuccess(){

        WebElement itemLogin = wd.findElement(By.linkText("LOGIN"));
        itemLogin.click();

        WebElement email = wd.findElement(By.name("email"));
        email.click();
        email.clear();
        email.sendKeys("Maria123@gmail.com");

        // find password + click +clear + type
        WebElement password = wd.findElement(By.name("password"));
        password.click();
        password.clear();
        password.sendKeys("Mariia2345$");

        // submit  form
        // find button registration + click
        List<WebElement> buttons = wd.findElements(By.tagName("button"));
        WebElement buttonRegistration = buttons.get(1);
        buttonRegistration.click();


    }
    @AfterMethod
    public void postCondition(){
        // close browser
        // wd.quit();
    }


    @Test
    public void csslocatrstest()
    {
        wd.findElement(By.linkText("LOGIN")).click();

        wd.findElement(By.tagName("div"));

        wd.findElement(By.cssSelector("div"));
        wd.findElement(By.cssSelector("a"));
        wd.findElement(By.cssSelector("input"));
        wd.findElement(By.cssSelector("button"));

        wd.findElement(By.className("container"));
        wd.findElement(By.cssSelector(".container"));
        wd.findElement(By.cssSelector(".active"));
        wd.findElement(By.cssSelector("[class = 'active']"));

        wd.findElement(By.cssSelector("#root"));
        wd.findElement(By.cssSelector("[href= '/login']"));

        wd.findElement(By.cssSelector("[placeholder = 'Password']"));
        wd.findElement(By.cssSelector("[placeholder ^= 'Pass']"));
        wd.findElement(By.cssSelector("[placeholder *= 'ass']"));
        wd.findElement(By.cssSelector("[placeholder $= 'ord']"));

        wd.findElement(By.cssSelector("div#root.container"));
        wd.findElement(By.cssSelector("a[href= '/login]"));
        wd.findElement(By.cssSelector("input[name= 'email']"));
        wd.findElement(By.cssSelector("button [name='login']"));


    }

}