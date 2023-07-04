package runner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class RunBase {

    static WebDriver driver;

    public static WebDriver getDriver(){
        return driver;
    }

    public static WebDriver getDriver(String browser) {

        if (driver !=  null) {
            driver.quit();
        }
/*Para passar o browser como parametro quando executamos aqui pela IDE e não pelo run cucumber
  é só ir ali em RunCucumber na seta para baixo e entrar em edit configurations
  no textbox ali em ea passar o mesmo parametro da linha de comando -Dbrowser=chrome ou =firefox
  comando no terminar = mvn test -Dtest=RunCucumber -Dbrowser=chrome cluecumber-report:reporting

 */
        switch (browser) {
            case "chrome":
                driver = new ChromeDriver();
                break;
            case "firefox":
                driver = new FirefoxDriver();
                break;
            case "edge":
                throw new IllegalArgumentException("Edge ainda nao suportado");
            default:
                throw new IllegalArgumentException("Navegador não encontrado! Passe um navegador existente: chrome, forefox ou edge.");
        }

        if(driver != null){
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        }

        return driver;
    }

}
