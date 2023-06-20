package br.fai.lds.primeiroprojetospringboot.dao;

import br.fai.lds.primeiroprojetospringboot.model.UserModel;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class UserFakeDao {

    private final Map<Integer, UserModel> database;
    private static int ID = 0;

    public UserFakeDao() {
        this.database = new HashMap<>();

        populateData();
    }
    private static int generateNextId(){
        ID++;
        return ID;
    }

    private void populateData() {
        final UserModel user = new UserModel();
        user.setFullName("Tiburssinho");
        user.setEmail("tiburssinho@tib.com");
        user.setId(generateNextId());
        user.setUserName("tiburssinho");
        user.setPassword("123");
        this.database.put(1, user);

        final UserModel user2 = new UserModel();
        user2.setFullName("Tibursso");
        user2.setEmail("tibursso@tib.com");
        user2.setId(generateNextId());
        user2.setUserName("tibursso");
        user2.setPassword("456");
        this.database.put(2, user2);

        final UserModel user3 = new UserModel();
        user3.setFullName("Tiburssao");
        user3.setEmail("tiburssao@tib.com");
        user3.setId(generateNextId());
        user3.setUserName("tiburssao");
        user3.setPassword("789");
        this.database.put(3, user3);
    }

    public List<UserModel> find() {

        return new ArrayList<>(database.values());
    }

    public UserModel findById(int id) {
        return database.get(id);
    }

    public UserModel update(final UserModel user) {
        database.put(user.getId(), user);
        return database.get(user.getId());
    }

    public boolean delete(final int id) {
        UserModel removedUser = database.remove(id);
        return removedUser == null ? false : true;
    }

    public UserModel create(final UserModel userModel){
        userModel.setId(generateNextId());
        this.database.put(userModel.getId(), userModel);
        return userModel;
    }
}
