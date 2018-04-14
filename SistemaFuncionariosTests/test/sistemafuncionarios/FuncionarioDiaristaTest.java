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
public class FuncionarioDiaristaTest extends TestCase{
    
    public FuncionarioDiaristaTest() {
    }
    
    private FuncionarioDiarista f2;
    
    public void setUp(){
        f2 = new FuncionarioDiarista();
    }
    
    //calcularSalario
    @Test
    public void testCalcularSalarioFD(){
        float aux = 0;
        f2.setNumDias(1);
        f2.setValorDia(1);
        aux = f2.getNumDias() * f2.getValorDia();
        assertEquals(aux, f2.calcularSalario());
    }
    
    //calcularValeTransporte
    @Test 
    public void testCalcularValeTransporteValorMaiorLimFD(){
        f2.setQtdeValesDia(1);
        f2.setNumDias(1);
        f2.setValorDia(45.8f);
        assertEquals(2.74f ,f2.calcularValeTransporte(), 0.01);
    }
    
    @Test
    public void testCalcularValeTransporteValorMenorLimFD(){
        f2.setQtdeValesDia(1);
        f2.setNumDias(1);
        f2.setValorDia(45.9f);
        assertEquals(2.75f, f2.calcularValeTransporte());
    }
    
    //calcularBonus
    @Test
    public void tesCalcularBonusFD(){
        f2.setValorDia(1);
        f2.setNumDias(1);
        assertEquals(101, f2.calcularBonus());
    }
    
    //aumentaPorcento
    @Test
    public void testAumentaPorcentoFD(){
        f2.setNumDias(1);
        f2.setValorDia(1);
        assertEquals(1.1f, f2.aumentaPorcento(10));
    }
    
    //calcularSalarioFamilia
    @Test
    public void testCalcularSalarioFamiliaNumDepMaiorLimDepValMaiorLimPercFM(){
        f2.setNumDependentes(3);
        f2.setNumDias(1);
        f2.setValorDia(334);
        assertEquals(100f, f2.calcularSalarioFamilia());
    }
    
    @Test
    public void testCalcularSalarioFamiliaNumDepMaiorLimDepValMenorLimPercFM(){
        f2.setNumDependentes(3);
        f2.setNumDias(1);
        f2.setValorDia(333.33f);
        assertEquals(100f, f2.calcularSalarioFamilia(), 0.01);
    }
    
    @Test
    public void testCalcularSalarioFamiliaNumDepMenorLimDepValMenorLimPercFM(){
        f2.setNumDependentes(2);
        f2.setNumDias(1);
        f2.setValorDia(166.66f);
        assertEquals(50f, f2.calcularSalarioFamilia(), 0.01);
    }
}
