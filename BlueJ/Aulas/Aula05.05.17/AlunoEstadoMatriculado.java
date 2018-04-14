public class AlunoEstadoMatriculado implements AlunoEstado
{
    public String matricular(Aluno aluno){
        return "Aluno matriculado nao pode matricular";
    }
    
    public String trancar(Aluno aluno){
        aluno.setEstado(new AlunoEstadoTrancado());
        return "Aluno matriculado pode trancar";
    }
    
    public String desistir(Aluno aluno){
        aluno.setEstado(new AlunoEstadoDesistente());
        return "Aluno matriculado pode desistir";
    }
    
    public String formar(Aluno aluno){
        aluno.setEstado(new AlunoEstadoFormado());
        return "Aluno matriculado pode formar";
    }
    
    public String jubilar(Aluno aluno){
        aluno.setEstado(new AlunoEstadoJubilado());
        return "Aluno matriculado pode jubilar";
    }
}
