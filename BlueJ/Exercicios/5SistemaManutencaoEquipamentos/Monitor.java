public class Monitor extends EquipamentoManutencao
{
    public Monitor(){}
    
    public Monitor(float valorMaoObra){
        super(valorMaoObra);
    }
    
    @Override
    public float getValorPecas(){
        return 0;
    }
    
    public float calcularValorManutencao(){
        return this.getValorMaoObra();
    }
    
    public String tipoClasse(){
        return "Monitor";
    }
}
