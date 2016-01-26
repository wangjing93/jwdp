package cn.zzjddg.jwdp.core.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * @author zzjddg
 * @date 2016/1/26
 */
@Controller
@RequestMapping("test")
public class TestController {

    @Autowired
    private TestService testService;
    @RequestMapping("helloworld")
    public String helloWorld(Model model) {
        List<Test> tests = testService.findAll();
        model.addAttribute("tests", tests);
        return "index";
    }
}
