package picture;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

/**
 * 
 * 功能描述：创建TXT文件并进行读、写、修改操作
 * 
 * @author <a href="mailto:zhanghhui@126.com">KenZhang</a>
 * @version 1.0 Creation date: 2007-12-18 - 下午06:48:45
 */
public class svalog {
	public static BufferedReader bufread;
	// 指定文件路径和名称
	private static String path = "E:/tp/log.txt";
	private static File filename = new File(path);

	public void creatTxtFile() {
		if (!filename.exists()) {
			try {
				filename.createNewFile();
				System.out.println("创建文件成功");
			} catch (IOException e) {
				System.out.println(e);
				System.out.println("创建文件失败!!");
			}
		} else {
			System.out.println("文件已创建");
		}
	}

	public void writeTxtFile(String str) {
		try {
			 FileOutputStream fos = new FileOutputStream(path, true);   
			PrintWriter myFile = new PrintWriter(fos);
			//myFile.write(str2);
			myFile.print(str);
			myFile.close();
			fos.flush();
			fos.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public String readTxtFile() {
		String lineTxt = "";
		String lineTxt2 = "";
		 try {
			InputStreamReader read = new InputStreamReader(new FileInputStream(filename));
			BufferedReader bufferedReader = new BufferedReader(read);
			while((lineTxt = bufferedReader.readLine()) != null){
				lineTxt2= lineTxt2 + lineTxt+"\n";
            }
			read.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return lineTxt2;
	}

	/**
	 * main方法测试
	 * 
	 * @param s
	 * @throws IOException
	 */
	public static void main(String[] s) throws IOException {
		svalog sv = new svalog();
//		sv.creatTxtFile();
		// sv.readTxtFile();
		for(int i=0;i<10;i++){
			sv.writeTxtFile("20080808:12:132中\n");
		}
	}
}