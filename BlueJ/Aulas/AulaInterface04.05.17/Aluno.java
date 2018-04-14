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
        return this.estado.matricular();
    }
    
    public String trancar(){
        return this.estado.trancar();
    }
    
    public String desistir(){
        return this.estado.desistir();
    }
    
    public String formar(){
        return this.estado.formar();
    }
    public String jubilar(){
        return this.estado.jubilar();
    }
    
    
}
