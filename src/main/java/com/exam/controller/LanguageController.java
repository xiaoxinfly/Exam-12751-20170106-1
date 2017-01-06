package com.exam.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.exam.pojo.Language;
import com.exam.service.LanguageService;

@Controller
@RequestMapping("/language")
public class LanguageController {
    
    @Autowired
    private LanguageService languageService;

    @RequestMapping("/all")
    @ResponseBody
    public List<Language> showAll(){
        return this.languageService.getAllLanguage();
    }
}
