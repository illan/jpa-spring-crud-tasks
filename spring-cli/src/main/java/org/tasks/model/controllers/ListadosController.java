package org.tasks.model.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;
import java.util.List;
import java.util.Date;

import org.tasks.model.repositories.*;
import org.tasks.model.domain.*;
import org.springframework.beans.factory.annotation.Autowired;

@RestController
public class ListadosController {
    
    @Autowired OperarioRepository repository;
    @Autowired TareaRepository tareaRepository;
    @Autowired EjecucionRepository ejecucionRepository;
    
    @RequestMapping("/desde/{fecha}")
    public List<Ejecucion> desde(@PathVariable("fecha") Date fecha) {
        return    ejecucionRepository.
                    findByFechaAfter(fecha);
    }
    
    @RequestMapping("/realizadas/{operario}")
    public List<Tarea> realizadas(@PathVariable("operario") Operario operario, Model model) {
        return tareaRepository.findByAsignadoAndEstado(
           operario,Tarea.Estado.COMPLETADA);
    }
    @RequestMapping("/pendientes/{operario}")
    public List<Tarea> pendientes(@PathVariable("operario") Operario operario, Model model) {
        return tareaRepository.findByAsignadoAndEstado(
           operario,Tarea.Estado.PENDIENTE);
    }

}