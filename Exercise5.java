import java.util.Scanner;
import java.lang.*;
class Exercise5 {
	public static void main(String[] args) {
		int i=0;
		double j=1.0;
		int c=1;
		int largestHailstone=0;
		Scanner myinput = new Scanner (System.in);
		System.out.println("Please input an integer:");
		i = myinput.nextInt();
		while (i>1) {
			j=1.0*i;
			j=j/2;
			if (j==Math.round(j)) {
				//even	
				i=i/2;
			} 
			else {
				//odd
				i=3*i+1;
			}
			c++;
			if (i>largestHailstone) {
				largestHailstone=i;
			}
				System.out.println(i);
		}	
	System.out.println("length: " + c + " Maximum Hailstone: " + largestHailstone);
	}
}