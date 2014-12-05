package org.tasks.model.domain;

import java.util.Set;
import java.util.HashSet;

import javax.persistence.GenerationType;
/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * @generated
 */
@javax.persistence.Entity 
public class Operario
{
	


	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	 
	@javax.persistence.Column(nullable = true) 
	protected String nombre;

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	 
	@javax.persistence.OneToMany(mappedBy = "asignado") 
	protected Set<Tarea> tarea;

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	@javax.persistence.Column(nullable = false) 
	@javax.persistence.Id
    @javax.persistence.GeneratedValue(strategy=GenerationType.AUTO)
	protected long id = 0L;

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public Operario(String nombre){
		setNombre(nombre);
	}


	protected Operario(){	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public String getNombre() {
		return this.nombre;	
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public Set<Tarea> getTarea() {
		if(this.tarea == null) {
				this.tarea = new HashSet<Tarea>();
		}
		return (Set<Tarea>) this.tarea;	
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public long getId() {
		return this.id;	
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public void addAllTarea(Set<Tarea> newTarea) {
		if (this.tarea == null) {
			this.tarea = new HashSet<Tarea>();
		}
		for (Tarea tmp : newTarea)
			tmp.setAsignado(this);
			
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public void removeAllTarea(Set<Tarea> newTarea) {
		if(this.tarea == null) {
			return;
		}
		
		this.tarea.removeAll(newTarea);	
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public void setNombre(String myNombre) {
		this.nombre = myNombre;	
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public void addTarea(Tarea newTarea) {
		if(this.tarea == null) {
			this.tarea = new HashSet<Tarea>();
		}
		
		if (this.tarea.add(newTarea))
			newTarea.basicSetAsignado(this);	
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public void unsetNombre() {
		this.nombre = "";	
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public void removeTarea(Tarea oldTarea) {
		if(this.tarea == null)
			return;
		
		if (this.tarea.remove(oldTarea))
			oldTarea.unsetAsignado();
			
	}
	
}

