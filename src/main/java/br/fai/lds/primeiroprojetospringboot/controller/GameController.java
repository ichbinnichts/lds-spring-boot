package br.fai.lds.primeiroprojetospringboot.controller;

import br.fai.lds.primeiroprojetospringboot.model.Game;
import br.fai.lds.primeiroprojetospringboot.service.GameService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/games")
public class GameController {
    private final GameService service;
    public GameController(GameService service){
        this.service = service;
    }
    @GetMapping("/list")
    public String get(){
        List<Game> gamesList = new ArrayList<>();
        return "game/list";
    }
    @GetMapping("/details/{id}")
    public String getById(@PathVariable("id") int id){
        Game game = this.service.getById(id);
        return "game/detail";
    }
    @GetMapping("/edit/{id}")
    public String updateGame(@PathVariable("id") int id){
        return "game/edit";
    }
    @GetMapping("delete/{id}")
    public void deleteGame(@PathVariable("id") int id){
        this.service.deleteGame(id);
    }
}
