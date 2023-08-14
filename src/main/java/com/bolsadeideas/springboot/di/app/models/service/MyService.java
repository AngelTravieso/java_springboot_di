package com.bolsadeideas.springboot.di.app.models.service;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

// Entre @Component y @Service la diferencia es semantica, actuan de igual manera
@Component // -> indicar que mi servicio es un bean de spring, es decir, un componente, esto es un singleton que se puede inyectar en otros componentes
// @Service // -> Aporta una semantica de que esta clase representa un servicio en spring, una clase de lógica de negocios
public class MyService {

    public String operation() {
        return "executing something important...";
    }

}
