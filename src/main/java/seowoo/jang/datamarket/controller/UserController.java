package seowoo.jang.datamarket.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import seowoo.jang.datamarket.model.UserDto;
import seowoo.jang.datamarket.service.UserService;

@Controller
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/users")
    public String getUser(Model model){
        model.addAttribute("users", userService.getAllUsers());
        return "users/userList";
    }

    @GetMapping("/users/new")
    public String createForm(){
        return "users/createUserForm";
    }

    @PostMapping("/users/new")
    public String create(UserForm form){
        UserDto user = new UserDto();
        user.setName(form.getName());

        userService.join(user);

        return "redirect:/";
    }
}