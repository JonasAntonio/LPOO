public class FuncionarioHorista extends Funcionario
{
  private float valorHora;
  private int numDias;
  private int numHorasDia;
  
  public FuncionarioHorista(){};
  
  public FuncionarioHorista(float valorHora, int numDias, int numHorasDia){
      this.setValorHora(valorHora);
      this.setNumDias(numDias);
      this.setNumHorasDia(numHorasDia);
  }
  
  public FuncionarioHorista(String nome, int matricula, int qtdeValesDia, int numDependentes, float valorHora, int numDias, int numHorasDia, Cargo cargo){
      super(nome, matricula, qtdeValesDia, numDependentes, cargo);
      this.setValorHora(valorHora);
      this.setNumDias(numDias);
      this.setNumHorasDia(numHorasDia);
    }
  
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
  
  public int getLimiteDependentes(){
      return ParametrosFuncionarioHorista.getLimiteDependentes();
    }
  public float getValorDependente(){
      return ParametrosFuncionarioHorista.getValorDependente();
    }
  public float getLimitePercentual(){
      return ParametrosFuncionarioHorista.getLimitePercentual();
    }
}
