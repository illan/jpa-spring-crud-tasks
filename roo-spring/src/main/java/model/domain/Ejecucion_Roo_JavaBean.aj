// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package model.domain;

import java.util.Date;
import model.domain.Ejecucion;
import model.domain.Estado;

privileged aspect Ejecucion_Roo_JavaBean {
    
    public Date Ejecucion.getFecha() {
        return this.fecha;
    }
    
    public void Ejecucion.setFecha(Date fecha) {
        this.fecha = fecha;
    }
    
    public Estado Ejecucion.getEstado() {
        return this.estado;
    }
    
    public void Ejecucion.setEstado(Estado estado) {
        this.estado = estado;
    }
    
}