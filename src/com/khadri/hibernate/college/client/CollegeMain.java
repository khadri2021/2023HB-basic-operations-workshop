package com.khadri.hibernate.college.client;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.stream.Collectors;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.khadri.hibernate.college.entity.College;

public class CollegeMain {
	public static void main(String[] args) {

		Supplier<SessionFactory> sessionFactory = () -> {
			Configuration cfg = new Configuration();
			cfg.configure();
			return cfg.buildSessionFactory();
		};
		SessionFactory factory = sessionFactory.get();
		College college = new College();

		List<String> list = new ArrayList<>();

		list.add("STSN");
		list.add("SVDC");
		list.add("SVBC");
		list.add("BDC");
		list.add("ADC");

		for (String nameOfCollege : list) {

			Session session = factory.openSession();
			Transaction txn = session.beginTransaction();
			college.setCollegeName(nameOfCollege);
			session.save(college);
			txn.commit();
			session.close();

		}
		Consumer<SessionFactory> closingFactory = (fact) -> {
			fact.close();
		};
		closingFactory.accept(factory);

		Set<String> set = list.stream().collect(Collectors.toSet());

		Consumer<Set> loop = (setOfColleges) -> {
			int i = 1;
			
			for (String string : set) {
				System.out.println(i + ". College Name : " + string);
				i++;
			}
			
		};
		loop.accept(set);
	}
}
