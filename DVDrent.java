package com.xujianning;
import java.io.*;
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class DVDrent {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		menu();
	}
	static void menu()
	{
		JFrame jf=new JFrame("请选择功能：");
		JPanel jp=new JPanel();
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		jf.setBounds(600, 600, 400, 200);
		jf.setVisible(true);
		JButton button1=new JButton("DVD租出");
		JButton button2=new JButton("DVD还回");
		JButton button3=new JButton("DVD入库");
		Mouselistener1 m1=new Mouselistener1();
		button1.addActionListener(m1);
		Mouselistener2 m2=new Mouselistener2();
		button2.addActionListener(m2);
		Mouselistener3 m3=new Mouselistener3();
		button3.addActionListener(m3);
		jf.add(jp);
		jp.add(button3);
		jp.add(button1);
		jp.add(button2);
		
	
		
	}
	void stock() throws IOException{
		//提示输入新进DVD的名称，编码，购买花费，预定租金和当前库存
		JFrame jf=new JFrame("DVD入库");
		JPanel jp=new JPanel();
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setBounds(600, 600, 400, 200);
		jf.setVisible(true);
		JTextArea jt1=new JTextArea();
		JTextField field=new JTextField();
		jf.add(jp);
}
	void rent(){
		
		JFrame jf=new JFrame("DVD租出");
		JPanel jp=new JPanel();
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setBounds(600, 600, 400, 200);
		jf.setVisible(true);
		JButton button=new JButton("输入完成");
		Mouselistener4 m1=new Mouselistener4();
		button.addActionListener(m1);
		jf.add(jp);
		jp.add(button);
		//System.out.println("rent");
	}
	void restore(){
		JFrame jf=new JFrame("DVD还回");
		JPanel jp=new JPanel();
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setBounds(600, 600, 400, 200);
		jf.setVisible(true);
		JButton button1=new JButton("输入完成");
		Mouselistener1 m1=new Mouselistener1();
		button1.addActionListener(m1);
		jf.add(jp);
		jp.add(button1);
		//System.out.println("restore");
	}

}
class Mouselistener1 implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		new DVDrent().rent();
	}
}
class Mouselistener2 implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		new DVDrent().restore();
	}
}
class Mouselistener3 implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		try {
			new DVDrent().stock();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
}
class Mouselistener4 implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		try {
			
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
}