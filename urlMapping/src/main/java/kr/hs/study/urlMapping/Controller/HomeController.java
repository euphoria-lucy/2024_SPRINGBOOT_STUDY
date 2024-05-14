package kr.hs.study.urlMapping.Controller;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Component // 객체 생성
public class HomeController {
    @RequestMapping("/") // "/(root) 로 get으로 접속했을 때 아래 home메서드를 실행하라"라는 의미
    public String home() {
        return "result"; // 타임리프 파일이름
    }
}
