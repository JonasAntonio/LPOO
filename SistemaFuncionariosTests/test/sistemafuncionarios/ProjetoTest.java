/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemafuncionarios;

import java.util.ArrayList;
import junit.framework.TestCase;
import static junit.framework.TestCase.assertEquals;
import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author jonas
 */
public class ProjetoTest extends TestCase{
    
    public ProjetoTest() {
    }
    
    private Projeto p1;
    private FuncionarioMensalista f1;
    private FuncionarioDiarista f2;
    private FuncionarioHorista f3;
    private ArrayList lista;
    
    public void setUp() {
        p1 = new Projeto();
        f1 = new FuncionarioMensalista();
        f2 = new FuncionarioDiarista();
        f3 = new FuncionarioHorista();
        lista = new ArrayList<>();
    }
    
    public void testListarFuncionariosListaNaoNula(){
        f1.setNome("Jaum");
        f2.setNome("Doido");
        f3.setNome("Maluco");
        lista.add(f1);
        lista.add(f2);
        lista.add(f3);
        p1.alocarFuncionario(f1);
        p1.alocarFuncionario(f2);
        p1.alocarFuncionario(f3);
        assertEquals(lista, p1.listarFuncionarios());
    }
    
    public void testListarFuncionariosListaNula(){
        assertEquals(lista, p1.listarFuncionarios());
    }
    
}
