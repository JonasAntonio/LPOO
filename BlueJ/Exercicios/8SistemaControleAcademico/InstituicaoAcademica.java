import java.util.ArrayList;

public class InstituicaoAcademica
{
    private ArrayList<Aluno> alunos;
    private ArrayList<Curso> cursos;
    
    public void adidionarAluno(Aluno aluno){
        this.alunos.add(aluno);
    }
    
    public void adicionarCurso(Curso curso){
        this.cursos.add(curso);
    }
    
    public void consultaAlunos(){
        for(int i = 0; i < alunos.size(); i++){
            System.out.println(this.alunos.get(i).dadosAluno());
        }
    }
}
