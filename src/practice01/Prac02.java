package practice01;     //again

import java.util.Scanner;

public class Prac02 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in) ;
		System.out.println("숫자를 입력하세요");
		int num=sc.nextInt();
		for(int j=1; j<=num; j++) {
			
			for(int i=1; i<=j; i++) {
				System.out.print(j);
			}
			System.out.println();
		
		}
		
		
		sc.close();
	}
}
