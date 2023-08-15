package com.bolsadeideas.springboot.di.app.models.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

// Entre @Component y @Service la diferencia es semántica, actúan de igual manera
@Component("myComplexService")
public class MyComplexService implements IService {

    @Override // Este método es una implementación de un padre
    public String operation() {
        return "executing complicated process...";
    }

}
