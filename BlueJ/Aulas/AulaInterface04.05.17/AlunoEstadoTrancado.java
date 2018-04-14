public class AlunoEstadoTrancado implements AlunoEstado
{
    public String matricular(){
        return "Aluno trancado pode matricular";
    }
    
    public String trancar(){
        return "Aluno trancado nao pode trancar";
    }
    
    public String desistir(){
        return "Aluno trancado pode desistir";
    }
    
    public String formar(){
        return "Aluno trancado nao pode formar";
    }
    
    public String jubilar(){
        return "Aluno trancado pode jubilar";
    }
}
