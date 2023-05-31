package br.fai.lds.primeiroprojetospringboot.controller;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//The url to this class is localhost:8080/api/first
@RequestMapping("/api/first")
public class ApiRestController {
    //The url to this method is localhost:8080/api/first/good-night
    @GetMapping("/good-night")
    public ResponseEntity<String> goodNight() {
        return ResponseEntity.ok("<h1>good night =D</h1>");
    }
}
