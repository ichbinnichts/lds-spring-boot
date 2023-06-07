package br.fai.lds.primeiroprojetospringboot.service;

import br.fai.lds.primeiroprojetospringboot.dao.UserDao;
import br.fai.lds.primeiroprojetospringboot.model.UserModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {


    @Autowired
    private UserDao userDao;

    public List<UserModel> find() {
        return userDao.find();
    }
}
