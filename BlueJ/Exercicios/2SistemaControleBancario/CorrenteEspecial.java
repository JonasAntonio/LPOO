public class CorrenteEspecial extends CorrenteNormal
{
    private float limiteCredito;
    
    public CorrenteEspecial(){}
    
    public CorrenteEspecial(int numero, float saldo, float limiteCredito, Cliente cliente){
        super(numero, saldo, cliente);
        this.setLimiteCredito(limiteCredito);
    }
    
    public float getLimiteCredito(){
        return this.limiteCredito;
    }
    
    public void setLimiteCredito(float limiteCredito){
        this.limiteCredito = limiteCredito;
    }
    
    public float calcularSaldo(){
        return this.getSaldo() + this.getLimiteCredito();
    }
    
    public String tipoClasse(){
        return "Corrente Especial";
    }
}
