public class AlunoEstadoTrancado implements AlunoEstado
{
    public String matricular(Aluno aluno){
        aluno.setEstado(new AlunoEstadoMatriculado());
        return "Aluno trancado pode matricular";
    }
    
    public String trancar(Aluno aluno){
        return "Aluno trancado nao pode trancar";
    }
    
    public String desistir(Aluno aluno){
        aluno.setEstado(new AlunoEstadoDesistente());
        return "Aluno trancado pode desistir";
    }
    
    public String formar(Aluno aluno){
        return "Aluno trancado nao pode formar";
    }
    
    public String jubilar(Aluno aluno){
        aluno.setEstado(new AlunoEstadoJubilado());
        return "Aluno trancado pode jubilar";
    }
}
