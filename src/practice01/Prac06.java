package practice01;    //again

import java.util.Scanner;

public class Prac06 {
	public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("숫자를 입력하세요");
			int num=sc.nextInt();
			int sum=0;
			if(num%2==0) {
				for(int i=1; i<=num; i++) {
					if(i%2==0) {
						sum=sum+i;
					}
				}
			}else if(num%2!=0) {
				for(int i=1; i<=num; i++) {
					 if(i%2!=0) {
						 sum=sum+i;
					 
					 }
			}
				
			}
			System.out.println("결과값: "+sum);
	}
}