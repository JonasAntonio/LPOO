public class AlunoEstadoDesistente implements AlunoEstado
{
    public String matricular(){
        return "Aluno desistente nao pode matricular";
    }
    
    public String trancar(){
        return "Aluno desistente nao pode trancar";
    }
    
    public String desistir(){
        return "Aluno desistente nao pode desistir";
    }
    
    public String formar(){
        return "Aluno desistente nao pode formar";
    }
    
    public String jubilar(){
        return "Aluno desistente nao pode jubilar";
    }
}
