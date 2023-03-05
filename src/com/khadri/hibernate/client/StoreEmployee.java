package com.khadri.hibernate.client;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.khadri.hibernate.entity.Employee;
import com.khadri.hibernate.session.BasicOperationSession;

public class StoreEmployee {

	public static void main(String[] args) {

		Session sess = BasicOperationSession.getSession();

		Transaction txn = sess.beginTransaction();

		Employee emp = new Employee();
		Scanner sc =new Scanner(System.in);
		
		System.out.println("please enter employee name  ");
		String userName = sc.next();
		emp.setEmpName(userName);
		
		System.out.println("please enter employee salary  ");
		double salary = sc.nextDouble();
		emp.setEmpsalary(salary);
		

		sess.save(emp);

		txn.commit();

		sess.close();

	}
}
