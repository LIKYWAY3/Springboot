package vn.hoidanit.laptopshop.controller;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import vn.hoidanit.laptopshop.domain.User;
import vn.hoidanit.laptopshop.service.UserService;

//Baitap 1
@Controller
public class UserController {

    @RequestMapping("/admin/user")
    public String getPageUser(Model model) {
        model.addAttribute("newUsers", new User());
        return "admin/user/create";
    }

    @RequestMapping(value = "/admin/user/create", method = RequestMethod.POST)
    public String getPostPage(Model model, @ModelAttribute("newUsers") User kha2) {
        System.out.println("Run here" + kha2);
        return "hello";
    }
}

// MÔ hình mvc
// @Controller
// public class UserController {
// private UserService userService;

// public UserController(UserService userService) {
// this.userService = userService;
// }

// @RequestMapping("/")
// public String getHomePage(Model model) {
// String test = userService.handleHello();
// model.addAttribute("khajsp", test);
// return "hello";
// }
// }
