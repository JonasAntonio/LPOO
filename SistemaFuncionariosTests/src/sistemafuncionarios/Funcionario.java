package sistemafuncionarios;

public abstract class Funcionario
{
    private int matricula;
    private String nome;
    private int qtdeValesDia;
    private float limiteDependentes;
    private int numDependentes;
    private Cargo cargo;
    private static float valorUnitarioVT;
    private static float valorPercentualLimiteVT;
    private static float valorBonus;
    
    public Funcionario(){}
    
    public Funcionario(String nome, int matricula, int qtdeValesDia, int numDependentes, Cargo cargo){
        this.setMatricula(matricula);
        this.setNome(nome);
        this.setQtdeValesDia(qtdeValesDia);
        this.setNumDependentes(numDependentes);
        this.setCargo(cargo);
    }
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
    
    public Cargo getCargo(){
        return this.cargo;
    }
    
    public void setCargo(Cargo cargo){
        this.cargo = cargo;
    }
    
    public static float getValorUnitarioVT(){
        return 2.75f;
    }
    
    public static float getValorPercentualLimiteVT(){
        return 0.06f;
    }
    
    public static float getValorBonus(){
        return 100;
    }
    
    public abstract float calcularSalario();
   
    public float aumentaPorcento(float valorAumento) {
       return this.calcularSalario() * (1+ (valorAumento/100));
    }
    
    public abstract int getNumDias();
  
    public float calcularValeTransporte() {
        float valorVT = this.getNumDias() * getValorUnitarioVT() * this.getQtdeValesDia();
        float limiteVT = this.calcularSalario() * getValorPercentualLimiteVT();
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
        
         if(getNumDependentes() > getLimiteDependentes()){//1
            valorSalarioFamilia = this.getValorDependente() * this.getLimiteDependentes();//2
         }else{
            valorSalarioFamilia = this.getValorDependente() * this.getNumDependentes();//3
         }
         
        if(valorSalarioFamilia > this.calcularSalario() * this.getLimitePercentual()){//4 
            valorSalarioFamilia = this.calcularSalario() * this.getLimitePercentual();//5
        }
        
        return valorSalarioFamilia;//6
        
    }
 
    public float calcularBonus(){
        return this.calcularSalario() + getValorBonus();
    }
    
    public String toString(){
        return this.nome;
    }
}
