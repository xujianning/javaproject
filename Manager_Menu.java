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
	frm.setTitle("DVD����ϵͳ");
	frm.setLayout(null);
		JMenuBar bar=null;
		menu1=new JMenu("��Ϣ¼��");
		menu2=new JMenu("��Ϣ��ѯ");
		menu3=new JMenu("��Ϣɾ��");
		menu4=new JMenu("�˳�ϵͳ");
		item1=new JMenuItem("¼��");
		item2=new JMenuItem("��ѯ");
		item3=new JMenuItem("ɾ��");
		item4=new JMenuItem("�˳�");
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
		JLabel label=new JLabel("DVD�û���Ϣ����",JLabel.CENTER);
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

