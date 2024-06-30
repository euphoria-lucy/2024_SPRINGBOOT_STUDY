package kr.hs.study.ModelProject1.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Test3Controller {

    @GetMapping("/test3/submit")
    public String test3(@RequestParam("num") int num,
                        @RequestParam("alphabet") String alphabet,
                        Model model) {

        int sum = 0;

        if (alphabet.equals("e")) {
            for (int i = 1; i <= num; i++) {
                if (i % 2 == 0) {
                    sum += i;
                }
            }
        } else if (alphabet.equals("o")) {
            for (int i = 1; i <= num; i++) {
                if (i % 2 != 0) {
                    sum += i;
                }
            }
        }

        model.addAttribute("sum", sum);

        return "Test3Result";
    }
}