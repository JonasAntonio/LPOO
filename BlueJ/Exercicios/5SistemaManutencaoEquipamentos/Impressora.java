public class Impressora extends EquipamentoManutencao
{
    public Impressora(){}
    
    public Impressora(float valorMaoObra, float valorPecas){
        super(valorMaoObra, valorPecas);
    }
    
    public float calcularValorManutencao(){
        return this.getValorMaoObra() + this.getValorPecas();
    }
    
    public String tipoClasse(){
        return "Impressora";
    }
}
