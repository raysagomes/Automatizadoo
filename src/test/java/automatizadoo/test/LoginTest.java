package automatizadoo.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import automatizadoo.page.LoginPO;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import automatizadoo.page.GooglePO;

//executa os metodos em ordem crescente
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class LoginTest extends BaseTest {

     private static LoginPO loginPage;



     @BeforeClass
    public static void prepararTestes(){
    
        loginPage = new LoginPO(driver);
    }

        @Test
        public void TC001_naoDevelogarNoSistemaComEmailIncorretoESenhaVazios(){ 
         
          loginPage.executarAcaoDeLogar("", "");
            String mensagem = loginPage.obterMensagem();
           // assert verifica se sao iguais, esperado, atual
            assertEquals(mensagem, "Informe usuário e senha, os campos não podem ser brancos.");;
        }
        @Test
        public void TC002_naoDevelogarNoSistemaComEmailIncorretoESenhaVazios(){ 
         
            loginPage.executarAcaoDeLogar("a", "");
            String mensagem = loginPage.obterMensagem();
           // assert verifica se sao iguais, esperado, atual
            assertEquals(mensagem, "Informe usuário e senha, os campos não podem ser brancos.");;
        }
        @Test
        public void TC003_naoDevelogarNoSistemaComEmailVazioESenhaIncorreta(){ 
            loginPage.executarAcaoDeLogar("", "aa");

            String mensagem = loginPage.obterMensagem();
           // assert verifica se sao iguais, esperado, atual
            assertEquals(mensagem, "Informe usuário e senha, os campos não podem ser brancos.");;
        }

        @Test
        public void TC004_DevelogarNoSistemaComEmailESenhaCorretos(){ 
            loginPage.executarAcaoDeLogar("admin@admin.com", "admin@123");

            loginPage.obterTituloPagina();
           // assert verifica se sao iguais, esperado, atual
            assertEquals(loginPage.obterTituloPagina(), "Controle de Produtos");
        }

}


