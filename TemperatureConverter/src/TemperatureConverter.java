import java.util.Scanner;

public class TemperatureConverter {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter temp  f");
		double f=scan.nextDouble();
		TemperatureConverterApp TemperatureConverter = new TemperatureConverterApp();
		System.out.printf("%.2f",TemperatureConverter.convertFahrenheitToCelsius(f));
	}

}
