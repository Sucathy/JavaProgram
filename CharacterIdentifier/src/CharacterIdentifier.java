import java.util.*;
public class CharacterIdentifier {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a character to check digit or vowel or consonent");
		char c=scan.next().charAt(0);
		characterIdentifier(c);

	}
         public static void characterIdentifier(char c)
         {
		  if(Character.isDigit(c))
		  {
			  System.out.println(" Entered character" +c+ "is digit");
		  }
		  else if(Character.isLetter(c)) 
		  {
			  System.out.println("Enetred character" +c+ " is letter");
		  }
		  
		  else
		  {
			  switch(Character.toLowerCase(c))
			  
		  {
			  case'a':
			  case'e':
			  case'i':
			  case'o':
			  case'u':
				  if(Character.isLowerCase(c)) {
					  System.out.println("Entered character " +c+"is lower vowel");
				  }
				  else {
					  System.out.println("Entered character " +c+ " is upper vowel");
				  }
				  
				  break;
				  
				  default:
					  if(Character.isLowerCase(c)) {
						  System.out.println("Entered character " +c+ "is lower consonent");
					  }
					  else 
					  {
						  System.out.println("Entered character" +c+ " is apper consonent");
					  }
					  
		  }
			  
			  
		  }
         }	
         
}
