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
public class Direccion
{
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

	 
	 
	@javax.persistence.Column(nullable = true) 
	protected String descripcion;

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	 
	// @javax.persistence.OneToMany(mappedBy = "direccion") 
	// protected Set<Tarea> tarea;


	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	protected Direccion(){}
	
	public Direccion(String descripcion){
		setDescripcion(descripcion);
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public String getDescripcion() {
		return this.descripcion;	
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	// public Set<Tarea> getTarea() {
	// 	if(this.tarea == null) {
	// 			this.tarea = new HashSet<Tarea>();
	// 	}
	// 	return (Set<Tarea>) this.tarea;	
	// }
	
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
	//  */
	// public void addAllTarea(Set<Tarea> newTarea) {
	// 	if (this.tarea == null) {
	// 		this.tarea = new HashSet<Tarea>();
	// 	}
	// 	for (Tarea tmp : newTarea)
	// 		tmp.setDireccion(this);
			
	// }
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	// public void removeAllTarea(Set<Tarea> newTarea) {
	// 	if(this.tarea == null) {
	// 		return;
	// 	}
		
	// 	this.tarea.removeAll(newTarea);	
	// }
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public void setDescripcion(String myDescripcion) {
		this.descripcion = myDescripcion;	
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	//  */
	// public void addTarea(Tarea newTarea) {
	// 	if(this.tarea == null) {
	// 		this.tarea = new HashSet<Tarea>();
	// 	}
		
	// 	if (this.tarea.add(newTarea))
	// 		newTarea.basicSetDireccion(this);	
	// }
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public void unsetDescripcion() {
		this.descripcion = "";	
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	// public void removeTarea(Tarea oldTarea) {
	// 	if(this.tarea == null)
	// 		return;
		
	// 	if (this.tarea.remove(oldTarea))
	// 		oldTarea.unsetDireccion();
			
	// }
	
}

