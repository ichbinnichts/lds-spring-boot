package br.fai.lds.primeiroprojetospringboot.dao;

import br.fai.lds.primeiroprojetospringboot.model.UserModel;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public class UserFakeDao {


    public UserFakeDao(Map<Integer, UserModel> database) {
        this.database = database;
    }

    private final Map<Integer, UserModel> database;

    public List<UserModel> find() {
        return null;
    }
}
