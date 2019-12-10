import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MainClass {


    public static void  main(String[] args){

        System.setProperty("webdriver.gecko.driver", "C:\\Users\\irazjivin\\IdeaProjects\\stream\\drivers\\geckodriver.exe");

        WebDriver driver = new FirefoxDriver();

        driver.get("http://stage360-web.dev-stream.ru/");



    }
}

