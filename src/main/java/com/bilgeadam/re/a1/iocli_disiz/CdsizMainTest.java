package com.bilgeadam.re.a1.iocli_disiz;

public class CdsizMainTest {
	
	public static void main(String[] args) {
		
//		JavaManager javaManager = new JavaManager(new BMW());
		JavaManager javaManager = new JavaManager(new Mercedes());
		javaManager.carEngine();
		
		
	}
	
}
