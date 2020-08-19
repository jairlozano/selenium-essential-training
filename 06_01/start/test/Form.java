import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Form {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "/opt/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/form");

        driver.findElement(By.id("first-name")).sendKeys("Jair");
        driver.findElement(By.id("last-name")).sendKeys("Lozano");
        driver.findElement(By.id("job-title")).sendKeys("IaC engineer");
        driver.findElement(By.id("radio-button-3")).click();
        driver.findElement(By.id("checkbox-1")).click();
        driver.findElement(By.cssSelector("option[value='2']")).click();
        driver.findElement(By.id("datepicker")).sendKeys("21/09/1990", Keys.RETURN);
        driver.findElement(By.cssSelector("a[role='button']")).click();
        // driver.findElement(By.cssSelector(".btn .btn-lg .btn-primary ")).click(); Esto igual funciona

        driver.quit();
    }
}
