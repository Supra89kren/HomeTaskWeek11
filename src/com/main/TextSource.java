package com.main;

import org.springframework.stereotype.Component;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

@Component()
public class TextSource {

	public String getText(String path) {
		try {
			BufferedReader bufferedReader = new BufferedReader(new FileReader(path));
			return bufferedReader.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
        return " ";

	}
}
