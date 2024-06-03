package kr.hs.study.RedirectTest.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {
    @PostMapping("/test1")
    public String test1(@RequestParam("name") String name,
                        @RequestParam("email") String email,
                        @RequestParam("addr") String addr) {

        System.out.println("NAME : " + name);
        System.out.println("EMAIL : " + email);
        System.out.println("ADDR : " + addr);

        return "redirect:/login";
    }

    @GetMapping("/login")
    public String login() {
        return "login";
    }
}
