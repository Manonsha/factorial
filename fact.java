package projectUpload;

import java.util.Scanner;

public class fact {
	
	public static void main(String []args) {

		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number to get the Factorial : ");
		int n=sc.nextInt();
		int res=1;
		for(int i=1;i<=n;i++) {
					
				res=res*i;
			}
		System.out.println("Factorial of "+n+" is "+res);
	}
}