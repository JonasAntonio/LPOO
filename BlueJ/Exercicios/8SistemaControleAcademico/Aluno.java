public abstract class Aluno
{
    private int matricula;
    private String nome;
    private String endereco;
    private float valMensalidade;
    private int numMensalidade;
    
    public Aluno(int matricula, String nome, String endereco){
        this.setMatricula(matricula);
        this.setNome(nome);
        this.setEndereco(endereco);
    }
    
    public Aluno(int matricula, String nome, String endereco, float valMensalidade, int numMensalidade){
        this.setMatricula(matricula);
        this.setNome(nome);
        this.setEndereco(endereco);
        this.setValMensalidade(valMensalidade);
        this.setNumMensalidade(numMensalidade);
    }
    
    public int getMatricula(){
        return this.matricula;
    }
    
    public void setMatricula(int matricula){
        this.matricula = matricula;
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public String getEndereco(){
        return this.endereco;
    }
    
    public void setEndereco(String endereco){
        this.endereco = endereco;
    }
    
    public float getValMensalidade(){
        return this.valMensalidade;
    }
    
    public void setValMensalidade(float valMensalidade){
        this.valMensalidade = valMensalidade;
    }
    
    public int getNumMensalidade(){
        return this.numMensalidade;
    }
    
    public void setNumMensalidade(int numMensalidade){
        this.numMensalidade = numMensalidade;
    }
    
    public abstract float calcularValorMensalidade();
    
    public abstract String tipoClasse();
    
    public String dadosAluno(){
        return " Aluno: " + this.getNome() + " Matricula: " + this.getMatricula() + " Tipo de Aluno: " + this.tipoClasse() +
        " Endereço: " + this.getEndereco() + " Valor da Mensalidade: " + this.getValMensalidade() + " Mensalidades: " + this.getNumMensalidade();
    }
}
