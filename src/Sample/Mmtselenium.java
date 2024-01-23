package Sample;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Arrays;


public class Mmtselenium {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\KIIT\\Downloads\\chromedriver.exe");

        WebDriver driver=new ChromeDriver();
        driver.get("https://www.makemytrip.com/railways/");
        System.out.println("https://www.makemytrip.com/railways/");
        System.out.println("makemytrip");
        driver.manage().window().maximize();


        //source address -Delhi
        WebElement e1=driver.findElement(By.xpath("//span[text()='From']"));
        JavascriptExecutor executor=(JavascriptExecutor)driver;
        executor.executeScript("arguments[0].click();",e1);
        Thread.sleep(2000);
        WebElement e2=driver.findElement(By.xpath("//input[@placeholder='From']"));
        e2.sendKeys("Delhi");
        Thread.sleep(2000);
        e2.sendKeys(Keys.ARROW_DOWN);
        Thread.sleep(2000);
        e2.sendKeys(Keys.ENTER);
        Thread.sleep(2000);



        //Destination Address - LUCKNOW
        WebElement e3=driver.findElement(By.xpath("//span[text()=\"To\"]"));
        executor.executeScript("arguments[0].click();",e3);
        Thread.sleep(2000);
        WebElement e4=driver.findElement(By.xpath("//input[@placeholder='To']"));
        e4.sendKeys("Lucknow");
        Thread.sleep(2000);
        e4.sendKeys(Keys.ARROW_DOWN);
        Thread.sleep(2000);
        e4.sendKeys(Keys.ENTER);
        Thread.sleep(2000);

        //FOR DATE DROUPDOWN
        WebElement e5=driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div/div[2]/div/div[3]/label/span"));
        executor.executeScript("arguments[0].click();",e5);
        Thread.sleep(2000);
        WebElement e10= driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div/div/div[2]/div/div[3]/div[1]/div/div/div/div[2]/div/div[1]/span[2]"));
        executor.executeScript("arguments[0].click();",e10);
        Thread.sleep(2000);
        WebElement e11= driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div/div/div[2]/div/div[3]/div[1]/div/div/div/div[2]/div/div[1]/span[2]"));
        executor.executeScript("arguments[0].click();",e11);
        Thread.sleep(2000);
        WebElement e12= driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div/div/div[2]/div/div[3]/div[1]/div/div/div/div[2]/div/div[1]/span[2]"));
        executor.executeScript("arguments[0].click();",e12);
        Thread.sleep(2000);
        WebElement e6= driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div/div/div[2]/div/div[3]/div[1]/div/div/div/div[2]/div/div[2]/div[2]/div[3]/div[4]/div[2]"));
        executor.executeScript("arguments[0].click();",e6);
        Thread.sleep(2000);



        //travelClass
        WebElement e7=driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div/div[2]/div/div[4]/label/span"));
        executor.executeScript("arguments[0].click();",e7);
        Thread.sleep(2000);
        WebElement e8= driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div/div[2]/div/div[4]/ul/li[3]"));
        executor.executeScript("arguments[0].click();",e8);
        Thread.sleep(2000);


        WebElement e9=driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div/div[2]/p/a"));
        executor.executeScript("arguments[0].click();",e9);
        Thread.sleep(2000);

        System.out.println("Testing Successful");
        System.out.println("Thank You!! and have a wonderfull day ");

    }
}