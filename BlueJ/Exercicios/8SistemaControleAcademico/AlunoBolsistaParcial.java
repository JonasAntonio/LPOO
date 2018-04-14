public class AlunoBolsistaParcial extends Aluno
{
    private float percentualDesconto;
    
    public AlunoBolsistaParcial(int matricula, String nome, String endereco, float valMensalidade, int numMensalidade, float percentualDesconto){
        super(matricula, nome, endereco, valMensalidade, numMensalidade);
        this.setPercentualDesconto(percentualDesconto);
    }
    
    public float getPercentualDesconto(){
        return this.percentualDesconto;
    }
    
    public void setPercentualDesconto(float percentualDesconto){
        this.percentualDesconto = percentualDesconto;
    }
    
    public float calcularValorMensalidade(){
        float valMensalidadeTot = 0;
        if(getPercentualDesconto() > 50){
            this.setPercentualDesconto(percentualDesconto);
            System.out.println("Valor do desconto é superior ao limite de 50%");
            
        } else {
            valMensalidadeTot = this.getValMensalidade() - (this.getValMensalidade() * this.getPercentualDesconto()/100);
        }
        return valMensalidadeTot;
    }
    
    public String tipoClasse(){
        return "Bolsista Parcial";
    }
}
