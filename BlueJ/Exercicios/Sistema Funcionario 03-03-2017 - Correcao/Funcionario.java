public abstract class Funcionario
{
    private int matricula;
    private String nome;
    private float valorVT;
    private int qtdeValesDia;
    private float limiteDependentes;
    private float valorDependente;
    private float valorLimite;
    private int numDependentes;
    
    public int getMatricula() {
        return this.matricula;
    }
    
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
    
    public String getNome() {
        return this.nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public int getQtdeValesDia() {
        return this.qtdeValesDia;
    }
    
    public void setQtdeValesDia(int qtdeValesDia) {
        this.qtdeValesDia = qtdeValesDia;
    }
    
        public void setNumDependentes(int numDependentes){
        this.numDependentes = numDependentes;
    }
    
    public int getNumDependentes(){
        return numDependentes;
    }
    
    public abstract float calcularSalario();
   
    public float aumentaPorcento(float valorAumento) {
       return this.calcularSalario() * (1+ (valorAumento/100));
    }
    
    public abstract int getNumDias();
  
    public float calcularValeTransporte() {
        float valorVT = this.getNumDias() * 2.75f * this.qtdeValesDia;
        float limiteVT = this.calcularSalario() * 0.06f;
        if (valorVT > limiteVT) {
           valorVT = limiteVT;
        }
        return valorVT;
    }
    
    public abstract int getLimiteDependentes();
    public abstract float getValorDependente();
    public abstract float getLimitePercentual();

    public float calcularSalarioFamilia(){
        
        float valorSalarioFamilia;
        
         if(getNumDependentes() > getLimiteDependentes()){
            valorSalarioFamilia = this.getValorDependente() * this.getLimiteDependentes();
         }else{
            valorSalarioFamilia = this.getValorDependente() * this.numDependentes;
         }
         
        if(valorSalarioFamilia > this.calcularSalario() * this.getLimitePercentual()){
            valorSalarioFamilia = this.calcularSalario() * this.getLimitePercentual();
        }
        
        return valorSalarioFamilia;
        
    }
    
}
