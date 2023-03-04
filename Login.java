package pkg_quiz_application;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Login extends JFrame implements ActionListener{
	
	JButton rules, back;
	JTextField tfname;
	
	Login(){
		getContentPane().setBackground(Color.pink);
		setLayout(null);


		ImageIcon  icon= new ImageIcon(getClass() .getResource("harsh1.jpg"));
		JLabel image=new JLabel(icon);
		image.setBounds(0, 0, 600, 500);
		add(image);
		
		JLabel heading= new JLabel("Brain Test ");
		heading.setBounds(750, 60, 300, 45);
		heading.setFont(new Font("Viner Hand ITC",Font.BOLD,40));
		heading.setForeground(new Color(30,144,254));
		add(heading);
		
		JLabel name= new JLabel("Enter your name");
		name.setBounds(810, 150, 300, 20);
		name.setFont(new Font("Mangolian Baiti",Font.BOLD,18));
		name.setForeground(new Color(30,144,254));
		add(name);
		
		 tfname=new JTextField();
		tfname.setBounds(735, 200, 300, 25);
		tfname.setFont(new Font("Times New Roman",Font.BOLD,20));
		add(tfname);
		
		
	  rules= new JButton("Rules");
	 rules.setBounds(735, 270, 120, 25);
	 rules.setBackground(new Color(30,144,254));
	 rules.setForeground(Color.WHITE);
	 rules.addActionListener(this);
	 add(rules);
	 
	 
	 back= new JButton("Back");
	 back.setBounds(915, 270, 120, 25);
	 back.setBackground(new Color(30,144,254));
	 back.setForeground(Color.WHITE);
	 back.addActionListener(this);
	 add(back);
	 
		setSize(1200,500);
		setLocation(200,200);
		setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==rules) {
			String name= tfname.getText();
			setVisible(false);
			new Rules(name);
		}else if(e.getSource()== back) {
			setVisible(false);
		}
		
	}
	public static void main(String[] args) {
		new Login();
	}
	

}
