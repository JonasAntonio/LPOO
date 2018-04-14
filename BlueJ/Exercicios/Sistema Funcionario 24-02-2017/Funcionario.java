public abstract class Funcionario
{
    private int matricula;
    private String nome;
    private float valorVT;
    private int qtdeValesDia;
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
    
    public int getNumDependentes() {
        return this.numDependentes;
    }
    
    public void setNumDependentes(int numDependendes) {
       this.numDependentes = numDependentes;
    }
    
    public abstract int limiteDependentes();
    public abstract float valorDependente();
    public abstract float valorLimite();
        
    public float calcularSalarioFamilia() {
        if(getNumDependentes() > limiteDependentes()) {
           this.numDependentes = limiteDependentes();
        }
        float salarioFamilia = valorDependente() * this.numDependentes;
        if (salarioFamilia > valorLimite()) {
            salarioFamilia = valorLimite();
        }
        return salarioFamilia;
    }
}
