/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int number;
		Scanner s1=new Scanner(System.in);
		number=s1.nextInt();
		if(number>0)
		System.out.println("Positive");
		else if(number<0)
		System.out.println("Negative");
		else
		System.out.println("Zero");
	}
}
