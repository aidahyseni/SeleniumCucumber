package stepDefinition;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.WebDriver;

public class YouTubeVideoSteps {

    WebDriver driver;

    @Given("I open chromebrowser")
    public void i_open_chromebrowser() {
        System.setProperty("webdriver.chrome.driver", "C://Users//aida.hyseni//IdeaProjects/chromedriver.exe");
        driver = new ChromeDriver();
    }

    @When("I open google")
    public void i_open_google() throws InterruptedException {
        {
            driver.get("https://www.google.com");

        }


    }

    @Then("I look for IphoneProMax")
    public void i_look_for_iphone_pro_max() throws InterruptedException {

        JavascriptExecutor j = (JavascriptExecutor) driver;
        WebElement search = driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input"));
        j.executeScript("arguments[0].click()", search);
        search.sendKeys("Introducing iPhone 13 Pro | Apple");
        j.executeScript("arguments[0].value=arguments[1]", search, "Introducing iPhone 13 Pro | Apple");
        Thread.sleep(3000);
        driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[2]/div[2]/div[5]/center/input[1]")).click();
        Thread.sleep(2000);
        driver.manage().window().maximize();
       boolean status= driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div[2]/div[2]/div[1]/div/div/div/div/a/div[1]/div[2]")).isDisplayed();
        Assert.assertEquals(true,status);
        driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div[2]/div[2]/div[1]/div/div/div/div/a/div[2]/div[1]")).click();
        Thread.sleep(15000);

    }

    @Then("I close video")
    public void i_close_video() {
        driver.quit();
    }
}
