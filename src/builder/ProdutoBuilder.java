package automatizadoo.builder;

public class ProdutoBuilder {

    //valores padrão
    public String codigo = "0001";
    public String nome = "Produto Padrão";
    public Integer quantidade = 1 ;
    public String data = "03/01/2021";

    

    public ProcessBuilder adicionarNome(String nome){
        this.nome = nome;
        return this;
    }

    public ProcessBuilder adicionarData(String data){
        this.data = data;
        return this;
    }
}
