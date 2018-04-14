import java.util.ArrayList;

public class Contribuinte
{
    private int codigo;
    private String nome;
    private ArrayList<Imovel> imoveis;
    
    public Contribuinte(){
        imoveis = new ArrayList<Imovel>();
    }
    
    public Contribuinte(int codigo, String nome){
        this.setCodigo(codigo);
        this.setNome(nome);
        imoveis = new ArrayList<Imovel>();
    }
    
    public int codigo(){
        return this.codigo;
    }
    
    public void setCodigo(int codigo){
        this.codigo = codigo;
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public void addImovel(Imovel imovel){
        this.imoveis.add(imovel);
    }
    
    public void consultaCliente(){
        for(int i = 0; i < imoveis.size(); i++){
            System.out.println("Cliente: " + this.getNome() + " Tipo do Imovel: " + this.imoveis.get(i).tipoClasse());
        }
    }
    
    public void consultaValorImovel(){
        for(int i = 0; i < imoveis.size(); i++){
            System.out.println("Cliente: " + this.getNome() + " Valor: " + this.imoveis.get(i).calcularValorImovel());
        }
    }
    
}

