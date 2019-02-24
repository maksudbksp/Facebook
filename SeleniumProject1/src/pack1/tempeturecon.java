package pack1;

import java.util.Scanner;

public class tempeturecon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
double cel;		
double fer;
Scanner scan=new Scanner(System.in);
System.out.println("please enter today tempature in celcious");
cel=scan.nextInt();

 fer=(((cel *9) /5) +32);
System.out.println("ok, it will be in Ferenheit"+ fer);
/*String name;	
int hour;
double payrate;
double totalsalary;
Scanner scan=new Scanner(System.in);
System.out.println("what is your name?");
name=scan.nextLine();

System.out.println("what is your hour?");
hour=scan.nextInt();
System.out.println("what is your payrate?");
payrate=scan.nextDouble();

totalsalary=payrate*hour;
System.out.println("ok, your daily salary is"+ totalsalary);

*/
}
}