package kr.hs.study.Model.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.ArrayList;
import java.util.List;

@Controller
public class HomeController {
@GetMapping("/")
    public String home() {
        return "index";
    }

    @GetMapping("/test1")
    public String test1(Model model) { // model : key-value
        model.addAttribute("name", "kim");
        model.addAttribute("age", "30");

        return "test1"; // view 이름
    }

    @GetMapping("/test2/{data1}/{data2}/{data3}")
    public String test2(@PathVariable("data1") String name,
                        @PathVariable("data2") int age,
                        @PathVariable("data3") String address,
                        Model model) {

        model.addAttribute("data1", name);
        model.addAttribute("data2", age);
        model.addAttribute("data3", address);

        return "test2";
    }

    @GetMapping("/test3")
    public String test3(Model model) {
        // list에 넣어서
        List<String> list = new ArrayList<>();

        // kim, lee, park, chang 데이터 삽입
        list.add("kim");
        list.add("lee");
        list.add("park");
        list.add("chang");

        // model에 list 추가
        model.addAttribute("data", list);

        // view에 넘겨서 출력
        return "test3";
    }
}
