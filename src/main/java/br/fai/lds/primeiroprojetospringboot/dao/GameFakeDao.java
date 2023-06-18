package br.fai.lds.primeiroprojetospringboot.dao;

import br.fai.lds.primeiroprojetospringboot.model.Game;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
@Repository
public class GameFakeDao {
    private final Map<Integer, Game> db;
    public GameFakeDao(Map<Integer, Game> database){
        this.db = database;
    }
    public void generateData(){

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
