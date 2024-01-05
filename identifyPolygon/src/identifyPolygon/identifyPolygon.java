package identifyPolygon;

import java.util.Scanner;

public class identifyPolygon {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the side's ");
		int side=scan.nextInt();
		IdentifyPolygon(side);
	}
     public static void IdentifyPolygon(int side)
     {
    	 switch (side) {
        case 3:System.out.println("Triangle");
        break;
        case 4:System.out.println("Quadrilateral");
        break;
        case 7:System.out.println("Pentagon");
        break;
        case 6:System.out.println("Hexagon");
        break;
        case 7:System.out.println("Heptagon");
        break;
        case 8:System.out.println("Octagon");
        break;
        case 9:System.out.println("Nonagon");
        break;
        case 10:System.out.println("Decagon");
        break;
		 default:
			 System.out.println("Enter the sides of Polygon");
    	 }
     }
}