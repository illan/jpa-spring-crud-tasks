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

@Controller
public class DetallesController {
    
    @Autowired 
    OperarioRepository repository;
    
    @Autowired 
    TareaRepository tareaRepository;
    
    
    @RequestMapping("/detalles/{id}")
    public String detalles(@PathVariable("id") Long id , Model model) {
        model.addAttribute("operario",repository.findOne(id) );
        model.addAttribute("tareas",tareaRepository.findAllByOperarioId(id) );
        return "detalles";
    }

}