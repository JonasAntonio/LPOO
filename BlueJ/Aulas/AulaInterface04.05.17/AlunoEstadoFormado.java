public class AlunoEstadoFormado implements AlunoEstado
{
    public String matricular(){
        return "Aluno formado nao pode matricular";
    }
    
    public String trancar(){
        return "Aluno formado nao pode trancar";
    }
    
    public String desistir(){
        return "Aluno formado nao pode desistir";
    }
    
    public String formar(){
        return "Aluno formado nao pode formar";
    }
    
    public String jubilar(){
        return "Aluno formado nao pode jubilar";
    }
}
