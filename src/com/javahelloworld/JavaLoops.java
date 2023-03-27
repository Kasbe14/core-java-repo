package com.javahelloworld;

public class JavaLoops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		while loop also called entry control loop
//		becox it checks the conditn first then start the loop
		int i=1,j=0,n=20;
		while(i<=n) {
			System.out.println(i);
			i++;
		}
//		do-while loop exit also called exit control loop
//		because it checks conditns at the exit.
//		the doWhile loop executes al least once
		do {
			j=j+1;
			System.out.println(j);
		}while(j<=n);
//for loop it requires initialization condition and updates;
//		we can skip the initialization and upadation
		for(int k=0;k<n;k++) {
			System.out.println(k);
		}
	}

}
