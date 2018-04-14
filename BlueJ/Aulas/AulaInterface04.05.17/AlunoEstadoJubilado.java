public class AlunoEstadoJubilado implements AlunoEstado
{
    public String matricular(){
        return "Aluno jubilado nao pode matricular";
    }
    
    public String trancar(){
        return "Aluno jubilado nao pode trancar";
    }
    
    public String desistir(){
        return "Aluno jubilado nao pode desistir";
    }
    
    public String formar(){
        return "Aluno jubilado nao pode formar";
    }
    
    public String jubilar(){
        return "Aluno jubilado nao pode jubilar";
    }
}
