import java.util.ArrayList;
import java.util.Iterator;

public class Departamento
{
    private String descricao;
    private Funcionario chefe;
    private Empresa empresa;
    private ArrayList<Funcionario> funcionarios;
    
    public Departamento(){
        funcionarios = new ArrayList<Funcionario>();
    }
    
    public Departamento (String descricao, Funcionario chefe, Empresa empresa){
        this.setDescricao(descricao);
        this.setChefe(chefe);
        this.setEmpresa(empresa);
        funcionarios = new ArrayList<Funcionario>();
    }
    
    public String getDescricao(){
        return this.descricao;
    }
    
    public void setDescricao(String descricao){
        this.descricao = descricao;
    }
    
    public Funcionario getChefe(){
        return this.chefe;
    }
    
    public void setChefe(Funcionario chefe){
        this.chefe = chefe;
    }
    
    public Empresa getEmpresa(){
        return this.empresa;
    }
    
    public void setEmpresa(Empresa empresa){
        this.empresa = empresa;
    }
    
    public String getNomeChefe(){
        if(this.chefe != null){
            return this.chefe.getNome(); //ou this.getChefe().getNome();
        } else {
            return "Departamento não tem chefe";
        }
    }
    
   public void addFuncionario(Funcionario funcionario){
       this.funcionarios.add(funcionario);
    }
    
    public void listarFuncionarios(){
        for(Iterator i = funcionarios.iterator(); i.hasNext();){
            System.out.println(i.next());
        }
    }
    
    public boolean funcionarioDepartamento(String nome){
        boolean funcDepart = false;
        for(Iterator i = funcionarios.iterator(); i.hasNext();){
            Funcionario func = (Funcionario)i.next();
            if(func.getNome().equals(nome)){
                funcDepart = true;
            }
        }
        return funcDepart;
    }
}
