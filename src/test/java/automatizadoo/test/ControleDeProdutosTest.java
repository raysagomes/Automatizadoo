package automatizadoo.test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import automatizadoo.page.ControleDeProdutoPO;
import automatizadoo.page.LoginPO;

import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ControleDeProdutosTest extends BaseTest{

    private static LoginPO loginPage;
    private static ControleDeProdutoPO controlleProdutoPage;

    @BeforeClass
    public static void prepararTestes(){
        loginPage = new LoginPO(driver);
        loginPage.executarAcaoDeLogar("admin@admin.com", "admin@123");
        
        controlleProdutoPage = new ControleDeProdutoPO(driver);
        assertEquals(controlleProdutoPage.obterTituloPagina(), "Controle de Produtos");
    }


@Test
    public void TC001_deveAbrirModalParaCadastroAoClicarNoBotãoClicar(){
        controlleProdutoPage.buttonAdicionar.click();
        controlleProdutoPage.buttonAdicionar.click();

        String titulo = controlleProdutoPage.tituloModal.getText();

        assertEquals("Produto", titulo);

    }
    

}