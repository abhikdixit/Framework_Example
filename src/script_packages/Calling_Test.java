package script_packages;

import org.testng.annotations.Test;
import demo_package.FlightReservation_Main_Page;

public class Calling_Test {
	
	FlightReservation_Main_Page CallMainPage = new FlightReservation_Main_Page();

  @Test
  public void Call_All_Test(){
	   
	  CallMainPage.Login();
	  CallMainPage.bookticket();
	  CallMainPage.CloseBrowser();
  }
}
