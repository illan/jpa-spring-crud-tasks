package model.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.jpa.repository.*;
import org.springframework.data.jpa.repository.query.*;
import org.springframework.data.*;
import model.domain.Tarea;
import java.util.List;


/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * @generated
 */
public  interface TareaRepository  extends JpaRepository<Tarea,Long>
{
	/*
    @Query("select tarea from Tarea tarea where tarea.asignado = :operarioId")
	 List<Tarea> findAllByOperarioId(@Param("operarioId") Long operarioId);

	 @Query("select tarea from Tarea tarea where tarea.asignado = :operarioId and tarea.ejecucion.estado = Ejecucion.Estado.COMPLETADO")
	 List<Tarea> findCompletadasByOperarioId(@Param("operarioId") Long operarioId);
	 */
}

