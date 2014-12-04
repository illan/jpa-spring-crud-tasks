package model.domain;
import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.jpa.activerecord.RooJpaActiveRecord;
import org.springframework.roo.addon.tostring.RooToString;
import javax.validation.constraints.NotNull;
import javax.persistence.Enumerated;

@RooJavaBean
@RooToString
@RooJpaActiveRecord(sequenceName = "TAREA_SEQ")
public class Tarea {

    /**
     */
    @NotNull
    private String descripcion;

    /**
     */
    @NotNull
    @Enumerated
    private Estado estado;
}
