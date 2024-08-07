package org.modelador;

import org.modelador.programa.JanelaPrincipal;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@SpringBootApplication
public class Principal {

    public static final String NOME_PROGRAMA = "sheepnator";
    public static JanelaPrincipal janelaPrincipal;

    public static void main(String[] args) {
        if (args.length != 0 && args[0].equals("--version")) {
            System.out.println(Principal.class.getPackage().getImplementationVersion());
            System.exit(0);
        }

        SpringApplication.run(Principal.class, args);
    }

    @RequestMapping({"/", "/index", "/index.html", "/home", "/home.html"})
    String index(ModelMap modelMap) {
        return "index";
    }
}
