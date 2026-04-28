package com.ita.cursoapis.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/*

-Controller: es una clase en java que gestiona la solicitudes http(como GET; POST; DELETE)
que llegue a la aplicacion web o API, es el puente entre el cliente y la logica de negocio o servicios
en otras palabras  es donde defines que hacer cuando alguein visita cierta URL

Controlador REST: clase en java que expone rutas HTTP(URLs) para que otros sistemas puedan enviar
peticiones y recibir respuestas JSON
-indica que es un controlador REST
-combina @Controller y @responseBody
-no nistas HTML

*/
//indicamos que esta clase es un controlador web en APIs REST
@RestController

//configuramos una URL para todos los metodos del controllador
@RequestMapping("/micontroller")
public class PruebaController {
    @GetMapping
    public  String Saludar(){
        return "Hola mundo";
    }
}
