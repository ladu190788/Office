package Utility.FirstMaven;

import java.util.Scanner;

import org.testng.annotations.Test;

public class ReverseName
{

	@Test
	public void rev()
	{
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your name or String");
		String str=sc.nextLine();
		String revName="";
		
		for(int i=str.length()-1;i>=0;i--)
		{
			
			revName=revName+str.charAt(i);
		}
		
		System.out.println("The user input is : " +str);
		
		System.out.println("The reverse  is : " +revName);
		
		
	}
	
}
