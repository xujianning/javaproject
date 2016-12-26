package com.xujianning;
import java.io.*;
import java.awt.*;
import javax.swing.*;
import com.xujianning.DVD;
import com.xujianning.User;
public class DVDrent {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
	}
	void menu()
	{
		JFrame jf=new JFrame("请选择功能：");
		
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		jf.setBounds(600, 600, 400, 200);
		jf.setVisible(true);
		JButton button1=new JButton("DVD租出");
		JButton button2=new JButton("DVD还回");
		JButton button3=new JButton("DVD入库");
		jf.add(button1);
		jf.add(button2);
		jf.add(button3);
	
		
	}
	static void stock() throws IOException{
		//提示输入新进DVD的名称，编码，购买花费，预定租金和当前库存
		BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
		JFrame jf=new JFrame("DVD入库");
		JPanel jp=new JPanel();
		JTextArea jt1=new JTextArea();
		JTextField field=new JTextField();
		String name;
		int code,cost,price,num;
		name=bf.readLine();
		code=bf.read();
		cost=bf.read();
		price=bf.read();
		num=bf.read();
}
	static void rent(){
		
	}
	static void restore(){
		
	}

}


