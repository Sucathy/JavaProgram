import java.util.Scanner;

public class CalculatorApp {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		while(true) {
			System.out.println("Hello user welcome to macOs"); 
			System.out.println("+ =====> Addtion"); 
			System.out.println("- =====> Subtaction");     
			System.out.println("* =====> Multiplication"); 
			System.out.println("/ =====> Division");  
			System.out.println("% =====> Reaminder");  
			System.out.println("^ =====> Square");  
			Calculator  c=new Calculator();
			System.out.println("Enter the choice");
			

			char ch=scan.next().charAt(0);


			switch(ch){
				
			case('+'):
				c.Addtion();
				break;


			case('-'):
				c.sub();
				break;


			case'*':
				c.multp();
				break;


			case'/':
				c.Divd();
				break;


			case'%':
				c.findReam();
				break;


			case'^':
				c.findSquare();
				break;		

		    default:
			    System.out.println("fuck you");
			    break;


			}
		}	
	}

}
