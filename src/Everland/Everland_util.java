package Everland;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Everland_util {
	public int ageCal( int age , String jumin) {
		 
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
		 age = thisYear - juminYear;
		 	
		 if( juminMonth > thisMonth) {
		 	age = age - 1;			
		 }
		 else if ( juminMonth == thisMonth) {		 	
			 if(juminDay > thisDay) {
				 age = age - 1;	
			 }
		 }		
		 
		 return age;
	}
	
	public int calPrice(int pref, int div) {
		 //�����׿� ���� ����, ������ ����
		 int price = 0;
		
		 if (pref == 1 ) {
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
		 
		 else if (pref == 2 ) {
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
		 
		 else if (pref == 3 ) {
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
		 
		 else if (pref == 4 ) {
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
		 
		 else if (pref == 5 ) {
			 if( div == 2 ) {
		         price = 51000;
			 }
		 }
		
		return price;

	}
	
	public String calPref(int pref) {
		String perfKorean = null;
		
		switch(pref) {
			case 1:
				perfKorean = "������ ��";
				break;
			case 2:
				perfKorean = "�����";
				break;
			case 3:
				perfKorean = "����������";
				break;
			case 4:
				perfKorean = "���ڳ�";
				break;
			case 5:
				perfKorean = "�ӻ��";
				break;
		}			
		
		return perfKorean;
		
	}
	
	public String calPerson(int div) {
		String divKorean = null;
		
		switch(div) {
			case 1:
				divKorean = "���";
				break;
			case 2:
				divKorean = "����";
				break;
			case 3:
				divKorean = "û�ҳ�";
				break;
			case 4:
				divKorean = "����";
				break;
			case 5:
				divKorean = "36 ���� �̸�";
				break;
		}		 
		
		return divKorean;
	}

}
