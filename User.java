package com.xujianning;
import java.io.*;
public class User {
	String name;
	String code;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		
	}
	User(String name,String code){
		this.name=name;
		this.code=code;
	}
	void creat() throws IOException{
		BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
		//等待输入用户名
		name=bf.readLine();
		//等待输入密码
		code=bf.readLine();
		
	}
	int load() throws IOException{
		BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
		String n,c;
		//提示输入用户名
		n=bf.readLine();
		//提示输入密码
		c=bf.readLine();
		if(n.equals(name)&c.equals(code))
			return 1;//登陆成功
		else
			return -1;//登录失败	
}

}
