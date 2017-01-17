import java.util.Scanner;

public class PrimeFactors {
	public static void main (String []args){
		int num,factor=2;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter any number:");
        num = s.nextInt();
        while(num>1){
        	if(num%factor==0){
        		System.out.println(factor);
        		num=num/factor;
        	}
        	else{
        		factor++;
        	}
        }
        
	}

}
