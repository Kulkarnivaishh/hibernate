package com.jbk;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {
	@Id
int stud_id;
String stud_name;
String stud_address;
String stud_contact;
String stud_email;
public Student() {
	super();
	// TODO Auto-generated constructor stub
}
public Student(int stud_id, String stud_name, String stud_address, String stud_contact, String stud_email) {
	super();
	this.stud_id = stud_id;
	this.stud_name = stud_name;
	this.stud_address = stud_address;
	this.stud_contact = stud_contact;
	this.stud_email = stud_email;
}
@Override
public String toString() {
	return "Student [stud_id=" + stud_id + ", stud_name=" + stud_name + ", stud_address=" + stud_address
			+ ", stud_contact=" + stud_contact + ", stud_email=" + stud_email + "]";
}
public int getStud_id() {
	return stud_id;
}
public void setStud_id(int stud_id) {
	this.stud_id = stud_id;
}
public String getStud_name() {
	return stud_name;
}
public void setStud_name(String stud_name) {
	this.stud_name = stud_name;
}
public String getStud_address() {
	return stud_address;
}
public void setStud_address(String stud_address) {
	this.stud_address = stud_address;
}
public String getStud_contact() {
	return stud_contact;
}
public void setStud_contact(String stud_contact) {
	this.stud_contact = stud_contact;
}
public String getStud_email() {
	return stud_email;
}
public void setStud_email(String stud_email) {
	this.stud_email = stud_email;
}

}
