/* 关于导入excel 
    需要把文件上传到服务器端，然后在读取服务器端文件进行操作
*/

jsp 页面
<%@ page contentType="text/html;charset=gb2312"%>
<html>
<title><%= application.getServerInfo() %></title>
<body>
上传文件程序应用示例
<form action="doUpload.jsp" method="post" enctype="multipart/form-data">
<%-- 类型enctype用multipart/form-data，这样可以把文件中的数据作为流式数据上传，不管是什么文件类型，均可上传。--%>
请选择要上传的文件<input type="file" name="upfile" size="50">
<input type="submit" value="提交">
</form>
</body>
</html>


后台接收
String saveDirectory = Parameters.getUpload_path() + "\\";  //获取本地保存文件位置  一般在配置文件里面有
int maxPostSize = 0x14000000;     //文件最大

//保存文件
MultipartRequest multi = null;
	try {
		multi = new MultipartRequest(request, saveDirectory,
				maxPostSize, "gbk");
	} catch (IOException e1) {
		e1.printStackTrace();
	}
	
	Enumeration files = multi.getFileNames();
	String fileName = "";   
	String filePath="";
	//文件名
	fileName = (String) files.nextElement();  
	//文件对象
	File f = multi.getFile(fileName);   
	//真实文件名
	filePath = multi.getFilesystemName(fileName);   
	
	InputStream is = new FileInputStream(saveDirectory + filePath);
	HSSFWorkbook hssfWorkbook = new HSSFWorkbook(is);
	HSSFSheet hssfSheet = hssfWorkbook.getSheetAt(0);
	if (hssfSheet != null) {
		for (int rowNum = 1; rowNum <= hssfSheet.getLastRowNum(); rowNum++) {
			HSSFRow hssfRow = hssfSheet.getRow(rowNum);
			if(hssfRow != null){
				hssfRow.getCell(1).setCellType(HSSFCell.CELL_TYPE_STRING);
				System.out.println(hssfRow.getCell(1).getStringCellValue());	
			}
		}
	}
