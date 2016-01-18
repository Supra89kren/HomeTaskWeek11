package com.main;

import com.lang.Language;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Dictionary {

	private Map<Language, Map<String, String>> dictionaries = new HashMap<Language, Map<String, String>>();

	public String translate(String word, Language language) {
        //TODO: Implement me
		return null;
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
        //TODO: Implement me
        return null;
	}
}
