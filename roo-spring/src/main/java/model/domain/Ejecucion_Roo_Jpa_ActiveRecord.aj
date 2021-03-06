// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package model.domain;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import model.domain.Ejecucion;
import org.springframework.transaction.annotation.Transactional;

privileged aspect Ejecucion_Roo_Jpa_ActiveRecord {
    
    @PersistenceContext
    transient EntityManager Ejecucion.entityManager;
    
    public static final List<String> Ejecucion.fieldNames4OrderClauseFilter = java.util.Arrays.asList("fecha", "estado");
    
    public static final EntityManager Ejecucion.entityManager() {
        EntityManager em = new Ejecucion().entityManager;
        if (em == null) throw new IllegalStateException("Entity manager has not been injected (is the Spring Aspects JAR configured as an AJC/AJDT aspects library?)");
        return em;
    }
    
    public static long Ejecucion.countEjecucions() {
        return entityManager().createQuery("SELECT COUNT(o) FROM Ejecucion o", Long.class).getSingleResult();
    }
    
    public static List<Ejecucion> Ejecucion.findAllEjecucions() {
        return entityManager().createQuery("SELECT o FROM Ejecucion o", Ejecucion.class).getResultList();
    }
    
    public static List<Ejecucion> Ejecucion.findAllEjecucions(String sortFieldName, String sortOrder) {
        String jpaQuery = "SELECT o FROM Ejecucion o";
        if (fieldNames4OrderClauseFilter.contains(sortFieldName)) {
            jpaQuery = jpaQuery + " ORDER BY " + sortFieldName;
            if ("ASC".equalsIgnoreCase(sortOrder) || "DESC".equalsIgnoreCase(sortOrder)) {
                jpaQuery = jpaQuery + " " + sortOrder;
            }
        }
        return entityManager().createQuery(jpaQuery, Ejecucion.class).getResultList();
    }
    
    public static Ejecucion Ejecucion.findEjecucion(Long id) {
        if (id == null) return null;
        return entityManager().find(Ejecucion.class, id);
    }
    
    public static List<Ejecucion> Ejecucion.findEjecucionEntries(int firstResult, int maxResults) {
        return entityManager().createQuery("SELECT o FROM Ejecucion o", Ejecucion.class).setFirstResult(firstResult).setMaxResults(maxResults).getResultList();
    }
    
    public static List<Ejecucion> Ejecucion.findEjecucionEntries(int firstResult, int maxResults, String sortFieldName, String sortOrder) {
        String jpaQuery = "SELECT o FROM Ejecucion o";
        if (fieldNames4OrderClauseFilter.contains(sortFieldName)) {
            jpaQuery = jpaQuery + " ORDER BY " + sortFieldName;
            if ("ASC".equalsIgnoreCase(sortOrder) || "DESC".equalsIgnoreCase(sortOrder)) {
                jpaQuery = jpaQuery + " " + sortOrder;
            }
        }
        return entityManager().createQuery(jpaQuery, Ejecucion.class).setFirstResult(firstResult).setMaxResults(maxResults).getResultList();
    }
    
    @Transactional
    public void Ejecucion.persist() {
        if (this.entityManager == null) this.entityManager = entityManager();
        this.entityManager.persist(this);
    }
    
    @Transactional
    public void Ejecucion.remove() {
        if (this.entityManager == null) this.entityManager = entityManager();
        if (this.entityManager.contains(this)) {
            this.entityManager.remove(this);
        } else {
            Ejecucion attached = Ejecucion.findEjecucion(this.id);
            this.entityManager.remove(attached);
        }
    }
    
    @Transactional
    public void Ejecucion.flush() {
        if (this.entityManager == null) this.entityManager = entityManager();
        this.entityManager.flush();
    }
    
    @Transactional
    public void Ejecucion.clear() {
        if (this.entityManager == null) this.entityManager = entityManager();
        this.entityManager.clear();
    }
    
    @Transactional
    public Ejecucion Ejecucion.merge() {
        if (this.entityManager == null) this.entityManager = entityManager();
        Ejecucion merged = this.entityManager.merge(this);
        this.entityManager.flush();
        return merged;
    }
    
}
