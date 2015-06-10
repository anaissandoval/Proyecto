package edu.uan.fis.jeesample.dto;

import java.io.Serializable;

public class Detallecompra implements Serializable {

    private Integer id_detalle=0;
    private Integer id_factura=0;
    private Integer id_producto=0;
    private Integer cantidad=0;
   

    public Integer getIddetalle() {
        return id_detalle;
    }

    public void setIddetalle(Integer id_detalle) {
        this.id_detalle = id_detalle;
    }
    
    public Integer getIdfactura() {
        return id_factura;
    }

    public void setIdfactura(Integer id_factura) {
        this.id_factura = id_factura;
    }
    
     public Integer getIdproducto() {
        return id_producto;
    }

    public void setIdproducto(Integer id_producto) {
        this.id_producto = id_producto;
    }
    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }
    
    
    @Override
    public boolean equals(Object o) {
        if(o instanceof Detallecompra == false)
            return false;
        Detallecompra that = (Detallecompra) o;
        return that.id_detalle.equals(this.id_detalle);
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + (this.id_detalle != null ? this.id_detalle.hashCode() : 0);
        hash = 79 * hash + (this.id_factura != null ? this.id_factura.hashCode() : 0);
        hash = 79 * hash + (this.id_producto != null ? this.id_producto.hashCode() : 0);
        hash = 79 * hash + (this.cantidad != null ? this.cantidad.hashCode() : 0);
        
        return hash;
    }
}


