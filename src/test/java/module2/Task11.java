package module2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task11 {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        String url1 = "https://nusaka.narod.ru/";
        driver.get(url1);

        driver.manage().window().maximize();

        String url2 = "https://vk.com/";
                driver.get(url2);

        String url3 = "https://www.instagram.com/";
                driver.get(url3);

        String url4 = "https://www.facebook.com/";
        driver.navigate().to(url4);
        System.out.println("4 url name is " + driver.getTitle());

        driver.navigate().back();
        Thread.sleep(3000);
        System.out.println("3 url name is " + driver.getTitle());

        driver.navigate().back();
        System.out.println("2 url name is " + driver.getTitle());

        driver.navigate().back();
        System.out.println("1 url name is " + driver.getTitle());

        driver.quit();

    }
}
