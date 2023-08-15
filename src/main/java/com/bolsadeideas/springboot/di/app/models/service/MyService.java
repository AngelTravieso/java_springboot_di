package com.bolsadeideas.springboot.di.app.models.service;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

// Entre @Component y @Service la diferencia es semántica, actúan de igual manera
@Component("mySimpleService") // -> indicar que mi servicio es un bean de spring, es decir, un componente, esto es un singleton que se puede inyectar en otros componentes
// @Service // -> Aporta una semántica de que esta clase representa un servicio en spring, una clase de lógica de negocios
public class MyService implements IService {

    @Override // -> este método es una implementación de un padre
    public String operation() {
        return "executing simple process";
    }

}
