import java.util.ArrayList;

public class Venda
{
    private Cliente comprador;
    private Vendedor vendedor;
    
    public Venda(){}
    
    public Venda(Cliente comprador, Vendedor vendedor){
        this.setComprador(comprador);
        this.setVendedor(vendedor);
    }
    
    public Cliente getComprador(){
        return this.comprador;
    }
    
    public void setComprador(Cliente comprador){
        this.comprador = comprador;
    }
    
    public Vendedor getVendedor(){
        return this.vendedor;
    }
    
    public void setVendedor(Vendedor vendedor){
        this.vendedor = vendedor;
    }
    
    public void finalizarVenda(){
        System.out.println("Venda Finalizada.");
        System.out.println("Comprador: " + this.comprador.dadosCliente());
        System.out.println("Vendedor: " + this.vendedor.dadosVendedor());
        System.out.println("Valor a Pagar: " + this.comprador.somatorioValorCompra());
    }
}
