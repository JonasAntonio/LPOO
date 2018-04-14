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
public class EmpresaTest extends TestCase{
    
    public EmpresaTest() {
    }
    
    private Empresa e1;
    
    public void setUp() {
        e1 = new Empresa();
    }
    
    public void testRazaoSocial(){
        e1.setRazaoSocial("Empresa");
        assertEquals("Empresa", e1.getRazaoSocial());
    }
}
