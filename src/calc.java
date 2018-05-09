import static org.junit.jupiter.api.Assertions.*;

import org.junit.Test;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import java.lang.System;
import static org.junit.Assert.assertEquals;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.chrome.ChromeDriver;

public class calc  {
	
	private static WebDriver driver;
	
	
	  @BeforeClass
	    public static void setUp(){
		  System.setProperty("webdriver.chrome.driver","/Users/pnovaz/chromeDriver/chromedriver");	
		  driver = new ChromeDriver();
		   driver.get("http://sod73.asu.edu/~jbalasoo/cse464/hw5/modified/math1.php");
	
	    }
      
	  @Test
	    public void testMultiplication() {
		 
		   String num1text = "1";
	       String num2text = "2";
	       WebElement num1 = driver.findElement(By.name("num1"));
	        
	        WebElement num2 = driver.findElement(By.name("num2"));	
	        num1.sendKeys(num2text);
	        num2.sendKeys(num1text);
	        WebElement mulRadio = driver.findElement(By.xpath("//input[@value='MUL']"));
	        mulRadio.click();
	        WebElement submit = driver.findElement(By.name("submit"));	
	        submit.click();
	        String resultText2 = driver.findElement(By.name("result")).getAttribute("value");
	     
	        Assert.assertEquals(resultText2, "2");
	    }
	  
	  @Test
	    public void testAddition() {
		
		   
		   String num1text = "1";
	       String num2text = "2";
	       WebElement num1 = driver.findElement(By.name("num1"));
	        
	        WebElement num2 = driver.findElement(By.name("num2"));	
	        num1.sendKeys(num2text);
	        num2.sendKeys(num1text);
	        WebElement addRadio = driver.findElement(By.xpath("//input[@value='ADD']"));
	        addRadio.click();
	        WebElement submit = driver.findElement(By.name("submit"));	
	        submit.click();
	        String resultText2 = driver.findElement(By.name("result")).getAttribute("value");
	     
	        Assert.assertEquals(resultText2, "3");
	    }
           
	  @Test
	    public void testDivision() {
		
		   
		   String num1text = "1";
	       String num2text = "2";
	       WebElement num1 = driver.findElement(By.name("num1"));
	        
	        WebElement num2 = driver.findElement(By.name("num2"));	
	        num1.sendKeys(num2text);
	        num2.sendKeys(num1text);
	        WebElement addRadio = driver.findElement(By.xpath("//input[@value='DIV']"));
	        addRadio.click();
	        WebElement submit = driver.findElement(By.name("submit"));	
	        submit.click();
	        String resultText2 = driver.findElement(By.name("result")).getAttribute("value");
	     
	        Assert.assertEquals(resultText2, "2");
	    }
	  
	  @Test
	    public void testDivisionbyZero() {
		
		   
		   String num1text = "2";
	       String num2text = "0";
	       WebElement num1 = driver.findElement(By.name("num1"));
	        
	        WebElement num2 = driver.findElement(By.name("num2"));	
	        num1.sendKeys(num1text);
	        num2.sendKeys(num2text);
	        WebElement addRadio = driver.findElement(By.xpath("//input[@value='DIV']"));
	        addRadio.click();
	        WebElement submit = driver.findElement(By.name("submit"));	
	        submit.click();
	        String resultText2 = driver.findElement(By.name("result")).getAttribute("value");
	     
	        Assert.assertEquals(resultText2, "/"); //for division by zero output is "/" not sure why
	    }
	  
	  
        
	  @Test
	    public void testSubtraction() {
		
		   
		   String num1text = "1";
	       String num2text = "2";
	       WebElement num1 = driver.findElement(By.name("num1"));
	        
	        WebElement num2 = driver.findElement(By.name("num2"));	
	        num1.sendKeys(num2text);
	        num2.sendKeys(num1text);
	        WebElement subRadio = driver.findElement(By.xpath("//input[@value='SUB']"));
	        subRadio.click();
	        WebElement submit = driver.findElement(By.name("submit"));	
	        submit.click();
	        String resultText2 = driver.findElement(By.name("result")).getAttribute("value");
	     
	        Assert.assertEquals(resultText2, "1");
	    }
	  
	  @Test
	    public void testNegativeSubtraction() {
		
		   
		   String num1text = "1";
	       String num2text = "2";
	       WebElement num1 = driver.findElement(By.name("num1"));
	        
	        WebElement num2 = driver.findElement(By.name("num2"));	
	        num1.sendKeys(num1text);
	        num2.sendKeys(num2text);
	        WebElement subRadio = driver.findElement(By.xpath("//input[@value='SUB']"));
	        subRadio.click();
	        WebElement submit = driver.findElement(By.name("submit"));	
	        submit.click();
	        String resultText2 = driver.findElement(By.name("result")).getAttribute("value");
	     
	        Assert.assertEquals(resultText2, "-1");
	    }
       
    }
       
     
    
