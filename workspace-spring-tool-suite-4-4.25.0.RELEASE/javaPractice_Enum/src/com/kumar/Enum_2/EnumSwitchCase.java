/**
 * Role of Enum in switch case
 */


package com.kumar.Enum_2;

 enum Day{
	SUN,MON,TUE,WED,THU,FRI,SAT;
	 //the default constructor is called for each and every constant befor using it.
//	 Day(){
//			System.out.println("Invoke Constructor.");
//		}
}
public class EnumSwitchCase {

	public static void main(String[] args) {
		
		Day[] days= Day.values();
		for (Day day: days) {
			switch(day) {
			
			case MON:
				System.out.println("Monday");
				break;
			case TUE:
				System.out.println("Tuesday");
				break;
			case WED:
				System.out.println("Wednesday");
				break;
			case THU:
				System.out.println("Thursday");
				break;
			case FRI:
				System.out.println("Friday");
				break;
			case SAT:
				System.out.println("Saturday");
				break;
			case SUN:
				System.out.println("Sunday");
				break;
			}
		}
		

	}

}
