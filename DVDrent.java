package com.xujianning;
import java.io.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.ArrayList;
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
		jf.setBounds(200, 200, 600, 120);
		jf.setVisible(true);
		JLabel jl=new JLabel("请输入DVD8位编码 名称 价格(以空格区分)");
		jl.setHorizontalAlignment(JLabel);

		final ArrayList<DVD> list = new ArrayList<DVD>();
		jf.getContentPane().add(jl,BorderLayout.NORTH);
		JButton button=new JButton("输入");
		final JTextField jt=new JTextField();
		jt.setEditable(true);
		
		jf.getContentPane().add(jt,BorderLayout.CENTER);
		button.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				try {
					FileWriter fw=new FileWriter(".\\DVD.txt");
					DVD d=new DVD();
					list.add(d);
					/*for(int i=0;i<jt.getText().length();i++)
					{
						int flag=0;
						for(int j=0;j<list.size();j++){
							if(jt.getText()!=" "&&flag<9){
								list.get(j).code+=jt.getText();
								flag++;
							}
							else if(jt.getText()!=" "&&flag>=9&&flag<19){
								list.get(j).name+=jt.getText();
								flag++;
							}
							else if(jt.getText()!=" "&&flag>=19){
								list.get(j).cost+=jt.getText();
								flag++;
							}
						}
						
					}*/
					fw.close();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}});
		//Mouselistener5 m=new Mouselistener5();
		//button.addActionListener(m);
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
		
		
	}

}
class DVD {

	
	String name;
	String code;
	String cost;
	
}
class Customer {
	String name;
	String id;
	String dvdcode;
}

