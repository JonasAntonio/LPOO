import java.util.ArrayList;

public class Hospede
{
    private int codigo;
    private String nome;
    private ArrayList<Reserva> reservas;
    
    public Hospede(){
        reservas = new ArrayList<Reserva>();
    }
    
    public Hospede(int codigo, String nome){
        this.setCodigo(codigo);
        this.setNome(nome);
        reservas = new ArrayList<Reserva>();
    }
    
    public int getCodigo(){
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
    
    public void addReserva(Reserva reserva){
        this.reservas.add(reserva);
    }
    
    public void consultaReservas(){
        for(int i = 0; i < reservas.size(); i++){
            System.out.println("Cliente: " + this.getNome() + this.reservas.get(i).dadosReserva());
        }
    }
}
