import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class TextBoxTest {
	
	//TC01
	public void  submitSuccessfully() {
		// mở trình duyệt 
		System.setProperty("webdriver.chrome.driver", "F:\\01Automation\\01Tools\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// gõ url
		driver.get("https://demoqa.com/");
		// click vào element
		driver.findElement(By.xpath("//h5[text()='Elements']")).click();
		//Clcik vào menu Text Box
		
		//Nhập dự liêu của các trường
//		click submit
		//all values are display in text
	}
 	

}
