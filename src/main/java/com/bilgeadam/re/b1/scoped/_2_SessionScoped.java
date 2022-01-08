package com.bilgeadam.re.b1.scoped;

import java.io.Serializable;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

// 1 kullanıcı için geçerlidir.
// Aynı browserda yaşar farklı browserda yaşamaz
// sessionscope implements yazılmalıdır.
@Named(value = "bilgeadam2")
@SessionScoped
public class _2_SessionScoped implements Serializable {
	private static final long serialVersionUID = -3112160708263140526L;
	
	public String getScoped() {
		return "session:" + hashCode();
	}
}
