package Everland;

public class Everland_finalPrint {
	
	public void finalPrint(){
		
		Everland_Input Ever_Input = new Everland_Input();
		Everland_Arraylist everArray = new Everland_Arraylist();
		Everland_util everUtil = new Everland_util();
		 
		 do {
			 
		Ever_Input.inPut();
		
		Ever_Input.manAge = everUtil.ageCal(Ever_Input.manAge, Ever_Input.jumin);	
		Ever_Input.div = everUtil.divCal(Ever_Input.manAge);	
		Ever_Input.ticket = everUtil.ticketCal(Ever_Input.DateOfUse);
		Ever_Input.person = everUtil.calPerson(Ever_Input.div);
		Ever_Input.price  = everUtil.calPrice(Ever_Input.preferential, Ever_Input.div);
		Ever_Input.woodae = everUtil.calPref(Ever_Input.preferential);

		everArray.confirmAdd(Ever_Input.ticket, Ever_Input.person, Ever_Input.ticketCount ,Ever_Input.price, Ever_Input.woodae, Ever_Input.isEventCoupon);
		
 		} while(Ever_Input.addorder==1);
		
		everArray.printData();
	}

}