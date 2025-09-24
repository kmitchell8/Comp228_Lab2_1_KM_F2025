package com.km.week4.lab2_1.Driver;

import java.util.Scanner;
//import com.km.week4.lab2_1.*;
import java.math.BigDecimal;

import com.km.week4.lab2_1.Interest;

public class Main {

	public static void main(String[] args) {
		
		
		// TODO Auto-generated method stub
		
		double principal;
		double rate;
		int time;
		Scanner input = new Scanner(System.in);
		
		try {
		System.out.println("Please enter a starting amount");
		principal = input.nextDouble();
		System.out.println("Please Enter an interest rate");
		rate = input.nextDouble();
		System.out.println("Please enter the amount of time in years for your loan");
		time = input.nextInt();
		
		Interest interest1 = new Interest(principal, rate, time);
		interest1.SimpleInterest();
		interest1.CompoundInterest();
		
		System.out.println("Please enter a starting amount");
		principal = input.nextDouble();
		System.out.println("Please Enter an interest rate");
		rate = input.nextDouble();
		System.out.println("Please enter the amount of time in years for your loan");
		time = input.nextInt();
		
		Interest interest2 = new Interest(principal, rate, time);
		interest2.SimpleInterest();
		interest2.CompoundInterest();
		
		System.out.println("Please enter a starting amount");
		principal = input.nextDouble();
		System.out.println("Please Enter an interest rate");
		rate = input.nextDouble();
		System.out.println("Please enter the amount of time in years for your loan");
		time = input.nextInt();
		
		Interest interest3 = new Interest(principal, rate, time);
		interest3.SimpleInterest();
		interest3.CompoundInterest();
		
		System.out.println("Please enter a starting amount");
		principal = input.nextDouble();
		System.out.println("Please Enter an interest rate");
		rate = input.nextDouble();
		System.out.println("Please enter the amount of time in years for your loan");
		time = input.nextInt();
		
		Interest interest4 = new Interest(principal, rate, time);
		interest4.SimpleInterest();
		interest4.CompoundInterest();
		
		
		BigDecimal deciPrincipal = new BigDecimal("50000.3256");
		principal = deciPrincipal.doubleValue();
		BigDecimal deciRate = new BigDecimal("1.0001");
		rate = deciRate.doubleValue();
		System.out.println("Please enter the amount of time in years for your loan");
		time = input.nextInt();
		
		Interest interest5 = new Interest(principal, rate, time);
		interest5.SimpleInterest();
		interest5.CompoundInterest();
		}
		catch (Exception e){
				System.out.println("Invalid input "+e.getMessage());
				System.exit(0);
		}
		

	}

}
