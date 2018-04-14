public class FuncionarioHorista
{
  private float valorHoras;
  private int numDias;
  private int numHorasDias;
  
  public float getValorHoras(){
      return this.valorHoras;
  }
  
  public void setValorHoras(float valorHoras){
      this.valorHoras = valorHoras;
  }
  
  public int getNumDias(){
      return this.numDias;
  }
  
  public void setNumDias(int numDias){
      this.numDias = numDias;
  }
  
  public int getNumHorasDias(){
      return this.numHorasDias;
  }
  
  public void setNumHorasDias(int numHorasDias){
      this.numHorasDias = numHorasDias;
  }
  public float calcularSalario(){
      return this.valorHoras*this.numDias*this.numHorasDias;
  }
  
  public float aumento(float valorAumento){
      return this.calcularSalario() * (1+valorAumento/100);
  }
}
