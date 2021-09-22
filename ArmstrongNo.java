 package myJavaPractice;

import java.util.Scanner;

public class AmstrongNo {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("enter the number");
	int num=s.nextInt();
	int sum=0,temp,rem;
	temp=num;
	while(num>0) {
		rem=num%10;
		sum=sum+(rem*rem*rem);
		num=num/10;
	}
	if(temp==sum) {
		System.out.println("amstrong");
	}
	else {
		System.out.println("not amstron");
	}
	
}

}
