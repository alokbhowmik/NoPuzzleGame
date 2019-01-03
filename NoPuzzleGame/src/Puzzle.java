

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


class Puzzel extends JFrame implements ActionListener{
	private int width=500;
	private int hight=500;
	JButton b[]=new JButton[9];
	JButton refres,next;
	// ImageIcon img1;
	int label=1;
	String s1[][]={
		{"1","2","3","4","5","6","","7","8"},
		{"2","4","5","1","3","6","","8","7"},
		{"3","4","1","2","","5","8","6","7"},
		{"8","3","2","1","5","6","","4","7"},
		{"5","1","3","2","4","8","6","7",""},
		{"6","4","3","2","7","5","1","","8"},
		
		};
	Puzzel(){
		setLayout(null);
		setTitle("                                     Puzzle Solving");
		setBounds(100,150,width,hight);
		setVisible(true);
		setBackground(Color.cyan);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		int k=0;
		int x=10,y=25;
		for(int i=0;i<3;i++){
			x=100;
			for(int j=0;j<3;j++){
				b[k]=new JButton();
				
			
				b[k].setLabel(s1[0][k]);
				// b[k].setFont(new Font("Castellar (Headings)",Font.Italic,"30"));
				b[k].setBounds(x,y,100,100);
				b[k].addActionListener(this);
				add(b[k]);
				x+=100;
				k++;
				
			}
			y+=100;
		}
		refres=new JButton("ReFress");
		refres.setBounds(70,350,100,30);
		refres.setForeground(Color.black);
		refres.setBackground(new Color(105,105,209));
		refres.addActionListener(this);
		add(refres);
		
		next=new JButton("next");
		next.setBounds(350,350,100,30);
		next.setForeground(Color.black);
		next.setBackground(new Color(105,105,209));
		next.addActionListener(this);
		add(next);
		
		// img1=new ImageIcon("img\\back.gif");
		// back=new JButton(img1);
		// back.setBounds(300,350,70,29);
		// back.addActionListener(this);
		// add(back);
		
	}
	@Override
	public void actionPerformed(ActionEvent e){
		
		if(e.getSource()==b[0]){
			String s=b[0].getText();
			if(b[1].getText().equals("")){
				b[0].setText("");
				b[1].setText(s);
				
			}
			if(b[3].getText().equals("")){
				b[0].setText("");
				b[3].setText(s);
				
			}
		}
		if(e.getSource()==b[1]){
			String s=b[1].getText();
			if(b[0].getText().equals("")){
				b[1].setText("");
				b[0].setText(s);
			}
			if(b[2].getText().equals("")){
				b[1].setText("");
				b[2].setText(s);
			}
			if(b[4].getText().equals("")){
				b[1].setText("");
				b[4].setText(s);
			}
			
		}
		if(e.getSource()==b[2]){
			String s=b[2].getText();
			if(b[1].getText().equals("")){
				b[2].setText("");
				b[1].setText(s);
			}
			if(b[5].getText().equals("")){
				b[2].setText("");
				b[5].setText(s);
			}
			
		}
		if(e.getSource()==b[3]){
			String s=b[3].getText();
			if(b[0].getText().equals("")){
				b[3].setText("");
				b[0].setText(s);
			}
			if(b[4].getText().equals("")){
				b[3].setText("");
				b[4].setText(s);
			}
			if(b[6].getText().equals("")){
				b[3].setText("");
				b[6].setText(s);
			}
			
		}
		if(e.getSource()==b[4]){
			String s=b[4].getText();
			if(b[1].getText().equals("")){
				b[4].setText("");
				b[1].setText(s);
			}
			if(b[3].getText().equals("")){
				b[4].setText("");
				b[3].setText(s);
			}
			if(b[5].getText().equals("")){
				b[4].setText("");
				b[5].setText(s);
			}
			if(b[7].getText().equals("")){
				b[4].setText("");
				b[7].setText(s);
			}
			
		}
		if(e.getSource()==b[5]){
			String s=b[5].getText();
			if(b[2].getText().equals("")){
				b[5].setText("");
				b[2].setText(s);
			}
			if(b[4].getText().equals("")){
				b[5].setText("");
				b[4].setText(s);
			}
			if(b[8].getText().equals("")){
				b[5].setText("");
				b[8].setText(s);
			}
			
		}
		if(e.getSource()==b[6]){
			String s=b[6].getText();
			if(b[3].getText().equals("")){
				b[6].setText("");
				b[3].setText(s);
			}
			if(b[7].getText().equals("")){
				b[6].setText("");
				b[7].setText(s);
			}
			
		}
		if(e.getSource()==b[7]){
			String s=b[7].getText();
			if(b[6].getText().equals("")){
				b[7].setText("");
				b[6].setText(s);
			}
			if(b[8].getText().equals("")){
				b[7].setText("");
				b[8].setText(s);
			}
			if(b[4].getText().equals("")){
				b[7].setText("");
				b[4].setText(s);
			}
			
			
		}
		if(e.getSource()==b[8]){
			
			String s=b[8].getText();
			if(b[7].getText().equals("")){
				b[8].setText("");
				b[7].setText(s);
			}
			if(b[5].getText().equals("")){
				b[8].setText("");
				b[5].setText(s);
			}
			if(b[8].getText()=="" && b[0].getText()=="1" && b[1].getText()=="2" &&
					b[2].getText()=="3" && b[3].getText()=="4" && b[4].getText()=="5" &&
					b[5].getText()=="6" && b[6].getText()=="7" &&b[7].getText()=="8"){
			JOptionPane.showMessageDialog(this, "You Won The Match");
			}
		}
		if(e.getSource()==next){
			for(int k=0;k<9;k++){
				try{
				b[k].setLabel(s1[label][k]);
				}catch(Exception exc){}
			}
			label++;
			
		}
		
		if(e.getSource()==refres){
			label--;
			for(int k=0;k<9;k++){
				try{
				b[k].setLabel(s1[label][k]);
				}catch(Exception exc){}
			}
			//label++;
			
		}
		
	}

}
// class Demo15{
	// public static void main(String args[]){
		// new Puzzel();
	// }
// }