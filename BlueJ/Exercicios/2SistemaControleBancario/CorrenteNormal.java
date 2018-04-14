public class CorrenteNormal extends Conta
{
    public CorrenteNormal(){}
    
    public CorrenteNormal(int numero, float saldo, Cliente cliente){
        super(numero, saldo, cliente);
    }
    
    public float calcularSaldo(){
        return this.getSaldo();
    }
    
    public String tipoClasse(){
        return "Corrente Normal";
    }
}
