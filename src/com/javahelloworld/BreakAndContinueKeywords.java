package com.javahelloworld;

public class BreakAndContinueKeywords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int limit=100;
		for(int i=1;i<=limit;i++) {
//			System.out.println(i);
			if(i==50) {
//				break;
				continue;
			}
			System.out.println(i);
		}

	}

}
