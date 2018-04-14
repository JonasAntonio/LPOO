/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemafuncionarios;

import java.util.ArrayList;
import junit.framework.TestCase;
import static junit.framework.TestCase.assertEquals;
import org.junit.Test;

/**
 *
 * @author jonas
 */
public class DepartamentoTest extends TestCase{
    
    public DepartamentoTest() {
    }
    
    private Departamento dp;
    private Departamento dp1;
    private FuncionarioMensalista fm;
    private FuncionarioDiarista fd;
    private FuncionarioHorista fh;
    private ArrayList lista;
    
    public void setUp() {
        dp = new Departamento();
        dp1 = new Departamento();
        fm = new FuncionarioMensalista();
        fd = new FuncionarioDiarista();
        fh = new FuncionarioHorista();
        lista = new ArrayList();
    }
   
    
    @Test
    public void testGetNomeChefeTemChefe(){
        fm.setNome("Jaiminho, o carteiro");
        dp.setChefe(fm);
        assertEquals(fm.getNome(),dp.getNomeChefe());
    }
    
    @Test
    public void testGetNomeChefeSemChefe(){
        assertEquals("Departamento não tem chefe", dp.getNomeChefe());
    } 
    
    @Test
    public void testFuncionarioDepartamentoTrue(){
        dp.addFuncionario(fh);
        fh.setNome("Zé");
        assertEquals(true, dp.funcionarioDepartamento(fh.getNome()));
    }
    
    @Test
    public void testFuncionarioDepartamentoFalse(){
        fd.setNome("Jaum");
        assertEquals(false, dp.funcionarioDepartamento(fd.getNome()));
    }
    
    @Test
    public void testGetHierarquiaDepartamentosNula(){
        dp.setDescricao("dp");
        assertEquals(dp.getDescricao(), dp.getHierarquiaDepartamentos());
    }
    
    @Test
    public void testGetHierarquiaDepartamentosNaoNula(){
        dp.setSuperDepartamento(dp1);
        dp.setDescricao("dp");
        dp1.setDescricao("dp1");
        assertEquals(dp1.getDescricao(), dp.getDescricao(), dp.getHierarquiaDepartamentos());
    }
    
    @Test
    public void testListarFuncionariosListaNaoNula(){
        fm.setNome("Jaum");
        fd.setNome("Doido");
        fh.setNome("Maluco");
        dp.addFuncionario(fm);
        dp.addFuncionario(fd);
        dp.addFuncionario(fh);
        lista.add(fm);
        lista.add(fd);
        lista.add(fh);
        assertEquals(lista, dp.listarFuncionarios());
    }
    
    @Test
    public void testListarFuncionariosListaNula(){
        assertEquals(lista, dp.listarFuncionarios());
    }
    
}
