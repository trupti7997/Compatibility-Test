import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class First {

	public static void main(String[] args) throws InterruptedException {
		
		// Launch a new Browser 
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        
        //Open URL
        driver.get("http://jt-dev.azurewebsites.net/#/SignUp");
        
        //Get the title of URL
        System.out.println(driver.getTitle());
        
        //Maximize the window
        driver.manage().window().maximize();
         
        //Dropdown Operation
        driver.findElement(By.xpath("//*[@id='language']")).click();         //Dutch
  		driver.findElement(By.xpath("(//*[@id=\"ui-select-choices-row-1-1\"])[1]")).click();
  		System.out.println("Dutch");
  		Thread.sleep(3000);
        
      	driver.findElement(By.xpath("//*[@id='language']")).click();         //English
      	driver.findElement(By.xpath("(//*[@id='ui-select-choices-row-1-0'])[1]")).click();
      	System.out.println("English");
      	Thread.sleep(3000);
      		
      	//Enter Name	
        driver.findElement(By.id("name")).sendKeys("Trupti Chaudhari");
      		
      	//Enter Organization	
        driver.findElement(By.id("orgName")).sendKeys("Trupti Chaudhari");
      		
      	//Enter Email 	
        driver.findElement(By.xpath("//input[@type='email']")).sendKeys("chaudharitrupti87@gmail.com");
        Thread.sleep(1000);
      		
      	//Click on I agree to the Terms And Conditions	
      	driver.findElement(By.xpath("//span[text()='I agree to the']")).click();
      	Thread.sleep(3000);
      	
      	//Click on SignUp
      	driver.findElement(By.xpath("//button[@type='submit']")).click();
      	Thread.sleep(5000L);
      	
      	//Validation
      	if(driver.getPageSource().contains("A welcome email has been sent. Please check your email. "))
      	{
      	System.out.println("A welcome email has been sent. Please check your email. ");
      	   }else{
      			System.out.println("unable to login");
      	}
      					
      	//close the driver
   		 driver.close();

	}

}
