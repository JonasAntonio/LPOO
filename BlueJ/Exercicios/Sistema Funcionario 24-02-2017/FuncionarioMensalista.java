public class FuncionarioMensalista extends Funcionario
{
   private float valorMes;
   
   public float getValorMes() {
       return this.valorMes;
   }
   
   public void setValorMes(float valorMes) {
       this.valorMes = valorMes;
   }
   
   public int getNumDias() {
       return 20;
   }
   
   public float calcularSalario() {
       return this.valorMes;
   }
   
   public int limiteDependentes() {
       return 3;
   }
   
   public float valorDependente() {
       return 100.00f;
   }
   
   public float valorLimite() {
       return this.calcularSalario() * 0.50f;
   }
}
