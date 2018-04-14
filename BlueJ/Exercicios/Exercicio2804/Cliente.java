import java.util.ArrayList;

public class Cliente
{
    private String nomeCliente;
    private String cpf;
    private String telefone;
    private String endereco;
    private Vendedor vendedor;
    private ArrayList<Veiculo> veiculosComprados;
    
    public Cliente(){
        veiculosComprados = new ArrayList<Veiculo>();
    }
    
    public Cliente(String nomeCliente, String cpf, String telefone, String endereco){
        this.setNomeCliente(nomeCliente);
        this.setCpf(cpf);
        this.setTelefone(telefone);
        this.setEndereco(endereco);
        veiculosComprados = new ArrayList<Veiculo>();
    }
    
    public String getNomeCliente(){
        return this.nomeCliente;
    }
    
    public void setNomeCliente(String nomeCliente){
        this.nomeCliente = nomeCliente;
    }
    
    public String getCpf(){
        return this.cpf;
    }
    
    public void setCpf(String cpf){
        this.cpf = cpf;
    }
    
    public String getTelefone(){
        return this.telefone;
    }
    
    public void setTelefone(String telefone){
        this.telefone = telefone;
    }
    
    public String getEndereco(){
        return this.endereco;
    }
    
    public void setEndereco(String endereco){
        this.endereco = endereco;
    }
    
    public Vendedor getVendedor(){
        return this.vendedor;
    }
    
    public void setVededor(Vendedor vendedor){
        this.vendedor = vendedor;
    }
    
    public void addVeiculo(Veiculo veiculo){
       this.veiculosComprados.add(veiculo);
    }
    
    public float somatorioValorCompra(){
        float total = 0;
        for(int i = 0; i < veiculosComprados.size(); i++){
            total += this.veiculosComprados.get(i).getPreco();
        }
        return total;
    }
    
    public String dadosCliente(){
        return ("Nome: " + this.getNomeCliente() + "CPF" + this.getCpf() + 
        "Telefone: " + this.getTelefone() + "Endereço: " + this.getEndereco() + "Vendedor: " + this.getVendedor());
    }
}
