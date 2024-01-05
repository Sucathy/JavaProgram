import java.util.Scanner;
public class fibonacci {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int n =scanner.nextInt();
		if (n < 0) {
			System.out.println("Invaild input please enter a non-negative integer.");
			
		}else {
			System.out.println("fIbaonacci serirs upb to the "+ n +"th term");
			if (n == 0) {
				System.out.println("0");
			}else if (n ==1) {
				System.out.println("0,1");
				
			}else {
				int first =0;
				int second =1;
				System.out.print("0,1");
				for(int i=2;i<=n;i++) {
					int next =first +second;
				System.out.println(","+next);
				first = second;
				second = next;
				}
				System.out.println();
			}
		} scanner.close();		

	}

}
