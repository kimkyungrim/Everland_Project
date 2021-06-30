package Everland;

import java.util.Scanner;

public class Everland_Input {
	
	public int DateOfUse, ticketCount, preferential, price = 0, manAge = 0, addorder = 0, div, isEventCoupon = 0;;
	public String jumin, person = null, woodae = null, ticket = null;
	
	public void inPut() {
	Scanner myInput = new Scanner(System.in);
		
	System.out.print("이용날짜를 입력하세요. ex)20210101 : ");
    DateOfUse = myInput.nextInt();
    
    System.out.print("주민번호 앞자리를 입력하세요. ex)960101 : ");
    jumin = myInput.next();
    
    System.out.print("몇장을 구매하시겠습니까?  ");
    ticketCount = myInput.nextInt();
    
    System.out.println("우대사항을 선택하세요.\n" + "1. 없음\n"+ "2. 장애인\n"+ "3. 국가유공자\n"+ "4. 다자녀\n"+ "5. 임산부" );
    preferential = myInput.nextInt();
    
    System.out.println("이벤트쿠폰 여부를 선택하세요.\n" + "1. 있음  2. 없음" );
    isEventCoupon = myInput.nextInt();

    System.out.println("1. 추가구매, 2. 구매종료");
	addorder = myInput.nextInt();
	     
	System.out.println("---------------------------------------------");
	
	}
}
