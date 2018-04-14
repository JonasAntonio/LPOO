public class AlunoEstadoDesistente implements AlunoEstado
{
    public String matricular(Aluno aluno){
        return "Aluno desistente nao pode matricular";
    }
    
    public String trancar(Aluno aluno){
        return "Aluno desistente nao pode trancar";
    }
    
    public String desistir(Aluno aluno){
        return "Aluno desistente nao pode desistir";
    }
    
    public String formar(Aluno aluno){
        return "Aluno desistente nao pode formar";
    }
    
    public String jubilar(Aluno aluno){
        return "Aluno desistente nao pode jubilar";
    }
}
