public abstract class Imovel
{
    private int areaTerreno;
    private Contribuinte contribuinte;
    
    public Imovel(){}
    
    public Imovel(int areaTerreno){
        this.setAreaTerreno(areaTerreno);
    }
    
    public int getAreaTerreno(){
        return this.areaTerreno;
    }
    
    public void setAreaTerreno(int areaTerreno){
        this.areaTerreno = areaTerreno;
    }
    
    public abstract float calcularValorImovel();
    
    public abstract String tipoClasse();
}
