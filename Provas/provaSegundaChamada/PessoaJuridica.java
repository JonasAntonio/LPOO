public class PessoaJuridica extends Cliente
{
    private String cnpj;
    
    public PessoaJuridica(){}
    
    public PessoaJuridica(String nome, String email, String endereco, String cnpj){
        super(nome, email, endereco);
        this.setCnpj(cnpj);
    }
    
    public void setCnpj(String cnpj){
        this.cnpj = cnpj;
    }
    
    public String getCnpj(){
        return this.cnpj;
    }
    
    public String documentoIdentificacao(){
        return " CNPJ: " + this.getCnpj();
    }
}
