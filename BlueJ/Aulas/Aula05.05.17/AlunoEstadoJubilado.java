public class AlunoEstadoJubilado implements AlunoEstado
{
    public String matricular(Aluno aluno){
        return "Aluno jubilado nao pode matricular";
    }
    
    public String trancar(Aluno aluno){
        return "Aluno jubilado nao pode trancar";
    }
    
    public String desistir(Aluno aluno){
        return "Aluno jubilado nao pode desistir";
    }
    
    public String formar(Aluno aluno){
        return "Aluno jubilado nao pode formar";
    }
    
    public String jubilar(Aluno aluno){
        return "Aluno jubilado nao pode jubilar";
    }
}
