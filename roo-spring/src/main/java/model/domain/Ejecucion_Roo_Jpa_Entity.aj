// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package model.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Version;
import model.domain.Ejecucion;

privileged aspect Ejecucion_Roo_Jpa_Entity {
    
    declare @type: Ejecucion: @Entity;
    
    @Id
    @SequenceGenerator(name = "ejecucionGen", sequenceName = "EJECUCION_SEQ")
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "ejecucionGen")
    @Column(name = "id")
    private Long Ejecucion.id;
    
    @Version
    @Column(name = "version")
    private Integer Ejecucion.version;
    
    public Long Ejecucion.getId() {
        return this.id;
    }
    
    public void Ejecucion.setId(Long id) {
        this.id = id;
    }
    
    public Integer Ejecucion.getVersion() {
        return this.version;
    }
    
    public void Ejecucion.setVersion(Integer version) {
        this.version = version;
    }
    
}
