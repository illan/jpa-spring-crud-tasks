package model.repositories;

import org.springframework.data.repository.CrudRepository;
import model.domain.Operario;
import model.domain.Operario;

import java.util.List;
/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * @generated
 */
public  interface OperarioRepository  extends CrudRepository<Operario,Long>
{
	List<Operario> findByNombre(String nombre);
}

