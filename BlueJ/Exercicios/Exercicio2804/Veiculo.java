public abstract class Veiculo
{
    private String modelo;
    private int ano;
    private String placa;
    private float preco;
    private String marca;
    
    public Veiculo(){}
    
    public Veiculo(String modelo, int ano, String placa, float preco, String marca){
        this.setModelo(modelo);
        this.setAno(ano);
        this.setPlaca(placa);
        this.setPreco(preco);
        this.setMarca(marca);
    }
    
    public String getModelo(){
        return this.modelo;
    }
    
    public void setModelo(String modelo){
        this.modelo = modelo;
    }
    
    public int getAno(){
        return this.ano;
    }
    
    public void setAno(int ano){
        this.ano = ano;
    }
    
    public String getPlaca(){
        return this.placa;
    }
    
    public void setPlaca(String placa){
        this.placa = placa;
    }
    
    public float getPreco(){
        return this.preco;
    }
    
    public void setPreco(float preco){
        this.preco = preco;
    }
    
     public String getMarca(){
        return this.marca;
    }
    
    public void setMarca(String marca){
        this.marca = marca;
    }
    
    public abstract String tipoVeiculo();
    
    public String dadosVeiculo(){
        return "Tipo do Veiculo: " + this.tipoVeiculo() + "Modelo: " + this.getModelo() + "Marca: " + this.getMarca() + 
        "Ano: " + this.getAno() + "Placa: " + this.getPlaca() + "Preço: " + this.getPreco();
    }
    
}
