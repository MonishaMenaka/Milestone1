//Activity 5
package wiproPRP;
import java.util.Scanner;
public class averagesum {

	public static void main(String[] args)  {  
	      int n=10, count = 1;   
	      float  x, average, sum = 0;   
	      Scanner sc = new Scanner(System.in);   
	      System.out.println("Enter 10 numbers:");
	      while (count <= n)   
	             {   
	                   
	                  x = sc.nextInt();  
	                  sum += x;   
	                  ++count;   
	             }   
	                  average = sum/n;   
	        System.out.println("The Average is"+average);  
	    }    
	}