package model.web;
import model.domain.Operario;
import org.springframework.roo.addon.web.mvc.controller.scaffold.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/operarios")
@Controller
@RooWebScaffold(path = "operarios", formBackingObject = Operario.class)
public class OperarioController {
}
