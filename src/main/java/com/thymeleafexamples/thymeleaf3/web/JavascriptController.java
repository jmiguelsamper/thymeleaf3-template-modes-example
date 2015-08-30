package com.thymeleafexamples.thymeleaf3.web;

import javax.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class JavascriptController {

    @RequestMapping(value = "common.js", method = RequestMethod.GET)
    public String common(Model model, HttpServletResponse response) {
        model.addAttribute("code", "Thymeleaf rules!".hashCode());
        return "common.js";
    }
}
