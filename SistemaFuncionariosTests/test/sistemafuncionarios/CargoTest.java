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
public class CargoTest extends TestCase{
    
    public CargoTest() {
    }
    
    private Cargo c1;
    
    public void setUp() {
        c1 = new Cargo();
    }
    
    @Test
    public void testDescricaoCargo(){
        c1.setDescricao("Descricao");
        assertEquals("Descricao", c1.getDescricao());
    }
    
    
    
}
