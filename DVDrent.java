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
		JFrame jf=new JFrame("��ѡ���ܣ�");
		JPanel jp=new JPanel();
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		jf.setBounds(600, 600, 400, 200);
		jf.setVisible(true);
		JButton button1=new JButton("DVD���");
		JButton button2=new JButton("DVD����");
		JButton button3=new JButton("DVD���");
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
		//��ʾ�����½�DVD�����ƣ����룬���򻨷ѣ�Ԥ�����͵�ǰ���
		JFrame jf=new JFrame("DVD���");
		JPanel jp=new JPanel();
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setBounds(600, 600, 400, 200);
		jf.setVisible(true);
		JTextArea jt1=new JTextArea();
		JTextField field=new JTextField();
		jf.add(jp);
}
	void rent(){
		
		JFrame jf=new JFrame("DVD���");
		JPanel jp=new JPanel();
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setBounds(600, 600, 400, 200);
		jf.setVisible(true);
		JButton button=new JButton("�������");
		Mouselistener4 m1=new Mouselistener4();
		button.addActionListener(m1);
		jf.add(jp);
		jp.add(button);
		//System.out.println("rent");
	}
	void restore(){
		JFrame jf=new JFrame("DVD����");
		JPanel jp=new JPanel();
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setBounds(600, 600, 400, 200);
		jf.setVisible(true);
		JButton button1=new JButton("�������");
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