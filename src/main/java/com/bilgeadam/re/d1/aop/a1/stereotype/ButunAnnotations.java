package com.bilgeadam.re.d1.aop.a1.stereotype;

import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Stereotype;
import javax.inject.Named;

@Stereotype
@Target({ TYPE })
@Retention(RUNTIME)
@Documented

@InterceptorKesici
@Named
@ApplicationScoped

public @interface ButunAnnotations {
	
}
