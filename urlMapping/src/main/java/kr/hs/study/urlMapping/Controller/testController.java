package kr.hs.study.urlMapping.Controller;

import jakarta.servlet.http.HttpServletRequest;
import kr.hs.study.urlMapping.beans.DataBean;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.context.request.WebRequest;

@Controller
public class testController {
    @GetMapping("/test1")
    public String test() {
        return "test1";
    }

    // HttpServletRequest
    @GetMapping("/test2")
    public String test2(HttpServletRequest req) {
        String a = req.getParameter("data1");
        String b = req.getParameter("data2");
        String c = req.getParameter("data3");

        System.out.println("data1 : " + a);
        System.out.println("data2 : " + b);
        System.out.println("data3 : " + c);

        return "result";
    }

    // WebRequest
    @GetMapping("/test3")
    public String test3(WebRequest web) {
        String a = web.getParameter("data1");
        String b = web.getParameter("data2");
        String c = web.getParameter("data3");

        System.out.println("data1 : " + a);
        System.out.println("data2 : " + b);
        System.out.println("data3 : " + c);

        return "result";
    }

    // HttpServletRequest
    @GetMapping("/test4")
    public String test4(HttpServletRequest req) {
        String a = req.getParameter("data1");
        String b = req.getParameter("data2");
        String c [] = req.getParameterValues("data3");

        System.out.println("data1 : " + a);
        System.out.println("data2 : " + b);

        for (String str : c) {
            System.out.println("data3 : " + str);
        }

        return "result";
    }

    // PathVariable
//    @GetMapping("/test5/{data1}/{data2}/{data3}")
//    public String test5(@PathVariable("data1") String data1,
//                        @PathVariable("data2") String data2,
//                        @PathVariable("data3") String data3) {
//        System.out.println("data1 : " + data1);
//        System.out.println("data2 : " + data2);
//        System.out.println("data3 : " + data3);
//
//        return "result";
//    }

    @GetMapping("/test5/{data1}/{data2}/{data3}")
    public String test5(@PathVariable("data1") int data1,
                        @PathVariable("data2") int data2,
                        @PathVariable("data3") int data3) {

        System.out.println(data1 + data2 + data3);

        return "result";
    }

    // RequestParam
    @GetMapping("/test6")
    public String test6(@RequestParam("data1") int data1,
                        @RequestParam("data2") int data2,
                        @RequestParam("data3") int [] data3,
                        @RequestParam(value = "data5", required = false, defaultValue = "65") int data5) {

        System.out.println("data1 : " + data1);
        System.out.println("data2 : " + data2);

        for (int i : data3) {
            System.out.println("data3 : " + i);
        }

        System.out.println("data5 : " + data5);

        return "result";
    }

    // ModelAttribute
    @GetMapping("/test7")
    // @ModelAttribute는 생략가능!!
    public String test7(@ModelAttribute DataBean bean) {
        // @ModelAttribute DataBean bean → DataBean 객체 bean을 만들어서 container(컨테이너)에 보관 → 자동으로 set메서드가 실행되어서 값이 들어감
        System.out.println("data1 : " + bean.getData1());
        System.out.println("data2 : " + bean.getData2());
        System.out.println("data3 : " + bean.getData3());

        return "result";
    }
}
