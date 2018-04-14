public abstract class Encomenda 
{
    private Cliente cliente;
    
    public Encomenda(){}
    
    public Encomenda(Cliente cliente){
        this.setCliente(cliente);
    }
    
    public String getDestinatario(){
        return this.cliente.getNome();
    }
    
    public String getEndereco(){
        return this.cliente.getEndereco();
    }
    
    public void setCliente(Cliente cliente){
        this.cliente = cliente;
    }
    
    public Cliente getCliente(){
        return this.cliente;
    }
    
    public void encomendaCliente(){
        System.out.println("Destinatario: " + this.getDestinatario() + ";"+ cliente.documentoIdentificacao());
    }
    
    public abstract String getPrazo();
}
