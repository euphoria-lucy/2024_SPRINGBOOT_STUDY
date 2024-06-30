package kr.hs.study.ModelProject1.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Random;

@Controller
public class Test4Controller {

    @GetMapping("/test4/submit")
    public String test4(@RequestParam("firstNum") int firstNum,
                        @RequestParam("endNum") int endNum,
                        Model model) {

        Random random = new Random();
        int sum = 0;

        for (int i = 0; i < 10; i++) {
            int randomNumber = random.nextInt(endNum - firstNum + 1) + firstNum;
            sum += randomNumber;
        }

        model.addAttribute("sum", sum);

        return "Test4Result";
    }
}