package com.bilgeadam.re.e1.aop.a1.event;

import java.io.BufferedWriter;
import java.io.FileWriter;

import javax.enterprise.event.Observes;

public class EventNormalClass {
	
	private static final String filePath = "C:\\spring\\observerListener.txt";
	
	// Yazdırma metodu Clean codes
	public static void observerFileWriter(String data) {
		try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(filePath, true))) {
			bufferedWriter.write(data);
			bufferedWriter.flush();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	// @Observes=tüketicidir.
	public void actionMethod(@Observes EventData data) {
		System.out.println("Consele : " + data.hashCode() + " " + data.getName());
		observerFileWriter("1 : " + data.hashCode() + " " + data.getName());
	}
}
