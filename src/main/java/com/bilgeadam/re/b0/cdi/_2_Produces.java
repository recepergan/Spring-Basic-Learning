package com.bilgeadam.re.b0.cdi;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Produces;
import javax.inject.Named;

@Named(value = "producesCdi")
@ApplicationScoped
public class _2_Produces implements Serializable{

	private static final long serialVersionUID = 8504268995899737873L;
	
	//üreten kısım
	
	@Produces
	public List<String> list() {
		List<String> listem = new ArrayList<String>();
		listem.add("Lebron James");
		listem.add("Kevin Durant");
		listem.add("Stephen Curry");
		listem.add("Giannis Anteteakunpo");
		listem.add("Anthony Davis");
		
		return listem;
	}
	
	@Produces
	public String adimSoyadi() {
		return "Recep ERGAN";
	}
	
	
}
