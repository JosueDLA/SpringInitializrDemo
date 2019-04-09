package gt.edu.umg.antigua.sistemas.laboratorio1.laboratorio1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {
    
    @GetMapping("/hola")
    public String hola(){
        return "Hola Mundo";
    }
    
}
