import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Choose an option: ");
		System.out.println("1 to convert Denar to Eur");
		System.out.println("2 to convert Denar to USD");
		System.out.println("3 to convert Denar to AUD");
		System.out.println("4 to convert Euro to Denar");
		System.out.println("5 to convert USD to Denar");
		System.out.println("6 to convert AUD to Denar");
		int num=sc.nextInt();
		switch(num) {
		case 1:
			Converter.denarToEur();
			break;
		case 2:
			Converter.denarToUsd();
			break;
		case 3:
			Converter.denarToAud();
			break;
		case 4:
			Converter.eurToDenar();
			break;	
		case 5:
			Converter.usdToDenar();
			break;
		case 6:
			Converter.audToDenar();
			break;		
		}

	}

}
