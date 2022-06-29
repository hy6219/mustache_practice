package com.example.mustacheex.controller;

import com.example.mustacheex.dto.SectionJsonDto;
import com.example.mustacheex.dto.SectionListJsonRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@Controller
public class MustacheExController {

    @RequestMapping("/mustache")
    public ModelAndView test(){
        ModelAndView mv = new ModelAndView("test/test");
        mv.addObject("name","Json");
        mv.addObject("htmlName","<p><b>Json</b></p>");
        mv.addObject("section01-1",true);
        mv.addObject("section01-2","JSON");
        mv.addObject("section01-3",new ArrayList<>(List.of("123","456")));
        mv.addObject("section01-4",false);
        mv.addObject("section01-5",null);

        SectionListJsonRequest request = new SectionListJsonRequest(new ArrayList<>(List.of(new SectionJsonDto("ABC"),new SectionJsonDto("DEF"))));

        mv.addObject("section01-6",request);
        return mv;
    }
}
