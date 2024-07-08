package kr.hs.study.firstDB.Controller;

import kr.hs.study.firstDB.dto.TestDTO;
import kr.hs.study.firstDB.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

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
        return "redirect:/";
    }

    @GetMapping("/")
    public String list(Model model) {
        List<TestDTO> list = service.listAll();
        model.addAttribute("list", list);
        return "index";
    }

    @GetMapping("/update/{id}")
    public String update_form(@PathVariable("id") int id,
                              Model model) {

        TestDTO dto = service.listOne(id);

        model.addAttribute("dto", dto);

//        update test set id=id, name=name where id=id;

        return "view";
    }

    @PostMapping("/update")
    public String update(TestDTO dto) {
        service.update(dto);
        return "result";
    }
}
