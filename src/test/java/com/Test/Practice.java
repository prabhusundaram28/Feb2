package com.Test;

import java.util.LinkedHashSet;

public class Practice  {
	public static void main(String[] args) {
		LinkedHashSet<Testing> li=new LinkedHashSet<Testing>();
		Testing a=new Testing();
		a.setId(1234);
		a.setName("prabhu");
		a.setPhone(8807048016l);
		
		Testing a1=new Testing();
		a1.setId(4567);
		a1.setName("mathan");
		a1.setPhone(8667805763l);
		li.add(a);
		li.add(a1);
		
		
		for (Testing test : li) {
			System.out.println(test.getId());
			System.out.println(test.getName());
			System.out.println(test.getPhone());
		}
	}

}
