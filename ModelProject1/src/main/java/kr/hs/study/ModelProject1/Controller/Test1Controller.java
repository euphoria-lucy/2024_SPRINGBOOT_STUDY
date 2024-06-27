package kr.hs.study.ModelProject1.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Test1Controller {

    @GetMapping("/test1")
    public String test1(@RequestParam("num") String number, Model model) {
        int num = Integer.parseInt(number);
        // 1부터 n까지의 합계 계산
        int sum = 0;
        for (int i = 1; i <= num; i++) {
            sum += i;
        }
        // 평균 계산
        double average = (double) sum / num;

        // 모델에 평균 값을 추가
        model.addAttribute("average", average);

        return "test1Result";
    }
}
