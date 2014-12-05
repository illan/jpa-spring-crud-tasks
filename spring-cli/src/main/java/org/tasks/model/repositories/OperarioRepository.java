package org.tasks.model.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.tasks.model.domain.Operario;

import java.util.List;
/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * @generated
 */
public  interface OperarioRepository  extends CrudRepository<Operario,Long>
{
	List<Operario> findByNombre(String nombre);
	Operario findOne(Long id);
	List<Operario> findAll();
}

