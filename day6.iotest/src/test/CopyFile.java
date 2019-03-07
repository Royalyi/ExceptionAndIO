package test;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

public class CopyFile {
	/*
	 * 拷贝文件
	 * 
	 * 分析：从键盘输入文件路径
	 * 创建有缓冲区的文件输入输出流对象
	 * 一次读写数据
	 * 
	 * 注意提高程序运行效率
	 * */
	
	public static void main(String[] args) throws Exception {
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入需要拷贝的文件的正确路径");
		String str=sc.nextLine();
		File file = new File(str);															//文件地址
		System.out.println(file
				);
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream(file));
		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(file.getName()));
		int b;
		byte arr[] = new byte[1024*8];
		while((b = bis.read(arr)) != -1 ){
			bos.write(arr, 0, b);															//将指定 byte 数组中从偏移量 off 开始的 len 个字节写入此缓冲的输出流。
			
		}	
		System.out.println("运行完成");
	}
}
