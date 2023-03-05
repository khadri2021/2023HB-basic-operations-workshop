package com.khadri.hibernate.client;

import java.util.Optional;
import java.util.Scanner;

import org.hibernate.Session;

import com.khadri.hibernate.entity.College;
import com.khadri.hibernate.session.BasicOperationSession;

public class Client3 {
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		Session sess = BasicOperationSession.getSession();

		System.out.println("please enter college Id : ");
		int id = sc.nextInt();

		College cid = sess.get(College.class, id);

		Optional<College> ofNullable = Optional.ofNullable(cid);
		if (ofNullable.isPresent()) {
			College cid2 = ofNullable.get();

			System.out.println(cid2.getClgId());
			System.out.println(cid2.getClgName());
		} else {
			System.out.println("NO RECORDS FOUND !!!!");
		}

	}

}
