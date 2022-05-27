package com.cts;

import com.service.ServiceClass;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello");
		System.out.println("How are you??");
		
		ServiceClass obj = new ServiceClass();
		System.out.println(obj.findLength("password"));

	}

}
