package sistemafuncionarios;

public class ParametrosFuncionarioDiarista
{
    private static int limiteDependentes;
    private static float valorDependente;
    private static float limitePercentual;
    
    public static int getLimiteDependentes(){
       return 2;
    }
    
   public static float getValorDependente(){
       return 50f;
    }
   
   public static float getLimitePercentual(){
       return 0.3f;
    }
}
