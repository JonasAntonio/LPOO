public class FuncionarioDiarista extends Funcionario
{
   private float valorDia;
   private int numDias;
   
   public FuncionarioDiarista(){};
   
   public FuncionarioDiarista(float valorDia, int numDias){
       this.setValorDia(valorDia);
       this.setNumDias(numDias);
   }
   
   public FuncionarioDiarista(String nome, int matricula, int qtdeValesDia, int numDependentes, float valorDia, int numDias){
       super(nome, matricula, qtdeValesDia, numDependentes);
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
       return 2;
    }
    
   public float getValorDependente(){
       return 50f;
    }
   
   public float getLimitePercentual(){
       return 0.3f;
    }
}
