package com.design.factory.service;

import java.util.List;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Java8Tester {
	public static void main(String[] args) {

		ArrayList<String> list1 = new ArrayList<String>();
		list1.add("元素1");
		list1.add("元素2");
		list1.add("元素3");
		list1.add("元素4");

		ArrayList<String> list2 = new ArrayList<String>();
		list2.add("元素1");
		list2.add("元素2");
		list2.add("元素3");
		list2.add("元素4");
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
		int[] a= {1,2,3,4};
		int[] b = new int[] {1,32,45};
		for (int i : b) {
			System.out.println("============");
			System.out.println(i);
		}
		/*
		 * Java8Tester tester = new Java8Tester(); System.out.println("使用 Java 7 语法: ");
		 * 
		 * tester.sortUsingJava7(list1); System.out.println(list1);
		 * System.out.println("使用 Java 8 语法: ");
		 * 
		 * tester.sortUsingJava8(list2); System.out.println(list2);
		 * 
		 */
	//	 list1.forEach(System.out::println);
		list1.forEach(System.out::println);
		for (String string : list2) {
			System.out.print(string);
		}
	}

	// 使用 java 7 排序
	private void sortUsingJava7(List<String> names) {
		Collections.sort(names, new Comparator<String>() {
			@Override
			public int compare(String s1, String s2) {
				return s1.compareTo(s2);
			}
		});
	}

	// 使用 java 8 排序
	private void sortUsingJava8(List<String> names) {
		Collections.sort(names, (s1, s2) -> s1.compareTo(s2));
	}
	
	
	//测试lambda
	public void test1(int a,int b) {
	}

}
