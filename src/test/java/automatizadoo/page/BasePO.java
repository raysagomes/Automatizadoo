package automatizadoo.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePO {

    protected WebDriver driver; 

    /** construtor para criação da fábrica de elementos
     * @param driver Driver da pag atual
     */ 
    public BasePO(WebDriver driver){
        this.driver = driver; 
        PageFactory.initElements(driver, this);
    }
    public String obterTituloPagina(){
        return driver.getTitle();
     }
}
