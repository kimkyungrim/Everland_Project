package Everland;

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
		 String ticket = null;
		 
		 Everland_util everUtil = new Everland_util();
		 
		 int addorder = 0, ordercount = 0;

		 //��������
		 String[] saveage = new String[100];
		 String[] saveticket = new String[100];
		 int[] savecount = new int[100];
		 int[] saveprice = new int[100];
		 String[] savewoodae = new String[100];	
		 
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
	     
	     if ( manAge >= 65 )                     div = 1;
	     else if ( manAge >= 19 && manAge < 65 ) div = 2;
	     else if ( manAge >= 13 && manAge < 19 ) div = 3;
	     else if ( manAge >= 3  && manAge < 13 ) div = 4;
	     else 							         div = 5;
		 
	     ticket = everUtil.ticketCal(DateOfUse);
	     person = everUtil.calPerson(div);
	     price  = everUtil.calPrice(preferential, div);
		 woodae = everUtil.calPref(preferential);
		
	     //����
		 saveticket[ordercount] = ticket;
	     saveage[ordercount] = person;
	     savecount[ordercount] = ticketCount;
	     saveprice[ordercount] = price;
	     savewoodae[ordercount] = woodae;
		 ordercount++;
 		} while(addorder==1);
		 
 		//�������� ���
		for(int i = 0; i < ordercount; i++) { 	
		finalPrice += savecount[i] *  saveprice[i] ;
 		} 
 		System.out.printf("������ %d�� �Դϴ�.\n�����մϴ�.\n", finalPrice);		
		System.out.println("=============== ��������  ===================");
		
		//���� ���
		for(int index = 0; index < ordercount; index++) {
		System.out.printf("%s %s X %d %d %s ����\n",saveticket[index],saveage[index], savecount[index], saveprice[index], savewoodae[index] );
		}
		System.out.println("=============================================");
	}
}
 

		 