public class Casa extends Lote
{
    private int areaConstrucao;
    
    public Casa(){}
    
    public Casa(int areaTerreno, int areaConstrucao){
        super(areaTerreno);
        this.setAreaConstrucao(areaConstrucao);
    }
    
    public int getAreaConstrucao(){
        return this.areaConstrucao;
    }
    
    public void setAreaConstrucao(int areaConstrucao){
        this.areaConstrucao = areaConstrucao;
    }
    
    public float calcularValorImovel(){
        return (this.getAreaTerreno() * 30) + (this.getAreaConstrucao() * 50);
    }
    
    public String tipoClasse(){
        return "Casa";
    }
}
