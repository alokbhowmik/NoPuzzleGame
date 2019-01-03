

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.*;

import javax.swing.*;
class FDemo extends JFrame implements ActionListener{
	ImageIcon img1,img2;
	Image alok,next;
	JLabel l1,l2,l3,l4,l5;
	JButton b1;
	
	String s="         PUZZLE IS ";
	FDemo(){
		this.setBackground(Color.black);
		
		l1=new JLabel(s);
		l1.setFont(new Font("Algerian",Font.BOLD,30));
		l1.setBounds(100,10,500,50);
		l1.setForeground(Color.RED);
		add(l1);
		
		l2=new JLabel("By");
		l2.setFont(new Font("Algerian",Font.BOLD,30));
		l2.setBounds(240,60,500,50);
		l2.setForeground(Color.RED);
		add(l2);
		img1=new ImageIcon("img\\alok10.png");
		alok=img1.getImage();
		l5=new JLabel();
		l5.setIcon(img1);
		l5.setBounds(200,140,100,150);
		add(l5);
		img2=new ImageIcon("img\\next.gif");
//		next=img2.getImage();
		
		l3=new JLabel("Alok Bhowmik ");
		l3.setFont(new Font("Algerian",Font.BOLD,30));
		l3.setBounds(150,300,500,50);
		l3.setForeground(Color.RED);
		add(l3);
		
		b1=new JButton(img2);
		b1.setBounds(390,400,67,39);
		b1.addActionListener(this);
		add(b1);

	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		this.dispose();
		new Rule();
		
	}
}
public class Intro {

	public static void main(String[] args) {
		
		FDemo f=new FDemo();
		
		f.setLayout(null);
		f.setVisible(true);
		f.setBounds(100,150,500,500);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
