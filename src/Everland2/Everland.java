package Everland2;

import java.text.SimpleDateFormat;
import java.util.Date;
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
		 String jumin;
		 String person = null;
		 String woodae = null;
		 
		 int addorder = 0, ordercount = 0;

		 //누적변수
		 String[] saveage = new String[100];
		 String[] saveticket = new String[100];
		 int[] savecount = new int[100];
		 int[] saveprice = new int[100];
		 String[] savewoodae = new String[100];
				 
		 
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

		 // 만 나이 계산
		 
		 SimpleDateFormat format = new SimpleDateFormat("yyyyMMdd");
		 String today = format.format(new Date());
		 	
		 int thisYear  = Integer.parseInt(today.substring(0,4));
		 int thisMonth = Integer.parseInt(today.substring(4,6));
		 int thisDay   = Integer.parseInt(today.substring(6,8));
		 		
		 int juminYear  = Integer.parseInt(jumin.substring(0,2));
		 int juminMonth = Integer.parseInt(jumin.substring(2,4));
		 int juminDay   = Integer.parseInt(jumin.substring(4,6));
		 
		 if( juminYear > 21) {
		    juminYear = 1900 + juminYear;
		 }
		 else if( juminYear <= 21) {
		 	juminYear = 2000 + juminYear;
		 }		
		 manAge = thisYear - juminYear;
		 	
		 if( juminMonth > thisMonth) {
			 manAge = manAge - 1;			
		 }
		 else if ( juminMonth == thisMonth) {		 	
			 if(juminDay > thisDay) {
				 manAge = manAge - 1;	
			 }
		 }			 

			/*  ****** 나이에 따라 연령대(DIV) 구분 ******
			 *  1 : 경로
			 *  2 : 대인
			 *  3 : 청소년
			 *  4 : 소인
			 *  5 : 36 개월 미만
			 *  **************************************  */
		 
		 int div = 0;

		 if ( manAge >= 65 )                     div = 1;
		 else if ( manAge >= 19 && manAge < 65 ) div = 2;
		 else if ( manAge >= 13 && manAge < 19 ) div = 3;
		 else if ( manAge >= 3  && manAge < 13 ) div = 4;
		 else 							         div = 5;
	
		 //우대사항에 따른 가격 구분
		
		 if (preferential == 1 ) {
			 if( div == 2 || div == 3 ) {
		         price = 60000;
			 }
			 else if ( div == 1 || div == 4 ) {
				 price = 48000;
			 }
			 else {
				 price = 0;
			 }
		 }	 
		 
		 else if (preferential == 2 ) {
			 if( div == 2 ) {
		         price = 36000;
			 }
			 else if ( div == 1 || div == 3 || div == 4 ) {
				 price = 28000;
			 }
			 else {
				 price = 0;
			 }
		 }	 		 
		 
		 else if (preferential == 3 ) {
			 if( div == 2 || div == 3 ) {
		         price = 30000;
			 }
			 else if ( div == 1 || div == 4 ) {
				 price = 24000;
			 }
			 else {
				 price = 0;
			 }
		 }	 		
		 
		 else if (preferential == 4 ) {
			 if( div == 2 || div == 3 ) {
		         price = 48000;
			 }
			 else if ( div == 1 || div == 4 ) {
				 price = 38000;
			 }
			 else {
				 price = 0;
			 }
		 }	
		 
		 else if (preferential == 5 ) {
			 if( div == 2 ) {
		         price = 51000;
			 }
		 }
		 
			//연령대에 따라 명칭 구분
			
			switch(div) {
				case 1:
					person = "경로";
					break;
				case 2:
					person = "대인";
					break;
				case 3:
					person = "청소년";
					break;
				case 4:
					person = "소인";
					break;
				case 5:
					person = "36 개월 미만";
					break;
			}		 
			
		 // 우대사항 구분
		
		switch(preferential) {
			case 1:
				woodae = "우대사항 미";
				break;
			case 2:
				woodae = "장애인";
				break;
			case 3:
				woodae = "국가유공자";
				break;
			case 4:
				woodae = "다자녀";
				break;
			case 5:
				woodae = "임산부";
				break;
		}			
		
	     //저장
	     saveage[ordercount] = person;
	     savecount[ordercount] = ticketCount;
	     saveprice[ordercount] = price;
	     savewoodae[ordercount] = woodae;
		 ordercount++;
 		} while(addorder==1);
		 
 		for(int i = 0; i < ordercount; i++) { 
		
		finalPrice += savecount[i] *  saveprice[i] ;
 		}
		System.out.printf("가격은 %d원 입니다.\n감사합니다.\n", finalPrice);		
		System.out.println("=============== 에버랜드  ===================");
		
		for(int index = 0; index < ordercount; index++) {
		System.out.printf("A티켓 %s X %d %d %s 적용\n", saveage[index], savecount[index], saveprice[index], savewoodae[index] );
		
		}
		System.out.println("=============================================");
	}
}
