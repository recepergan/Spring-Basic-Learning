package com.bilgeadam.re.a1.iocli_disiz;

public class JavaManager {
	
	//IOC oluşturdum
	//interface çağırdım
	private IBrandEngine iBrandEngine;
	
	//p.li cons.
	public JavaManager(IBrandEngine iBrandEngine) {
		this.iBrandEngine = iBrandEngine;
	}
	
	//metot
	public void carEngine() {
		iBrandEngine.engine();
	}
	
	

	
	
}
