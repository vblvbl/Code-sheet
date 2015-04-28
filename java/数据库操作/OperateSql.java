package com.sc.database;
 
import java.util.ArrayList;
import java.util.HashMap;

import com.sc.database.datasource.Utility;

/**
 * 
 * Description 处理java对象与数据库相关的操作,如增加，更新，返回对象列表等操作<br>
 * 此类的中所有方法中的参数dataSourceIdentifier为数据源的标示符，一般不必调用此标志的方法
 * @author administor
 */
public class OperateSql {

	public OperateSql() { 

	}
 
	/**
	 * 执行DDL及增加，删除操作，但不包括查询操作
	 * 
	 * @param sql
	 *            要执行的sql语句
	 * @return 如果执行成功返回true 执行失败返回false
	 */
	public static boolean exeSql(String sql) {
		return OperateUtil.exeSQL(Utility.getDefaultDataSource()
				.getDataSourceIdentifier(), sql);
	}

	public static boolean exeSql(String dataSourceIdentifier, String sql) {

		return OperateUtil.exeSQL(dataSourceIdentifier, sql);

	} 

	/**
	 * 查询数据库中的一条记录保存到HashMap并返回 能查询除了java.sql.Blob,java.sql.Clob字段已外的所有字段值
	 * 
	 * @param sql
	 *            sql语句
	 * @return 数据库中的一条记录
	 */
	public static HashMap getHashmapFromRs(String sql) {
		return getHashmapFromRs(Utility.getDefaultDataSource()
				.getDataSourceIdentifier(), sql);
	}

	public static HashMap getHashmapFromRs(String dataSourceIdentifier,
			String sql) {

		return OperateUtil.getHashmapFromRs(dataSourceIdentifier, sql);
	}
	
	public static ArrayList getHashListFromRs(String sql, int pagesize, int pagenum) {
		return getHashListFromRs(Utility.getDefaultDataSource()
				.getDataSourceIdentifier(), sql,pagesize,pagenum);
	}

	public static ArrayList getHashListFromRs(String dataSourceIdentifier,
			String sql, int pagesize, int pagenum) {

		return OperateUtil.getHashListFromRs(dataSourceIdentifier, sql,pagesize, pagenum);
	}
	/**
	 * 
	 * 查询数据库中的多条记录保存到HashMap，将多个HashMap存放到ArrayList中返回
	 * 能查询除了java.sql.Blob,java.sql.Clob字段已外的所有字段值
	 * 
	 * @param sql
	 *            sql语句
	 * @return 已ArrayList形式返回数据库的多条记录
	 */
	public static ArrayList getHashListFromRs(String sql) {
		return getHashListFromRs(Utility.getDefaultDataSource()
				.getDataSourceIdentifier(), sql);
	}

	public static ArrayList getHashListFromRs(String dataSourceIdentifier,
			String sql) {

		return OperateUtil.getHashListFromRs(dataSourceIdentifier, sql);
	}

	/**
	 * 该方法即可以保存对象到数据库，也可以将修改后的obj对象保存到数据库到数据库<br>
	 * obj中必须含有一个表已经存在的id号，如果obj对象的id为0，此方法会在数据库中创建主键,如果id存在<br>
	 * java对象会去更新tablename表中id等于obj.getId()的那条记录<br>
	 * 如果返回值是false表示操作成功了 如果返回true表示操作失败了<br>
	 * 
	 * @param obj
	 *            要保存到数据库的java对象<br>
	 * @param tablename
	 *            java对象所对应的数据库表名<br>
	 * @return 返回false表示成功，true表示失败<br>
	 */
	public static boolean saveObjectToDatabase(Object obj, String tablename) {
		return saveObjectToDatabase(Utility.getDefaultDataSource()
				.getDataSourceIdentifier(), obj, tablename);
	}

	public static boolean saveObjectToDatabase(String dataSourceIdentifier,
			Object obj, String tablename) {
		return OperateUtil.saveObjectToDatabase(dataSourceIdentifier, obj,
				tablename);
	}

	/**
	 * 把表中的一条记录封装后以对象返回,也可以只检索一条记录中的几个字段封装后以对象返回
	 * 
	 * @param sql
	 *            sql语句
	 * @param obj
	 *            必须是new Contructor()出来的对象
	 * @return 要更新的对象
	 */
	public static Object getRsToObj(String sql, Object obj) {
		return getRsToObj(Utility.getDefaultDataSource()
				.getDataSourceIdentifier(), sql, obj);
	}

