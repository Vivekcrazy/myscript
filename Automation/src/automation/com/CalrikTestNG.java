package automation.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CalrikTestNG 
{
	WebDriver driver;
	@BeforeMethod
	public void launchBrowser() throws InterruptedException
	{
		driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://dev-app.kalrik.com/login");
	    driver.findElement(By.xpath("//input[@id='email']")).sendKeys("vivekraghav.ace@gmail.com");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Test@123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(4000);
	}
	@Test(priority=1)
	public void userLogin()
	{
		driver.findElement(By.xpath("//div[@class='ant-notification-notice-description']")).isDisplayed();
		String welcomeMessage = driver.findElement(By.xpath("//div[@class='ant-notification-notice-description']")).getText();
		System.out.println("Login successfull ---->>> "+welcomeMessage);
	}
	@Test(priority=2)
	public void createAvailability() throws InterruptedException
	{
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[@class='anticon anticon-close ant-modal-close-icon']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//img[@alt='Setting']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//div[@id='rc-tabs-0-tab-/availability']")).click();
		Thread.sleep(6000);
		driver.findElement(By.xpath("//a[normalize-space()='+ Add New Interval']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[normalize-space()='OK']")).click();
		Thread.sleep(5000);
	}
	@Test(priority=3)
	public void createOTOMeeting() throws InterruptedException
	{
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[@class='anticon anticon-close ant-modal-close-icon']")).click();
		driver.findElement(By.xpath("//img[@alt='New Meeting Template']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[normalize-space()='Create 1:1 Meeting']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@id='basic_username']")).sendKeys("My 1:1 Meeting");	
		driver.findElement(By.xpath("//input[@id='rc_select_0']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[normalize-space()='Place']")).click();
		driver.findElement(By.xpath("//input[@id='location_0']")).sendKeys("London");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//span[normalize-space()='Next']")).click();
		driver.findElement(By.xpath("//input[@value='never_expire']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[normalize-space()='Create meeting']")).click();
	    Thread.sleep(3000);
	}
	@Test(priority=6,enabled=false)
	public void deleteMeeting() throws InterruptedException
	{
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[@class='anticon anticon-close ant-modal-close-icon']")).click();
		driver.findElement(By.xpath("//img[@alt='Meeting Templates']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[name()='path' and contains(@d,'M456 231a5')]")).click();
		driver.findElement(By.xpath("//li[@role='menuitem']//div[1]")).click();
		driver.findElement(By.xpath("//span[normalize-space()='Yes']")).click();
		Thread.sleep(5000);
	}
	@Test(priority=7)
	public void deleteAvailability() throws InterruptedException
	{
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[@class='anticon anticon-close ant-modal-close-icon']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//img[@alt='Setting']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//div[@id='rc-tabs-0-tab-/availability']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//body/div[@id='__next']/div[@class='page-wrap page-wrap-with-card']/div[@class='ant-card-grid layout-card ant-card-grid-hoverable']/div[@class='app']/div[@class='settings-page-wrap']/div[@class='ant-space ant-space-vertical']/div[@class='ant-space-item']/div/div/div/div[1]/div[1]/div[1]/span[2]//*[name()='svg']//*[name()='path' and contains(@d,'M292.7 840')]")).click();
		driver.findElement(By.xpath("//span[normalize-space()='Yes']")).click();
	}
	@Test(priority=8)
	public void logOut() throws InterruptedException
	{
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[@class='anticon anticon-close ant-modal-close-icon']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//img[@src='https://kalrik.s3.amazonaws.com/278-2d98cbec-53e1-49e6-ac39-14de0d981858/bam04spmcrENW2pJtAB1wQYnRLLzwfDVml8RjSGi.jpg']")).click();
		driver.findElement(By.xpath("//a[normalize-space()='Logout']")).click();
	}
	@Test(priority=9)
	public void createCategory() throws InterruptedException
	{
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[@class='anticon anticon-close ant-modal-close-icon']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//img[@alt='Setting']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//div[@id='rc-tabs-0-tab-/categories']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//a[normalize-space()='+ Add New Category']")).click();
		driver.findElement(By.xpath("//input[@id='category_name']")).sendKeys("Automation Demo");
		driver.findElement(By.xpath("//span[normalize-space()='Add']")).click();
		Thread.sleep(4000);
	}
	@Test(priority=10)
	public void deleteCategory() throws InterruptedException
	{
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[@class='anticon anticon-close ant-modal-close-icon']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//img[@alt='Setting']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//div[@id='rc-tabs-0-tab-/categories']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//*[name()='path'])[8]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[normalize-space()='Yes']")).click();	
	}
	@Test(priority=11)
	public void connectiCloud() throws InterruptedException
	{
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[@class='anticon anticon-close ant-modal-close-icon']")).click();
		driver.findElement(By.xpath("//img[@alt='Integrations']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@class='ant-col ant-col-xs-24 ant-col-sm-24 ant-col-md-24 ant-col-lg-16 ant-col-xl-14 ant-col-xxl-10 gutter-row']//div[2]//div[1]//div[2]//button[1]//span[1]")).click();
		driver.findElement(By.xpath("//input[@id='apple_id']")).sendKeys("kishan.aqe@gmail.com");
		driver.findElement(By.xpath("//input[@id='app_pwd']")).sendKeys("kfjc-texp-sfzw-ijro");
		driver.findElement(By.xpath("//div[@class='ant-modal-footer']//span[contains(text(),'Connect')]")).click();
		Thread.sleep(6000);
		driver.findElement(By.xpath("//span[normalize-space()='Save']")).click();
		Thread.sleep(5000);
	}
	@Test(priority=12)
	public void disconnectiCloud() throws InterruptedException
	{
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[@class='anticon anticon-close ant-modal-close-icon']")).click();
		driver.findElement(By.xpath("//img[@alt='Integrations']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[normalize-space()='Disconnect']")).click();
		driver.findElement(By.xpath("//button[@class='ant-btn ant-btn-primary ant-btn-dangerous danger']//span[contains(text(),'Disconnect')]")).click();
		Thread.sleep(5000);
	}
	@Test(priority=16)
	public void updateProfile() throws InterruptedException
	{
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[@class='anticon anticon-close ant-modal-close-icon']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//img[@alt='Setting']")).click();
		Thread.sleep(6000);
		driver.findElement(By.xpath("//span[@title='Congo']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='ant-select-item-option-content'][normalize-space()='Chad']")).click();
		//driver.findElement(By.xpath("//a[@class='primary']")).click();
		//driver.findElement(By.xpath("//input[@type='file']")).sendKeys("C:\\Users\\vragh\\Downloads\\Calrikpic.jpg");
        //driver.findElement(By.xpath("//span[normalize-space()='Save Profile Image']")).click();
		WebElement input = driver.findElement(By.xpath("//input[@id='fullname']"));
		input.clear();
		driver.findElement(By.xpath("//input[@id='fullname']")).sendKeys("John");
		driver.findElement(By.xpath("//span[normalize-space()='Save']")).click();
	}
	@Test(priority=14)
	public void defaultPage() throws InterruptedException
	{
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[@class='anticon anticon-close ant-modal-close-icon']")).click();
		driver.findElement(By.xpath("//img[@alt='Setting']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//div[@id='rc-tabs-0-tab-/default-page']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@id='booking_link']")).clear();
		Thread.sleep(3000);
		WebElement input = driver.findElement(By.xpath("//input[@id='booking_link']"));
		input.sendKeys("DemoLink");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//textarea[@id='booking_page_text']")).clear();
		driver.findElement(By.xpath("//textarea[@id='booking_page_text']")).sendKeys("Calrik Automation Script using TestNG");
		driver.findElement(By.xpath("//span[normalize-space()='Save']")).click();
	}
	@Test(priority=15)
	public void openAnalyticsPage() throws InterruptedException
	{
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[@class='anticon anticon-close ant-modal-close-icon']")).click();
		driver.findElement(By.xpath("//img[@src='/images/analytics.png']")).click();
		Thread.sleep(4000);	
	}
	@Test(priority=13)
	public void forgotPassword() throws InterruptedException
	{
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[@class='anticon anticon-close ant-modal-close-icon']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//img[@src='https://kalrik.s3.amazonaws.com/278-2d98cbec-53e1-49e6-ac39-14de0d981858/bam04spmcrENW2pJtAB1wQYnRLLzwfDVml8RjSGi.jpg']")).click();
		driver.findElement(By.xpath("//a[normalize-space()='Logout']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//a[@class='forgot-pass']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("vivekraghav.ace@gmail.com");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
	}
	@Test(priority=17)
	public void changePassword() throws InterruptedException
	{
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[@class='anticon anticon-close ant-modal-close-icon']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//img[@src='https://kalrik.s3.amazonaws.com/278-2d98cbec-53e1-49e6-ac39-14de0d981858/bam04spmcrENW2pJtAB1wQYnRLLzwfDVml8RjSGi.jpg']")).click();
	    driver.findElement(By.xpath("//a[normalize-space()='Login Details']")).click();
		Thread.sleep(4000);		
		driver.findElement(By.xpath("//span[normalize-space()='Change Password']")).click();
	    driver.findElement(By.xpath("//input[@id='old_password']")).sendKeys("Test@123");
	    driver.findElement(By.xpath("//input[@id='new_password']")).sendKeys("Test@1234");
	    driver.findElement(By.xpath("//input[@id='confirm_password']")).sendKeys("Test@1234");
	    driver.findElement(By.xpath("//span[normalize-space()='OK']")).click();
	    Thread.sleep(3000);
	    
	}
	@Test(priority=4)
	public void createPollMeeting() throws InterruptedException
	{
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[@class='anticon anticon-close ant-modal-close-icon']")).click();
		driver.findElement(By.xpath("//img[@alt='New Meeting Template']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[normalize-space()='Create Group Meeting Poll']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@id='basic_username']")).sendKeys("My Poll Meeting");	
		driver.findElement(By.xpath("//input[@id='rc_select_0']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[normalize-space()='Place']")).click();
		driver.findElement(By.xpath("//input[@id='location_0']")).sendKeys("London");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//span[normalize-space()='Next']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//a[@aria-label='February 4, 2025']//input[@type='checkbox']")).click();
		driver.findElement(By.xpath("//span[normalize-space()='Create Poll']")).click();
		Thread.sleep(3000);
		//driver.findElement(By.xpath("//div[@class='ant-notification-notice-description']")).isDisplayed();
		//String successMessage = driver.findElement(By.xpath("//div[@class='ant-notification-notice-description']")).getText();
		//System.out.println("Poll "+successMessage);
	}
	@Test (priority=5)
	public void createGroupEvent() throws InterruptedException
	{
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[@class='anticon anticon-close ant-modal-close-icon']")).click();
		driver.findElement(By.xpath("//img[@alt='New Meeting Template']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[normalize-space()='Create Group Event']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@id='basic_username']")).sendKeys("My Group Event");
		driver.findElement(By.xpath("//input[@id='rc_select_2']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[normalize-space()='Place']")).click();
		driver.findElement(By.xpath("//input[@id='location+278_0']")).sendKeys("London");
		driver.findElement(By.xpath("//span[normalize-space()='Next']")).click();
		driver.findElement(By.xpath("//input[@id='meeting_maximum_invitees']")).sendKeys("4");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@aria-label='February 4, 2025']//input[@type='checkbox']")).click();
		driver.findElement(By.xpath("//span[normalize-space()='Create meeting']")).click();
	}
	
	@AfterMethod
	public void closeBrowser()
	{
		driver.quit();
	}

}
