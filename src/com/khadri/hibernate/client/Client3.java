package com.khadri.hibernate.client;

import java.util.Scanner;

import org.hibernate.Session;

import com.khadri.hibernate.entity.College;
import com.khadri.hibernate.session.BasicOperationSession;

public class Client3 {
	private static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
 
		Session sess =  BasicOperationSession.getSession();
		
		System.out.println("please enter college Id : ");
		int id = sc.nextInt();
		
		College cid = sess.get(College.class, id);
		
		
		System.out.println(cid.getClgId());
		System.out.println(cid.getClgName());
		
	}

}
