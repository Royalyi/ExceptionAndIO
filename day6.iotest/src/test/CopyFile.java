package test;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

public class CopyFile {
	/*
	 * �����ļ�
	 * 
	 * �������Ӽ��������ļ�·��
	 * �����л��������ļ��������������
	 * һ�ζ�д����
	 * 
	 * ע����߳�������Ч��
	 * */
	
	public static void main(String[] args) throws Exception {
		Scanner sc=new Scanner(System.in);
		System.out.println("��������Ҫ�������ļ�����ȷ·��");
		String str=sc.nextLine();
		File file = new File(str);															//�ļ���ַ
		System.out.println(file
				);
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream(file));
		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(file.getName()));
		int b;
		byte arr[] = new byte[1024*8];
		while((b = bis.read(arr)) != -1 ){
			bos.write(arr, 0, b);															//��ָ�� byte �����д�ƫ���� off ��ʼ�� len ���ֽ�д��˻�����������
			
		}	
		System.out.println("�������");
	}
}
