import java.util.ArrayList;

public abstract class Cliente
{
    private String nome;
    private String email;
    private String endereco;
    private ArrayList<Encomenda> encomendas;
    
    public Cliente(){
        encomendas = new ArrayList<Encomenda>();
    }
    
    public Cliente(String nome, String email, String endereco){
        this.setNome(nome);
        this.setEmail(email);
        this.setEndereco(endereco);
        encomendas = new ArrayList<Encomenda>();
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public void setEmail(String email){
        this.email = email;
    }
    
    public String getEmail(){
        return this.email;
    }
    
    public void setEndereco(String endereco){
        this.endereco = endereco;
    }
    
    public String getEndereco(){
        return this.endereco;
    }
    
    public void addEncomenda(Encomenda encomenda){
        encomendas.add(encomenda);
    }
    
    public void listarEncomendas(){
        for(int i = 0; i < encomendas.size(); i++){
            System.out.println("Destinatario: " + encomendas.get(i).getDestinatario() + ";" + " Prazo: " + this.encomendas.get(i).getPrazo());
        }
    }
    
    public abstract String documentoIdentificacao();
}
