package Everland;

import java.util.ArrayList;
import java.util.Scanner;

public class Everland {
	
	public static void main(String[] args) {

		 /* 변수 선언 */
		 int DateOfUse;
		 int ticketCount;
		 int preferential;
		 int price = 0;
		 int manAge = 0;
		 int finalPrice = 0;
		 int addorder = 0;
		 String jumin;
		 String person = null;
		 String woodae = null;
		 String ticket = null;
		 
		 Everland_util everUtil = new Everland_util();

		 //누적변수

		 ArrayList<String> saveage = new ArrayList<String>();
		 ArrayList<String> saveticket = new ArrayList<String>();
		 ArrayList<Integer> savecount = new ArrayList<Integer>();
		 ArrayList<Integer> saveprice = new ArrayList<Integer>();
		 ArrayList<String> savewoodae = new ArrayList<String>();
		 
		// 스캐너 선언 
		 Scanner myInput = new Scanner(System.in);
		 
		 do {
	          System.out.print("이용날짜를 입력하세요. ex)20210101 : ");
	          DateOfUse = myInput.nextInt();
	          
	          System.out.print("주민번호 앞자리를 입력하세요. ex)960101 : ");
	          jumin = myInput.next();
	          
	          System.out.print("몇장을 구매하시겠습니까?  ");
	          ticketCount = myInput.nextInt();
	          
		      System.out.println("우대사항을 선택하세요.\n" + "1. 없음\n"+ "2. 장애인\n"+ "3. 국가유공자\n"+ "4. 다자녀\n"+ "5. 임산부" );
		      preferential = myInput.nextInt();

		      System.out.println("1. 추가구매, 2. 구매종료");
			  addorder = myInput.nextInt();
			     
			  System.out.println("---------------------------------------------");
	
		 manAge = everUtil.ageCal(manAge, jumin);	
		 
	     /*  ****** DIV 구분 ******
	      *  1 : 경로
	      *  2 : 대인
	      *  3 : 청소년
	      *  4 : 소인
	      *  5 : 36 개월 미만
	      *  **********************  */
	      
	     int div = 0;
	     
	     if ( manAge >= 65 )                      div = 1;
	     else if ( manAge >= 19 && manAge < 65 ) div = 2;
	     else if ( manAge >= 13 && manAge < 19 ) div = 3;
	     else if ( manAge >= 3  && manAge < 13 ) div = 4;
	     else 							          div = 5;
		 
	     ticket = everUtil.ticketCal(DateOfUse);
	     person = everUtil.calPerson(div);
	     price  = everUtil.calPrice(preferential, div);
		 woodae = everUtil.calPref(preferential);
		
	     //저장
		 saveticket.add(ticket);
	     saveage.add(person);
	     savecount.add(ticketCount);
	     saveprice.add(price);
	     savewoodae.add(woodae);
 		} while(addorder==1);
		 
		 myInput.close();
		 
 		//최종가격 출력
		for(int i = 0; i < saveticket.size(); i++) { 	
		finalPrice += savecount.get(i) *  saveprice.get(i);
 		} 
 		System.out.printf("가격은 %d원 입니다.\n감사합니다.\n", finalPrice);		
		System.out.println("=============== 에버랜드  ===================");
		
		//최종 출력
		for(int index = 0; index < saveticket.size(); index++) {
		System.out.printf("%s %s X %d %d %s 적용\n",saveticket.get(index),saveage.get(index), savecount.get(index), saveprice.get(index), savewoodae.get(index));
		}
		System.out.println("=============================================");
	}
}
 

		 