package test;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Scanner;

public class test3 {
	/*
	 *  ������¼������ݿ�������ǰ��Ŀ�µ�text.txt�ļ���,����¼�����ݵ�����quitʱ���˳�
	 * */
	
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		FileOutputStream fos = new FileOutputStream("text.text");
		
		while(true){
			String str = sc.nextLine();
			if(str.equals("quit"))
				break;
			fos.write(str.getBytes());
			fos.write("\r\n".getBytes());
		}
		fos.close();
		
	}
 
  }
