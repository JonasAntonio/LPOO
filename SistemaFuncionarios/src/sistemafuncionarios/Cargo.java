package sistemafuncionarios;

public class Cargo
{
    private String descricao;
    
    public Cargo(){};
    
    public Cargo(String descricao){
        this.setDescricao(descricao);
    }
    public String getDescricao(){
        return this.descricao;
    }
    
    public void setDescricao(String descricao){
        this.descricao = descricao;
    }
}
