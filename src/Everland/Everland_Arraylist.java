package Everland;

import java.util.ArrayList;

public class Everland_Arraylist {
	
	 public ArrayList<String> saveage = new ArrayList<String>();
	 public ArrayList<String> saveticket = new ArrayList<String>();
	 public ArrayList<Integer> savecount = new ArrayList<Integer>();
	 public ArrayList<Integer> saveprice = new ArrayList<Integer>();
	 public ArrayList<String> savewoodae = new ArrayList<String>();
	 
	 public void confirmAdd(String ticket, String person, int ticketCount , int price, String woodae ) {
	 saveticket.add(ticket);
     saveage.add(person);
     savecount.add(ticketCount);
     saveprice.add(price);
     savewoodae.add(woodae);
	 }
     
 	public void printData() {
 	 int finalPrice = 0;
	 for(int i = 0; i < saveticket.size(); i++) {
		finalPrice += savecount.get(i) *  saveprice.get(i);
 		} 
 		System.out.printf("가격은 %d원 입니다.\n감사합니다.\n", finalPrice);		
		System.out.println("=============== 에버랜드  ===================");
		
		for(int index = 0; index < saveticket.size(); index++) {
		System.out.printf("%s %s X %d %d %s 적용\n",saveticket.get(index),saveage.get(index), savecount.get(index), saveprice.get(index), savewoodae.get(index));
		}
		System.out.println("=============================================");
 	}

}
