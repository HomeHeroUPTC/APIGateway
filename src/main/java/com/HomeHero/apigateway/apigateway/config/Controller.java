package com.HomeHero.apigateway.apigateway.config;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/pago")
public class Controller {
    @GetMapping
    @ResponseStatus(HttpStatus.OK)

    public String getHelloWorld() {
        String hello = "Hola mundo estoy funcionando";
        return hello;
    }

    @GetMapping("/user")
    @ResponseStatus(HttpStatus.OK)

    public String getHelloWorldUser() {
        String hello = "Hola mundo estoy funcionando";
        return hello;
    }
    @PostMapping("/add/{pago}")
    @ResponseStatus(HttpStatus.OK)

    public String postPagos(@PathVariable String pago) {
        String pagos = "Se va a pagar con " + pago + " un total de 20000.00 pesos colombianos";
        return pagos;
    }

    @GetMapping("/hello")
    @ResponseStatus(HttpStatus.OK)
    public String getHelloWorld2() {
        String hello = "Hola mundo estoy funcionando";
        return hello;
    }
}
