package model.web;
import model.domain.Ejecucion;
import org.springframework.roo.addon.web.mvc.controller.scaffold.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/ejecucions")
@Controller
@RooWebScaffold(path = "ejecucions", formBackingObject = Ejecucion.class)
public class EjecucionController {
}
