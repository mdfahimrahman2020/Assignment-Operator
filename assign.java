import java.util.Scanner;
public class assign{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int x,y;
		System.out.print("\n\nEnter the value of \"X\" :");
		x = input.nextInt();
		System.out.println("The value of \"X\" is :"+x);
		
		System.out.print("\n\nEnter the value of \"Y\" :");
		y = input.nextInt();
		System.out.println("The value of \"Y\" is : "+y);
		
		x+=y;
				System.out.println("\nAdd & Assign x:"+x);
		
		x-=y;
				System.out.println("\nSubtract & Assign x:"+x);

		x*=y;
	            System.out.println("\nMuptiplication & Assign x:"+x);

		x/=y;
				System.out.println("\nDivision & Assign x:"+x);

		x%=y;
				System.out.println("\nRemainder & Assign x:"+x);

		
		
	}

}