
public class JourneyCalculator {

	public static void main(String[] args) {
		
	JourneyCalculator journeyCalculator=new JourneyCalculator();
		
	Double dist=journeyCalculator.calculateDistance(60.0,1.5);
	System.out.printf("%.2f", dist);

		
		

	}
     public double calculateDistance(double speed, double time) {
    	 double distance=speed*time;
    	 return distance;
     }
}
