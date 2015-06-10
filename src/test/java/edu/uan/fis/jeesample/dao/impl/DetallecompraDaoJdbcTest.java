package edu.uan.fis.jeesample.dao.impl;

import edu.uan.fis.jeesample.dto.Detallecompra;
import java.util.List;
import junit.framework.TestCase;

public class DetallecompraDaoJdbcTest extends TestCase {
    
    public DetallecompraDaoJdbcTest(String testName) {
        super(testName);
    }
    
    @Override
    protected void setUp() throws Exception {
        super.setUp();
    }
    
    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }

    public void testCreate() {
        System.out.println("create");
        Detallecompra detallefactura = new Detallecompra();
        detallefactura.setIddetalle(1);
        detallefactura.setIdfactura(1);
        detallefactura.setIdproducto(1);
        detallefactura.setCantidad(50);
        DetallecompraDaoJdbc instance = new DetallecompraDaoJdbc();
        Detallecompra expResult = detallefactura;
        Detallecompra result = instance.create(detallefactura);
        assertEquals(expResult, result);
    }

    public void testUpdate() {
        System.out.println("update");
        Detallecompra detallefactura = new Detallecompra();
        detallefactura.setIddetalle(1);
        detallefactura.setCantidad(70);      
        DetallecompraDaoJdbc instance = new DetallecompraDaoJdbc();
        Detallecompra expResult = detallefactura;
        Detallecompra result = instance.update(detallefactura);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

   public void testDelete() {
        System.out.println("delete");
        Detallecompra detallefactura = new Detallecompra();
        detallefactura.setIddetalle(1);
       DetallecompraDaoJdbc instance = new DetallecompraDaoJdbc();
       instance.delete(detallefactura);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    public void testFindById() {
        System.out.println("findById");
        Integer detalleId = 1;
        DetallecompraDaoJdbc instance = new DetallecompraDaoJdbc();
        Detallecompra expResult = null;
        Detallecompra result = instance.findById(detalleId);
        //assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    public void testFindAll() {
        System.out.println("findAll");
        DetallecompraDaoJdbc instance = new DetallecompraDaoJdbc();
        List expResult = null;
        List result = instance.findAll();
        //assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
}
