package com.jbk;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class UpdateData {
	public static void main(String[] args) {
		Configuration cfg=new Configuration();
		cfg.configure().addAnnotatedClass(Student.class);
		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();
		Transaction tt=session.beginTransaction();//in case select not neede
Student stud=session.get(Student.class,1);
stud.setStud_address("Mumbai");
session.update(stud);
tt.commit();
System.out.println("student updated successfully");

}
}