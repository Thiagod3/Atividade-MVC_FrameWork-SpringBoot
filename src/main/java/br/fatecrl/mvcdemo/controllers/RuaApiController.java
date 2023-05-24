package br.fatecrl.mvcdemo.controllers;

import br.fatecrl.mvcdemo.models.Rua;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/ruas")
public class RuaApiController {


    private static final List<Rua> ruas = new ArrayList<Rua>();

    public RuaApiController() {

        ruas.add(new Rua("Praça Maria Coelho Lopes", 11089030));
        ruas.add(new Rua("Avenida Jovino de Mello", 11089000));
        ruas.add(new Rua("Avenida Senador Feijó", 11015502));
    }

    @GetMapping
    public List<Rua> getRuas(){
         return ruas;
    }

}
