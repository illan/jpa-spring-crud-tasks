package org.tasks.model.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.jpa.repository.Query;


import org.tasks.model.domain.*;
import java.util.List;


/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * @generated
 */
public  interface TareaRepository  extends CrudRepository<Tarea,Long>
{

	List<Tarea> findAll();
	
    //@Query("select tarea from Tarea tarea where tarea.asignado = :id")
	 List<Tarea> findByAsignado(@Param("asignado") Operario asignado);

	 //@Query("select tarea from Tarea tarea where tarea.asignado = :id and tarea.estado = :estado")
	 List<Tarea> findByAsignadoAndEstado(@Param("asignado") Operario asignado,@Param("estado") Tarea.Estado estado);

}

