public class AlunoEstadoFormado implements AlunoEstado
{
    public String matricular(Aluno aluno){
        return "Aluno formado nao pode matricular";
    }
    
    public String trancar(Aluno aluno){
        return "Aluno formado nao pode trancar";
    }
    
    public String desistir(Aluno aluno){
        return "Aluno formado nao pode desistir";
    }
    
    public String formar(Aluno aluno){
        return "Aluno formado nao pode formar";
    }
    
    public String jubilar(Aluno aluno){
        return "Aluno formado nao pode jubilar";
    }
}
