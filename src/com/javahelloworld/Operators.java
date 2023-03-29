package com.javahelloworld;

public class Operators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=10,b=20;
		
		int result=(a<b)?a:b;
		
		System.out.println(result);
		
		
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);
		System.out.println(b%a);
		
		
		System.out.println(a>b);
		System.out.println(a<b);
		System.out.println(a>=b);
		System.out.println(a<=b);
		System.out.println(a!=b);
		System.out.println(a==b);
		
		
		System.out.println((a!=b)&&(a>b));
		System.out.println((a!=b)||(a>b));
		
		
		System.out.println(a>>2);
		System.out.println(b<<2);
		
		a=a+10;
		a+=10;
		
		a=a*b;
		a*=b;
	}

}
