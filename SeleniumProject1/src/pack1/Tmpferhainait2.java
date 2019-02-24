package pack1;
import java.util.Scanner;

public class Tmpferhainait2 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter 1 to convert from celcious to Fahrenheit.");
		System.out.println("Enter 2 to convert from Fahrenheit to celcious.");
		int choice = scan.nextInt();
		double temperature=0.0;
		double converted=0.0;
		if(choice==1)
		{
			System.err.println("Enter the temperature in cel");
		//how to convert below the formula
		temperature=scan.nextDouble();
		converted=9/5.0* temperature+32;
		System.out.println("temperature in fahrenheit=" +converted);
		}
		//for 2nd choice to converted to fahr to cels another condition
		else if(choice==2)
		{
	System.out.println("Enter the temperature in fahr");
		temperature=scan.nextDouble();
		converted=5/9.0* (temperature-32);
		System.out.println("temperature in celcious=" +converted);
		}
		else
			System.out.println("wrong input");
	}
}

