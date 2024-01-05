import java.util.Scanner;

public class Calculator {
	Scanner scan=new Scanner(System.in);
	public void Addtion() {
		System.out.println("Enter two Number");
		int a=scan.nextInt();
		int b=scan.nextInt();
		System.out.println(a+b);
		}
	
	public void sub() {
		System.out.println("Enter two Number");
		int a=scan.nextInt();
		int b=scan.nextInt();
		System.out.println(a-b);
		}
	public void multp() {
		System.out.println("Enter two Number");
		int a=scan.nextInt();
		int b=scan.nextInt();
		System.out.println(a*b);
		}
	public void Divd() {
		System.out.println("Enter two Number");
		int a=scan.nextInt();
		int b=scan.nextInt();
		System.out.println(a/b);
		}
	public void findReam() {
		System.out.println("Enter two Number");
		int a=scan.nextInt();
		int b=scan.nextInt();
		System.out.println(a%b);
		}
	public void findSquare() {
		System.out.println("Enter two Number");
		int a=scan.nextInt();
		int b=scan.nextInt();
		System.out.println(a^b);
		}
		
}

