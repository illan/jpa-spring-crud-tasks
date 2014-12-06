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
    public String detalles(@PathVariable("id") String id , Model model) {
        Operario operario=repository.findOne(Long.parseLong(id));
        model.addAttribute("operario",operario );
        model.addAttribute("tareas",tareaRepository.findByAsignado(operario) );
        return "detalles";
    }
       
    @RequestMapping("/todas")
    public String todas(Model model) {
        model.addAttribute("tareas",tareaRepository.findAll() );
        return "detalles";
    }
       


}