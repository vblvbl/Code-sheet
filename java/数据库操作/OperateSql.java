package com.sc.database;
 
import java.util.ArrayList;
import java.util.HashMap;

import com.sc.database.datasource.Utility;

/**
 * 
 * Description ����java���������ݿ���صĲ���,�����ӣ����£����ض����б�Ȳ���<br>
 * ����������з����еĲ���dataSourceIdentifierΪ����Դ�ı�ʾ����һ�㲻�ص��ô˱�־�ķ���
 * @author administor
 */
public class OperateSql {

	public OperateSql() { 

	}
 
	/**
	 * ִ��DDL�����ӣ�ɾ������������������ѯ����
	 * 
	 * @param sql
	 *            Ҫִ�е�sql���
	 * @return ���ִ�гɹ�����true ִ��ʧ�ܷ���false
	 */
	public static boolean exeSql(String sql) {
		return OperateUtil.exeSQL(Utility.getDefaultDataSource()
				.getDataSourceIdentifier(), sql);
	}

	public static boolean exeSql(String dataSourceIdentifier, String sql) {

		return OperateUtil.exeSQL(dataSourceIdentifier, sql);

	} 

	/**
	 * ��ѯ���ݿ��е�һ����¼���浽HashMap������ �ܲ�ѯ����java.sql.Blob,java.sql.Clob�ֶ�����������ֶ�ֵ
	 * 
	 * @param sql
	 *            sql���
	 * @return ���ݿ��е�һ����¼
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
	 * ��ѯ���ݿ��еĶ�����¼���浽HashMap�������HashMap��ŵ�ArrayList�з���
	 * �ܲ�ѯ����java.sql.Blob,java.sql.Clob�ֶ�����������ֶ�ֵ
	 * 
	 * @param sql
	 *            sql���
	 * @return ��ArrayList��ʽ�������ݿ�Ķ�����¼
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
	 * �÷��������Ա���������ݿ⣬Ҳ���Խ��޸ĺ��obj���󱣴浽���ݿ⵽���ݿ�<br>
	 * obj�б��뺬��һ�����Ѿ����ڵ�id�ţ����obj�����idΪ0���˷����������ݿ��д�������,���id����<br>
	 * java�����ȥ����tablename����id����obj.getId()��������¼<br>
	 * �������ֵ��false��ʾ�����ɹ��� �������true��ʾ����ʧ����<br>
	 * 
	 * @param obj
	 *            Ҫ���浽���ݿ��java����<br>
	 * @param tablename
	 *            java��������Ӧ�����ݿ����<br>
	 * @return ����false��ʾ�ɹ���true��ʾʧ��<br>
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
	 * �ѱ��е�һ����¼��װ���Զ��󷵻�,Ҳ����ֻ����һ����¼�еļ����ֶη�װ���Զ��󷵻�
	 * 
	 * @param sql
	 *            sql���
	 * @param obj
	 *            ������new Contructor()�����Ķ���
	 * @return Ҫ���µĶ���
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
	 * &nbsp;&nbsp;�����ݿ���е����м�¼����װ��һ����object�����У��ٰ���Щ����<br>
	 * ��ŵ�һ��ArrayList�з���,sql������select * ,Ҳ����select column1,<br>
	 * column2......
	 * 
	 * @param sql
	 * @param obj
	 *            ������new Contructor()�����Ķ���
	 * @return ���ݿ��ж�����¼ 
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
	 * @param sql ��ѯ���
	 * @param obj	����ArrayList��������
	 * @param pagesize	ÿҳ�ļ�¼��
	 * @param pagenum	�ڼ�ҳ
	 * @return	ĳҳ�ļ�¼�б�
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
	 * &nbsp;&nbsp;����tablename����һ��seq_tablename�����У�����<br>
	 * �����в���һ������id
	 * 
	 * @param tablename
	 * @return seq_tablename������ֵ(Ĭ�����ݿ����������)
	 */
	public static long getNewSeqId(String tablename) {   
		return getNewSeqId(Utility.getDefaultDataSource()
				.getDataSourceIdentifier(), tablename);
	}

	public static long getNewSeqId(String dataSourceIdentifier, String tablename) {
		return OperateUtil.getNewSeqId(dataSourceIdentifier, tablename);
	}

	/**
	 * �˷����ѹ�ʱ<br> &nbsp;&nbsp;��ArrayList��ʽ���ص������ݿ�������з��ϵļ�¼����<br>
	 * 
	 * @param sql
	 *            sql���
	 * @return ˫��ArrayList
	 */
	public static ArrayList exeQuery(String sql) {
		return exeQuery(Utility.getDefaultDataSource()
				.getDataSourceIdentifier(), sql);
	}

	public static ArrayList exeQuery(String dataSourceIdentifier, String sql) {
		return OperateUtil.exeQuery(dataSourceIdentifier, sql);
	}

	/**
	 * ���ַ�������ʽ�������ݱ���ĳ���е����м�¼<br>
	 * ���浽һ��java.util.ArrayList�У��������������
	 * 
	 * @param sql
	 * @return ĳ���ֶε����м�¼��ArrayList
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
	 * �÷������Եõ����ݿ��з��������ļ�¼��
	 * @param sql Ҫִ�е�sql���
	 * @return	��¼��
	 */
	public static long getRecrodCount(String sql) {
		return getRecordCount(Utility.getDefaultDataSource()
				.getDataSourceIdentifier(), sql);
	}

	public static long getRecordCount(String dataSourceIdentifier, String sql) {
		return OperateUtil.getRecordCount(dataSourceIdentifier, sql);
	}
	
	
	/**
	 * �÷������Եõ����ݿ��з��������ļ�¼��
	 * @param sql Ҫִ�е�sql���,��select count(id) from t_scoa_sys_user
	 * @return	��¼��
	 */
	public static long getRecCount(String sql) {
		return getRecCount(Utility.getDefaultDataSource()
				.getDataSourceIdentifier(), sql);
	}

	public static long getRecCount(String dataSourceIdentifier, String sql) {
		return OperateUtil.getRecCount(dataSourceIdentifier, sql);
	}
}
