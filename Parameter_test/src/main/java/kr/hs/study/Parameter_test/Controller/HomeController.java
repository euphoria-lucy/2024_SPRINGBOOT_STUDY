package kr.hs.study.Parameter_test.Controller;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;

@Component
public class HomeController {
    @PostMapping("/")
    public String home() {
        return "index";
    }
}
