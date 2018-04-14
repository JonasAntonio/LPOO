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
   
   public int limiteDependentes() {
       return 2;
   }
   
   public float valorDependente() {
       return 50.00f;
   }
   
   public float valorLimite() {
       return this.calcularSalario() * 0.30f;
   }
}
