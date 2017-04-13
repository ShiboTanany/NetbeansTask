/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.sun2springmvc;

import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author shibo
 */
@Controller
@RequestMapping("/shibo")
public class Test2 {
    
    @RequestMapping("/login")
    protected ModelAndView handleRequestInternal() { //  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
       
        ModelAndView mv = new ModelAndView("hello");
        mv.addObject("message", "hello every one i would like to report you about my experience");
        return mv;
    }
   
    
}
