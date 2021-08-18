//Activity 10
package wiproPRP;

public class PerfectSquare {

	public static void main(String[] args) {
		int number;
		for(int i=21;i<=(int)Math.pow(2,21);i++)
		{
		    int square_root=(int)Math.sqrt(i);
		    if((square_root*square_root == i)&&(i%21==0 && i%36==0 && i%66==0))
		    {	
		    System.out.println(i);
		    break;
		    }
		}
	}
}
