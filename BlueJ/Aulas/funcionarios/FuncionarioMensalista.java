public class FuncionarioMensalista
{
   private float valorMes;
   
   public float getValorMes(){
       return this.valorMes;
   }
   
   public void setValorMes(float valorMes){
       this.valorMes = valorMes;
   }
   
   public float calcularSalario(){
       return this.valorMes;
   }
   
   public float aumento(float valorAumento){
       return this.calcularSalario()*(1+valorAumento/100);
   }
}
