/*import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class MainClass {

    public static void  main(String[] args){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\irazjivin\\IdeaProjects\\stream\\drivers\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.manage().window().maximize(); //максимальный размер окна

        driver.get("http://market.yandex.ru/");

//        driver.findElement(By.xpath("/html/body/div[4]/div[3]/div/div/div[2]/div[1]/span/span")).click();

        driver.findElement(By.xpath("/html/body/div[1]/div/span/div[2]/noindex/div[2]/div/div/div[1]/div[4]/a/span")).click();
        driver.findElement(By.xpath("//a[text()='Стиральные машины']")).click();
        driver.findElement(By.xpath("//*[@id=\"search-prepack\"]/div/div/div[3]/div/div[2]/div[3]/fieldset/ul/li[1]/div/a/label/div/span")).click();
        driver.findElement(By.xpath("//*[@id=\"search-prepack\"]/div/div/div[3]/div/div[2]/div[3]/fieldset/ul/li[1]/div/a/label/div/span")).click();


        /*driver.manage().window().setSize(new Dimension(900, 500));



        driver.get("http:google.com");
        //driver.get("http://a2p.beta.dev-stream.ru/");
        driver.navigate().to( "http://seleniumhq.org");
        driver.navigate().back(); //переместиться назад
        driver.navigate().forward(); //переместиться вперед
        driver.navigate().refresh(); //перезагрузить страницу

        System.out.println(driver.getTitle());//получить заголовок
        System.out.println(driver.getCurrentUrl());*/


        /*WebElement link = driver.findElement(By.linkText("Log in"));
        WebElement link2 = driver.findElement(By.partialLinkText("Donate"));
        WebElement searchField = driver.findElement(By.name("search"));
        WebElement searchButton = driver.findElement(By.className("searchButton"));
        WebElement li = driver.findElement(By.id("ca-viewsource"));
        WebElement input = driver.findElement(By.tagName("input"));
        WebElement element = driver.findElement(By.cssSelector("div#simpleSearch input#searchButton"));
        WebElement logo = driver.findElement(By.xpath("//div[@id='mw-panel']"));*/



        // driver.quit();
        /*driver.get("http://github.com/");


        WebElement button = driver.findElement(By.xpath("//form[@class='home-hero-signup js-signup-form']//button"));
        if (button.getText().equals("Sign up for GitHub")) {
            System.out.println("Success!");
        }
        else System.out.println("Fail!");
        button.submit();*/

        /*driver.get("http://en.wikipedia.org");
        WebElement link = driver.findElement(By.xpath("//*[@id='n-aboutsite']/a"));
        System.out.println(link.getText());
        link.click();
        driver.findElement(By.xpath("//input[@id='searchInput']")).sendKeys("Selenium WebDriver");
        driver.findElement(By.xpath("//input[@id='searchButton']")).click();
        System.out.println(driver.findElement(By.xpath("//input[@id='ooui-php-1']")).getAttribute("value"));
        driver.findElement(By.xpath("//input[@id='ooui-php-1']")).clear();*/



        /*driver.get("http://github.com/");
        driver.findElement(By.xpath("//*[@id=\"user[login]\"]")).sendKeys("testUsername");
        driver.findElement(By.xpath("//*[@id=\"user[password]\"]")).sendKeys("testPass");
        WebElement button = driver.findElement(By.xpath("/html/body/div[4]/main/div[1]/div/div/div[2]/div/form/button"));
        button.submit();*/


        /*WebElement button = driver.findElement(By.xpath("//form[@class='home-hero-signup js-signup-form']//button"));
        if (button.getText().equals("Sign up for GitHub")) {
            System.out.println("Success!");
        }
        else System.out.println("Fail!");
        button.submit();


    }
}*/
