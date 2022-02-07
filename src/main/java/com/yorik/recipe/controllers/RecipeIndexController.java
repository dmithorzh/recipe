package com.yorik.recipe.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RecipeIndexController {

    @RequestMapping({"","/","dog"})
    public String index () {
        return "index";
    }
}
