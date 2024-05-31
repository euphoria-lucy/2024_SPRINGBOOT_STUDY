package kr.hs.study.Model2.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
    @GetMapping("/test1")
    public String test1(@RequestParam("name") String name,
                        @RequestParam("pass") String pass,
                        Model model) {

        model.addAttribute("name", name);
        model.addAttribute("pass", pass);

        return "test1";
    }

    @GetMapping("/test2/{name}/{age}/{addr}")
    public String test2(@PathVariable("name") String name,
                        @PathVariable("age") int age,
                        @PathVariable("addr") String addr,
                        Model model) {

        model.addAttribute("name", name);
        model.addAttribute("age", age);
        model.addAttribute("addr", addr);

        return "test2";
    }

//    데이터 이름뿐만 아니라 데이터도 같이 넘긴다.
    @GetMapping("/test3")
    public ModelAndView mav() {
        ModelAndView mv = new ModelAndView();
        mv.addObject("name", "lee");
        mv.addObject("pass", "2222");
        mv.setViewName("test3"); // return "test3"

        return mv;
    }

    @PostMapping("/test4")
    public String test4(@RequestParam("id") String id,
                        @RequestParam("pw") String pw,
                        Model model) {

        model.addAttribute("id", id);
        model.addAttribute("pw", pw);

        if (id.equals("park") && pw.equals("3333")) {
            return "test4";
        } else {
            return "wrong";
        }

    }
}
