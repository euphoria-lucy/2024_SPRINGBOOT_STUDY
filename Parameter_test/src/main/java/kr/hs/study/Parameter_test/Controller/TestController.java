package kr.hs.study.Parameter_test.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class TestController {
    @PostMapping("/test")
    public String test(@RequestParam("id") String id,
                       @RequestParam("pw") String pw,
                       Model model) {
        // @RequestParam는 사용자의 입력값을 받아오는 애
        // Model : 값을 저장시키는 애

//        System.out.println("id : " + id);
//        System.out.println("pw : " + pw);

        // id, pw에 들어있는 값이 model에 추가되어 view(result.html)로 넘어간다.
        model.addAttribute("id", id);
        model.addAttribute("pw", pw);

        return "result";
    }
}
