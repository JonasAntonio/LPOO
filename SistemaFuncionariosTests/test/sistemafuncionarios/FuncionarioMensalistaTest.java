/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemafuncionarios;

import junit.framework.TestCase;
import static junit.framework.TestCase.assertEquals;
import org.junit.Test;


/**
 *
 * @author jonas
 */
public class FuncionarioMensalistaTest extends TestCase{
    
    public FuncionarioMensalistaTest() {
    }
    
    private FuncionarioMensalista f1;
    
    public void setUp(){
        f1 = new FuncionarioMensalista();
    }
    
    //calcularSalario
    @Test
    public void testCalcularSalarioFM(){
        f1.setValorMes(1);
        assertEquals(f1.getValorMes(), f1.calcularSalario());
    }
    
    //calcularValeTransporte
    @Test 
    public void testCalcularValeTransporteValorMaiorLimFM(){
        f1.setQtdeValesDia(1);
        f1.setValorMes(45.8f);
        assertEquals(2.74f ,f1.calcularValeTransporte(), 0.01);
    }
    
    @Test
    public void testCalcularValeTransporteValorMenorLimFM(){
        f1.setQtdeValesDia(1);
        f1.setValorMes(45.9f);
        assertEquals(2.75f, f1.calcularValeTransporte());
    }
    
    //calcularSalarioFamilia
    @Test
    public void testCalcularSalarioFamiliaNumDepMaiorLimDepValMaiorLimPercFM(){
        f1.setNumDependentes(4);
        f1.setValorMes(150);
        assertEquals(75f, f1.calcularSalarioFamilia());
    }
    
    @Test
    public void testCalcularSalarioFamiliaNumDepMaiorLimDepValMenorLimPercFM(){
        f1.setNumDependentes(4);
        f1.setValorMes(600);
        assertEquals(300f, f1.calcularSalarioFamilia());
    }
    
    @Test
    public void testCalcularSalarioFamiliaNumDepMenorLimDepValMenorLimPercFM(){
        f1.setNumDependentes(3);
        f1.setValorMes(600);
        assertEquals(300f, f1.calcularSalarioFamilia());
    }
    
    //calcularBonus
    @Test
    public void testCalcularBonusFM(){
        f1.setValorMes(1);
        assertEquals(151f, f1.calcularBonus());
    }
    
    //calcularReajuste
    
    @Test
    public void testCalcularReajustePorcentagemFM(){
        f1.setValorMes(1);
        assertEquals(1.1f, f1.calcularReajuste(10f));
    }
    
    @Test
    public void testCalcularReajustePorcentagemBonusFM(){
        f1.setValorMes(1);
        assertEquals(1.2f, f1.calcularReajuste(10f, 0.1f));
    }
    
    //AumentoPorcento
    
    @Test
    public void testAumentaPorcentoFM(){
        f1.setValorMes(1);
        assertEquals(1.1f, f1.aumentaPorcento(10));
    }
}
