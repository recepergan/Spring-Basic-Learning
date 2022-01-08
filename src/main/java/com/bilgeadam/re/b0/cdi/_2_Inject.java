package com.bilgeadam.re.b0.cdi;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.inject.Named;

@Named(value = "injectCdi")
@ApplicationScoped
public class _2_Inject implements Serializable {

	private static final long serialVersionUID = -2568581610796655074L;
	
	
	//tuketen
	@Inject
	private List<String> nameList;


	public List<String> getNameList() {
		return nameList;
	}
	
	@Inject
	private String nameSurname;
	
	public String getNameSurname() {
		return nameSurname;
	}
	
}
