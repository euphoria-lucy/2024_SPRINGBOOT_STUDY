package kr.hs.study.ModelProject1.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ScoreController {

    @GetMapping("/score/submit")
    public String score(@RequestParam("name") String name,
                        @RequestParam("koreanScore")int koreanScore,
                        @RequestParam("englishScore") int englishScore,
                        @RequestParam("mathScore") int mathScore,
                        Model model) {

        int total = koreanScore + englishScore + mathScore;
        double average = (double) total / 3;

        model.addAttribute("name", name);
        model.addAttribute("koreanScore", koreanScore);
        model.addAttribute("englishScore", englishScore);
        model.addAttribute("mathScore", mathScore);
        model.addAttribute("total", total);
        model.addAttribute("average", average);

        return "ScoreResult";
    }
}