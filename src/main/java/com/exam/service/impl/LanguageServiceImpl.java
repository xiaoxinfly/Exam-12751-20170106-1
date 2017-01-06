package com.exam.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exam.mapper.LanguageMapper;
import com.exam.pojo.Language;
import com.exam.service.LanguageService;

@Service
public class LanguageServiceImpl implements LanguageService{
    
    @Autowired
    private LanguageMapper languageMapper;

    @Override
    public List<Language> getAllLanguage() {
        return this.languageMapper.selectAll();
    }
    
}
