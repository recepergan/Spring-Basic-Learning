package com.bilgeadam.re.b0.cdi;

import java.io.Serializable;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
@Named(value = "namedCdi")
@RequestScoped
public class _1_NamedTutorials implements Serializable{

	private static final long serialVersionUID = -2127405366582029009L;
	
	//nesne değişkenleri
	private String adi;
	
	//p.siz cons.
	public _1_NamedTutorials() {
		this.adi= "RECEP ERĞAN";
	}

	//p.li cons.
	public _1_NamedTutorials(String adi) {
		this.adi = adi;
	}
	//toString
	@Override
	public String toString() {
		return "_1_NamedTutorials [adi=" + adi + "]";
	}
	
	//getter and setter
	public String getAdi() {
		return adi;
	}
	
	public void setAdi(String adi) {
		this.adi = adi;
	}
	
}

	
	
