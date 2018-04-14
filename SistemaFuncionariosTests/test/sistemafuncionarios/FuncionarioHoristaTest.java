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
public class FuncionarioHoristaTest extends TestCase{
    
    public FuncionarioHoristaTest() {
    }
    
    private FuncionarioHorista f3;
    
    public void setUp(){
        f3 = new FuncionarioHorista();
    }
     //calcularSalario
    @Test
    public void testCalcularSalarioFH(){
        float aux = 0;
        f3.setNumDias(1);
        f3.setNumHorasDia(1);
        f3.setValorHora(1);
        aux = f3.getNumDias() * f3.getNumHorasDia() * f3.getValorHora();
        assertEquals(aux, f3.calcularSalario());
    }
    
    //calcularValeTransporte
    @Test 
    public void testCalcularValeTransporteValorMaiorLimFH(){
        f3.setQtdeValesDia(1);
        f3.setNumDias(1);
        f3.setNumHorasDia(1);
        f3.setValorHora(45.8f);
        assertEquals(2.74f ,f3.calcularValeTransporte(), 0.01);
    }
    
    @Test
    public void testCalcularValeTransporteValorMenorLimFH(){
        f3.setQtdeValesDia(1);
        f3.setNumDias(1);
        f3.setNumHorasDia(1);
        f3.setValorHora(45.9f);
        assertEquals(2.75f, f3.calcularValeTransporte());
    }
    
    //calcularBonus
    @Test
    public void tesCalcularBonusFH(){
        f3.setValorHora(1);
        f3.setNumHorasDia(1);
        f3.setNumDias(1);
        assertEquals(101, f3.calcularBonus());
    }
    
    //aumentaPorcento
    @Test
    public void testAumentaPorcentoFH(){
        f3.setNumDias(1);
        f3.setNumHorasDia(1);
        f3.setValorHora(1);
        assertEquals(1.1f, f3.aumentaPorcento(10));
    }
    
    //calcularSalarioFamilia
    @Test
    public void testCalcularSalarioFamiliaNumDepMaiorLimDepValMaiorLimPercFH(){
        f3.setNumDependentes(2);
        f3.setNumDias(1);
        f3.setNumHorasDia(1);
        f3.setValorHora(126);
        assertEquals(25f, f3.calcularSalarioFamilia());
    }
    
    @Test
    public void testCalcularSalarioFamiliaNumDepMaiorLimDepValMenorLimPercFH(){
        f3.setNumDependentes(2);
        f3.setNumDias(1);
        f3.setNumHorasDia(1);
        f3.setValorHora(125);
        assertEquals(25f, f3.calcularSalarioFamilia());
    }
    
    @Test
    public void testCalcularSalarioFamiliaNumDepMenorLimDepValMenorLimPercFH(){
        f3.setNumDependentes(1);
        f3.setNumDias(1);
        f3.setNumHorasDia(1);
        f3.setValorHora(125);
        assertEquals(25f, f3.calcularSalarioFamilia());
    }
}
