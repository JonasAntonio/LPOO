import java.util.ArrayList;

public class Reserva
{
    private int numDias;
    private ArrayList<Quarto> quartos;
    
    public Reserva(){
        quartos = new ArrayList<Quarto>();
    }
    
    public Reserva(int numDias){
        this.setNumDias(numDias);
        quartos = new ArrayList<Quarto>();
    }
    
    public int getNumDias(){
        return this.numDias;
    }
    
    public void setNumDias(int numDias){
        this.numDias = numDias;
    }
    
    public void adicionarQuarto(Quarto quarto){
        this.quartos.add(quarto);
    }
    
    public float calcValReserva(){
        float valorReserva = 0;
        for(int i = 0; i < quartos.size(); i++){
            valorReserva = (this.quartos.get(i).getValorDia() * this.getNumDias()) + this.quartos.get(i).getNumRef();
        }
        return valorReserva;
    }
    
    public String dadosReserva(){
        String dados = "";
        for(int i = 0; i < quartos.size(); i++){
            dados = " Tipo do Quarto: " + this.quartos.get(i).tipoClasse() + " Valor por Dia: " +
            this.quartos.get(i).getValorDia() + " Numero de Refeições: " + this.quartos.get(i).getNumRef() + " Numero de Dias: " + 
            this.getNumDias() + " Valor Total: " + this.calcValReserva();
        }
        return dados;
    }
    
    public void consultaValorReserva(){
        for(int i = 0; i < quartos.size(); i++){
            System.out.println("Valor da Reserva: " + this.calcValReserva());
        }
    }
}
