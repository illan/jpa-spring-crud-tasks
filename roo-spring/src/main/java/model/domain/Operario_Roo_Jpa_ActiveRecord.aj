// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package model.domain;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import model.domain.Operario;
import org.springframework.transaction.annotation.Transactional;

privileged aspect Operario_Roo_Jpa_ActiveRecord {
    
    @PersistenceContext
    transient EntityManager Operario.entityManager;
    
    public static final List<String> Operario.fieldNames4OrderClauseFilter = java.util.Arrays.asList("nombre");
    
    public static final EntityManager Operario.entityManager() {
        EntityManager em = new Operario().entityManager;
        if (em == null) throw new IllegalStateException("Entity manager has not been injected (is the Spring Aspects JAR configured as an AJC/AJDT aspects library?)");
        return em;
    }
    
    public static long Operario.countOperarios() {
        return entityManager().createQuery("SELECT COUNT(o) FROM Operario o", Long.class).getSingleResult();
    }
    
    public static List<Operario> Operario.findAllOperarios() {
        return entityManager().createQuery("SELECT o FROM Operario o", Operario.class).getResultList();
    }
    
    public static List<Operario> Operario.findAllOperarios(String sortFieldName, String sortOrder) {
        String jpaQuery = "SELECT o FROM Operario o";
        if (fieldNames4OrderClauseFilter.contains(sortFieldName)) {
            jpaQuery = jpaQuery + " ORDER BY " + sortFieldName;
            if ("ASC".equalsIgnoreCase(sortOrder) || "DESC".equalsIgnoreCase(sortOrder)) {
                jpaQuery = jpaQuery + " " + sortOrder;
            }
        }
        return entityManager().createQuery(jpaQuery, Operario.class).getResultList();
    }
    
    public static Operario Operario.findOperario(Long id) {
        if (id == null) return null;
        return entityManager().find(Operario.class, id);
    }
    
    public static List<Operario> Operario.findOperarioEntries(int firstResult, int maxResults) {
        return entityManager().createQuery("SELECT o FROM Operario o", Operario.class).setFirstResult(firstResult).setMaxResults(maxResults).getResultList();
    }
    
    public static List<Operario> Operario.findOperarioEntries(int firstResult, int maxResults, String sortFieldName, String sortOrder) {
        String jpaQuery = "SELECT o FROM Operario o";
        if (fieldNames4OrderClauseFilter.contains(sortFieldName)) {
            jpaQuery = jpaQuery + " ORDER BY " + sortFieldName;
            if ("ASC".equalsIgnoreCase(sortOrder) || "DESC".equalsIgnoreCase(sortOrder)) {
                jpaQuery = jpaQuery + " " + sortOrder;
            }
        }
        return entityManager().createQuery(jpaQuery, Operario.class).setFirstResult(firstResult).setMaxResults(maxResults).getResultList();
    }
    
    @Transactional
    public void Operario.persist() {
        if (this.entityManager == null) this.entityManager = entityManager();
        this.entityManager.persist(this);
    }
    
    @Transactional
    public void Operario.remove() {
        if (this.entityManager == null) this.entityManager = entityManager();
        if (this.entityManager.contains(this)) {
            this.entityManager.remove(this);
        } else {
            Operario attached = Operario.findOperario(this.id);
            this.entityManager.remove(attached);
        }
    }
    
    @Transactional
    public void Operario.flush() {
        if (this.entityManager == null) this.entityManager = entityManager();
        this.entityManager.flush();
    }
    
    @Transactional
    public void Operario.clear() {
        if (this.entityManager == null) this.entityManager = entityManager();
        this.entityManager.clear();
    }
    
    @Transactional
    public Operario Operario.merge() {
        if (this.entityManager == null) this.entityManager = entityManager();
        Operario merged = this.entityManager.merge(this);
        this.entityManager.flush();
        return merged;
    }
    
}
