
public class Departamento
{
    private String descricao;
    private Funcionario chefe;
    private Empresa empresa;
    
    public Departamento(){};
    
    public Departamento (String descricao, Funcionario chefe, Empresa empresa){
        this.setDescricao(descricao);
        this.setChefe(chefe);
        this.setEmpresa(empresa);
    }
    
    public String getDescricao(){
        return this.descricao;
    }
    
    public void setDescricao(String descricao){
        this.descricao = descricao;
    }
    
    public Funcionario getChefe(){
        return this.chefe;
    }
    
    public void setChefe(Funcionario chefe){
        this.chefe = chefe;
    }
    
    public Empresa getEmpresa(){
        return this.empresa;
    }
    
    public void setEmpresa(Empresa empresa){
        this.empresa = empresa;
    }
    
    public String getNomeChefe(){
        if(this.chefe != null){
            return this.chefe.getNome(); //ou this.getChefe().getNome();
        } else {
            return "Departamento não tem chefe";
        }
    }
}
