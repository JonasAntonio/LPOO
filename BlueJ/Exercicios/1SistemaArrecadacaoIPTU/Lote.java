public class Lote extends Imovel
{
    public Lote(){}
    
    public Lote(int areaTerreno){
        super(areaTerreno);
    }
    
        public float calcularValorImovel(){
        return this.getAreaTerreno() * 30;
    }
    
    public String tipoClasse(){
        return "Lote";
    }
}
