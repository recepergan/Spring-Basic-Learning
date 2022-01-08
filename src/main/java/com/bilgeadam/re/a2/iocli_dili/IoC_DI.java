package com.bilgeadam.re.a2.iocli_dili;

import java.io.Serializable;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.inject.Named;

@Named(value = "cdi")
@ApplicationScoped
public class IoC_DI implements Serializable {
	
	private static final long serialVersionUID = -6438806583420957538L;
	
	@Inject
	Engine engine;
	
	public Engine getEngine() {
		return engine;
	}
	
	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	
}
