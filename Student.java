package com.springcore.steraotype;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component //object autometic bn  jyga anotation se xml kaa kaam kiya
@Scope("prototype") //isse hash code agAL aayga becouase this is prototpye
public class Student {
@Value("yuvraj")
	private String studentName;
@Value("dehli")
	private String city;
@Value("#{temp}")
private List<String> address;
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	
	public List<String> getAddress() {
		return address;
	}
	public void setAddress(List<String> address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Student [studentName=" + studentName + ", city=" + city + "]";
	}
	

}
