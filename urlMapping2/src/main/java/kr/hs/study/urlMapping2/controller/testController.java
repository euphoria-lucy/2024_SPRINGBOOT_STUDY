package kr.hs.study.urlMapping2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

// test 컨트롤러에 접속방식에 따른 코드 작성

@Controller
//@RequestMapping("/sub")
public class testController {

    @GetMapping("test1")
    public String test() {
        return "test1";
    }

    // sub/test2로 접속하면 sub/test2.html 실행
//    @GetMapping("sub/test2")
    @GetMapping("test2") // = sub/test2
    public String test2() {
        return "sub/test2";
    }

    // sub/test3로 접속하면 sub/test3.html 실행
//    @GetMapping("sub/test3")
    @GetMapping("test3") // = sub/test3
    public String test3() {
        return "sub/test3";
    }

    @PostMapping("/test4")
    public String test4() {
        return "sub/test4";
    }

}
