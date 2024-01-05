import java.util.Scanner;
public class Fib {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); 
		System.out.println("enter the value of n");
		int n =scanner.nextInt();
		int fib1=0 ,fib2=1;
		if (n == 1){
			System.out.println(fib1);
		}else if (n == 2) {
			System.out.println(fib1 +" "+ fib2);
			
		}else {
			System.out.println(fib1+" "+fib2+" ");
			for(int i=3;i<=n;i++) {
			int nextno =fib1 +fib2;
			System.out.println(nextno);
			fib1 = fib2;
			fib2=nextno;
			}
		}
			
		
		

	}

}
