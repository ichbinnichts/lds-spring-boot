package br.fai.lds.primeiroprojetospringboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
//To get the url go to localhost:8080/first
@RequestMapping("/first")
public class FirstController {
    //The url to this method is localhot:8080/first/good-night
    @GetMapping("/good-night")
    public String goodNight() {
        return "playground/first-page";
    }

    @GetMapping("/good-morning")
    public String goodMorning() {
        return "playground/second-page";
    }
}
