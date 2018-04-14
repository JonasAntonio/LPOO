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
    
    public ArrayList listarFuncionarios(){
        for(int i = 0; i < funcionarios.size(); i++){
            System.out.println(funcionarios.get(i));
        }
        return funcionarios;
    }
}

