package com.GestionRestaurante.Restaurante.Controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeAdmiController {

    @GetMapping("/")
    public String redirectToLogin() {
        return "redirect:/login";
    }
}
