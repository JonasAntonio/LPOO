public class FuncionarioHorista extends Funcionario
{
  private float valorHora;
  private int numDias;
  private int numHorasDia;
  
  public float getValorHora() {
      return this.valorHora;
  }
  
  public void setValorHora(float valorHora) {
      this.valorHora = valorHora;
  }
  
  public int getNumDias() {
      return this.numDias;
  }
  
  public void setNumDias(int numDias) {
      this.numDias = numDias;
  }
  
  public int getNumHorasDia() {
      return this.numHorasDia;
  }
  
  public void setNumHorasDia(int numHorasDia){
      this.numHorasDia = numHorasDia;
  }
  
  public float calcularSalario() {
      return this.valorHora*this.numHorasDia*this.numDias;
  }
  
  public int limiteDependentes() {
       return 1;
  }
   
  public float valorDependente() {
       return 25.00f;
  }
   
  public float valorLimite() {
       return this.calcularSalario() * 0.20f;
  }
}
