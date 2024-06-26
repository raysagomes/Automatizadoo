package automatizadoo.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ControleDeProdutoPO extends BasePO{

    @FindBy(id= "btn-adicionar")
    public WebElement buttonAdicionar;

    @FindBy(css= "ul>li>a.nav-link")
    public WebElement linkVoltar;

    @FindBy(css = "div.modal-header>h4")
    public WebElement tituloModal;

    public ControleDeProdutoPO(WebDriver driver) {
        super(driver);
    }

    public String obterTituloPagina(){
        return driver.getTitle();
     }
}
