package Everland;

import java.util.Scanner;

public class Everland_Input {
	
	public int DateOfUse, ticketCount, preferential, price = 0, manAge = 0, addorder = 0, div, isEventCoupon = 0;;
	public String jumin, person = null, woodae = null, ticket = null;
	
	public void inPut() {
	Scanner myInput = new Scanner(System.in);
		
	System.out.print("�̿볯¥�� �Է��ϼ���. ex)20210101 : ");
    DateOfUse = myInput.nextInt();
    
    System.out.print("�ֹι�ȣ ���ڸ��� �Է��ϼ���. ex)960101 : ");
    jumin = myInput.next();
    
    System.out.print("������ �����Ͻðڽ��ϱ�?  ");
    ticketCount = myInput.nextInt();
    
    System.out.println("�������� �����ϼ���.\n" + "1. ����\n"+ "2. �����\n"+ "3. ����������\n"+ "4. ���ڳ�\n"+ "5. �ӻ��" );
    preferential = myInput.nextInt();
    
    System.out.println("�̺�Ʈ���� ���θ� �����ϼ���.\n" + "1. ����  2. ����" );
    isEventCoupon = myInput.nextInt();

    System.out.println("1. �߰�����, 2. ��������");
	addorder = myInput.nextInt();
	     
	System.out.println("---------------------------------------------");
	
	}
}
