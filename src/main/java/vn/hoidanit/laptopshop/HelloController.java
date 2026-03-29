package vn.hoidanit.laptopshop;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String hello() {
        return "Hello world with ";
    }

    @GetMapping("/user")
    public String user() {
        return "onlyuser";
    }

    @GetMapping("/admin")
    public String admin() {
        return "onlyadmin";
    }
}
