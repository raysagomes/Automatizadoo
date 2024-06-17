package automatizadoo.test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import static org.junit.Assert.assertTrue;

import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;
import automatizadoo.page.GooglePO;

public class GoogleTest extends BaseTest {

    private static GooglePO googlePage;

    //como tem mais de um beforeclass ele roda primeiro o mais interno, ou seja o de onde ele ta herdando
    @BeforeClass
    public static void prepararTestes(){
        driver.get("https://www.google.com/webhp?hl=pt-BR&sa=X&ved=0ahUKEwjAjsq9iuOGAxUFp5UCHcx7DLsQPAgJ");
        googlePage = new GooglePO(driver); 
    }

        @Test
        public void TC001_deveSerPossivelPesquisarNoGoogleBatataFrita(){ 
           
            // webelement= qualquer elemento que voce pode capturar
           // WebElement inputPesquisa = driver.findElement(By.name("q"));
            // metodo do selenium para digitar e pesqusiar
            googlePage.pesquisar("Batata frita");
            
            //Procura pelo id no dev, e coloca a id aqui e volta o texto
         //  String resultado = driver.findElement(By.id("hdtb-tls")).getText();
         // nesse debaixo ele instancia e pega diretamente da pagina do google page;
           String resultado = googlePage.obterResultadoDaPesquisa();
           //verificar se o que eu quero está certo, e depois da , a condição
            assertTrue(resultado, resultado.contains("Ferramentas"));             
        }


}
