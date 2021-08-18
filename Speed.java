//Activity 8
package wiproPRP;
import java.util.*;
public class Speed {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		int y=sc.nextInt();
		float ans=(float)x/(float)y;
		float result=ans*(float)18/(float)5;
		System.out.println((int)result+5);
	}
}
