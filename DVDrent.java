package com.xujianning;
import java.io.*;
import com.xujianning.User;
public class DVDrent {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
		String name,code,k;
		int i;
		//提示选择登陆或注册
		i=(int)(bf.read());
		User user=new User();
		if(i==1)
			user.creat();
		else {
			user.load();
			i=user.load();
			if(i==-1){
				System.out.println("登陆失败");
				
				}
			else{
				//选择DVD入库，出租或还库
				i=(int)(bf.read());
				if(i==1)
					stock();
				else if(i==2)
					rent();
				else
					restore();
				}
			
				
		}
	}
	static void stock(){
		
	}
	static void rent(){
		
	}
	static void restore(){
		
	}

}
