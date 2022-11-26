package com.prescholas.java_basics;

public class HomeClass {
	
	//first project
	/* Write a program that declares 2 integer variables, assigns an integer to each, and adds them together. 
	   Assign the sum to a variable. Print out the result.
	 */
	public static void main(String[] args) {
	int a = 5 ;
	int b = 7 ;
	int sum = a + b;
	System.out.println("a + b = 5 + 7 = " +sum);
	
	/* second one
		Write a program that declares 2 double variables, assigns a number to each, and adds them together. 
		Assign the sum to a variable. Print out the result.
	*/
	double c = 33.3D;
	double k = 4.9D;
	double sum2 = c + k;
	System.out.println("c + k = 33.3 + 4.9 = " +sum2);

	/*
	  Write a program that declares an integer variable and a double variable, assigns numbers to each, and adds them together. 
	  Assign the sum to a variable. 
	  Print out the result. What variable type must the sum be?
	 */
	
	int w = 5;
	double p = 5.7D;
	double sum3 = w + p;  //The sum must be double
	System.out.println("w + p = 5 + 5.7 = " +sum3);

	/*
	  Write a program that declares 2 integer variables, assigns an integer to each, and divides the larger number by the smaller number. 
	  Assign the result to a variable. Print out the result. 
	 */
	
	int m = 14;
	int n = 5;
	double result = (m / n);  //The result must be double
	System.out.println("m / n = 14 / 5 = " +result);
	/*
	  Now change the larger number to a decimal. 
	  What happens? What corrections are needed?
	  
	  	int m2 = 14.6; 
		int n2 = 5;
		double result2 = (m2 / n2);  
		System.out.println( "m2 / n2 = " +result2 );
	 */
	
	/*
	 * Write a program that declares 2 double variables, assigns a number to each, and divides the larger by the smaller. 
	 * Assign the result to a variable. Print out the result.
	 */
	
	double m3 = 14.6; 
	double n3 = 5.1;
	double result3 = (m3 / n3);  
	System.out.println( "m3 / n3 = " +result3 );
	
	/*
	 *  Now, cast the result to an integer. Print out the result again.
	 */
	
	double m4 = 14.6; 
	double n4 = 5.1;
	double result4 = (int)(m4 / n4);  
	System.out.println( "m4 / n4 = " +result4 );
	
	
	/*
	 * Write a program that declares two integer variables, x, and y, and assigns 5 to x and 6 to y. 
	 * Declare a variable q and assign y/x to it and print q. 
	 * Now, cast y to a double and assign it to q. Print q again.
	 */
	
	int x = 5;
	int y = 6;
	double y1 = y; // cast int to double
	double q = y1 / x ; 
	System.out.println("x + y = 6 / 5 = " +q);

	/*
	 * Write a program that declares a named constant and uses it in a calculation. Print the result.
	 */
	
	int constant1 = 5;
	double z = constant1 * 3;System.out.println(z);
	
	
	/*
	  Write a program where you create 3 variables that represent products at a cafe. 
	  The products could be beverages like coffee, cappuccino, espresso, green tea, etc. 
	  Assign prices to each product. 
	  Create 2 more variables called subtotal and totalSale and 
	  complete an “order” for 3 items of the first product, 
	  4 items of the second product, and 2 items of the third product. 
	  Add them all together to calculate the subtotal.
	 */
	
	double tea = 4.5;
	double coffee = 5.8;
	double cappuccino = 3.6; 
	double subtotal;
	double totalSale;
	subtotal = tea * 3 + coffee * 4 + cappuccino * 2;
	System.out.println(subtotal);
	
	/*
	 * Create a constant called SALES_TAX and add sales tax to the subtotal to obtain the totalSale amount. 
	 * Be sure to format the results to 2 decimal places.
	 */
	
	double SALES_TAX = 6.5 ;
	totalSale =  subtotal + SALES_TAX;
	System.out.printf("%.2f", totalSale);
	}
}
