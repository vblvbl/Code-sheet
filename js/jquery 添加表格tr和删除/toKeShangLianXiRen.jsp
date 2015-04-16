<%@ page language="java"  pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>

<SCRIPT type="text/javascript">
function addlxren(){
	$('#lxren tr').eq(-2).after('<tr><td width="82"><div align="center">姓名:</div></td>'+
	    '<td width="80"><input style="width:79" />'+
	    '<td width="80"><div align="center">职务:</div></td>'+
	    '<td width="79"><input style="width:79" />'+
	    '<td width="75"><div align="center">性别:</div></td>'+
	    '<td width="79"><select style="width:79" ><option value="男">男</option><option value="女">女</option></select> '+
	    '<td width="74"><div align="center">年龄:</div></td>'+
	    '<td width="84"><input style="width:79" /></tr><tr>'+
	    '<td><div align="center">生日:</div></td>'+
	    '<td><input style="width:79" /></td>'+
	    '<td><div align="center">电话:</div></td>'+
	    '<td><input style="width:79"/> </td>'+
	    '<td><div align="center">QQ:</div></td>'+
	    '<td><input style="width:79" /></td>'+
	    '<td><div align="center">邮箱:</div></td>'+
	    '<td><input style="width:79" /></td></tr><tr>'+
	    '<td><div align="center">联系人地址:</div></td>'+
	    '<td><input style="width:79" /></td>'+
	    '<td><div align="center">办公室门牌号:</div></td>'+
	    '<td><input style="width:79" /></td>'+
	    '<td><div align="center">在公司年限:</div></td>'+
	    '<td><input style="width:79" /></td>'+
	    '<td><div align="center">性格特点:</div></td>'+
	    '<td><input style="width:79" /></td></tr><tr>'+
	    '<td><div align="center">嗜好:</div></td>'+
	    '<td><input style="width:79" /></td>'+
	    '<td><div align="center">家庭成员:</div></td>'+
	    '<td><input style="width:79" /></td>'+
	    '<td><div align="center">家庭情况:</div></td>'+
	    '<td><input style="width:79" /></td>'+
	    '<td><div align="center">联系人流动:</div></td>'+
	    '<td><input style="width:79" /></td></tr><tr>'+
	    '<td><div align="center">其他:</div></td>'+
	    '<td colspan="7"><div align="left">'+
	    '<input style="width:580" /></div></td></tr>');
	
}
$('#deletelianxiren').click(function(){
	var l = $("#lxren tr").length;
	if(l>6){
		$('#addlxren tr').eq(-2).remove();
		$('#addlxren tr').eq(-2).remove();
		$('#addlxren tr').eq(-2).remove();
		$('#addlxren tr').eq(-2).remove();
		$('#addlxren tr').eq(-2).remove();
	}else{
		alert("无法删除！");
	}
});
 
$('#saveLianxiRen').click(function(){
	var kskid = $('#addKeShangLianXiRenDialog').attr('kskid');
	var lxren = [];
	 $('#lxren input[name!=caozuo],#lxren select').each(function(){
	 		lxren.push($(this).val());
		 });
	     lxren.push("-");
	  var url = window.globalContextPath+'heTongGuanLi/insertKsLxRen.action';
	     $.post(url,{'kskrenyuan':lxren.join(","),'kskid':kskid},function(data){
	    	 if(data==0){
	    		 alert("提交成功!");
	    		 $('#addKeShangLianXiRenDialog').dialog('close');
	    		 getLianxirentianjia(); //马庆华 2014-6-26 16:27:20 
	    	 }
	     });
})

</script>
 <table id="lxren" width="685"class="datagrid-toolbar datagrid-cell datagrid-cell-c3-text" border="1">
  <tr>
    <td width="82"><div align="center">姓名:</div></td>
    <td width="80"><input style="width:79" /></td>
    <td width="80"><div align="center">职务:</div></td>
    <td width="79"><input style="width:79" /></td>
    <td width="75"><div align="center">性别:</div></td>
    <td width="79"><select style="width:79">
    	<option value="男">男</option>
    	<option value="女">女</option>
    </select></td>
    <td width="74"><div align="center">年龄:</div></td>
    <td width="84"><input style="width:79" /></td>
  </tr>
  <tr>
    <td><div align="center">生日:</div></td>
    <td><input  style="width:79" /></td>
    <td><div align="center">电话:</div></td>
    <td><input style="width:79" /></td>
    <td><div align="center">QQ:</div></td>
    <td><input style="width:79" /></td>
    <td><div align="center">邮箱:</div></td>
    <td><input style="width:79" /></td>
  </tr>
  <tr>
    <td><div align="center">联系人地址:</div></td>
    <td><input style="width:79" /></td>
    <td><div align="center">办公室门牌号:</div></td>
    <td><input style="width:79" /></td>
    <td><div align="center">在公司年限:</div></td>
    <td><input style="width:79" /></td>
    <td><div align="center">性格特点:</div></td>
    <td><input style="width:79" /></td>
  </tr>
  <tr>
    <td><div align="center">嗜好:</div></td>
    <td><input style="width:79" /></td>
    <td><div align="center">家庭成员:</div></td>
    <td><input style="width:79" /></td>
    <td><div align="center">家庭情况:</div></td>
    <td><input style="width:79" /></td>
    <td><div align="center">联系人流动:</div></td>
    <td><input style="width:79" /></td>
  </tr>
  <tr>
    <td><div align="center">其他:</div></td>
    <td colspan="7"><div align="left">
      <input style="width:580" />
    </div>
    </td>
    </tr>
    <tr align="center">
  	<td colspan="8">
  		<input  id="addlianxiren" name="caozuo" type="button" onclick="addlxren();" value="添加"/>
  		 <input  id="deletelianxiren" name="caozuo" type="button"  value="删除"/>
  	</td>
  </tr>
</table>
<div align="center"><a id="saveLianxiRen" data-options="iconCls:'icon-save'"class="easyui-linkbutton">保存联系人</a></div>

