	package com.khadri.hibernate.client;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.khadri.hibernate.entity.Student;
import com.khadri.hibernate.session.BasicOperationSession;

public class StoreStudent {
	public static void main(String[] args) {

		Session sess = BasicOperationSession.getSession();
		Transaction txn = sess.beginTransaction();

		Student std = new Student();

		Scanner sc = new Scanner(System.in);
	 
		System.out.println("please enter Student name:  ");
		String stdName = sc.next();
		std.setStdName(stdName);

		System.out.println("please enter Student father name:  ");
		String stdFatherName = sc.next();
		std.setFatherName(stdFatherName);

		System.out.println("please enter Student town:  ");
		String stdTown = sc.next();
		std.setTown(stdTown);

		System.out.println("please enter Student district:  ");
		String stdDistrict = sc.next();
		std.setDistrict(stdDistrict);

		System.out.println("please enter Student fee:  ");
		Double stdFee = sc.nextDouble();
		std.setFee(stdFee);

		System.out.println("please enter Student percentage:  ");
		int stdPercentage = sc.nextInt();
		std.setPercentage(stdPercentage);

		System.out.println("please enter Student College Name:  ");
		String stdCollegeName = sc.next();
		std.setCollegeName(stdCollegeName);

		sess.save(std);
		txn.commit();
		
		System.out.println("Record inserted successfully");
		sess.close();

	}

}
