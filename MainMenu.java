package Manager;

import java.awt.event.*;
import javax.swing.JButton;
import javax.swing.JFrame;

public abstract  class MainMenu extends JFrame implements ActionListener{
public static void main(){
	JFrame frm=new JFrame();
	frm.setTitle("欢迎进入DVD租赁管理系统");
	frm.setLayout(null);
	
	JButton button1=new JButton();
	button1.setText("用户信息管理");
	button1.setBounds(50,40,200,40);
	frm.getContentPane().add(button1);
	
	JButton button2=new JButton();
	button2.setText("DVD信息管理");
	button2.setBounds(50,90,200,40);
	frm.getContentPane().add(button2);
	
	JButton button3=new JButton();
	button3.setText("租赁信息管理");
	button3.setBounds(50,140,200,40);
	frm.getContentPane().add(button3);
	frm.setBounds(400,200,400,320);
	frm.setVisible(true);
}
}
