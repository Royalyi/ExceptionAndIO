package test;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class TransferPhotowithpassword {
	/*��ͼƬ����
	 * 
	 *�������ڸ���ͼƬ�Ļ��������һ����
	 * */
	public static void main(String[] args) throws Exception {
		BufferedInputStream bis=new BufferedInputStream(new FileInputStream("U.jpg"));           //�����FileInputStream����һ���ڲ����������飬�����˶�ȡ�ļ���Ч��
		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("copy.jpg"));	
		int b;
		while((b=bis.read()) != -1){ 																//���ζ����ֽڲ�д��
			bos.write(b^123);
		}
		
		bis.close();
		bos.close();
	
	}
}
