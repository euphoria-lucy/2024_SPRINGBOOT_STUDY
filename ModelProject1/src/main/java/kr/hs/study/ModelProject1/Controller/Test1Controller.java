package kr.hs.study.ModelProject1.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Test1Controller {

    @GetMapping("/test1/submit")
    public String test1(@RequestParam("num") int num,
                        Model model) {

        int sum = 0;

        for (int i = 1; i <= num; i++) {
            sum += i;
        }

        double average = (double) sum / num;

        model.addAttribute("average", average);

        return "Test1Result";
    }
}