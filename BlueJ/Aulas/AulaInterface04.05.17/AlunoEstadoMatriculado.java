public class AlunoEstadoMatriculado implements AlunoEstado
{
    public String matricular(){
        return "Aluno matriculado nao pode matricular";
    }
    
    public String trancar(){
        return "Aluno matriculado pode trancar";
    }
    
    public String desistir(){
        return "Aluno matriculado pode desistir";
    }
    
    public String formar(){
        return "Aluno matriculado pode formar";
    }
    
    public String jubilar(){
        return "Aluno matriculado pode jubilar";
    }
}
