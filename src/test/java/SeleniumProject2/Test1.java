package SeleniumProject2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {


    @Test
    public void test1() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();

        driver.get("https://www.seleniumeasy.com/test/basic-first-form-demo.html");

        Thread.sleep(2000);
        WebElement closePopUp=driver.findElement(By.xpath("//a[@class='at-cv-button at-cv-lightbox-yesno at-cm-no-button']"));
        closePopUp.click();
        String currentTitle=driver.getTitle();
        String expectedTitle="Selenium Easy Demo - Simple Form to Automate using Selenium";
        Assert.assertEquals(expectedTitle,currentTitle);

        WebElement enterMessage=driver.findElement(By.xpath("//input[@placeholder='Please enter your Message']"));
        enterMessage.sendKeys("First Test Case");
        WebElement showMessage=driver.findElement(By.xpath("//button[@onclick='showInput();']"));
        showMessage.click();
        String expectedmessage="First Test Case";

        //try {
        WebElement actualShowText = driver.findElement(By.xpath("//label[text()='Your Message: ']/following-sibling::span"));
        String actualMessage = actualShowText.getText();
        Assert.assertEquals(expectedmessage,actualMessage);
        // }catch (NoSuchElementException e) {
        // Assert.fail("Actual message is different");

    }
          @Test
          public void test2() throws InterruptedException {
           WebDriverManager.chromedriver().setup();
           WebDriver driver=new ChromeDriver();
           driver.get("https://www.seleniumeasy.com/test/basic-first-form-demo.html");

           Thread.sleep(2000);
        WebElement closePopUp=driver.findElement(By.xpath("//a[@class='at-cv-button at-cv-lightbox-yesno at-cm-no-button']"));
        closePopUp.click();
        WebElement enterA=driver.findElement(By.xpath("//input[@id='sum1']"));
        enterA.sendKeys("12");
        WebElement enterB=driver.findElement(By.xpath(" //input[@id='sum2']"));
        enterB.sendKeys("17");
        WebElement getButton=driver.findElement(By.xpath("//button[@onclick='return total()']"));
        getButton.click();

        String actualTotal=driver.findElement(By.xpath("//span[@id='displayvalue']")).getText();
        String expectedTotal="29";
        Assert.assertEquals(expectedTotal,actualTotal);
    }

         @Test
         public void test3() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.seleniumeasy.com/test/basic-first-form-demo.html");

        Thread.sleep(2000);
        WebElement closePopUp = driver.findElement(By.xpath("//a[@class='at-cv-button at-cv-lightbox-yesno at-cm-no-button']"));
        closePopUp.click();
        WebElement entera = driver.findElement(By.xpath("//input[@id='sum1']"));
        entera.sendKeys("Chicago");
        WebElement enterb = driver.findElement(By.xpath(" //input[@id='sum2']"));
        enterb.sendKeys("Illinois");
        WebElement getButton = driver.findElement(By.xpath("//button[@onclick='return total()']"));
        getButton.click();

        String actualString = driver.findElement(By.xpath("//span[@id='displayvalue']")).getText();
        String expectedString = "NaN";
        Assert.assertEquals(expectedString, actualString);
    }
        @Test
        public void tes4() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.seleniumeasy.com/test/basic-checkbox-demo.html");
        WebElement singleClick = driver.findElement(By.id("isAgeSelected"));
        singleClick.click();
        String singleClickText = driver.findElement(By.id("txtAge")).getText();
        String expectedText = "Success - Check box is checked";
        Assert.assertEquals(expectedText, singleClickText);

    }
         @Test
         public void test5(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.seleniumeasy.com/test/basic-radiobutton-demo.html");
        WebElement femaleRadioButton = driver.findElement(By.xpath("//p[text()='Click on button to get the selected value']/following-sibling::label[2]/input"));
        femaleRadioButton.click();
        Assert.assertTrue(femaleRadioButton.isSelected());
        WebElement maleRadioButton = driver.findElement(By.xpath("//p[text()='Click on button to get the selected value']/following-sibling::label[1]/input"));
        Assert.assertFalse(maleRadioButton.isSelected());
        WebElement getCheckedValue = driver.findElement(By.xpath("//button[@id='buttoncheck']"));
        getCheckedValue.click();
        String successMessage=driver.findElement(By.xpath("//p[@class='radiobutton']")).getText();  //(actualMessage=successMessage)
        String expectedMessage="Radio button 'Female' is checked";
        Assert.assertEquals(expectedMessage,successMessage);
    }





              }





