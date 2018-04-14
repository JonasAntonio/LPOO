public class FuncionarioMensalista extends Funcionario
{
   private float valorMes;
   
   public FuncionarioMensalista(){};
   
   public FuncionarioMensalista(float valorMes){
       this.setValorMes(valorMes);
   }
   
   public FuncionarioMensalista(String nome, int matricula, int qtdeValesDia, int numDependentes, float valorMes, Cargo cargo){
       super(nome, matricula, qtdeValesDia, numDependentes, cargo);
       this.setValorMes(valorMes);
   }
   
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
    
   public float getLimitePercentual(){
       return 0.50f;
    }
    
    public float calcularReajuste(float percentual){
        return (calcularSalario() * (1 + (percentual /100)));
    }
    
    public float calcularReajuste(float percentual, float bonus){
        return ((calcularSalario() * (1 + (percentual /100))) + bonus);
    }
    
    @Override
    public float calcularBonus(){
        return this.calcularSalario() + 150;
    }
}
