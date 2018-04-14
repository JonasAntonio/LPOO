public class Aluno
{
    private String nome;
    private AlunoEstado estado;
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public void setEstado(AlunoEstado estado){
        this.estado = estado;
    }
    
    public AlunoEstado getEstado(){
        return this.estado;
    }
    
    public String matricular(){
        return this.estado.matricular(this);
    }
    
    public String trancar(){
        return this.estado.trancar(this);
    }
    
    public String desistir(){
        return this.estado.desistir(this);
    }
    
    public String formar(){
        return this.estado.formar(this);
    }
    public String jubilar(){
        return this.estado.jubilar(this);
    }
    
    
}
