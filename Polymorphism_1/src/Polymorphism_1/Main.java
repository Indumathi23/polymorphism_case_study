package Polymorphism_1;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int coalPieces;
		float hairStrand;
		String coalMsg;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of coal pieces : ");
		coalPieces=sc.nextInt();
		System.out.println("Enter the hairStrand : ");
		hairStrand=sc.nextFloat();
		System.out.println("Enter coalMsg : ");
		coalMsg=sc.next();
		Machine s=new Machine(coalPieces,hairStrand,coalMsg);
		System.out.println("No of coal pieces :"+s.produceShoePolish(coalPieces));
		System.out.println("Hair Strand :"+s.produceShoePolish(hairStrand));
		System.out.println("Coal Msg:"+s.produceShoePolish(coalMsg));
	}

	
	}

