package automatizadoo.page;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GooglePO extends BasePO{

//CLASSE FEITA PARA ISOLAR A LOGICA DO GOOGLE

    //cria um webelement que pode usar em qualquer lugar

    @FindBy(name = "q")
    public WebElement inputPesquisa;

    @FindBy(id = "hdtb-tls")
    public WebElement divResultadoPesquisa;

        /**
         * Construtor da pagina do google
         * @param driver do google
         */

    // o crtl + . no import cria as coisa
    public GooglePO(WebDriver driver) {
        super(driver);
    }   

    /** pesquisa e da enter
     * @param texto
     */
    public void pesquisar (String texto){
        inputPesquisa.sendKeys(texto + Keys.ENTER);
    }

    /** retorna o resultado da pesquisa
     * @return
     */
    public String obterResultadoDaPesquisa(){
        return divResultadoPesquisa.getText();
    }

}
