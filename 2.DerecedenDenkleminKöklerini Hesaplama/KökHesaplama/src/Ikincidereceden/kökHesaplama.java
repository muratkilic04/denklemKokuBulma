package Ikincidereceden;

import java.util.Scanner;

public class kökHesaplama {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		
		double a,b,c,D;
		
		System.out.println("A katsayısnı girin:");
		a=s.nextDouble();
		
		System.out.println("B katsayısını girin:");
		b=s.nextDouble();
		
		System.out.println("C katsayısını girin:");
		c=s.nextDouble();
		
		D=b*b-4*a*c;
		
		if(D>0) {
			System.out.println("Denklemin 2 kökü vardır.");
			double x1=(-b+Math.sqrt(D))/2*a;
			double x2=(-b-Math.sqrt(D))/2*a;
			System.out.println("Birinci kök:"+x1);
			System.out.println("İkinci kök:"+x2);
		}else if(D==0) {
			System.out.println("Denklemin sadece 1 kökü vardır.");
			double x1=(-b+Math.sqrt(D))/2*a;
			System.out.println("Kök:"+x1);			
		}else{
			System.out.println("Denklemin reel kökleri yoktur");
		}
		
	}

}
