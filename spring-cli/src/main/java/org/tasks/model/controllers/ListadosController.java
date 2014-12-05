package org.tasks.model.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;
import java.util.List;
import org.tasks.model.repositories.*;
import org.tasks.model.domain.*;
import org.springframework.beans.factory.annotation.Autowired;

@RestController
public class ListadosController {
    
    @Autowired OperarioRepository repository;
    @Autowired TareaRepository tareaRepository;
    
    @RequestMapping("/asignadas/{id}")
    public List<Tarea> asignadas(@PathVariable("id") Long id) {
        return    tareaRepository.
        findAllByOperarioId(id);
    }
    
    @RequestMapping("/completadas/{id}")
    public List<Tarea> completadas(@PathVariable("id") Long operarioId,@RequestParam(value="desde", required=false, defaultValue="World") String name, Model model) {
        return tareaRepository.findAllByOperarioIdAndEstado(
            operarioId,Tarea.Estado.COMPLETADA);
    }

}