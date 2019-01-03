//package gamepuzzle;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Rule extends JFrame implements ActionListener{
	private int width=600;
	private int hight=500;
	JLabel l0,l1,l2,l3,l4;
	JButton b1;
	ImageIcon img1;
	
	String rule1="1.You have to sort the nos in Increasing Order";
	String rule2="2.You Only shift Empty button ";
	String rule3="3.Last cell is Empty at last";
	Rule(){
		setLayout(null);
		setBounds(100,150,width,hight);
		setVisible(true);
		setBackground(Color.cyan);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		
		
		l0=new JLabel("RULE");
		l0.setFont(new Font("Bernard MT Condensed",Font.BOLD,30));
		l0.setBounds(280,80,700,50);
		l0.setForeground(new Color(36,189,48));
		add(l0);
		
		l1=new JLabel(rule1);
		l1.setFont(new Font("Arial",Font.BOLD,20));
		l1.setBounds(100,150,700,50);
		l1.setForeground(Color.RED);
		add(l1);
		
		l2=new JLabel(rule2);
		l2.setFont(new Font("Arial",Font.BOLD,20));
		l2.setBounds(100,180,700,50);
		l2.setForeground(Color.RED);
		add(l2);
		l3=new JLabel("one Left /Right /Up /Down at a time ");
		l3.setFont(new Font("Arial",Font.BOLD,20));
		l3.setBounds(150,200,700,50);
		l3.setForeground(Color.RED);
		add(l3);
		
		l4=new JLabel(rule3);
		l4.setFont(new Font("Arial",Font.BOLD,20));
		l4.setBounds(100,230,700,50);
		l4.setForeground(Color.RED);
		add(l4);
		
		img1=new ImageIcon("img/next2.gif");
		b1=new JButton(img1);
		b1.setBounds(490,400,67,39);
		b1.addActionListener(this);
		add(b1);

		
	}
	public void actionPerformed(ActionEvent e){
		dispose();
		new Puzzel();
	}
	
}