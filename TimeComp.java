//Activity 11
package wiproPRP;

public class TimeComp {

	public static void main(String[] args) {
	    int rh=6;
	    int rw=32;
	    int kh=5;
	    int kw=40;
	    float onehour_work=(rw/rh)+(kw/kh);
	    float work=110/(onehour_work);
	    System.out.print("Time taken by both to complete 110 pages : "+work+"hrs");
		
}
}
