package com.bilgeadam.re.b0.cdi;

import java.io.Serializable;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.New;
import javax.enterprise.inject.Produces;
import javax.inject.Inject;
import javax.inject.Named;

import com.bilgeadam.re.dto.StudentDto;

@Named(value = "producesNewCdi")
@ApplicationScoped
public class _2_ProducesNew implements Serializable {
	
	private static final long serialVersionUID = 7139808639916609154L;
	
	@Produces
	public int uretilenMahsul(@New StudentDto dto) {
		// dto = new StudentDto();
		dto.setStudentNumber(555);
		
		return dto.getStudentNumber();
		
	}
	
	@Inject
	private int sayi;
	
	public int getSayi() {
		return sayi;
	}
	
}
