package calendar;

import java.util.Scanner;

public class calendar {
	private static final int[] maxDays = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30 ,31};
	public static int getmaxDaysOfMonth(int month) {
		return maxDays[month-1];
	}
	
	public void printSampleCalendar() {
		System.out.println(" 일    월    화    수    목    금    토\r\n" + 
				"--------------------\r\n" + 
				" 1  2  3  4  5  6  7\r\n" + 
				" 8  9 10 11 12 13 14\r\n" + 
				" 15 16 17 18 19 20 21\r\n" + 
				" 22 23 24 25 26 27 28 ");
	}
	
	public static void main(String[] args) {
		String PROMPT = "cal> ";
	//	System.out.println("반복횟수를 입력하세요");
		Scanner s = new Scanner(System.in);
	//	int times = s.nextInt();
		calendar cal = new calendar();
		// cal.printSampleCalendar();
		int month = 0;
		while(true) {
			System.out.println("달을 입력하세요");
			System.out.print(PROMPT);
			month = s.nextInt();
			if(month == -1) {
				break;
			}
			else if(month > 12) {
				continue;
			}
			System.out.println(month+"월은"+cal.getmaxDaysOfMonth(month)+"일 까지 있습니다");
		}
		System.out.println("Bye~");
		s.close();
	}
}