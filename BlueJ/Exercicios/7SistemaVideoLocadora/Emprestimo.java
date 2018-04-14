import java.util.ArrayList;

public class Emprestimo
{
    private String data;
    private int numDiasEmp;
    private ArrayList<Fita> fitas;
    
    public Emprestimo(){
        fitas = new ArrayList<Fita>();
    }
    
    public Emprestimo(String data, int numDiasEmp){
        this.setData(data);
        this.setNumDiasEmp(numDiasEmp);
        fitas = new ArrayList<Fita>();
    }
    
    public String getData(){
        return this.data;
    }
    
    public void setData(String data){
        this.data = data;
    }

    public int getNumDiasEmp(){
        return this.numDiasEmp;
    }
    
    public void setNumDiasEmp(int numDiasEmp){
        this.numDiasEmp = numDiasEmp;
    }
    
    public void adicionarFita(Fita fita){
        this.fitas.add(fita);
    }
    
    public String dadosFita(){
        String dadosFita = "";
        for(int i = 0; i < fitas.size(); i++){
            dadosFita = "Nome da Fita: " + fitas.get(i).getNomeFita() + " Preço do emprestimo: " + fitas.get(i).calcularValorFita();
        }
        return dadosFita;
    }
    
    public String imprimeConsultaCliente(){
        return dadosFita();
    }
    
    public void consultaEmprestimoFitas(){
        for(int i = 0; i < fitas.size(); i++){
            System.out.println(fitas.get(i).imprimeConsultaEmprestimos());
        }
    }
}
