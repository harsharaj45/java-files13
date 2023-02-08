package sample.first;

import java.util.Scanner;

public class SumAverage {
	int sum;
	private void sum(int a, int b) {
		 sum=a+b;
		System.out.println("sum : "+sum);
		
	}
	private float average() {
		float avg;
		avg=sum/2;
		return avg;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter numbers");
		int a=sc.nextInt();

		int b=sc.nextInt();
		SumAverage obj=new SumAverage();
		obj.sum(a,b);
		float av=obj.average();
		System.out.println("average : "+av);

	}

	
	

}
