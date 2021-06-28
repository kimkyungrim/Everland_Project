package Everland;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Everland_util {
	public int ageCal( int Manage , String jumin) {
		 
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
	
	public int calPrice(int preferential, int div) {
		 //�����׿� ���� ����, ������ ����
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
				woodae = "������ ��";
				break;
			case 2:
				woodae = "�����";
				break;
			case 3:
				woodae = "����������";
				break;
			case 4:
				woodae = "���ڳ�";
				break;
			case 5:
				woodae = "�ӻ��";
				break;
		}			
		
		return woodae;
		
	}
	
	public String calPerson(int div) {
		String person = null;
		
		switch(div) {
			case 1:
				person = "���";
				break;
			case 2:
				person = "����";
				break;
			case 3:
				person = "û�ҳ�";
				break;
			case 4:
				person = "����";
				break;
			case 5:
				person = "36 ���� �̸�";
				break;
		}		 
		
		return person;
	}

}
