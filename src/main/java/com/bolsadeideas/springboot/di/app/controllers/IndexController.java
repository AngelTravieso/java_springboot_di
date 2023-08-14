package com.bolsadeideas.springboot.di.app.controllers;

import com.bolsadeideas.springboot.di.app.models.service.MyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

    // private MyService service = new MyService();

    // Se inyecta el servicio con la notacion Autowired
    @Autowired // Esto inyecta un objeto que está registrado en el contenedor de spring (debe estar marcado como @Component o @Service)
    private MyService service;

    @GetMapping({"/","","/index"})
    public String index(Model model) {
        model.addAttribute("object", service.operation());
        return "index";
    }

}
