package edu.uan.fis.jeesample.dao;

import edu.uan.fis.jeesample.dto.Detallecompra;
import java.util.List;

public interface DetallecompraDao {

    /**
     * Creates a new detallefactura. 
     * @param detallecompra
     * @return 
     */
    Detallecompra create(Detallecompra detallecompra);

    /**
     * Updates an existing detallefactura. Detallecompra id can't be modified.
     * @param detallecompra
     * @return 
     */
    Detallecompra update(Detallecompra detallecompra);

    /**
     * Deletes an existing detallecompra
     * @param detallecompra
     */
    void delete(Detallecompra detallecompra);

    /**
     * Find a detallefactura by id
     * @param id_detalle
     * @return 
     */
    Detallecompra findById(Integer id_detalle);

    /**
     * Returns all the ddetallecompra in the database
     * @return 
     */
    List<Detallecompra> findAll();
}
