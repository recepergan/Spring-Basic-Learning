package com.bilgeadam.re.a2.iocli_dili;

// bean
public class Engine {
	
	private int id;
	private String engineName;
	
	// p.siz cons.
	public Engine() {
		this.engineName = "Engine running";
	}
	
	// p.li cons.
	public Engine(int id, String engineName) {
		this.id = id;
		this.engineName = engineName;
	}
	
	// toString
	@Override
	public String toString() {
		return "Engine [id=" + id + ", engineName=" + engineName + "]";
	}
	
	// getter and setter
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getEngineName() {
		return engineName;
	}
	
	public void setEngineName(String engineName) {
		this.engineName = engineName;
	}
	
}
