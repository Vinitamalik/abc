package StepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;		

public class Steps {				
	  WebDriver driver;	
     
    @Given("^Open the Chrome and launch the application$")				
    public void open_the_Firefox_and_launch_the_application() throws Throwable							
    {		
        System.setProperty("webdriver.chrome.driver", "C:\\Softwares\\Drivers\\chromedriver.exe");					
        driver= new ChromeDriver();					
        driver.manage().window().maximize();			
        driver.get("https://www.amazon.co.uk/");	
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }		

    @When("^Enter the Username and Password$")					
    public void enter_the_Username_and_Password() throws Throwable 							
    {		
       System.out.println("This step enter the Username and Password on the login page.");		
       driver.findElement(By.id("a-autoid-0-announce")).click();
       driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
       driver.findElement(By.id("ap_email")).sendKeys("Testabc@gmail.com");
       driver.findElement(By.id("continue")).click();
       
       
    }		

    @Then("^Reset the credential$")					
    public void Reset_the_credential() throws Throwable 							
    {    		
        System.out.println("This step click on the Reset button.");					
    }	
	
	

}
