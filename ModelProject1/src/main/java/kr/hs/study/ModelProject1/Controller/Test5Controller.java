package kr.hs.study.ModelProject1.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Test5Controller {

    @GetMapping("/test5")
    public String test5Form(Model model) {
        model.addAttribute("triangle");
        return "Test5";
    }

    @GetMapping("/test5/submit")
    public String test5Submit(@RequestParam("slide1") int slide1,
                              @RequestParam("slide2") int slide2,
                              @RequestParam("slide3") int slide3,
                              Model model) {

        // Triangle 객체 생성
        Triangle triangle = new Triangle(slide1, slide2, slide3);

        // 삼각형 성립 조건 검사
        String result;
        if (isTrianglePossible(triangle)) {
            result = "삼각형이 가능합니다.";
        } else {
            result = "삼각형이 불가능합니다.";
        }

        model.addAttribute("triangle", triangle);
        model.addAttribute("result", result);

        return "Test5Result";
    }

    // 삼각형 성립 조건을 확인하는 메소드
    private boolean isTrianglePossible(Triangle triangle) {
        return (triangle.getSlide1() + triangle.getSlide2() > triangle.getSlide3()) &&
                (triangle.getSlide1() + triangle.getSlide3() > triangle.getSlide2()) &&
                (triangle.getSlide2() + triangle.getSlide3() > triangle.getSlide1());
    }

    // 삼각형 클래스 정의
    public static class Triangle {
        private final int slide1;
        private final int slide2;
        private final int slide3;

        public Triangle(int slide1, int slide2, int slide3) {
            this.slide1 = slide1;
            this.slide2 = slide2;
            this.slide3 = slide3;
        }

        public int getSlide1() {
            return slide1;
        }

        public int getSlide2() {
            return slide2;
        }

        public int getSlide3() {
            return slide3;
        }
    }
}