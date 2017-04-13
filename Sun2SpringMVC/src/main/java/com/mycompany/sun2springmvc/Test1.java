package com.mycompany.sun2springmvc;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author shibo
 */
@Controller
@RequestMapping("/shibo")
public class Test1 {

    @RequestMapping("/welcome")
    protected ModelAndView handleRequestInternal() { //  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        ModelAndView mv = new ModelAndView("hello");
        mv.addObject("message", "hello every one i would like to report you about my experience");
        return mv;
    }

    @RequestMapping("/welcome2")
    protected ModelAndView handleRequestInternal2() { //  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        ModelAndView mv = new ModelAndView("welcome");
        mv.addObject("message", "hello every one i would like to report you about my experience");
        return mv;
    }
}
