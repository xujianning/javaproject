package Manager;
import java.awt.Font;
import javax.swing.*;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.JOptionPane;
import javax.swing.JFrame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Manager {
public static void main(String[] args){
	final String userName="manager";
	final String password="password";
	//��������
	JFrame frm=new JFrame();
	//���ô������
	frm.setTitle("DVD����Ա��¼");
	frm.setLayout(null);
	//��ǩ
	JLabel label1=new JLabel("�û���");
	label1.setBounds(60,40,70,50);
	label1.setHorizontalAlignment(JLabel.LEFT);
	label1.setFont(new Font("",Font.BOLD,20));
	JLabel label2=new JLabel("����");
	label2.setBounds(60,100,70,50);
	label2.setHorizontalAlignment(JLabel.LEFT);
	label2.setFont(new Font("",Font.BOLD,20));
	frm.getContentPane().add(label1);
	frm.getContentPane().add(label2);
	//�ı���
	JTextField text1=new JTextField();
	text1.setText("�������û���");
	text1.setHorizontalAlignment(JTextField.CENTER);
	text1.setBounds(140,40,200,40);
	frm.getContentPane().add(text1);
	//�����manaq
	JPasswordField Text2=new JPasswordField();
	Text2.setText("password");
	Text2.setEchoChar('*');
	Text2.setHorizontalAlignment(JPasswordField.CENTER);
	Text2.setBounds(140,100,200,40);
	frm.getContentPane().add(Text2);
	//��ť
	JButton loginBtn=new JButton("��¼");
	loginBtn.setBounds(160,170,70,40);
	frm.getContentPane().add(loginBtn);
	loginBtn.addActionListener(new ActionListener(){
		@Override
		public void actionPerformed(ActionEvent e){
		if(userName.equals(text1.getText())&&password.equals(Text2.getText())){
			JOptionPane.showMessageDialog(null, "��½�ɹ�","��ʾ",JOptionPane.INFORMATION_MESSAGE);
		}else{
			JOptionPane.showMessageDialog(null,"����","��ʾ",JOptionPane.ERROR_MESSAGE);
			text1.setText("");
			Text2.setText("");
		}
	}});
	frm.setBounds(400,200,400,320);
	frm.setVisible(true);
	
}
}