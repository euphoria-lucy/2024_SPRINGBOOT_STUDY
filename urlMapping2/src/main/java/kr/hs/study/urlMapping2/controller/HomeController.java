package kr.hs.study.urlMapping2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

// 보통 homeController는 홈만 작성!!

@Controller // bean을 생성해서 컨테이너에 보관하면서 라우터 기능
// @Component (객체 - Bean)을 생성해서 컨테이너에 보관 + @RequestMapping의 기능 합쳐짐
public class HomeController {
    // /로 get방식으로 접속했을 때 → index.html 실행
    // 스프링부트는 실행되면 자동으로 .html을 붙여줌!!
    // / (루트)로 get방식으로 접속했을 때 index.html을 실행해라
    // 루트로 접속했을 때 home 메서드가 실행됨.
    @GetMapping("/")
    public String home() {
        return "index"; // = index.html
    }

    // test1로 접속했을 때 Welcome 출력
//    @GetMapping("test1")
//    public String test() {
//        return "test1";
//    }

//    @GetMapping("test1")
//    @ResponseBody // JSON 형식으로 데이터 보내기 방식, 리턴한 문자를 출력시킴. 테스트할 때 주로 사용
//    public String test() {
//        return "test1";
//    }
}
