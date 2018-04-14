public class PessoaFisica extends Cliente
{
    private String cpf;

    public PessoaFisica(){}
    
    public PessoaFisica(String nome, String email, String endereco, String cpf){
        super(nome, email, endereco);
        this.setCpf(cpf);
    }
    
    public void setCpf(String cpf){
        this.cpf = cpf;
    }
    
    public String getCpf(){
        return this.cpf;
    }
    
    public String documentoIdentificacao(){
        return " CPF: " + this.getCpf();
    }
}
