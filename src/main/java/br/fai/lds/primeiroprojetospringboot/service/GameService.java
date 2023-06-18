package br.fai.lds.primeiroprojetospringboot.service;

import br.fai.lds.primeiroprojetospringboot.dao.GameFakeDao;
import br.fai.lds.primeiroprojetospringboot.model.Game;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameService {
    private final GameFakeDao db;
    public GameService(GameFakeDao database){
        this.db = database;
    }
    //Get all
    public List<Game> getAllGames(){
        return this.db.getAllGames();
    }
    //Get by id
    public Game getById(int id){
        return this.db.getGameById(id);
    }
    //Update game
    public void updateGame(int id, Game game){
        this.db.updateGame(id, game);
    }
    //Delete game

    public void deleteGame(int id){
        this.db.deleteGame(id);
    }
}
