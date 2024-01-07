
public class Calendar {	
    
	static int dayOfMonth = 1;   
	static int month = 1;
	static int year = 1900;
	static int dayOfWeek = 2;     
	static int nDaysInMonth = 31; 
	
	
	public static void main(String args[]) {
		int selctedyear = Integer.parseInt(args[0]);
	    int debugDaysCounter = 1; 
	 	while (year<= selctedyear) {	
	 		if (year == selctedyear) {
				System.out.print(dayOfMonth +"/"+ month + "/" + year);
			
				if (debugDaysCounter % 7 == 0 ) {
					
					System.out.print(" Sunday");	
				}
			}
			
			System.out.println();
			advance();
			
	 		debugDaysCounter++;
	 		
	 		
		}
			
	} 
	
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
	  
		 
    
	private static boolean isLeapYear(int year) {
	    boolean isLeap;
		isLeap = ((year % 400) == 0) || ((year % 4) == 0) && ((year % 100) != 0);

		return isLeap;
	}
	 
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