package Everland2;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Everland {

	public static void main(String[] args) {
		
		 /* ���� ���� */
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

		 //��������
		 String[] saveage = new String[100];
		 String[] saveticket = new String[100];
		 int[] savecount = new int[100];
		 int[] saveprice = new int[100];
		 String[] savewoodae = new String[100];
				 
		 
         Scanner myInput = new Scanner(System.in);
		
         
         
 		do {
			 System.out.print("�̿볯¥�� �Է��ϼ���. ex)20210101 : ");
		     DateOfUse = myInput.nextInt();
		     
		     System.out.print("�ֹι�ȣ ���ڸ��� �Է��ϼ���. ex)960101 : ");
		     jumin = myInput.next();
		     
		     System.out.print("������ �����Ͻðڽ��ϱ�?  ");
		     ticketCount = myInput.nextInt();
		     
			 System.out.println("�������� �����ϼ���.\n" + "1. ����\n"+ "2. �����\n"+ "3. ����������\n"+ "4. ���ڳ�\n"+ "5. �ӻ��" );
			 preferential = myInput.nextInt();
			 
			 System.out.println("1. �߰�����, 2. ��������");
		     addorder = myInput.nextInt();
		     
		     System.out.println("---------------------------------------------");

		 // �� ���� ���
		 
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

			/*  ****** ���̿� ���� ���ɴ�(DIV) ���� ******
			 *  1 : ���
			 *  2 : ����
			 *  3 : û�ҳ�
			 *  4 : ����
			 *  5 : 36 ���� �̸�
			 *  **************************************  */
		 
		 int div = 0;

		 if ( manAge >= 65 )                     div = 1;
		 else if ( manAge >= 19 && manAge < 65 ) div = 2;
		 else if ( manAge >= 13 && manAge < 19 ) div = 3;
		 else if ( manAge >= 3  && manAge < 13 ) div = 4;
		 else 							         div = 5;
	
		 //�����׿� ���� ���� ����
		
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
		 
			//���ɴ뿡 ���� ��Ī ����
			
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
			
		 // ������ ����
		
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
		
	     //����
	     saveage[ordercount] = person;
	     savecount[ordercount] = ticketCount;
	     saveprice[ordercount] = price;
	     savewoodae[ordercount] = woodae;
		 ordercount++;
 		} while(addorder==1);
		 
 		for(int i = 0; i < ordercount; i++) { 
		
		finalPrice += savecount[i] *  saveprice[i] ;
 		}
		System.out.printf("������ %d�� �Դϴ�.\n�����մϴ�.\n", finalPrice);		
		System.out.println("=============== ��������  ===================");
		
		for(int index = 0; index < ordercount; index++) {
		System.out.printf("AƼ�� %s X %d %d %s ����\n", saveage[index], savecount[index], saveprice[index], savewoodae[index] );
		
		}
		System.out.println("=============================================");
	}
}
