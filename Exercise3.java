import java.util.Scanner;
import java.lang.*;
class Exercise3  {
	public static void main(String[] args) {
		 double subterm=1.0;
		 double g;
		 int n=2;
		 double f = 1.0e-12;
		 double x=5.0;
		  // Scanner myinput = new Scanner (System.in);
		  // System.out.println("Please input an integer:");
		  // x = myinput.nextDouble();
		  g = 1 + x;
		   while (subterm > f) {
		       subterm=mypower(x,n)/factorial(n);
		       System.out.println("N=" + n + " mypower="+mypower(x,n)+" factorial="+factorial(n));
		  	 g += subterm;
		  	 System.out.println("N=" + n + " g=" + g);
		  	  n++;
		  	 }

         System.out.println(Math.exp(x) + " " + g);
		 double text = mypower(x, n);
	}
  public static double mypower(double m, int j){
  			double result=1.0;
  	for (int i = 1; i<=j; i++){
  		result = result * m;
  	}
   return result;
  }
  public static double factorial (int j){
  	double result = 1.;
    for (int i = 1; i<=j; i++){
     result = result * i;
    }
    return result;
  }
}