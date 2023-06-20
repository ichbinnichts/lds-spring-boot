package br.fai.lds.primeiroprojetospringboot.dao;

import br.fai.lds.primeiroprojetospringboot.model.Game;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
@Repository
public class GameFakeDao {
    private final Map<Integer, Game> db;
    private static int ID = 0;
    public GameFakeDao(Map<Integer, Game> database){
        this.db = database;

        generateData();
    }
    public void generateData(){
        Game game = new Game();
        game.setId(generateNextId());
        game.setName("Diablo 3");
        game.setType("RPG");
        game.setPrice(200);
        this.db.put(game.getId(), game);
        Game game2 = new Game();
        game2.setId(generateNextId());
        game2.setName("Diablo 4");
        game2.setType("RPG");
        game2.setPrice(400);
        this.db.put(game2.getId(), game2);
        Game game3 = new Game();
        game3.setId(generateNextId());
        game3.setName("Sekiro");
        game3.setType("Action");
        game3.setPrice(200);
        this.db.put(game3.getId(), game3);

    }
    public int generateNextId(){
        ID++;
        return ID;
    }
    //Get all
    public List<Game> getAllGames(){
        List<Game> list = new ArrayList<>();
        list.addAll(this.db.values());
        return list;
    }
    //Get by id
    public Game getGameById(int id){
        Game game = this.db.get(id);
        return game;
    }
    //Update
    public void updateGame(int id, Game game){
        this.db.put(game.getId(), game);
    }
    //Delete
    public void deleteGame(int id){
        this.db.remove(id);
    }
}
