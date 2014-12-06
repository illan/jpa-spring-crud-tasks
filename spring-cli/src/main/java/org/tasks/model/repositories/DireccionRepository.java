package org.tasks.model.repositories;

import org.springframework.data.repository.CrudRepository;
import org.tasks.model.domain.Direccion;
import java.util.List;


/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * @generated
 */
//@RepositoryRestResource(collectionResourceRel = "direcciones", path = "direcciones")
public  interface DireccionRepository  extends CrudRepository<Direccion,Long>
{
	List<Direccion> findAll();
}

