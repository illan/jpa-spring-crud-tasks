package model.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import model.domain.Operario;
import model.domain.Operario;

import java.util.List;
/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * @generated
 */
public  interface OperarioRepository  extends JpaRepository<Operario,Long>
{
	List<Operario> findByNombre(String nombre);
	List<Operario> findAll();
}

