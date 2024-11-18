/*Sample Problem

Write a Java Program that allows users to Convert: 
1. meters to kilometers 
2. ounces to liters 
3. celcius to fahrenheit
4. fahrenheit to celcius

Values
1. Meter = 0.001
2. ounce = 0.0295735;
3. C to F = (celsius * 9/5) + 32;
4. F to C = (fahrenheit - 32) * 5/9;
*/

import java.util.Scanner;

public class UnitConversion {
	public static double metersToKilometers(double meters){
		return meters = 0.001;
	}
	
	public static double ouncetoLiters(double ounce){
		return ounce = 0.0295735;
	}
	
	public static double celsiustoFahrenheit(double celsius){
		return (celsius * 9/5) + 32;
	}

	public static double fahrenheittoCelsius(double fahrenheit){
		return (fahrenheit - 32) * 5/9;
	}

	public static void main(String[] args){
		//Clear Console
        System.out.print("\033[H\033[2J");
        System.out.flush();
		
		//Start
		System.out.print("Welcome to Simple Converter System \n");
		System.out.print("Please Type the Number that you want to convert \n");
		
		//Choices
		System.out.print("1. Meter to Kilometer \n");
		System.out.print("2. Ounce to Liters \n");
		System.out.print("3. Celsius to Fahrenheit \n");
		System.out.print("4. Fahrenheit to Celsius \n");
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number from the choices: ");
		int choice = input.nextInt();
		switch (choice) { 
			case 1:
				System.out.print("Enter the value of meters: ");
				double meters = input.nextDouble();
				System.out.print(meters + "M = " + metersToKilometers(meters) + "Km");
				break;
				
			case 2: 
				System.out.print("Enter the value of ounces: ");
				double ounce = input.nextDouble();
				System.out.print(ounce + "OZ = " + ouncetoLiters(ounce) + "L");
				break;
				
			case 3:
				System.out.print("Enter the value of celsius: ");
				double celsius = input.nextDouble();
				System.out.print(celsius + "C = " + celsiustoFahrenheit(celsius) + "F");
				break;

			case 4:
				System.out.print("Enter the value of fahrenheit: ");
				double fahrenheit = input.nextDouble();
				System.out.print(fahrenheit + "F = " + fahrenheittoCelsius(fahrenheit) + "C");
				break;
				
			default:
				System.out.println("Invalid choice.");
		}
	}
}