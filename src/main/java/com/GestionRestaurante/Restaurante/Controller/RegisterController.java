package com.GestionRestaurante.Restaurante.Controller;
import com.GestionRestaurante.Restaurante.Services.ClienteServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/register") // Mapea todas las peticiones de este controlador a /register
public class RegisterController {

    private final ClienteServicio clienteService;

    @Autowired
    public RegisterController(ClienteServicio clienteService) {
        this.clienteService = clienteService;
    }

    // Método 1: Muestra el formulario de registro
    @GetMapping
    public String showRegistrationForm(Model model) {
        // Podrías pasar un objeto 'Cliente' vacío al formulario si lo necesitas
        // model.addAttribute("cliente", new Cliente());
        return "registration"; // Devuelve la vista registration.html
    }
/*
    // Método 2: Procesa el formulario de registro
    @PostMapping
    public String registerUser(
            @RequestParam String nombre,
            @RequestParam String apellido,
            @RequestParam String email,
            @RequestParam String usuario,
            @RequestParam String password,
            @RequestParam String telefono,
            Model model) {

        // Lógica de validación (por ejemplo, si el usuario ya existe)
        if (clienteService.existePorUsuario(usuario)) {
            model.addAttribute("error", "El nombre de usuario ya existe.");
            return "registration"; // Vuelve a la página de registro con un mensaje de error
        }

        // Crear el objeto Cliente y guardar en la base de datos
        clienteService.guardarCliente(nombre, apellido, email, usuario, password, telefono);

        // Redirige a la página de login después de un registro exitoso
        return "redirect:/login?success=true";
    }*/
    }

