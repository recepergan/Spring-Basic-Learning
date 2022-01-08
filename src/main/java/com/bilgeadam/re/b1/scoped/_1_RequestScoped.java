package com.bilgeadam.re.b1.scoped;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

// sadece 1 istek boyunca çalışır ve sonra ölür
// alışveriş sitesi: sepet ürünlerini
// performans düşüklüğüe sebeb oalbilir.
@Named(value = "bilgeadam1")
@RequestScoped
public class _1_RequestScoped {
	
	public String getScoped() {
		return "request:" + hashCode();
	}
}