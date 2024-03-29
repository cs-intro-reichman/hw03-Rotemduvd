
public class Calendar1 {	
    
	static int dayOfMonth = 1;   
	static int month = 1;
	static int year = 1900;
	static int dayOfWeek = 2;     // 1.1.1900 was a Monday
	static int nDaysInMonth = 31; // Number of days in January
	
	
	public static void main(String args[]) {
		
	    int debugDaysCounter = 1; 
		int specialsunday = 0;
	 	while (year<2000) {	
	 		System.out.print(dayOfMonth +"."+ month + "." + year);
			
			if (debugDaysCounter % 7 == 0 ) {
				System.out.print(" Sunday");
				if (dayOfMonth == 1) {
					specialsunday++;
				}
			}

			System.out.println();
			advance();
			
	 		debugDaysCounter++;
	 		
	 		//if (debugDaysCounter == 365) { 
	 			//break;
			//}
		}
			System.out.println("During the 20th century, " + specialsunday + " Sundays fell on the first day of the month");
	} 
		 		 	//// Write the necessary ending code here

	
	 // Advances the date (day, month, year) and the day-of-the-week.
	 // If the month changes, sets the number of days in this month.
	 // Side effects: changes the static variables dayOfMonth, month, year, dayOfWeek, nDaysInMonth.
	 private static void advance() {
		if (dayOfMonth<nDaysInMonth(month, year)){
			dayOfMonth ++;
		}else{
			dayOfMonth = 1;
			month++;
		}

		if (month>12){
			month = 1;
			year++;
		}	
		
		
		
	 }
	  
		 
    // Returns true if the given year is a leap year, false otherwise.
	private static boolean isLeapYear(int year) {
	    boolean isLeap;
		isLeap = ((year % 400) == 0) || ((year % 4) == 0) && ((year % 100) != 0);

		return isLeap;
	}
	 
	// Returns the number of days in the given month and year.
	// April, June, September, and November have 30 days each.
	// February has 28 days in a common year, and 29 days in a leap year.
	// All the other months have 31 days.
	private static int nDaysInMonth(int month, int year) {
		int days = 0;
		switch (month) {
			case 1:
				days = 31;
				break;
			case 2:
				if (isLeapYear(year)) {
					days = 29;
				} else {
					days = 28;
				}
				break;
			case 3:
				days = 31;
				break;
			case 4:
				days = 30;
				break;
			case 5:
				days = 31;
				break;
			case 6:
				days = 30;
				break;
			case 7:
				days = 31;
				break;
			case 8:
				days = 31;
				break;
			case 9:
				days = 30;
				break;
			case 10:
				days = 31;
				break;
			case 11:
				days = 30;
				break;
			case 12:
				days = 31;
				break;
		}
		
		return days;
	}
}