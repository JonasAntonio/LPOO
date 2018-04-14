package sistemafuncionarios;

public class ParametrosFuncionarioMensalista
{
    public static int numDias;
    public static int limiteDependentes;
    public static float valorDependentes;
    public static float limitePercentual;
    
    public static int getNumDias(){
        return 1;
    }
    
    public static void setNumDias(int nDias){
        numDias = nDias;
    }
    
    public static int getLimiteDependentes(){
       return 3;
    }
    
    public static void setLimiteDependentes(int limDependentes){
        limiteDependentes = limDependentes;
    }
    
   public static float getValorDependente(){
       return 100f;
    }
    
   public static void setValorDependente(float valDependente){
       
    }
    
   public static float getLimitePercentual(){
       return 0.50f;
    }
}
