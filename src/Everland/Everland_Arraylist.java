package Everland;

import java.util.ArrayList;

public class Everland_Arraylist {
	
	public ArrayList<DataClass> arrData = new ArrayList<DataClass>();
	 
	 public void confirmAdd(String ticket, String person, int ticketCount , int price, String woodae, int isEventCoupon ) {
		 DataClass item = new DataClass();
		 item.ticket = ticket;
		 item.ticketCount = ticketCount;
		 item.price = price;
         item.person = person;
         item.woodae = woodae;
         item.isEventCoupon = isEventCoupon;
		 arrData.add(item);
	 }
     
 	public void printData() {
 	 int finalPrice = 0;
	 for(int i = 0; i < arrData.size(); i++) {
		finalPrice += arrData.get(i).price *  arrData.get(i).ticketCount;
 		} 
 		System.out.printf("������ %d�� �Դϴ�.\n�����մϴ�.\n", finalPrice);		
		System.out.println("=============== ��������  ===================");
		
		for(int index = 0; index < arrData.size(); index++) {
		System.out.printf("%s %s X %d %d %s ����\n",arrData.get(index).ticket,arrData.get(index).person, arrData.get(index).ticketCount,
				arrData.get(index).price, arrData.get(index).woodae,arrData.get(index).isEventCoupon);
		}
		
		System.out.println("=============================================");
 	}

}
