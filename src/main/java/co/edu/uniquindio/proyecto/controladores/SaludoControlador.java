package co.edu.uniquindio.proyecto.controladores;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/saludo") // Prefijo común para todas las rutas del controlador
public class SaludoControlador {

    @GetMapping
    public String saludar(){
        return "Hola, bienvenido a la aplicación";
    }

    @GetMapping("/{nombre}") //para que ingrese el nombre por la url
    public String saludarNombre(@PathVariable String nombre){
        //return "Hola %s, bienvenido a la aplicación".formatted(nombre);
        return "Hola " + nombre + " bienvenido";
    }

    @GetMapping("/{nombre}/{edad}")
    public String saludarConEdad(@PathVariable String nombre, @PathVariable int edad) {
        return "Hola " + nombre + ", tienes " + edad + " años, bienvenido";
    }

    @PostMapping
    public String saludarPost(){ //valida en test/resources
        return "Hola, bienvenido a la aplicación prueba post";
    }

}
