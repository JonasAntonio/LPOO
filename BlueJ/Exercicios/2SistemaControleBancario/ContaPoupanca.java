public class ContaPoupanca extends Conta
{
    public ContaPoupanca(int numero, float saldo, Cliente cliente){
        super(numero, saldo, cliente);
    }
    
    public float calcularSaldo(){
        return this.getSaldo();
    }
    
    public String tipoClasse(){
        return "Conta Poupança";
    }
}
