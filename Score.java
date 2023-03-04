package pkg_quiz_application;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Score extends JFrame implements ActionListener{
	
	JButton next,submit;
	
	Score(String name,int score){
		setBounds(600,150,750,550);
		getContentPane().setBackground(Color.PINK);
		setLayout(null);
		
		
		ImageIcon  icon= new ImageIcon(getClass() .getResource("score.jpg"));
		Image icon1=icon.getImage().getScaledInstance(300, 250, Image.SCALE_DEFAULT);
		ImageIcon icon3=new ImageIcon(icon1);
		JLabel image=new JLabel(icon3);
		image.setBounds(0, 200, 300,250);
		add(image);
		
		JLabel heading=new JLabel("Thank You " + name +  " for playing simple Minds !!!");
		heading.setBounds(45,30, 700, 30);
	     heading.setFont(new Font("Tahoma",Font.BOLD,26));
		add(heading);
		
		
		JLabel lbscore=new JLabel("Your Score is:"+score);
		lbscore.setBounds(350,200, 300, 30);
	     lbscore.setFont(new Font("Tahoma",Font.PLAIN,26));
		add(lbscore);
		
		
		  submit= new JButton("Play Again");
	        submit.setBounds(380, 270, 120, 30);
	        submit.setFont(new Font("Tahoma",Font.PLAIN,16));
	        submit.setBackground(new Color(30,144,255));
	        submit.setForeground(Color.WHITE);
	        submit.addActionListener(this);
	        add(submit);
	        next= new JButton("Next Page");
	        next.setBounds(550, 270, 120, 30);
	        next.setFont(new Font("Tahoma",Font.PLAIN,16));
	        next.setBackground(new Color(30,144,255));
	        next.setForeground(Color.WHITE);
	        next.addActionListener(this);
	        add(next);
	       
		setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		setVisible(false);
		new Login();
		if(e.getSource()==next){
			new Quiz1("users");
		}
		
	}
	public static void main(String[] args) {
		new Score("User",0);
	}
	

}
