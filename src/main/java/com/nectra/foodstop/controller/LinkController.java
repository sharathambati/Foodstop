/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.nectra.foodstop.controller;

import com.nectra.foodstop.model.Restaurant;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author Sharath
 */
@Controller
public class LinkController {
    
    @RequestMapping("/")
    public ModelAndView mainPage()
    {
        System.out.println("***************************************************************************");
        ModelAndView mav = new ModelAndView("home");
         mav.addObject("restaurant", new Restaurant());
         return mav;
    }

    @RequestMapping("/index")
    public ModelAndView indexPage()
    {
                System.out.println("***************************************************************************");

ModelAndView mav = new ModelAndView("home");
         mav.addObject("restaurant", new Restaurant());
         return mav;    }
}
