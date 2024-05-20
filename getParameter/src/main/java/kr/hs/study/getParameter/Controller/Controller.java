package kr.hs.study.getParameter.Controller;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
public class Controller {
    @GetMapping("/")
    public String home() {
        return "index";
    }
}
