package org.tasks.model.domain;

import javax.persistence.GenerationType;

/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * @generated
 */
 
@javax.persistence.Entity
public class Tarea
{
	
	public static enum Estado
	{
		PENDIENTE, DEFECTOS, COMPLETADA;
	}
	
	
		

	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	 
	@javax.persistence.Column(nullable = true) 
	protected String descripcion;

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	 
	@javax.persistence.ManyToOne 
	@javax.persistence.JoinColumn(nullable = true) 
	protected Direccion direccion;

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	 
	@javax.persistence.ManyToOne 
	protected Operario asignado;

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	 
	@javax.persistence.OneToOne(cascade = javax.persistence.CascadeType.ALL) 
	protected Ejecucion ejecucion;
	
	@javax.persistence.Enumerated(javax.persistence.EnumType.STRING) 
	@javax.persistence.Column(nullable = false) 
	protected Tarea.Estado estado = Estado.PENDIENTE;


	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	@javax.persistence.Column(nullable = false) 
	@javax.persistence.Id
    @javax.persistence.GeneratedValue(strategy=GenerationType.AUTO)
	protected long id;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	protected Tarea(){
	}
	
	public Tarea(String descripcion){
		this.setDescripcion(descripcion);
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public void basicSetDireccion(Direccion myDireccion) {
		if (this.direccion != myDireccion) {
			if (myDireccion != null){
					Direccion olddireccion = this.direccion;
					this.direccion = myDireccion;
					// if (olddireccion != null)
					// 	olddireccion.removeTarea(this);
				}
		}	
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public void basicSetAsignado(Operario myAsignado) {
		if (this.asignado != myAsignado) {
			if (myAsignado != null){
				if (this.asignado != myAsignado) {
					Operario oldasignado = this.asignado;
					this.asignado = myAsignado;
					if (oldasignado != null)
						oldasignado.removeTarea(this);
				}
			}
		}	
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public void basicSetEjecucion(Ejecucion myEjecucion) {
		if (this.ejecucion != myEjecucion) {
			if (myEjecucion != null){
					Ejecucion oldejecucion = this.ejecucion;
					this.ejecucion = myEjecucion;
					setEstado(myEjecucion.getEstado());
			}
		}	
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public Tarea.Estado getEstado() {
		if (this.getEjecucion()!=null)
		return this.ejecucion.getEstado();
		return this.estado;	
	}
	
	public void unsetEstado() {
		this.estado = Estado.PENDIENTE;	
	}
	public void setEstado(Tarea.Estado myEstado) {
		this.estado = myEstado;

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
	public Direccion getDireccion() {
		return this.direccion;	
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public Operario getAsignado() {
		return this.asignado;	
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public Ejecucion getEjecucion() {
		return this.ejecucion;	
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
	public void setDescripcion(String myDescripcion) {
		this.descripcion = myDescripcion;	
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public void setDireccion(Direccion myDireccion) {
		this.basicSetDireccion(myDireccion);
	//	myDireccion.addTarea(this);	
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public void setAsignado(Operario myAsignado) {
		this.basicSetAsignado(myAsignado);
		myAsignado.addTarea(this);	
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public void setEjecucion(Ejecucion myEjecucion) {
		this.basicSetEjecucion(myEjecucion);
		myEjecucion.basicSetTarea(this);
			
	}
	
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
	public void unsetDireccion() {
		if (this.direccion == null)
			return;
		Direccion olddireccion = this.direccion;
		this.direccion = null;
	//	olddireccion.removeTarea(this);	
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public void unsetAsignado() {
		if (this.asignado == null)
			return;
		Operario oldasignado = this.asignado;
		this.asignado = null;
		oldasignado.removeTarea(this);	
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public void unsetEjecucion() {
		if (this.ejecucion == null)
			return;
		Ejecucion oldejecucion = this.ejecucion;
		this.ejecucion = null;
		//oldejecucion.unsetTarea();	
	}
	
}

