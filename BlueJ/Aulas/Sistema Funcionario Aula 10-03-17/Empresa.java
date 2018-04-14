public class Empresa
{
    private String razaoSocial;
    
    public Empresa(){};
    
    public Empresa(String razaoSocial){
        this.setRazaoSocial(razaoSocial);
    }
    
    public String getRazaoSocial(){
        return this.razaoSocial;
    }
    
    public void setRazaoSocial(String razaoSocial){
        this.razaoSocial = razaoSocial;
    }
}
