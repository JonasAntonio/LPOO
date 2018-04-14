import java.util.ArrayList;

public class Curso
{
    private int codigo;
    private String descricao;
    private int cHoraria;
    private ArrayList<Aluno> alunos;
    
    public Curso(){
        alunos = new ArrayList<Aluno>();
    }
    
    public Curso(int codigo, String descricao, int cHoraria){
        this.setCodigo(codigo);
        this.setDescricao(descricao);
        this.setCHoraria(cHoraria);
        alunos = new ArrayList<Aluno>();
    }
    
    public int getCodigo(){
        return this.codigo;
    }
    
    public void setCodigo(int codigo){
        this.codigo = codigo;
    }
    
    public String getDescricao(){
        return this.descricao;
    }
    
    public void setDescricao(String descricao){
        this.descricao = descricao;
    }
    
    public int getCHoraria(){
        return this.cHoraria;
    }
    
    public void setCHoraria(int cHoraria){
        this.cHoraria = cHoraria;
    }
    
    public void addAluno(Aluno aluno){
        this.alunos.add(aluno);
    }
    
    public String dadosCurso(){
        return " Curso: " + this.getDescricao() + " Codigo: " + this.getCodigo() + 
        " Carga Horaria: " + this.getCHoraria();
    }
    
    public void consultarAlunosCurso(){
        for(int i = 0; i < alunos.size(); i++){
            System.out.println(this.dadosCurso() + this.alunos.get(i).dadosAluno());
        }
    }
}
