public class CPU extends EquipamentoManutencao
{
    private float valTotPecas;
    
    public CPU(){}
    
    public CPU(float valorMaoObra, float valorPecas){
        super(valorMaoObra, valorPecas);
    }
    
    public float calcularValorManutencao(){
        return this.getValorMaoObra() + this.getValorPecas();
    }
    
    public String tipoClasse(){
        return "CPU";
    }
}
