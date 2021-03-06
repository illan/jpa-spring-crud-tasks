package org.tasks.model.domain;

import java.util.Date;
import javax.persistence.GenerationType;

/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * @generated
 */
 
@javax.persistence.Entity 
public class Ejecucion{
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */

	 
	@javax.persistence.Temporal(javax.persistence.TemporalType.DATE) 
	@javax.persistence.Column(nullable = false) 
	protected Date fecha;

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	 
	@javax.persistence.OneToOne 
	protected Operario operario;

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	 
	@javax.persistence.Enumerated(javax.persistence.EnumType.STRING) 
	@javax.persistence.Column(nullable = false) 
	protected Tarea.Estado estado;

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	 
	@javax.persistence.OneToOne(mappedBy = "ejecucion") 
	protected Tarea tarea;

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
	protected Ejecucion(){	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public Ejecucion(Tarea t,Operario o,Tarea.Estado e){
		this.basicSetEstado(e);
		this.setOperario(o);
		this.basicSetTarea(t);
        	updateEstadoTarea();
        	this.setFecha(new Date());
		
	}
	public Ejecucion(Tarea t,Tarea.Estado e){
		this.basicSetEstado(e);
		this.basicSetTarea(t);
		this.setFecha(new Date());
        	this.setOperario(t.getAsignado());
        	updateEstadoTarea();
	

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public void basicSetTarea(Tarea myTarea) {
		if (this.tarea != myTarea) {
			if (myTarea != null){
					this.tarea = myTarea;
			}
		}	
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public Date getFecha() {
		return this.fecha;	
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public Operario getOperario() {
		return this.operario;	
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public Tarea.Estado getEstado() {
		return this.estado;	
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public Tarea getTarea() {
		return this.tarea;	
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
	public void setFecha(Date myFecha) {
		this.fecha = myFecha;	
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public void setOperario(Operario myOperario) {
		this.operario = myOperario;	
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public void setEstado(Tarea.Estado myEstado) {
		basicSetEstado(myEstado);	
		updateEstadoTarea();
	}
	public void basicSetEstado(Tarea.Estado myEstado) {
		this.estado = myEstado;	
	}

	public void updateEstadoTarea() {
		
		if (this.getTarea()!=null
		&& this.getTarea().getEjecucion()==this)
			this.getTarea().setEstado(estado);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public void setTarea(Tarea myTarea) {
		this.basicSetTarea(myTarea);
		myTarea.basicSetEjecucion(this);
		updateEstadoTarea();
			
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public void unsetFecha() {
		this.fecha = new Date();	
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public void unsetOperario() {
		this.operario = new Operario("undefined");	
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public void unsetEstado() {
		this.estado = Tarea.Estado.PENDIENTE;	
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public void unsetTarea() {
		if (this.tarea == null)
			return;
		Tarea oldtarea = this.tarea;
		this.tarea = null;
		oldtarea.unsetEjecucion();	
	}
	
}

