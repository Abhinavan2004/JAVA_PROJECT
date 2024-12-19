package TravelandTourism;

import java.sql.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Payment extends JFrame implements ActionListener {

	JButton back ,pay;
	
	Payment(){
		
		setLayout(null);
		
		ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("paytm.jpeg"));
		Image i2 = i1.getImage().getScaledInstance(870 ,625,Image.SCALE_DEFAULT);
		ImageIcon i3 = new ImageIcon(i2);
		JLabel i4 = new JLabel(i3);
		i4.setBounds(0,0,870,625);
		add(i4);
		
		back = new JButton("BACK");
		back.setBounds(600,40,100,40);
		back.setFont(new Font("Tahoma" , Font.BOLD , 16));
		back.addActionListener(this);
		i4.add(back);
		
		pay = new JButton("Pay");
	    pay.setBounds(730,40,100,40);
		pay.setFont(new Font("Tahoma" , Font.BOLD , 16));
		pay.addActionListener(this);
        i4.add(pay);
        
		
        setBounds(350 , 180 , 870 ,625 );
        setVisible(true);
        
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Payment obj = new Payment();
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(back ==e.getSource()) {
			setVisible(false);
		}
		if(pay ==e.getSource()) {
			setVisible(false);
			new Paytm();
		}
	}

}
