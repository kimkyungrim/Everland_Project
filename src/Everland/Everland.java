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
		 String jumin;
		 String person = null;
		 String woodae = null;
		 
		 Everland_util everUtil = new Everland_util();
		 
		 
		 // ��ĳ�� ����
		 Scanner myInput = new Scanner(System.in);
		 
	     System.out.print("�̿볯¥�� �Է��ϼ���. ex)20210101 : ");
	     DateOfUse = myInput.nextInt();
	     
	     System.out.print("�ֹι�ȣ ���ڸ��� �Է��ϼ���. ex)960101 : ");
	     jumin = myInput.next();
	     
	     System.out.print("������ �����Ͻðڽ��ϱ�?  ");
	     ticketCount = myInput.nextInt();
	     
		 System.out.println("�������� �����ϼ���.\n" + "1. ����\n"+ "2. �����\n"+ "3. ����������\n"+ "4. ���ڳ�\n"+ "5. �ӻ��" );
		 preferential = myInput.nextInt();
		 
		 myInput.close();
	
		 
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
		 
		 price  = everUtil.calPrice(preferential, div);
		 woodae = everUtil.calPref(preferential);
		 person = everUtil.calPerson(div);
		
		 int finalPrice = ticketCount * price ;
		 
		 System.out.printf("������ %d�� �Դϴ�.\n�����մϴ�.\n", finalPrice);		
		 System.out.println("=============== ��������  ===================");
		 System.out.println(" AƼ�� " + person +  " X " + ticketCount + "  " + finalPrice + "   * " +  woodae + " ����");
		 System.out.println("=============================================");

		 
	}
}
 

		 