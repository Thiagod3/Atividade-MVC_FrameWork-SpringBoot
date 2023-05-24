package br.fatecrl.mvcdemo.controllers;
import br.fatecrl.mvcdemo.models.Rua;
import org.springframework.boot.autoconfigure.quartz.QuartzTransactionManager;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/ruas")
public class RuaController {

    private static final List<Rua> ruas = new ArrayList<Rua>();

    public RuaController() {
        ruas.add(new Rua("Praça Maria Coelho Lopes", 11089030));
        ruas.add(new Rua("Avenida Jovino de Mello", 11089000));
        ruas.add(new Rua("Avenida Senador Feijó", 11015502));
    }

    @GetMapping
    public String getRuas(Model model)
    {
        model.addAttribute("ruas", ruas);
        return "ruas";
    }
}