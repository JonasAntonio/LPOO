import java.util.ArrayList;

public class Empresa
{
    private String razaoSocial;
    private ArrayList<Departamento> departamentos;
    
    public Empresa(){
        departamentos = new ArrayList<Departamento>();
    }
    
    public Empresa(String razaoSocial){
        this.setRazaoSocial(razaoSocial);
        departamentos = new ArrayList<Departamento>();
    }
    
    public String getRazaoSocial(){
        return this.razaoSocial;
    }
    
    public void setRazaoSocial(String razaoSocial){
        this.razaoSocial = razaoSocial;
    }
    
    public void adicionarDepartamento(Departamento departamento){
        this.departamentos.add(departamento);
    }
    
    public float calcularFolhaPagamento(){
        float valorTotal = 0;
        for(int i = 0; i < departamentos.size(); i++){
            valorTotal += this.departamentos.get(i).calcularFolhaDepartamento();
        }
        return valorTotal;
    }
}
