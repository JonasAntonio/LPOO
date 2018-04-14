public class Apartamento extends Imovel
{
    private int areaApartamento;
    private int andar;
    
    public Apartamento(){}
    
    public Apartamento(int areaApartamento, int andar){
        this.setAreaApartamento(areaApartamento);
        this.setAndar(andar);
    }
    
    public int getAreaApartamento(){
        return this.areaApartamento;
    }
    
    public void setAreaApartamento(int areaApartamento){
        this.areaApartamento = areaApartamento;
    }
    
    public int getAndar(){
        return this.andar;
    }
    
    public void setAndar(int andar){
        this.andar = andar;
    }
    
    @Override
    public int getAreaTerreno(){
        return 0;
    }
    
    public float calcularValorImovel(){
        float valorImovel;
       if(this.getAndar() > 1){
           valorImovel = (this.getAreaApartamento() * 40) - ((this.getAndar() * 0.1f) * 100);
       } else{
           valorImovel = this.getAreaApartamento() * 40;
       }
       return valorImovel;
    }
    
    public String tipoClasse(){
        return "Apartamento";
    }
}
