package Manager;
import java.awt.*;
import java.awt.event.*;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
public abstract class Manager_Menu extends JFrame implements ActionListener{
		JMenu menu1,menu2,menu3,menu4;
		JMenuItem item1,item2,item3,item4;
Manager_Menu(){
	JFrame frm=new JFrame();
	frm.setTitle("DVD管理系统");
	frm.setLayout(null);
		JMenuBar bar=null;
		menu1=new JMenu("信息录入");
		menu2=new JMenu("信息查询");
		menu3=new JMenu("信息删除");
		menu4=new JMenu("退出系统");
		item1=new JMenuItem("录入");
		item2=new JMenuItem("查询");
		item3=new JMenuItem("删除");
		item4=new JMenuItem("退出");
		menu1.add(item1);
		menu2.add(item2);
		menu3.add(item3);
		menu4.add(item4);
		bar.add(menu1);
		bar.add(menu2);
		bar.add(menu3);
		bar.add(menu4);
		setJMenuBar(bar);
		item1.addActionListener(this);
		item2.addActionListener(this);
		item3.addActionListener(this);
		item4.addActionListener(this);
		JLabel label=new JLabel("DVD用户信息管理",JLabel.CENTER);
		String s="";
		Font f=new Font(s,Font.BOLD,22);
		label.setFont(f);
		label.setBackground(Color.GRAY);
		label.setForeground(Color.yellow);
		add(label,"Center");
		setVisible(true);
		setSize(350,300);
		frm.setVisible(true);
		}
			public void ActionPerformed(ActionEvent e){
				if(e.getSource()==item1){
					this.getContentPane().removeAll();
					this.getContentPane().add(item1,"Center");
					this.getContentPane().repaint();
					this.getContentPane().validate();
				}
				if(e.getSource()==item2){
					this.getContentPane().removeAll();
					this.getContentPane().add(item2,"Center");
					this.getContentPane().repaint();
					this.getContentPane().validate();
				}
				if(e.getSource()==item3){
					this.getContentPane().removeAll();
					this.getContentPane().add(item3,"Center");
					this.getContentPane().repaint();
					this.getContentPane().validate();
				}
				if(e.getSource()==item4){
					System.exit(0);
				}
														}
		
	}

