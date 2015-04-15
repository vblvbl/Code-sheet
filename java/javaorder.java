package com;
 

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

/**
 * 
 * 2014年4月8日10:05:49
 * @author 马庆华
 * 排序方法 Collections.sort 和  Arrays.sort
 * java中的排序方法 数据类型不匹配可以更改数据类型进行试用
 */
public class javaOrder {
	
	/**
	 * Collections.sort 排序方法
	 * @param list
	 * @return list
	 */
	public List<Object> collectionsOrder(List<Object> list){
		Collections.sort(list, new Comparator<Object>()   {
	        public int compare(Object o1, Object o2) {
	            return o1.toString().compareTo(o2.toString());
	        }
		});
		return list;
	}
	
	/**
	 * Arrays.sort 排序方法
	 * @param list
	 * @return list
	 */
	public Object[] arraysOrder(Object[] arr){
		Arrays.sort(arr, new Comparator<Object>() {
		    public int compare(Object o1, Object o2) {
		        return o1.toString().compareTo(o2.toString());
		    }
		});
		return arr;
	}
	
	
	/**
	 *  TreeSet 排序
	 * @param set
	 * @return
	 */
	public Set<String> setOrder (Set<String> set){
		Set<String> sortedSet = new TreeSet<String>(new Comparator<String>() {
			public int compare(String o1, String o2) {
				return o2.toString().compareTo(o1.toString());
			}
		});
		sortedSet.addAll(set);
		return sortedSet;
	}
	
	/**
	 *  TreeMap 排序
	 * @param set
	 * @return
	 */
	public Map<String,Integer> mapOrder(Map<String,Integer> map ){
		Map<String, Integer> sortedMap = new TreeMap<String, Integer>(String.CASE_INSENSITIVE_ORDER);
		sortedMap.putAll(map);
		return sortedMap;
	}
	/**
	 * TreeMap 排序
	 * @param set
	 * @return
	 */
	public Map<String,String> treeMapOrder(Map<String,String> map){
		Map<String, String> sortedMap = new TreeMap<String, String>(new Comparator<String>() {
		    public int compare(String o1, String o2) {
		        return o1.toString().compareTo(o2.toString());
		    }
		});
		sortedMap.putAll(map);
		return sortedMap;
	}
	
	
	
	public static void main(String[] args) {
		 
		javaOrder t = new javaOrder();
		
		
		Map<String,Integer> map = new TreeMap<String, Integer>();
		map.put("1", 1);
		map.put("3", 3);
		map.put("2", 2);
		
		System.out.println(map);
		
		List<Object> list = new ArrayList<Object>();
		list.add("ac");
		list.add("ab");
		list.add("bc");
		list.add("ec");
		list.add("aa");
		
		Object[] arr = new Object[10];
		arr[0]="aa";
		arr[1]="ab";
		arr[2]="aj";
		arr[3]="ai";
		arr[4]="ah";
		arr[5]="ag";
		arr[6]="af";
		arr[7]="ae";
		arr[8]="ad";
		arr[9]="ac";
		
		t.arraysOrder(arr);
		
		for(Object on :arr){
			System.out.println(on);
		}
		
		Set<String> s= new TreeSet<String>();
		s.add("b");
		s.add("a");
		s.add("e");
		
		 
		s= t.setOrder(s);
		for(String ss :s){
			System.out.println(ss);
		}
		
		
		
	}
	
}
