package Everland;

import java.util.ArrayList;
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
		 int addorder = 0;
		 String jumin;
		 String person = null;
		 String woodae = null;
		 String ticket = null;
		 
		 Everland_util everUtil = new Everland_util();

		 //��������

		 ArrayList<String> saveage = new ArrayList<String>();
		 ArrayList<String> saveticket = new ArrayList<String>();
		 ArrayList<Integer> savecount = new ArrayList<Integer>();
		 ArrayList<Integer> saveprice = new ArrayList<Integer>();
		 ArrayList<String> savewoodae = new ArrayList<String>();
		 
		// ��ĳ�� ���� 
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
	
		 manAge = everUtil.ageCal(manAge, jumin);	
		 
	     /*  ****** DIV ���� ******
	      *  1 : ���
	      *  2 : ����
	      *  3 : û�ҳ�
	      *  4 : ����
	      *  5 : 36 ���� �̸�
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
		
	     //����
		 saveticket.add(ticket);
	     saveage.add(person);
	     savecount.add(ticketCount);
	     saveprice.add(price);
	     savewoodae.add(woodae);
 		} while(addorder==1);
		 
		 myInput.close();
		 
 		//�������� ���
		for(int i = 0; i < saveticket.size(); i++) { 	
		finalPrice += savecount.get(i) *  saveprice.get(i);
 		} 
 		System.out.printf("������ %d�� �Դϴ�.\n�����մϴ�.\n", finalPrice);		
		System.out.println("=============== ��������  ===================");
		
		//���� ���
		for(int index = 0; index < saveticket.size(); index++) {
		System.out.printf("%s %s X %d %d %s ����\n",saveticket.get(index),saveage.get(index), savecount.get(index), saveprice.get(index), savewoodae.get(index));
		}
		System.out.println("=============================================");
	}
}
 

		 