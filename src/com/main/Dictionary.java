package com.main;

import com.lang.Language;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
@Component
public class Dictionary {
    @Autowired
    ResourceLoader resourceLoader;

	private Map<Language, Map<String, String>> dictionaries = new HashMap<Language, Map<String, String>>();

	public String translate(String word, Language language) {
        Map<String,String> currentLanguageDictonary=getDictionary(language);
        return currentLanguageDictonary.get(word);
	}

	private Map<String, String> getDictionary(Language language) {
		Map<String, String> dictionary = dictionaries.get(language);
		if (null == dictionary) {
			dictionary = loadDictionary(language);
			dictionaries.put(language, dictionary);
		}
		return dictionary;
	}

	private Map<String, String> loadDictionary(Language language) {
        Map<String,String> dictionary= new HashMap<String, String>();
        for (String s:resourceLoader.load("C:\\IdeaProject\\HomeTaskWeek11q\\dict\\english.dict")){
            char[] tempString = s.toCharArray();
            boolean flag=false;
            String firstWord="";
            String secondWord="";
            for (int i = 0; i < tempString.length  ; i++) {
                if(tempString[i]!='='&&!flag){
                    firstWord+=tempString[i];
                }else if(tempString[i]=='='){
                    flag=true;
                }
                if(tempString[i]!='='&&flag){
                    secondWord+=tempString[i];
                }
            }
            dictionary.put(firstWord,secondWord);
        }
        return dictionary;
	}
}
