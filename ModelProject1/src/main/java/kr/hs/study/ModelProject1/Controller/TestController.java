package kr.hs.study.ModelProject1.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController {
    @GetMapping("/test1")
    public String test1() {
        return "Test1";
    }

    @GetMapping("/test2")
    public String test2() {
        return "Test2";
    }

    @GetMapping("/test3")
    public String test3() {
        return "Test3";
    }

    @GetMapping("/test4")
    public String test4() {
        return "Test4";
    }

    @GetMapping("/timetable")
    public String timetable() {
        return "TimeTable";
    }

    @GetMapping("/score")
    public String score() {
        return "Score";
    }

}