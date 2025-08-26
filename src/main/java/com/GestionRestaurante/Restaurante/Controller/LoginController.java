package com.GestionRestaurante.Restaurante.Controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {

    @GetMapping("/login")
    public String showLoginForm() {
        return "Login"; // Asegúrate de que este sea el nombre de tu archivo HTML (Login.html)
    }

    // Necesitas un controlador para /home para que la redirección funcione
    @GetMapping("/home")
    public String homePage() {
        return "home"; // Devolverá una vista llamada home.html
    }
}
