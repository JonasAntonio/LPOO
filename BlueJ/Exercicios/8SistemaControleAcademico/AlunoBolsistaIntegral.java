public class AlunoBolsistaIntegral extends Aluno
{
    private float parcelasIsentas;
    
    public AlunoBolsistaIntegral(int matricula, String nome, String endereco, float parcelasIsentas){
        super(matricula, nome, endereco);
        this.setParcelasIsentas(parcelasIsentas);
    }
    
    public float getParcelasIsentas(){
        return this.parcelasIsentas;
    }
    
    public void setParcelasIsentas(float parcelasIsentas){
        this.parcelasIsentas = parcelasIsentas;
    }
    
    public float getValMensalidade(){
        return 0;
    }
    
    public int numMensalidade(){
        return 0;
    }
    
    public float calcularValorMensalidade(){
        return this.getParcelasIsentas();
    }
    
    public String tipoClasse(){
        return "Bolsista Integral";
    }
}
