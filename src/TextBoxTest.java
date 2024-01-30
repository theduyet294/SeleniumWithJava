import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextBoxTest {

	// TC01
	public void submitSuccessfully() {
		// mở trình duyệt
		System.setProperty("webdriver.chrome.driver", "F:\\01Automation\\01Tools\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// gõ url
		driver.get("https://demoqa.com/");
		// max size màn hình trước
		driver.manage().window().maximize();
		// scroll đênns cưới trang
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		// zoom nhỏ màn hình
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("document.body.style.zoom = '80%'");
		// click vào element
		driver.findElement(By.xpath("//h5[text()='Elements']")).click();
		
		// Clcik vào menu Text Box
		driver.findElement(By.xpath("//span[text()='Text Box']")).click();

		// Nhập dự liêu của các trường
		driver.findElement(By.id("userName")).sendKeys("Cường");
		driver.findElement(By.id("userEmail")).sendKeys("theduyet2904@gmail.com");
		driver.findElement(By.id("currentAddress")).sendKeys("fsdf");
		driver.findElement(By.id("permanentAddress")).sendKeys("fsdfds");
//		click submit
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		driver.findElement(By.id("submit")).click(); // all values are display in text
														// get text hiển thị so sánh text nhâp vào -giống nhau - pass
														// get text Name:fsdfds
		String originFullName = driver.findElement(By.id("name")).getText();
		// cắt chuỗi từ phải đến dấu ':'
		int index = originFullName.indexOf(":");
		String actualFullName = originFullName.substring(index + 1);
		assertEquals(actualFullName, "Cường");

	}

	// TC02
	public void EmailFormatIsWrong() {

		// mở trình duyệt
		System.setProperty("webdriver.chrome.driver", "F:\\01Automation\\01Tools\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// gõ url
		driver.get("https://demoqa.com/");
		// max size màn hình trước
		driver.manage().window().maximize();
		// scroll đênns cưới trang
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		// zoom nhỏ màn hình
//				JavascriptExecutor js = (JavascriptExecutor) driver;
//				js.executeScript("document.body.style.zoom = '80%'");
		// click vào element
		driver.findElement(By.xpath("//h5[text()='Elements']")).click();
		// Clcik vào menu Text Box
		driver.findElement(By.xpath("//span[text()='Text Box']")).click();

		// Nhập dự liêu của các trường
		driver.findElement(By.id("userName")).sendKeys("Cường");
		driver.findElement(By.id("userEmail")).sendKeys("theduyet2904gmail.com");
		driver.findElement(By.id("currentAddress")).sendKeys("fsdf");
		driver.findElement(By.id("permanentAddress")).sendKeys("fsdfds");
//				click submit
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		driver.findElement(By.id("submit")).click(); // all values are display in text
														// get text hiển thị so sánh text nhâp vào -giống nhau - pass
														// get text Name:fsdfds
		String originFullName = driver.findElement(By.id("name")).getText();
		// cắt chuỗi từ phải đến dấu ':'
//				int index = originFullName.indexOf(":");
//				String actualFullName = originFullName.substring(index + 1);
//				assertEquals(actualFullName, "Cường");	

	}

}
