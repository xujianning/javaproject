package com.xujianning;
import java.io.*;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.ArrayList;
public class DVDrent {
	private static final int JLabel = 0;
	private static final String HORIZONTAL = null;
	public void menu()
	{
		JFrame jf=new JFrame("请选择功能：");
		JPanel jp=new JPanel();
		jf.setBounds(200, 200, 600, 600);
		jf.setVisible(true);
		JLabel l=new JLabel();
		l.setBounds(200, 200, 400, 400);
		l.setIcon(new ImageIcon("water.jpg"));
		
		JButton button1=new JButton("DVD租出");
		JButton button2=new JButton("DVD还回");
		JButton button3=new JButton("DVD入库");
		Mouselistener1 m1=new Mouselistener1();
		button1.addActionListener(m1);
		Mouselistener2 m2=new Mouselistener2();
		button2.addActionListener(m2);
		Mouselistener3 m3=new Mouselistener3();
		button3.addActionListener(m3);
		GridLayout gl=new GridLayout(2,3);
		jf.setLayout(gl);
		jf.setBounds(200, 200, 600, 200);
		jf.setVisible(true);
		jf.getContentPane().add(new JLabel(" "));
		jf.getContentPane().add(l);
		jf.getContentPane().add(new JLabel(" "));
		jf.getContentPane().add(button3);
		jf.getContentPane().add(button1);
		jf.getContentPane().add(button2);
		
		
	}
	void stock() throws IOException{
		//提示输入新进DVD的名称，编码，购买花费
		JFrame jf=new JFrame("DVD入库");		
		jf.setLayout(new BorderLayout());
		jf.setBounds(400, 200, 600, 120);
		jf.setVisible(true);
		JLabel jl=new JLabel("请输入DVD编码 名称 价格");
		JLabel jl1=new JLabel("编码");
		JLabel jl2=new JLabel("名称");
		JLabel jl3=new JLabel("价格");
		GridLayout gl=new GridLayout(5,2);
		jf.setLayout(gl);
		final ArrayList<DVD> list = new ArrayList<DVD>();		
		JButton button1=new JButton("输入");
		JButton button2=new JButton("完成");
		 final JTextField jt1=new JTextField();
		jt1.setEditable(true);
		final JTextField jt2=new JTextField();
		jt1.setEditable(true);
		final JTextField jt3=new JTextField();
		jt1.setEditable(true);
		jf.getContentPane().add(jl);
		jf.getContentPane().add(new JLabel(" "));
		jf.getContentPane().add(jl1);
		jf.getContentPane().add(jt1);
		jf.getContentPane().add(jl2);
		jf.getContentPane().add(jt2);
		jf.getContentPane().add(jl3);
		jf.getContentPane().add(jt3);
		jf.getContentPane().add(button1);
		jf.getContentPane().add(new JLabel());
		
		button1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				try {
					FileWriter fw=new FileWriter(".\\DVD.txt");
					BufferedWriter br=new BufferedWriter(fw);
					DVD d=new DVD();
					list.add(d);
				
					for(int i=0;i<list.size();i++){
						list.get(i).code=jt1.getText();
						list.get(i).name=jt2.getText();
						list.get(i).cost=jt3.getText();
						br.write(list.get(i).code);
						br.write(" ");
						br.write(list.get(i).name);
						br.write(" ");
						br.write(list.get(i).cost);
						br.newLine();				
					}
					
					br.close();
					JOptionPane.showMessageDialog(null, "录入成功","提示",JOptionPane.INFORMATION_MESSAGE);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}});		
}
	void rent(){		
		JFrame jf=new JFrame("DVD租出");
		JLabel jl=new JLabel("请输入顾客姓名、卡号，DVD编号，租借日期，租期");
		jl.setBounds(200,200,600,20);
		JLabel jl0=new JLabel();
		jl0.setBounds(200,200,0,20);
		JLabel jl1=new JLabel("顾客姓名：");
		JLabel jl2=new JLabel("顾客卡号：");
		JLabel jl3=new JLabel("DVD编号：");
		JLabel jl4=new JLabel("租借日期（如20161230）：");
		JLabel jl5=new JLabel("租期：");
		final JTextField jt1=new JTextField();
		jt1.setEditable(true);
		final JTextField jt2=new JTextField();
		jt1.setEditable(true);
		final JTextField jt3=new JTextField();
		jt1.setEditable(true);
		final JTextField jt4=new JTextField();
		jt1.setEditable(true);
		final JTextField jt5=new JTextField();
		jt1.setEditable(true);
		final ArrayList<Customer> list = new ArrayList<Customer>();
		GridLayout gl=new GridLayout(7,2);
		jf.setLayout(gl);		
		jf.setBounds(200, 200, 600, 200);
		jf.setVisible(true);
		JButton button=new JButton("输入完成");
		jf.getContentPane().add(jl);
		jf.getContentPane().add(jl0);
		jf.getContentPane().add(jl1);
		jf.getContentPane().add(jt1);
		jf.getContentPane().add(jl2);
		jf.getContentPane().add(jt2);
		jf.getContentPane().add(jl3);
		jf.getContentPane().add(jt3);
		jf.getContentPane().add(jl4);
		jf.getContentPane().add(jt4);
		jf.getContentPane().add(jl5);
		jf.getContentPane().add(jt5);
		jf.getContentPane().add(button);
		jf.getContentPane().add(new JLabel());
		button.addActionListener(new ActionListener(){

			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				FileWriter fw;
				try {
					fw = new FileWriter(".\\customer.txt");
					BufferedWriter br=new BufferedWriter(fw);
					Customer c=new Customer();
					list.add(c);
					for(int i=0;i<list.size();i++){
						list.get(i).name=jt1.getText();
						list.get(i).id=jt2.getText();
						list.get(i).dvdcode=jt3.getText();
						list.get(i).date=jt4.getText();
						list.get(i).t=jt5.getText();
						br.write(list.get(i).name);
						br.write(" ");
						br.write(list.get(i).id);
						br.write(" ");
						br.write(list.get(i).dvdcode);
						br.write(" ");
						br.write(list.get(i).date);
						br.write(" ");
						br.write(list.get(i).t);						
						JFrame frm =new JFrame("租借信息");
						frm.setBounds(200, 200, 600, 200);
						frm.setVisible(true);
						String name,id,code,date,t,cost = null;
						name=list.get(i).name;
						id=list.get(i).id;
						date=list.get(i).date;
						code=list.get(i).dvdcode;
						t=list.get(i).t;
						FileReader fr=new FileReader(".\\DVD.txt");
						LineNumberReader in=new LineNumberReader(fr);
						String str=in.readLine();
						String[] s=str.split(" ");
						if(s[0].equals(list.get(i).dvdcode)){
							list.get(i).pay=s[2];
						}
						in.close();
						float f;
						f=Float.parseFloat(list.get(i).pay)/10;
						cost=String.valueOf(f);
						br.write(" ");
						br.write(list.get(i).pay);
						br.newLine();					
						JLabel jlb1=new JLabel("顾客姓名"+name);
						JLabel jlb2=new JLabel("顾客卡号"+id);
						JLabel jlb3=new JLabel("DVD编号"+code);
						JLabel jlb4=new JLabel("租借日期"+date);
						JLabel jlb5=new JLabel("租期"+t+"天");
						JLabel jlb6=new JLabel("租金"+cost+"元");
						GridLayout gl=new GridLayout(6,1);
						frm.setLayout(gl);
					
						frm.setBounds(200, 200, 600, 200);
						frm.setVisible(true);						
						frm.getContentPane().add(jlb1);
						frm.getContentPane().add(jlb2);
						frm.getContentPane().add(jlb3);
						frm.getContentPane().add(jlb4);
						frm.getContentPane().add(jlb5);
						frm.getContentPane().add(jlb6);	
					}				
					br.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}});
		
	}
	void restore(){
		JFrame jf=new JFrame("DVD还回");
		JLabel jl=new JLabel("请输入顾客姓名、卡号，DVD编号，租借日期，现在日期");
		jl.setBounds(200,200,600,20);
		JLabel jl0=new JLabel(" ");
		jl0.setBounds(200,200,0,20);
		JLabel jl1=new JLabel("顾客姓名:");
		JLabel jl2=new JLabel("顾客卡号:");
		JLabel jl3=new JLabel("DVD编号:");
		JLabel jl5=new JLabel("现在日期（如20161230）:");
		final JTextField jt1=new JTextField();
		jt1.setEditable(true);
		final JTextField jt2=new JTextField();
		jt2.setEditable(true);
		final JTextField jt3=new JTextField();
		jt3.setEditable(true);
		
		final JTextField jt5=new JTextField();
		jt5.setEditable(true);
		final ArrayList<Customer> list = new ArrayList<Customer>();
		GridLayout gl=new GridLayout(7,2);
		jf.setLayout(gl);
		
		jf.setBounds(200, 200, 600, 200);

		jf.setVisible(true);
		JButton button=new JButton("输入完成");
		jf.getContentPane().add(jl);
		jf.getContentPane().add(jl0);
		jf.getContentPane().add(jl1);
		jf.getContentPane().add(jt1);
		jf.getContentPane().add(jl2);
		jf.getContentPane().add(jt2);
		jf.getContentPane().add(jl3);
		jf.getContentPane().add(jt3);
		jf.getContentPane().add(jl5);
		jf.getContentPane().add(jt5);
		jf.getContentPane().add(button);
		jf.getContentPane().add(new JLabel());
		button.addActionListener(new ActionListener(){

			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				FileWriter fw;
				try {
				
						FileReader fr=new FileReader(".\\customer.txt");
					
						LineNumberReader in=new LineNumberReader(fr);
						String str=in.readLine();
						 String[] s=str.split(" ");
						if(s[0].equals(jt1.getText())&&s[1].equals(jt2.getText())&&s[2].equals(jt3.getText())){
							int d,n,t;
							d=Integer.parseInt(s[3]);
							t=Integer.parseInt(jt5.getText());
							n=Integer.parseInt(s[4]);
							if(t<=d+n){
								float f=Float.parseFloat(s[5])/10;
								JFrame frm=new JFrame("DVD已收回");
								JLabel jlb1=new JLabel("顾客姓名"+s[0]);
								JLabel jlb2=new JLabel("顾客卡号"+s[1]);
								JLabel jlb3=new JLabel("DVD编号"+s[2]);
								JLabel jlb4=new JLabel("租借日期"+s[3]);
								JLabel jlb5=new JLabel("租期"+s[4]+"天");
								JLabel jlb6=new JLabel("租金"+f+"元");
								GridLayout gl=new GridLayout(6,1);
								frm.setLayout(gl);
								frm.setBounds(200, 200, 600, 200);
								frm.setVisible(true);								
								frm.getContentPane().add(jlb1);
								frm.getContentPane().add(jlb2);
								frm.getContentPane().add(jlb3);
								frm.getContentPane().add(jlb4);
								frm.getContentPane().add(jlb5);
								frm.getContentPane().add(jlb6);
								JButton b=new JButton("顾客已付款");
								b.addActionListener(new ActionListener(){

									public void actionPerformed(ActionEvent arg0) {
										// TODO Auto-generated method stub
										
										FileReader fr1;
										try {
											fr1 = new FileReader(".\\customer.txt");
											LineNumberReader in1=new LineNumberReader(fr1);
											String strin;
											try {
												strin = in1.readLine();
												 String[] str=strin.split(" ");
													if(str[0].equals(jt1.getText())&&str[1].equals(jt2.getText())&&str[2].equals(jt3.getText()))
														try {
															FileWriter fw=new FileWriter(".\\customer.txt");
															for(int i=0;i<6;i++){
																str[i]=null;
															fw.close();
															}
														} catch (IOException e) {
															// TODO Auto-generated catch block
															e.printStackTrace();
														}
														
											} catch (IOException e) {
												// TODO Auto-generated catch block
												e.printStackTrace();
											}
											try {
												in1.close();
											} catch (IOException e) {
												// TODO Auto-generated catch block
												e.printStackTrace();
											}
										} catch (FileNotFoundException e) {
											// TODO Auto-generated catch block
											e.printStackTrace();
										}
										
									}});
								frm.getContentPane().add(b);
							}
							else{
								float f=Float.parseFloat(s[5])/10;
								JFrame frm=new JFrame("DVD已收回");
								JLabel jlb1=new JLabel("顾客姓名"+s[0]);
								JLabel jlb2=new JLabel("顾客卡号"+s[1]);
								JLabel jlb3=new JLabel("DVD编号"+s[2]);
								JLabel jlb4=new JLabel("租借日期"+s[3]);
								JLabel jlb5=new JLabel("租期"+s[4]+"天");
								JLabel jlb6=new JLabel("租金"+f*3+"元（超期）");
								GridLayout gl=new GridLayout(6,1);
								frm.setLayout(gl);					
								frm.setBounds(200, 200, 600, 200);
								frm.setVisible(true);
								frm.getContentPane().add(jlb1);
								frm.getContentPane().add(jlb2);
								frm.getContentPane().add(jlb3);
								frm.getContentPane().add(jlb4);
								frm.getContentPane().add(jlb5);
								frm.getContentPane().add(jlb6);
								JButton b=new JButton("顾客已付款");
								b.addActionListener(new ActionListener(){

									public void actionPerformed(ActionEvent arg0) {
										// TODO Auto-generated method stub
										
										FileReader fr1;
										try {
											fr1 = new FileReader(".\\customer.txt");
											LineNumberReader in1=new LineNumberReader(fr1);
											String strin;
											try {
												strin = in1.readLine();
												 String[] str=strin.split(" ");
													if(str[0].equals(jt1.getText())&&str[1].equals(jt2.getText())&&str[2].equals(jt3.getText()))
														try {
															FileWriter fw=new FileWriter(".\\customer.txt");
															for(int i=0;i<6;i++){
																str[i]=null;
															fw.close();
															}
														} catch (IOException e) {
															// TODO Auto-generated catch block
															e.printStackTrace();
														}
														
											} catch (IOException e) {
												// TODO Auto-generated catch block
												e.printStackTrace();
											}
											try {
												in1.close();
											} catch (IOException e) {
												// TODO Auto-generated catch block
												e.printStackTrace();
											}
										} catch (FileNotFoundException e) {
											// TODO Auto-generated catch block
											e.printStackTrace();
										}
									
									}});
								frm.getContentPane().add(b);
							}	
						}
						in.close();	
					}
				
				 catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}});
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

class DVD {
	String name;
	String code;
	String cost;
	
}
class Customer {
	String name;
	String id;
	String dvdcode;
	String pay;
	String date;
	String t;
}