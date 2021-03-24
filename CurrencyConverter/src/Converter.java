import java.util.Scanner;

public class Converter {
	Scanner sc=new Scanner(System.in);
	//method to convert Denar to Eur	
	public static void denarToEur() {
		System.out.println("Enter an amount of denar: ");
		Scanner sc=new Scanner(System.in);
		double denar=sc.nextDouble();
		if(denar>0) {
			System.out.println(denar/61.60);
		}else {
			System.out.println("Please enter the amount in Denar");
		}
	}
	//method to convert Eur to Denar
	public static void eurToDenar() {
		System.out.println("Enter an amount of eur: ");
		Scanner sc=new Scanner(System.in);
		double eur=sc.nextDouble();
		if(eur>0) {
			System.out.println(eur*61.60);
		}else {
			System.out.println("Please enter the amount in Eur");
		}
	}
	//method to convert Denar to USD
	public static void denarToUsd() {
		System.out.println("Enter an amount of Denar: ");
		Scanner sc=new Scanner(System.in);
		double denar=sc.nextDouble();
		if(denar>0) {
			System.out.println(denar/52.00);
		}else {
			System.out.println("Please enter the amount in Denar");
		}
	}
	//method to convert USD to Denar	
		public static void usdToDenar() {
			System.out.println("Enter an amount of USD: ");
			Scanner sc=new Scanner(System.in);
			double usd=sc.nextDouble();
			if(usd>0) {
				System.out.println(usd*52.00);
			}else {
				System.out.println("Please enter the amount in Denar");
			}		
	}
	//method to covert AUD to Denar
		public static void audToDenar() {
			System.out.println("Enter an amount of AUD: ");
			Scanner sc=new Scanner(System.in);
			double aud=sc.nextDouble();
			if(aud>0) {
				System.out.println(aud*39.52);
			}else {
				System.out.println("Please enter the amount in AUD");
			}		
	}
	//method to convert Denar to AUD
		public static void denarToAud() {
			System.out.println("Enter an amount of Denar: ");
			Scanner sc=new Scanner(System.in);
			double denar=sc.nextDouble();
			if(denar>0) {
				System.out.println(denar/39.52);
			}else {
				System.out.println("Please enter the amount in Denar");
			}		
	}
}
