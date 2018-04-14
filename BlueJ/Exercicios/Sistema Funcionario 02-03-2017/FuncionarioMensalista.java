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
   
   public int getLimiteDependentes(){
       return 3;
    }
    
   public float getValorDependente(){
       return 100f;
    }
    
   public float getValorLimite(){
       return 0.50f;
    }
}
