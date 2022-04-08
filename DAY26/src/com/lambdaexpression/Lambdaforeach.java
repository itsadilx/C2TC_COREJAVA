package com.lambdaexpression;

import java.util.LinkedList;

public class Lambdaforeach {

	public static void main(String[] args) 
	{
	LinkedList<String> ll=new LinkedList<String>();
	ll.add("adil");
	ll.add("ammar");
	ll.add("akash");
	ll.add("vikas");
	ll.forEach((n)->{System.out.println(n);});
	

	}

}
