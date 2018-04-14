package sistemafuncionarios;

import java.util.ArrayList;
import java.util.Iterator;

public class Projeto
{
    private String descricao;
    private ArrayList<Funcionario> funcionarios;
    
    public Projeto(){
        funcionarios = new ArrayList<Funcionario>();
    }
    
    public void setDescricao(String descricao){
        this.descricao = descricao;
    }
    
    public String getDescricao(){
        return this.descricao;
    }
    
    public void alocarFuncionario(Funcionario funcionario){
        this.funcionarios.add(funcionario);
    }
    
    public void listarFuncionarios(){
        for(Iterator i = funcionarios.iterator(); i.hasNext();){
            System.out.println(i.next());
        }
    }
}

