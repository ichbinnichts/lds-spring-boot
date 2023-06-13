package br.fai.lds.primeiroprojetospringboot.controller;

import br.fai.lds.primeiroprojetospringboot.model.UserModel;
import br.fai.lds.primeiroprojetospringboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {

    // Bean
    @Autowired
    private UserService userService;

    @GetMapping("/list")
    public String getListPage(final Model model) {

        final List<UserModel> userModels = userService.find();
        model.addAttribute("users", userModels);
        return "user/list";
    }
}
