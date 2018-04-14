
public class FuncionarioDiarista
{
   private float valorDia;
   private int numDias;
   
   public float getValorDia(){
       return this.valorDia;
   }
   
   public void setValorDia(float valorDia){
       this.valorDia = valorDia;
   }
   
   public int getNumDias(){
       return this.numDias;
   }
   
   public void setNumDias(int numDias){
       this.numDias = numDias;
   }
    
   public float calcularSalario(){
       return this.valorDia*this.numDias;
   }
   
   public float aumento(float valorAumento){
       return this.calcularSalario() * (1+valorAumento/100);
   }
}
