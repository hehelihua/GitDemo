package com;

public class Test {
	public static void main(String[] args) {
		System.out.println("test git");
		System.out.println("test git 分支111");
		System.out.println("test git 分支222");
		System.out.println("test git 分支333");
		System.out.println("test git 分支444");
		System.out.println("20171031");
		System.out.println("201710311109");
		
		User user =new User();
		user.setUserName("hehe");
		user.setPassword("123456");
		System.out.println(user.getUserName()+"\t"+user.getPassword());
	}
}
