package med.voll.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {
    //@RequestMapping é uma anotação de nível de classe que define o prefixo de URL para todas as rotas de um controller. @GetMapping define uma rota que responde a requisições HTTP GET.
    @GetMapping
    public  String olaMundo() {
        return "Hello World Spring!";
    }

}
