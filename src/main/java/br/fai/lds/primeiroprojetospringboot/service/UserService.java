package br.fai.lds.primeiroprojetospringboot.service;

import br.fai.lds.primeiroprojetospringboot.dao.UserFakeDao;
import br.fai.lds.primeiroprojetospringboot.model.UserModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {


    @Autowired
    private UserFakeDao userFakeDao;

    public List<UserModel> find() {
        return userFakeDao.find();
    }

    public UserModel findById(final int id) {
        return userFakeDao.findById(id);
    }

    public UserModel update(final UserModel user) {
        if (user == null) {
            return null;
        }
        UserModel model = userFakeDao.findById(user.getId());
        if (model == null) {
            return null;
        }
        model.setPassword(user.getPassword());
        model.setFullName(user.getFullName());
        final UserModel updatedUser = userFakeDao.update(model);
        return updatedUser;
    }

    public boolean delete(final int id) {
        return userFakeDao.delete(id);
    }
}
