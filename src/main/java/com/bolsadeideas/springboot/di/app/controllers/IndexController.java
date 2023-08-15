package com.bolsadeideas.springboot.di.app.controllers;

import com.bolsadeideas.springboot.di.app.models.service.IService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

    // private MyService service = new MyService();

    // Se inyecta el servicio con la notación Autowired
    @Autowired // Esto inyecta un objeto que está registrado en el contenedor de spring (debe estar marcado como @Component o @Service)
    private IService service;

    // Inyectando dependencia con el constructor, con el constructor se puede omitir el Autowired (no hay problema, aunque es mejor declararlo de manera explícita)
    /*
    @Autowired
    public IndexController(IService service) {
        this.service = service;
    }

     */

    @GetMapping({"/","","/index"})
    public String index(Model model) {
        model.addAttribute("object", service.operation());
        return "index";
    }

    // Inyectando la dependencia con un setter (también válido)
    /*
    @Autowired
    public void setService(IService service) {
        this.service = service;
    }
    */

}
