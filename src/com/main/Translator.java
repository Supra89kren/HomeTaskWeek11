package com.main;

import com.lang.Language;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
@Component
public class Translator {


	@Autowired
	Dictionary dictionary;
	@Autowired
	TextSource textSource;

    public String translate(String source) {
        return dictionary.translate(textSource.getText(source), Language.ENGLISH);
	}

}
