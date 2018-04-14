public abstract class EquipamentoManutencao
{
    private float valorMaoObra;
    private float valorPecas;
    
    public EquipamentoManutencao(){}
    
    public EquipamentoManutencao(float valorMaoObra){
        this.setValorMaoObra(valorMaoObra);
    }
    
    public EquipamentoManutencao(float valorMaoObra, float valorPecas){
        this.setValorMaoObra(valorMaoObra);
        this.setValorPecas(valorPecas);
    }
    
    public float getValorMaoObra(){
        return this.valorMaoObra;
    }
    
    public void setValorMaoObra(float valorMaoObra){
        this.valorMaoObra = valorMaoObra;
    }
    
    public float getValorPecas(){
        return this.valorPecas;
    }
    
    public void setValorPecas(float valorPecas){
        this.valorPecas = valorPecas;
    }
    
    public abstract float calcularValorManutencao();
    
    public abstract String tipoClasse();
}
