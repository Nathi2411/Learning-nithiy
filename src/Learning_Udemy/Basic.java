package Learning_Udemy;

import java.util.ArrayList;

public class Basic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 7 ; 
		String str = " testchar ";
		boolean value = true;
		double decimal = 8.99;
		System.out.println(value + str + num + " " + decimal);
		
		// arrays
		String[] str2 = {"hi","hello","common","letsgo"};
		System.out.println(str2[2]); 
		
		for(int i=0; i<str2.length; i++)
		{
			System.out.println(str2[i]);	
		}
				
		for(String n: str2)
		{
			System.out.println(n);
		}
		
		int[] arr = {1,3,2,4,5,6};
		
		for (int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		
		ArrayList<String> a = new ArrayList<String>();
		a.add("Hi");
		a.add("Hello");
		a.add("How");
		a.add("Are");
		a.add("You");
		System.out.println(a.get(1));
				
		
	}}
 