/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula.pkg02.pkg06.pkg17;

import junit.framework.TestCase;
import org.junit.Test;

/**
 *
 * @author jonas
 */
public class PessoaTest extends TestCase{
    private Pessoa imc;
    
    public PessoaTest(){
    }
    
    public void setUp(){
        imc = new Pessoa();
    }
    
    @Test
    public void testMulherAbaixoPeso(){
        imc.setSexo("F");
        imc.setAltura(1.0);
        imc.setPeso(19.0);
        assertEquals("Abaixo do peso", imc.calcularIMC());
    }
    
    @Test
    public void testMulherPesoNormal(){
        imc.setSexo("F");
        imc.setAltura(1.0);
        imc.setPeso(25.8);
        assertEquals("No peso normal", imc.calcularIMC());
    }
    
    @Test
    public void testMulherMarginalmenteAcimaPeso(){
        imc.setSexo("F");
        imc.setAltura(1.0);
        imc.setPeso(27.3);
        assertEquals("Marginalmente acima do peso", imc.calcularIMC());
    }
    
    @Test
    public void testMulherAcimaPesoIdeal(){
        imc.setSexo("F");
        imc.setAltura(1.0);
        imc.setPeso(32.3);
        assertEquals("Acima do peso ideal", imc.calcularIMC());
    }
    
    @Test
    public void testMulherObesa(){
        imc.setSexo("F");
        imc.setAltura(1.0);
        imc.setPeso(32.4);
        assertEquals("Obeso", imc.calcularIMC());
    }
    
    @Test
    public void testHomemAbaixoPeso(){
        imc.setSexo("M");
        imc.setAltura(1.0);
        imc.setPeso(20.6);
        assertEquals("Abaixo do peso", imc.calcularIMC());
    }
    
    @Test
    public void testHomemPesoNormal(){
        imc.setSexo("M");
        imc.setAltura(1.0);
        imc.setPeso(26.3);
        assertEquals("No peso normal", imc.calcularIMC());
    }
    
    @Test
    public void testHomemMarginalmenteAcimePeso(){
        imc.setSexo("M");
        imc.setAltura(1.0);
        imc.setPeso(27.8);
        assertEquals("Marginalmente acima do peso", imc.calcularIMC());
    }
    
    @Test
    public void testHomemAcimaPesoIdeal(){
        imc.setSexo("M");
        imc.setAltura(1.0);
        imc.setPeso(31.1);
        assertEquals("Acima do peso ideal", imc.calcularIMC());
    }
    
    @Test
    public void testHomemObeso(){
        imc.setSexo("M");
        imc.setAltura(1.0);
        imc.setPeso(31.2);
        assertEquals("Obeso", imc.calcularIMC());
    }
}