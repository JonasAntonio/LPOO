package sistemafuncionarios;

public class FuncionarioDiarista extends Funcionario
{
   private float valorDia;
   private int numDias;
   
   public FuncionarioDiarista(){};
   
   public FuncionarioDiarista(float valorDia, int numDias){
       this.setValorDia(valorDia);
       this.setNumDias(numDias);
   }
   
   public FuncionarioDiarista(String nome, int matricula, int qtdeValesDia, int numDependentes, float valorDia, int numDias, Cargo cargo){
       super(nome, matricula, qtdeValesDia, numDependentes, cargo);
       this.setValorDia(valorDia);
       this.setNumDias(numDias);
    }
   
   public float getValorDia() {
       return this.valorDia;
   }
    
   public void setValorDia(float valorDia) {
       this.valorDia = valorDia;
   }
   
   public int getNumDias() {
       return this.numDias;
   }
   
   public void setNumDias(int numDias) {
       this.numDias = numDias;
   }
   
   public float calcularSalario() {
       return this.valorDia*this.numDias;
   }
   
   public int getLimiteDependentes(){
       return ParametrosFuncionarioDiarista.getLimiteDependentes();
    }
    
   public float getValorDependente(){
       return ParametrosFuncionarioDiarista.getValorDependente();
    }
   
   public float getLimitePercentual(){
       return ParametrosFuncionarioDiarista.getLimitePercentual();
    }
}