	public static Object getRsToObj(String dataSourceIdentifier, String sql,
			Object obj) {
		return OperateUtil.getRsToObj(Utility.getDefaultDataSource()
				.getDataSourceIdentifier(), sql, obj);
	}

	/**
	 * &nbsp;&nbsp;将数据库表中的所有记录都封装到一个个object对象中，再把这些对象<br>
	 * 存放到一个ArrayList中返回,sql语句可以select * ,也可以select column1,<br>
	 * column2......
	 * 
	 * @param sql
	 * @param obj
	 *            必须是new Contructor()出来的对象
	 * @return 数据库中多条记录 
	 */
	public static ArrayList getObjList(String sql, Object obj) {
		return getObjList(Utility.getDefaultDataSource()
				.getDataSourceIdentifier(), sql, obj); 
	}

	public static ArrayList getObjList(String dataSourceIdentifier, String sql,
			Object obj) {
		return OperateUtil.getObjList(dataSourceIdentifier, sql, obj);
	}
	
	/**
	 * @param sql 查询语句
	 * @param obj	返回ArrayList对象类型
	 * @param pagesize	每页的记录数
	 * @param pagenum	第几页
	 * @return	某页的记录列表
	 */
	public static ArrayList getRsToObjList(String sql, Object obj,
			int pagesize, int pagenum) {
		return getRsToObjList(Utility.getDefaultDataSource()
				.getDataSourceIdentifier(), sql, obj, pagesize, pagenum);
	}

	public static ArrayList getRsToObjList(String dataSourceIdentifier,
			String sql, Object obj, int pagesize, int pagenum) {
		return OperateUtil.getRsToObjList(dataSourceIdentifier, sql, obj,
				pagesize, pagenum);
	}

	/**
	 * &nbsp;&nbsp;根据tablename产生一个seq_tablename的序列，再由<br>
	 * 该序列产生一个主键id
	 * 
	 * @param tablename
	 * @return seq_tablename的序列值(默认数据库产生的序列)
	 */
	public static long getNewSeqId(String tablename) {   
		return getNewSeqId(Utility.getDefaultDataSource()
				.getDataSourceIdentifier(), tablename);
	}

	public static long getNewSeqId(String dataSourceIdentifier, String tablename) {
		return OperateUtil.getNewSeqId(dataSourceIdentifier, tablename);
	}

	/**
	 * 此方法已过时<br> &nbsp;&nbsp;以ArrayList形式返回的是数据库表中所有符合的记录集合<br>
	 * 
	 * @param sql
	 *            sql语句
	 * @return 双层ArrayList
	 */
	public static ArrayList exeQuery(String sql) {
		return exeQuery(Utility.getDefaultDataSource()
				.getDataSourceIdentifier(), sql);
	}

	public static ArrayList exeQuery(String dataSourceIdentifier, String sql) {
		return OperateUtil.exeQuery(dataSourceIdentifier, sql);
	}

	/**
	 * 已字符串的形式检索数据表中某个列的所有记录<br>
	 * 并存到一个java.util.ArrayList中，并返回这个数组
	 * 
	 * @param sql
	 * @return 某个字段的所有记录的ArrayList
	 */
	public static ArrayList queryOneColumn(String sql) {
		return queryOneColumn(Utility.getDefaultDataSource()
				.getDataSourceIdentifier(), sql);
	}

	public static ArrayList queryOneColumn(String dataSourceIdentifier,
			String sql) {
		return OperateUtil.queryOneColumn(dataSourceIdentifier, sql);
	}

	/**
	 * 该方法可以得到数据库中符合条件的记录数
	 * @param sql 要执行的sql语句
	 * @return	记录数
	 */
	public static long getRecrodCount(String sql) {
		return getRecordCount(Utility.getDefaultDataSource()
				.getDataSourceIdentifier(), sql);
	}

	public static long getRecordCount(String dataSourceIdentifier, String sql) {
		return OperateUtil.getRecordCount(dataSourceIdentifier, sql);
	}
	
	
	/**
	 * 该方法可以得到数据库中符合条件的记录数
	 * @param sql 要执行的sql语句,如select count(id) from t_scoa_sys_user
	 * @return	记录数
	 */
	public static long getRecCount(String sql) {
		return getRecCount(Utility.getDefaultDataSource()
				.getDataSourceIdentifier(), sql);
	}

	public static long getRecCount(String dataSourceIdentifier, String sql) {
		return OperateUtil.getRecCount(dataSourceIdentifier, sql);
	}
}
