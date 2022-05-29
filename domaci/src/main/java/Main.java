import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*
Otići na https://www.stealmylogin.com/demo.html,
uneti bilo koje kredencijale za login, prisisnuti dugme.
Izvršiti proveru da je, nakon logina, URL promenjen na https://example.com/ kroz grananje.
 Ako jeste, štampati “Nice”. Ako nije, štampati “Not nice.”
Sve elemente koji se koriste smestiti u intuitivno imenovane promenljive.
Kod na git, screen recording puštanja i izvršavanja testa na Drive.
 */
public class Main {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\Andromeda\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.navigate().to("https://www.stealmylogin.com/demo.html");

        WebElement username = driver.findElement(By.xpath("/html/body/form/input[1]"));
        username.sendKeys("andromeda");

        WebElement password = driver.findElement(By.xpath("/html/body/form/input[2]"));
        password.sendKeys("andromeda");

        WebElement login = driver.findElement(By.xpath("/html/body/form/input[3]"));
        login.click();

        if (driver.getCurrentUrl().equals("https://example.com/")){
            System.out.println("Nice");
        } else {
            System.out.println("Not nice");
        }


    }
}
