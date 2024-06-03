package kr.hs.study.RedirectForward.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class testController {
    @GetMapping("/test1")
    public String test1() {
//        return "test1";
//        return "redirect:/list"; → 주소 변경
        return "forward:/list"; // → 주소 변경X
    }

    @GetMapping("/list")
    public String list() {
        // 글 목록을 뿌려주기
        return "list";
    }
}
