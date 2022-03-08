package fblog;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
public class fb {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		WebElement name = driver.findElement(By.id("email"));
		name.sendKeys("7708387877");
		WebElement pass = driver.findElement(By.id("pass"));
		pass.sendKeys("8608688090",Keys.ENTER);
	}
}

