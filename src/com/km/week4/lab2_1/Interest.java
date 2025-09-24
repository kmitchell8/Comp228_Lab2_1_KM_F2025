package com.km.week4.lab2_1;


public class Interest {
	
	
	private double principal;
	private double rate;
	private int time;
	private double total;

	
	/*public Interest(int time) {
		
		this.time=time;
	}*/
	
	
	public Interest (double principal, double rate, int time){

	//validate neagtive/interger for pirincal/no strings
		
	this.principal=principal;
	this.rate=rate;
	this.time=time;


	}
	

	//method for calculation SI PRT/100
	
	 public void SimpleInterest(){
		 
		 total = principal*(rate/100)*time;
		 System.out.println("(simple ineterest) iterest accumulated = "+ String.format("%.2f",(total)));				 
		
	}

	 
	 public void CompoundInterest() {
		 double n=time*12;
		 //total = ((principal*(1+(rate/n)))^(time*n);
		 total = principal *Math.pow((1+((rate/100)/n)),(time*n));
		 System.out.println("(compound ineterest) iterest accumulated = "+ String.format("%.2f",(total-principal)));
				 
	 }


	 
	

}
