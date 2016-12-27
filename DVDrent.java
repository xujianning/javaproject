package com.xujianning;
import java.io.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class DVDrent {
	private static final int JLabel = 0;
	private static final String HORIZONTAL = null;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		menu();
	}
	static void menu()
	{
		JFrame jf=new JFrame("请选择功能：");
		JPanel jp=new JPanel();
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setBounds(200, 200, 400, 200);
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
		//提示输入新进DVD的名称，编码，购买花费
		JFrame jf=new JFrame("DVD入库");
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setLayout(new BorderLayout());
		jf.setBounds(200, 200, 600, 800);
		jf.setVisible(true);
		JLabel jl=new JLabel("请输入DVD编码 名称 价格");
		jl.setHorizontalAlignment(JLabel);
		
		jf.getContentPane().add(jl,BorderLayout.NORTH);
		JButton button=new JButton("输入");
		JTextArea jt=new JTextArea();
		jt.setEditable(true);
		jf.getContentPane().add(jt,BorderLayout.CENTER);
		
		Mouselistener5 m=new Mouselistener5();
		button.addActionListener(m);
		jf.getContentPane().add(button,BorderLayout.SOUTH);
}
	void rent(){
		JFrame jf=new JFrame("DVD租出");
		JPanel jp=new JPanel();
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setBounds(200, 200, 400, 200);
		jf.setVisible(true);
		JButton button=new JButton("输入完成");
		Mouselistener4 m=new Mouselistener4();
		button.addActionListener(m);
		jf.add(jp);
		jp.add(button);
	}
	void restore(){
		JFrame jf=new JFrame("DVD还回");
		JPanel jp=new JPanel();
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setBounds(200, 200, 400, 200);
		jf.setVisible(true);
		JButton button1=new JButton("输入完成");
		Mouselistener1 m1=new Mouselistener1();
		button1.addActionListener(m1);
		jf.add(jp);
		jp.add(button1);
	}
}
class Mouselistener1 implements ActionListener{
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		new DVDrent().rent();
	}
}
class Mouselistener2 implements ActionListener{
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		new DVDrent().restore();
	}
}
class Mouselistener3 implements ActionListener{
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
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		/*try {

			

		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();*/
		}
	}
class Mouselistener5 implements ActionListener{
	public void actionPerformed(ActionEvent e) {
		System.out.println("asda");
	}

}