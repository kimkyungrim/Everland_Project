package Everland;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Everland_util {
	
	public String ticketCal(int DateOfUse) {
		String ticket = null;	
		if(DateOfUse == 20210904 || DateOfUse == 20210905 || DateOfUse == 20210911 || DateOfUse == 20210912 || DateOfUse == 20210918
				 || DateOfUse == 20210919 || DateOfUse == 20210920 || DateOfUse == 20210921 || DateOfUse == 20210922 || DateOfUse == 20210925
				 || DateOfUse == 20210926 || DateOfUse == 20211002 || DateOfUse == 20211003 || DateOfUse == 20211009 || DateOfUse == 20211010
				 || DateOfUse == 20211016 || DateOfUse == 20211017 || DateOfUse == 20211023 || DateOfUse == 20211024 || DateOfUse == 20211030
				 || DateOfUse == 20211031 || DateOfUse == 20211106 || DateOfUse == 20211107) {
				ticket = "A 티켓";

			} else if(DateOfUse == 20210703 || DateOfUse == 20210704 || DateOfUse == 20210710 || DateOfUse == 20210711 || DateOfUse == 20210717 
		         || DateOfUse == 20210718 || DateOfUse == 20210724 || DateOfUse == 20210725 || DateOfUse == 20210729 || DateOfUse == 20210730 
		    	 || DateOfUse == 20210731 || DateOfUse == 20210801 || DateOfUse == 20210802 || DateOfUse == 20210803 || DateOfUse == 20210807 
		    	 || DateOfUse == 20210808 || DateOfUse == 20210814 || DateOfUse == 20210815 || DateOfUse == 20210821 || DateOfUse == 20210822 
		    	 || DateOfUse == 20210828 || DateOfUse == 20210829 || DateOfUse == 20210903 || DateOfUse == 20210906 || DateOfUse == 20210907 
		    	 || DateOfUse == 20210908 || DateOfUse == 20210909 || DateOfUse == 20210910 || DateOfUse == 20210913 || DateOfUse == 20210914 
		    	 || DateOfUse == 20210915 || DateOfUse == 20210916 || DateOfUse == 20210917 || DateOfUse == 20210923 || DateOfUse == 20210924 
		    	 || DateOfUse == 20210927 || DateOfUse == 20210928 || DateOfUse == 20210929 || DateOfUse == 20210930 || DateOfUse == 20211001 
		    	 || DateOfUse == 20211004 || DateOfUse == 20211005 || DateOfUse == 20211006 || DateOfUse == 20211007 || DateOfUse == 20211008 
		    	 || DateOfUse == 20211011 || DateOfUse == 20211012 || DateOfUse == 20211013 || DateOfUse == 20211014 || DateOfUse == 20211015 
		    	 || DateOfUse == 20211018 || DateOfUse == 20211019 || DateOfUse == 20211020 || DateOfUse == 20211021 || DateOfUse == 20211022
		    	 || DateOfUse == 20211025 || DateOfUse == 20211026 || DateOfUse == 20211027 || DateOfUse == 20211028 || DateOfUse == 20211029 
		    	 || DateOfUse == 20211101 || DateOfUse == 20211102 || DateOfUse == 20211103 || DateOfUse == 20211104 || DateOfUse == 20211105 
		    	 || DateOfUse == 20211108 || DateOfUse == 20211109 || DateOfUse == 20211110 || DateOfUse == 20211111 || DateOfUse == 20211112 
		    	 || DateOfUse == 20211113 || DateOfUse == 20211114 || DateOfUse == 20211120 || DateOfUse == 20211121 || DateOfUse == 20211127 
		    	 || DateOfUse == 20211128) {
		    	ticket = "B 티켓";

			} else if(DateOfUse == 20210628 || DateOfUse == 20210629 || DateOfUse == 20210630 || DateOfUse == 20210701 || DateOfUse == 20210702
				 || DateOfUse == 20210705 || DateOfUse == 20210706 || DateOfUse == 20210707 || DateOfUse == 20210708 || DateOfUse == 20210709
				 || DateOfUse == 20210712 || DateOfUse == 20210713 || DateOfUse == 20210714 || DateOfUse == 20210715 || DateOfUse == 20210716
				 || DateOfUse == 20210719 || DateOfUse == 20210720 || DateOfUse == 20210721 || DateOfUse == 20210722 || DateOfUse == 20210723
				 || DateOfUse == 20210726 || DateOfUse == 20210727 || DateOfUse == 20210728 || DateOfUse == 20210804 || DateOfUse == 20210805
				 || DateOfUse == 20210806 || DateOfUse == 20210809 || DateOfUse == 20210810 || DateOfUse == 20210811 || DateOfUse == 20210812
				 || DateOfUse == 20210813 || DateOfUse == 20210816 || DateOfUse == 20210817 || DateOfUse == 20210818 || DateOfUse == 20210819
				 || DateOfUse == 20210820 || DateOfUse == 20210823 || DateOfUse == 20210824 || DateOfUse == 20210825 || DateOfUse == 20210826
				 || DateOfUse == 20210827 || DateOfUse == 20210830 || DateOfUse == 20210831 || DateOfUse == 20210901 || DateOfUse == 20210902
				 || DateOfUse == 20211115 || DateOfUse == 20211116 || DateOfUse == 20211117 || DateOfUse == 20211118 || DateOfUse == 20211119
				 || DateOfUse == 20211122 || DateOfUse == 20211123 || DateOfUse == 20211124 || DateOfUse == 20211125 || DateOfUse == 20211126
				 || DateOfUse == 20211129 || DateOfUse == 20211130) {
				ticket = "C 티켓";
			}
				 return ticket;
	}
		
	public int ageCal(int Manage, String jumin) {
		 
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
		 Manage = thisYear - juminYear;
		 	
		 if( juminMonth > thisMonth) {
		 	Manage = Manage - 1;			
		 }
		 else if ( juminMonth == thisMonth) {		 	
			 if(juminDay > thisDay) {
				 Manage = Manage - 1;	
			 }
		 }		
		 
		 return Manage;
	}
	
	public int divCal( int Manage) {
	     int div = 0;	     
	     if ( Manage >= 65 )                      div = 1;
	     else if ( Manage >= 19 && Manage < 65 ) div = 2;
	     else if ( Manage >= 13 && Manage < 19 ) div = 3;
	     else if ( Manage >= 3  && Manage < 13 ) div = 4;
	     else 							          div = 5;
	     return div;
	}
	
	public int calPrice(int preferential, int div) {
		 //우대사항에 따른 가격, 우대사항 구분
		 int price = 0;
		
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
		
		return price;

	}
	
	public String calPref(int preferential) {
		String woodae = null;
		
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
		
		return woodae;
		
	}
	
	public String calPerson(int div) {
		String person = null;
		
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
		
		return person;
	}

}
