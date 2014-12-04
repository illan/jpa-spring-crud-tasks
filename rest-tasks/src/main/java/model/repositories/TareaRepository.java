package model.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.jpa.repository.Query;


import model.domain.Tarea;
import java.util.List;


/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * @generated
 */
public  interface TareaRepository  extends JpaRepository<Tarea,Long>
{

    @Query("select tarea from Tarea tarea where tarea.asignado = :operarioId")
	 List<Tarea> findAllByOperarioId(@Param("operarioId") Long operarioId);

	 @Query("select tarea from Tarea tarea where tarea.asignado = :operarioId and tarea.estado = :estado")
	 List<Tarea> findByOperarioIdANDEstado(@Param("operarioId") Long operarioId,@Param("estado") Tarea.Estado estado);
	
}

