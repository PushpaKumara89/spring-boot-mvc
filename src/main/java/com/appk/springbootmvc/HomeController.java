package com.appk.springbootmvc;

import com.appk.springbootmvc.model.Alien;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {
    @RequestMapping("/")
    public String home(){
        return "index";
    }

    @RequestMapping("/add")
    public String add(@RequestParam("num1") int i, @RequestParam("num2")int j, ModelMap mm) { // Model m
        int sum = i + j;
        mm.addAttribute("sum", sum);

        return "result";
    }

    /*@RequestMapping("/addAlien")
    public String addAlien(@ModelAttribute Alien a, Model m) {
        m.addAttribute("alien", a);
        return "result";
    }*/

    @RequestMapping("/addAlien")
    public String addAlien(@ModelAttribute("a1") Alien a) {
        return "result";
    }
}