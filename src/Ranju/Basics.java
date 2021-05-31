package Ranju;

public class Basics 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Praveen.P\\Downloads\\jarFiles\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/popup.php");
		
		
		
		
		//https://apps.usw2.pure.cloud/directory/#/person/8a834ea5-0372-4ef2-8b45-d3715f72338b
	}
}
