package com.jbk;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class SaveOrUpdateData {
	public static void main(String[] args) {
		Configuration cfg=new Configuration();
		cfg.configure().addAnnotatedClass(Student.class);
		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();
		Transaction tt=session.beginTransaction();//in case select not neede
//Student stud=session.get(Student.class,1);
Student student=new Student();
student.setStud_id(2);
student.setStud_name("Deepak");
student.setStud_address("Pune");
student.setStud_contact("78965874589");
student.setStud_email("deep@gmail.com");
session.saveOrUpdate(student);
tt.commit();
System.out.println("student updated successfully");
}
}
