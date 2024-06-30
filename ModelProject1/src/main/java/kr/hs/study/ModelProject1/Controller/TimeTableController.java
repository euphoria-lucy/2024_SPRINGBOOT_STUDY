package kr.hs.study.ModelProject1.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
public class TimeTableController {

    @GetMapping("/timetable/submit")
    public String timetable(@RequestParam("num") int num,
                            Model model) {

        List<String> multiply = new ArrayList<>();

        for (int i = 1; i <= 9; i++) {
            int result = num * i;
            String form = num + " x " + i + " = " + result;
            multiply.add(form);
        }

        model.addAttribute("multiply", multiply);

        return "TimeTableResult";
    }
}