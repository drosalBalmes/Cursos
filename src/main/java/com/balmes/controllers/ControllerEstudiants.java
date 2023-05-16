package com.balmes.controllers;

import com.balmes.model.Estudiant;
import com.balmes.repositories.EstudiantRepository;
import com.balmes.services.EstudiantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("api")
public class ControllerEstudiants {

    EstudiantRepository estudiantRepository;

    @Autowired
    EstudiantService estudiantService = new EstudiantService(estudiantRepository);

    @GetMapping("estudiants")
    public String getEstudiants(Model model){
        model.addAttribute("estudiants",estudiantService.getStudents());
        return "llista-alumnes.html";
    }

    @GetMapping("/estudiants/nou")
    public String mostrarFormulariProjecte(Model model) {

        Estudiant estudiant = new Estudiant();
        model.addAttribute("estudiant", estudiant);

        return "nou-estudiant.html";
    }

    @PostMapping("estudiants/alta")
    public String altaProjecte(Estudiant estudiant){
        estudiantService.saveStudent(estudiant);

        return "redirect:/api/estudiants";
    }
}
