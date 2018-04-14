public class Carro extends Veiculo
{
    private int qtdPortas;
    private int cavalos;
    private int tamPortaMalas;
    private String chassi;
    
    public Carro(){}
    
    public Carro(String modelo, int ano, String placa, float preco, String marca, int qtdPortas, int cavalos, int tamPortaMalas, String chassi){
        super(modelo, ano, placa, preco, marca);
        this.setQtdPortas(qtdPortas);
        this.setCavalos(cavalos);
        this.setTamPortaMalas(tamPortaMalas);
        this.setChassi(chassi);
    }
    
    public int getQtdPortas(){
        return this.qtdPortas;
    }
    
    public void setQtdPortas(int qtdPortas){
        this.qtdPortas = qtdPortas;
    }
    
    public int getCavalos(){
        return this.cavalos;
    }
    
    public void setCavalos(int cavalos){
        this.cavalos = cavalos;
    }
    
    public int getTamPortaMalas(){
        return this.tamPortaMalas;
    }
    
    public void setTamPortaMalas(int tamPortaMalas){
        this.tamPortaMalas = tamPortaMalas;
    }
    
    public String getChassi(){
        return this.chassi;
    }
    
    public void setChassi(String chassi){
        this.chassi = chassi;
    }
    
    public String dadosCarro(){
        return "Quantidade de Portas: " + this.getQtdPortas() + "Cavalos: " + this.getCavalos() + 
        "Capacidade do Porta-Malas: " + this.getTamPortaMalas() + "Chassi: " + this.getChassi();
    }
    
    public String tipoVeiculo(){
        return "Carro";
    }
}
