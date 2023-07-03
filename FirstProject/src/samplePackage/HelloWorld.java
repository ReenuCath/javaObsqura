package samplePackage;

import java.util.Scanner;

public class HelloWorld
{
	
	public void display(int num)
	{
		int num1=1;
		System.out.println("Inside Method");
		while(num1<=num)
		{
			System.out.print(" "+num1);
			num1++;
		}
		
	}
		
	public static void main(String[] args) 
	{
		HelloWorld obj=new HelloWorld();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int i=sc.nextInt();
		obj.display(i);
		System.out.println("End");
	}

}
