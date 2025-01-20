package com.appk.springbootmvc;

import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {
    @RequestMapping("/")
    public String home(){
        return "index.jsp";
    }

    @RequestMapping("/add")
    public String add(@RequestParam("num1") int i, @RequestParam("num2")int j, HttpSession session) {
        int sum = i + j;

        session.setAttribute("sum", sum);
        return "result.jsp";
    }
}
