package com.bilgeadam.re.c2.qualifier2;

@IkiliSecenek
public class JavaVersion18 implements IJavaVersion {
	
	@Override
	public String surum(String data) {
		return "Seçilecek Java 18 " + data;
	}
	
}
