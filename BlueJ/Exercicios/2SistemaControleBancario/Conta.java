import java.util.ArrayList;

public abstract class Conta
{
    private int numero;
    private float saldo;
    private Cliente cliente;
    
    public Conta(){}
    
    public Conta(int numero, float saldo, Cliente cliente){
        this.setNumero(numero);
        this.setSaldo(saldo);
        this.setCliente(cliente);
    }
    
    public int getNumero(){
        return this.numero;
    }
    
    public void setNumero(int numero){
        this.numero = numero;
    }
    
    public float getSaldo(){
        return this.saldo;
    }
    
    public void setSaldo(float saldo){
        this.saldo = saldo;
    }
    
    public Cliente getCliente(){
        return this.cliente;
    }
    
    public void setCliente(Cliente cliente){
        this.cliente = cliente;
    }
    
    public abstract float calcularSaldo();
    
    public abstract String tipoClasse();
    
    public String dadosConta(){
        return " Tipo da Conta: " + this.tipoClasse() + " Número: " + this.getNumero() + " Saldo: " + this.calcularSaldo();
    }
    
    public void consultarContasSaldo(){
        System.out.println(dadosConta());
    }
}
