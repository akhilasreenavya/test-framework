package GenericLibrary;

import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {

public WebDriver driver;
public Properties p;
	
 public void setup() throws IOException {
	FileInputStream fis= new FileInputStream(System.getProperty("user.dir")+ "\\src\\main\\java\\GenericLibrary\\utils.properties");
	Properties p=new Properties();
	p.load(fis);

	String browserName=p.getProperty("browser");
	if(browserName.equalsIgnoreCase("chrome"))
	{
		System.setProperty("driver.chrome.driver", p.getProperty("chrome_path"));
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(p.getProperty("url"));
	}
	
		
	}
 
 public void tearDown()
 {
	 driver.close();
 }

}