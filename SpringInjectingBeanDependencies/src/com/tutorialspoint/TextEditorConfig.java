package com.tutorialspoint;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TextEditorConfig {

	@Bean 
	public TextEditor textEditor() {
		System.out.println("INside TextEditor constructor.");
		return new TextEditor( spellChecker() );
	}
	
	@Bean
	public SpellChecker spellChecker() {
		return new SpellChecker();
	}
}
