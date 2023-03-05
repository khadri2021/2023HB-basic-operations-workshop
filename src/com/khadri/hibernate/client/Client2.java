package com.khadri.hibernate.client;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.khadri.hibernate.entity.College;
import com.khadri.hibernate.session.BasicOperationSession;

public class Client2 {
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		College college = new College();
		Session session = BasicOperationSession.getSession();
		Transaction txn = session.beginTransaction();

		System.out.println("Enter Registration Number Of The College : ");
		String clgRegNumber = sc.next();
		System.out.println("Enter Name Of The College : ");
		String clgName = sc.next();
		System.out.println("Enter Strength Of The College : ");
		int clgStrength = sc.nextInt();
		System.out.println("Enter Address Of The College : ");
		String clgAddress = sc.next();
		System.out.println("Enter Town Of The College : ");
		String clgTown = sc.next();
		System.out.println("Enter City Of The College : ");
		String clgCity = sc.next();
		System.out.println("Enter State Of The College : ");
		String clgState = sc.next();
		System.out.println("Enter How Much Annual Return Of The College : ");
		double clgAnnualReturns = sc.nextDouble();
		System.out.println("Enter How Many Office Staff in The College : ");
		int clgOfficeStaff = sc.nextInt();
		System.out.println("Enter How Many Teaching Staff in The College : ");
		int clgTeachingStaff = sc.nextInt();

		college.setClgRegNumber(clgRegNumber);
		college.setClgName(clgName);
		college.setClgStrength(clgStrength);;
		college.setClgAddress(clgAddress);
		college.setClgTown(clgTown);
		college.setClgCity(clgCity);
		college.setClgState(clgState);
		college.setClgAnnualReturns(clgAnnualReturns);
		college.setClgOfficeStaff(clgOfficeStaff);
		college.setClgTeachingStaff(clgTeachingStaff);
		
		session.save(college);
		txn.commit();
		System.out.println("Successfully Inserted.");
	}
}
