package kr.hs.study.ModelProject1.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Test2Controller {

    @GetMapping("/test2/submit")
    public String test2(@RequestParam("num") int num,
                        Model model) {

        int sum = 0;

        for (int i = 1; i <= num; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }

        model.addAttribute("sum", sum);

        return "Test2Result";
    }
}