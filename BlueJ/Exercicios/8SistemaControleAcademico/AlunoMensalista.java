public class AlunoMensalista extends Aluno
{   
    public AlunoMensalista(int matricula, String nome, String endereco, float valMensalidade, int numMensalidade){
        super(matricula, nome, endereco, valMensalidade, numMensalidade);
    }
    
    public float calcularValorMensalidade(){
        return this.getValMensalidade();
    }
    
    public String tipoClasse(){
        return "Mensalista";
    }
}
