package com.khadri.hibernate.client;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.khadri.hibernate.entity.College;

public class Client3 {
	private static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure();
		SessionFactory sf = cfg.buildSessionFactory();
		Session sess = sf.openSession();
		System.out.println("please enter college Id...");
		int id = sc.nextInt();
		College cid = sess.get(College.class, id);
		System.out.println(cid.getClgId());
		System.out.println(cid.getClgName());
		
	}

}
