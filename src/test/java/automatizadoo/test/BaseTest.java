package automatizadoo.test;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;

/**
 *
 * @author raygom
 */

public abstract class BaseTest {
    
      protected static WebDriver driver; 
        public final static String URL_BASE = "file:///C:/Users/rae/automatizadoo/controle-de-produtos/sistema/login.html"; 
        public final static String CAMINHO_DRIVER = "C:\\Users\\rae\\automatizadoo\\src\\resource\\chromedriver.exe"; 

        //o before class é statico ent tudo dentro dele tem q ser
        @BeforeClass
     public static void iniciar(){
            System.setProperty("webdriver.chrome.driver", CAMINHO_DRIVER);
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.get(URL_BASE);
        }

     @AfterClass
        public static void finalizar(){
//sair do navegador
        driver.quit();        }

    }
 


