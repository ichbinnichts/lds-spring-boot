package br.fai.lds.primeiroprojetospringboot.controller;

import br.fai.lds.primeiroprojetospringboot.model.UserModel;
import br.fai.lds.primeiroprojetospringboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/details/{id}")
    public String GetDetailsPage(@PathVariable("id") final int id, final Model model) {
        UserModel user = userService.findById(id);
        model.addAttribute("user", user);
        return "/user/detail";
    }

    @GetMapping("/edit/{id}")
    public String GetEditUser(@PathVariable("id") final int id, final Model model) {
        UserModel user = userService.findById(id);
        model.addAttribute("user", user);
        return "/user/edit";
    }

    @PostMapping("/update")
    public String updateUser(final UserModel user) {

        final UserModel updatedUser = userService.update(user);

        return "redirect:/user/list";
    }

    @GetMapping("/delete/{id}")
    public String deleteUser(@PathVariable("id") final int id) {

        boolean response = userService.delete(id);
        System.out.println("Remove user: " + response);
        return "redirect:/user/list";
    }

    @GetMapping("/create")
    public String create(final UserModel userModel){
        return "user/create";
    }

    @PostMapping("/add")
    public String createUser(final UserModel userModel){
        this.userService.create(userModel);
        return "redirect:/user/list";
    }
}
