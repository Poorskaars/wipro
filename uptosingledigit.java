import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int num=-12345,temp=0,a=0;
		int n=Math.abs(num);
		while( n>0){
			temp=n%10;
			a=a+temp;
			n=n/10;
		}
			if(a>9){
				n=a;
				a=0;
				while(n>0){
					temp=n%10;
					a=a+temp;
					n=n/10;
				}
				}
				
				
	int sum=a;
	if(num<0){
		sum=-sum;
		System.out.println(sum);
	}
	else if(num>0){
	System.out.println(sum);
	}
	
	
	}
}
