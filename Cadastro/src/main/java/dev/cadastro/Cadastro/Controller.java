package dev.cadastro.Cadastro;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping
public class Controller {

    public String boasVindas(){
        return "Essa é minha primeira mensagem nessa rota";
    }

}
