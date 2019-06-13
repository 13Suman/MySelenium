package SeleniumPack;

import java.time.LocalDate;

public class JavaTimeStamp {

	public static void main(String[] args) {
		
		            int currentDate = LocalDate.now().getDayOfMonth();
		            System.out.println(currentDate);
		                int currentMonthValue =LocalDate.now().getMonthValue();
		                System.out.println(currentMonthValue);
		                          String cmn = LocalDate.now().getMonth().name();
		                          System.out.println(cmn);
		                         cmn =cmn.substring(0, 1) + cmn.substring(1).toLowerCase();
		                         System.out.println(cmn);
		                       int currentYear = LocalDate.now().getYear();
		                       System.out.println(currentYear);
		                       
		                       System.out.println("*****************************");
		                     int reqDate = LocalDate.now().plusDays(1).getDayOfMonth();
		                     System.out.println(reqDate);
		                          LocalDate ld = LocalDate.now().plusMonths(3);
		                          System.out.println(ld);
		                          int reqMonthValue = ld.getMonthValue();
		                          System.out.println(reqMonthValue);
		                          String reqMonthName = ld.getMonth().name();
		                          System.out.println(reqMonthName);
		                         
		                       System.out.println("*****************************");   
		                      int prevDate = LocalDate.now().minusDays(1).getDayOfMonth();
		                      System.out.println(prevDate);
		                              String prevMonth = LocalDate.now().minusMonths(3).getMonth().name();
		                              System.out.println(prevMonth);
		                        

	}

}
