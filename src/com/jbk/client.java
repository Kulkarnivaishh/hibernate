package com.jbk;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class client {
	public static void main(String[] args) {
		Configuration cfg=new Configuration();
		cfg.configure().addAnnotatedClass(Student.class);
		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();
		Transaction tt=session.beginTransaction();//in case select not neede
Student stud=new Student();
stud.setStud_name("kiran");
stud.setStud_address("pune");
stud.setStud_contact("7896589623");
stud.setStud_email("kiran@gmail.com");
session.save(stud);
tt.commit();
session.close();
System.out.println("Data save successfully");
}
}