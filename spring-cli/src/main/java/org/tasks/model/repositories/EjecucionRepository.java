package org.tasks.model.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.tasks.model.domain.*;
import java.util.List;
import java.util.Date;


/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * @generated
 */
public  interface EjecucionRepository  extends CrudRepository<Ejecucion,Long>
{
	List<Ejecucion> findByFechaAfter(@Param("fecha") Date fecha);
	List<Ejecucion> findByOperarioAndFechaAfter(@Param("operario") Operario operario, @Param("fecha") Date fecha);

    
}

