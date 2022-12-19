import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class Start {

    WebDriver wd;



    @Test
    public void myTest(){
        // open browser
        wd = new ChromeDriver();
        wd.get("https://telranedu.web.app/");   // without history

        // wd.navigate().to("https://telranedu.web.app/");// with history
        // wd.navigate().back();
        //  wd.navigate().forward();
        // wd.navigate().refresh();

        //wd.close();  // for one tab
        wd.quit();  // all tabs



    }
    @Test
    public void secondTest(){
        wd = new ChromeDriver();
        wd.get("https://telranedu.web.app/");
    }


}
