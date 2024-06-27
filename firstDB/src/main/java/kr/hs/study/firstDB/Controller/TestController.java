package kr.hs.study.firstDB.Controller;

import kr.hs.study.firstDB.dto.TestDTO;
import kr.hs.study.firstDB.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class TestController {
    @Autowired
    TestService service;

    @GetMapping("/add")
    public String add_form() {
        return "add_form";
    }

    @PostMapping("/add_done")
    public String add_done(TestDTO dto) {
        service.insert(dto);
        return "result";
    }
}
