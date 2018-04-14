public class FuncionarioDiarista extends Funcionario
{
   private float valorDia;
   private int numDias;
   
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
   
   public float getValorLimite(){
       return 0.3f;
    }
}
