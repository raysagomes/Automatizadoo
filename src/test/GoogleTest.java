package automatizadoo.test.java;

import org.openqa.selenium.WebDriver;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleTest {

        private WebDriver driver; 
        private final String URL_BASE = "https://www.google.com.br/?hl=pt-BR"; 
        private final String CAMINHO_DRIVER = "src\\resource\\chromedriver.exe"; 


        public void iniciar(){
            System.setProperty("webdriver.chrome.driver", CAMINHO_DRIVER);
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.get(URL_BASE);
        }
        @Test
        public void DevePesquisarNoGoogle(){ 
            iniciar();
        }
}
