package com.ebrainpractice;

import java.util.Scanner;

public class Arithmeticoperation2 {

	public static void main(String[] args) {
		try {
		int i,j;
		Scanner sc=new Scanner (System.in);
		System.out.println("enter first value:");
		i=sc.nextInt();
		System.out.println("enter sceond value:");
		j=sc.nextInt();
		System.out.println("addition:"+(i+j));
		System.out.println("subtraction:"+(i-j));
		System.out.println("multiplication:"+(i*j));
		System.out.println("division:"+(i/j));
		System.out.println("modolus:"+(i%j));
		System.out.println("increment:"+(++i));
		System.out.println("decrement:"+(--i));
	}
		catch(Exception e)
		{
			System.out.println("invalid input");
		}
	}
}
