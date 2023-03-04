package com.khadri.hibernate.client;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.khadri.hibernate.entity.Employee;
import com.khadri.hibernate.session.BasicOperationSessipon;

public class ClientMain {

	public static void main(String[] args) {

		Session sess = BasicOperationSessipon.getSession();

		Transaction txn = sess.beginTransaction();

		Employee emp = new Employee();
		emp.setEmpName("JHON");
		emp.setSalary(100000.00);

		sess.save(emp);

		txn.commit();

		sess.close();

	}
}
