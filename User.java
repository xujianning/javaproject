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
		//�ȴ������û���
		name=bf.readLine();
		//�ȴ���������
		code=bf.readLine();
		
	}
	void load() throws IOException{
		BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
		String n,c;
		//��ʾ�����û���
		n=bf.readLine();
		//��ʾ��������
		c=bf.readLine();
		if(n.equals(name)&c.equals(code)){
			//��½�ɹ�
		}
	}

}
