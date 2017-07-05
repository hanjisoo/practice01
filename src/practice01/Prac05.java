package practice01;   //again

import java.util.Scanner;

public class Prac05 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		
		int current;
		int best=0;
		
		for(int i=1; i<6; i++) {
			System.out.print("숫자: ");
			int num=sc.nextInt();    //5
			if(i==1) {
					
					current=num;
					best=current;
			}
			current=num;
			 if(current>best) {
					best=current;
				}
		}System.out.println("최대값은"+best+"입니다.");
		
	}
}
