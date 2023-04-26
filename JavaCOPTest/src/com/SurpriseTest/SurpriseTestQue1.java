package com.SurpriseTest;

import java.util.Arrays;
import java.util.Scanner;

public class SurpriseTestQue1 {

	public static void main(String[] args) {
		
		
		String str="hello everyone how are u";
		
		System.out.println(str.length());
		
		
		int size=str.length();
		char[] str1=new char[size];
		
		
		//System.out.println(str.charAt(0));
		
		for(int i=size-1, j=0;i>=0;i--,j++) {
			
			str1[j]=str.charAt(i);
			
		}
		
		for(int i=0;i<size;i++)
			System.out.print(str1[i]);
		
		
		System.out.println();
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the the char whose second last occurance u want to find");

		char c=sc.next().charAt(0);
		System.out.println("You Entered: "+c);
		
		int position=0, count=0;
		for(int i=0;i<size;i++) {
			
			if(str1[i]==c) {
				count++;
			}
			if(count==2) {
				position=size-i;
				break;
			}
		}
		System.out.println("Second last position of given character is:"+position+" \nindex is:"+(position-1));
		
	}

}
