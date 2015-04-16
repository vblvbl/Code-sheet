package com;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

public class test {

	public static void main(String[] args) {
		String fileName = "E:\\学习笔记\\ceshi.txt";
		String path = "E:\\学习笔记\\ceshi.txt";

//		try {
//			FileUtil.touch(path);
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//		String path2 = "E:\\学习笔记\\ceshi";
//		FileUtil.mkdir(path2);
//		System.out.println(FileUtil.isExist(path2));
		
		//输出流（write）------写入文件-------可以判断是否追加
		/*String charset = "gbk";
		Boolean isAppend = true;
		String fileContent="haha";
		try {
			BufferedWriter bw =FileUtil.getBufferedWriter(path, charset, isAppend);
			bw.write(fileContent);
			bw.close();  
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		String charset = "gbk";
		Boolean isAppend = true;
		try {
			PrintWriter pw = FileUtil.getPrintWriter(path, charset, isAppend);
			pw.write("gbk");
			pw.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}*/
		
		 //没有用write的输入流（基本输入流）-----读取文件
        /*FileInputStream fis = null;                 
        try{
                 //创建流对象
                 fis = new FileInputStream("E:\\学习笔记\\ceshi.txt");
                 //读取数据，并将读取到的数据存储到数组中
                 byte[] data = new byte[1024]; //数据存储的数组
                 int i = 0; //当前下标
                 //读取流中的第一个字节数据
                 int n = fis.read();
                 //依次读取后续的数据
                 while(n != -1){ //未到达流的末尾
                          //将有效数据存储到数组中
                          data[i] = (byte)n;
                          //下标增加
                          i++;
                          //读取下一个字节的数据
                           n = fis.read();
                 }             
                 //解析数据
                 String s = new String(data,0,i);

                //输出字符串
                 System.out.println(s);
        }catch(Exception e){
                 e.printStackTrace();
        }finally{
                 try{
                          //关闭流，释放资源
                          fis.close();
                 }catch(Exception e){}
        }*/
		
		//输入流（reader）--------读取文件
        /*String fileContent = "";     
	    try   
	    {    
	        File f = new File(fileName);      
	        if(f.isFile()&&f.exists())  
	        {       
	            InputStreamReader read = new InputStreamReader(new FileInputStream(f),"gbk");       
	            BufferedReader reader=new BufferedReader(read);       
	            String line;       
	            while ((line = reader.readLine()) != null)   
	            {        
	            	fileContent += line;       
	                System.out.println(fileContent);
	            }         
	            read.close();      
	        }     
	    } catch (Exception e)   
	    {
	    	e.printStackTrace();     
	    }*/
	     
		//输出流（write）-----写入文件
		String fileContent = "嘿嘿";      
        try   
        {      
            File f = new File(fileName);      
            if (!f.exists())   
            {       
                f.createNewFile();      
            }      
            OutputStreamWriter write = new OutputStreamWriter(new FileOutputStream(f),"gbk");      
            BufferedWriter writer=new BufferedWriter(write);          
            writer.write(fileContent);      
            writer.close();     
        } catch (Exception e)   
        {      
            e.printStackTrace();     
        }
  
	}
}
