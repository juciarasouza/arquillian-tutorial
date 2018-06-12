package org.arquillian.example;

import java.io.PrintStream;

import javax.inject.Inject;

public class Greeter {
	
	private PharseBuilder pharseBuilder;
	
	@Inject
	public Greeter(PharseBuilder pharseBuilder) {
		this.pharseBuilder = pharseBuilder;
	}

	public void greet (PrintStream to, String name) {
		to.println(createGreeting(name));
	}
	
	public String createGreeting(String name) {
		
		return pharseBuilder.buildPhrase("hello", name);
		
	}
}
