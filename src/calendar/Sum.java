package calendar;

import java.util.Scanner;

public class Sum {
	public static void main(String[] args) {
		System.out.println("달을 입력하세요");
		Scanner s = new Scanner(System.in);
		int month = s.nextInt();
		int[] maxDays = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30 ,31};
		
		System.out.println(month+"월은"+maxDays[month+1]+"일 까지 있습니다");
	}
}

