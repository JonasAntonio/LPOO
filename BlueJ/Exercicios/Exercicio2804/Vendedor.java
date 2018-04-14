import java.util.ArrayList;

public class Vendedor
{
    private String nomeVendedor;
    private String matricula;
    private Cliente comprador;
    private ArrayList<Venda> vendasRealizadas;
    private ArrayList<Veiculo> veiculoVendido;
    
    public Vendedor(){
        vendasRealizadas = new ArrayList<Venda>();
        veiculoVendido = new ArrayList<Veiculo>();
    }
    
    public Vendedor(String nomeVendedor, String matricula, Cliente comprador){
        this.setNomeVendedor(nomeVendedor);
        this.setMatricula(matricula);
        this.setComprador(comprador);
        vendasRealizadas = new ArrayList<Venda>();
        veiculoVendido = new ArrayList<Veiculo>();
    }
    
    public String getNomeVendedor(){
        return this.nomeVendedor;
    }
    
    public void setNomeVendedor(String vendedor){
        this.nomeVendedor = vendedor;
    }
    
    public String getMatricula(){
        return this.matricula;
    }
    
    public void setMatricula(String matricula){
        this.matricula = matricula;
    }
    
    public Cliente getComprador(){
        return this.comprador;
    }
    
    public void setComprador(Cliente comprador){
        this.comprador = comprador;
    }
    
    public String dadosVendedor(){
        return "Nome: " + this.getNomeVendedor() + "Matricula" + this.getMatricula();
    }
}
