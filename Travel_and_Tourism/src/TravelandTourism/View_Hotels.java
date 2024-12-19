package TravelandTourism;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;


public class View_Hotels extends JFrame implements Runnable{

	JLabel l1=null, l2=null , l3=null , l4=null ,l5=null ,l6=null ,l7=null ,l8= null, l9=null , l10=null;
	JLabel [] label = new JLabel[]{l1,l2,l3,l4,l5,l6,l7,l8,l9,l10};
	Thread t1;
	JLabel caption;
	
	View_Hotels(){
		
		
		caption = new JLabel();
        caption.setBounds(50, 450, 500, 70);
        caption.setForeground(Color.WHITE);
        caption.setFont(new Font("Tahoma", Font.PLAIN, 40));
        add(caption);

		
		setLayout(null);
		ImageIcon i1=null, i2=null , i3=null , i4=null ,i5=null ,i6=null ,i7=null ,i8= null, i9=null,i10 =null;
		ImageIcon [] image = new ImageIcon[]{i1,i2,i3,i4,i5,i6,i7,i8,i9,i10};
		
		Image j1=null, j2=null , j3=null , j4=null ,j5=null ,j6=null ,j7=null ,j8= null, j9=null,j10 =null;
		Image [] jimage = new Image[]{j1,j2,j3,j4,j5,j6,j7,j8,j9 ,j10};
		
		ImageIcon k1=null, k2=null , k3=null , k4=null ,k5=null ,k6=null ,k7=null ,k8= null, k9=null ,k10 =null;
		ImageIcon [] kimage = new ImageIcon[]{k1,k2,k3,k4,k5,k6,k7,k8,k9 , k10};
		
		
		
		for(int i=0 ;i<10 ;i++) {
			if(i==9) {
			    image[i] = new ImageIcon(ClassLoader.getSystemResource("hotel"+(i+1)+".jpg"));
				jimage[i] = image[i].getImage().getScaledInstance(870, 625, Image.SCALE_DEFAULT);
				kimage[i] = new ImageIcon(jimage[i]);
				label[i] = new JLabel(kimage[i]);
				label[i].setBounds(0,0,870,625);
				add(label[i]);
			}
	    image[i] = new ImageIcon(ClassLoader.getSystemResource("hotel"+(i+1)+".jpg"));
		jimage[i] = image[i].getImage().getScaledInstance(870, 625, Image.SCALE_DEFAULT);
		kimage[i] = new ImageIcon(jimage[i]);
		label[i] = new JLabel(kimage[i]);
		label[i].setBounds(0,0,870,625);
		add(label[i]);
		}
		
		
		
		setBounds(350,150,870,625);
		setVisible(true);
		
		t1 = new Thread(this);
		t1.start();
		
		
	}

	public static void main(String[] args) {
		View_Hotels obj = new View_Hotels();
		

	}

	@Override
	public void run() {
		String []text = new String[]{"JW Marriott Hotel" , "Mandarin Oriental Hotel" , "Four Seasons Hotel"  ,"Radisson Hotel" , "Classio Hotel" ,"The Bay Club Hotel" , "Breeze Blows Hotel" , "Quick Stop Hotel" , "Happy Mornings Motel" , "Moss View Hotel"} ;
 
		try {
			for(int i=0 ;i<10 ;i++) {
				if(i==9) {
					label[i].setVisible(true);
					caption.setText(text[i]);
					Thread.sleep(2000);
					label[i].setVisible(false);
				}
			label[i].setVisible(true);
			caption.setText(text[i]);
			Thread.sleep(2000);
			label[i].setVisible(false);
			}
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
