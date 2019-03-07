package test;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class TransferPhotowithpassword {
	/*给图片加密
	 * 
	 *分析：在复制图片的基础上异或一个属
	 * */
	public static void main(String[] args) throws Exception {
		BufferedInputStream bis=new BufferedInputStream(new FileInputStream("U.jpg"));           //相比与FileInputStream增加一个内部缓冲区数组，增加了读取文件的效率
		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("copy.jpg"));	
		int b;
		while((b=bis.read()) != -1){ 																//依次读入字节并写入
			bos.write(b^123);
		}
		
		bis.close();
		bos.close();
	
	}
}
