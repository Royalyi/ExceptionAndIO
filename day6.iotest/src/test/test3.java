package test;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Scanner;

public class test3 {
	/*
	 *  将键盘录入的数据拷贝到当前项目下的text.txt文件中,键盘录入数据当遇到quit时就退出
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
