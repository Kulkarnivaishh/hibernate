package com.jbk;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class LoadData {
	public static void main(String[] args) {
		Configuration cfg=new Configuration();
		cfg.configure().addAnnotatedClass(Student.class);
		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();
Student stud=session.load(Student.class,1);
System.out.println("student data");
System.out.println(stud.getStud_name());
System.out.println(stud.getStud_address());
System.out.println(stud.getStud_contact());
System.out.println(stud.getStud_email());
}
}
