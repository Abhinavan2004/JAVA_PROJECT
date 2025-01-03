package TravelandTourism;

import java.sql.*;
import java.awt.*;
import java.awt.event.*;
import java.io.IOException;

import javax.swing.*;

public class Dashboard extends JFrame implements ActionListener{
	JPanel topp , buttonp ;
	JLabel heading;
	JButton add_details, update_details , happy , view_details , about ,delete_details , calci , check_package ,book_package , view_package , view_hotels , book_hotel , view_booked_hotel ,destinations , payments ;

	String username ;
	Dashboard(String username){
		
		this.username = username;
		topp = new JPanel();
		topp.setLayout(null);
		topp.setBounds(0,0,1600,75);
		topp.setBackground(new Color(0,0,103));
		
		ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("Logo.png"));
		Image i2 = i1.getImage().getScaledInstance(65, 65, Image.SCALE_DEFAULT) ;
		ImageIcon i3 = new ImageIcon(i2) ;
		JLabel icon = new JLabel (i3) ;
		icon.setBounds(5, 0, 70, 70);
		add(icon);
		
		heading = new JLabel("Welcome, "+username+" - Travel & Tourism Systems");
		heading.setBounds(100,15,700,40);
		heading.setForeground(Color.white);
		heading.setFont(new Font("Tahoma" , Font.BOLD , 24));
		topp.add(heading);
		
		add(topp);
		
		buttonp = new JPanel();
		buttonp.setLayout(null);
		buttonp.setBackground(new Color(0,0,103));
		buttonp.setBounds(0,75,300,770);
		
		add_details = new JButton("Add Personal Details");
		add_details.setBounds(0,0,300,60);
		add_details.setBackground(new Color(0,0,103));
		add_details.setForeground(Color.white);
		add_details.setFont(new Font("Tahoma" , Font.PLAIN , 18));
		add_details.addActionListener(this);
   
		
		update_details = new JButton("Update Personal Details");
		update_details.setBounds(0,50,300,60);
		update_details.setBackground(new Color(0,0,103));
		update_details.setForeground(Color.white);
		update_details.setFont(new Font("Tahoma" , Font.PLAIN , 18));
		update_details.addActionListener(this);
       
		
		view_details = new JButton("View Profile");
		view_details.setBounds(0,100,300,60);
		view_details.setBackground(new Color(0,0,103));
		view_details.setForeground(Color.white);
		view_details.setFont(new Font("Tahoma" , Font.PLAIN , 18));
		view_details.addActionListener(this);
		
		delete_details = new JButton("Delete Personal Details");
		delete_details.setBounds(0,150,300,60);
		delete_details.setBackground(new Color(0,0,103));
		delete_details.setForeground(Color.white);
		delete_details.setFont(new Font("Tahoma" , Font.PLAIN , 18));
        delete_details.addActionListener(this);
		
	    check_package = new JButton("Check Package");
        check_package.setBounds(0, 200, 300, 60);
        check_package.setBackground(new Color(0, 0, 103));
        check_package.setForeground(Color.white);
        check_package.setFont(new Font("Tahoma", Font.PLAIN, 18));
        check_package.addActionListener(this);

        book_package = new JButton("Book Package");
        book_package.setBounds(0, 250, 300, 60);
        book_package.setBackground(new Color(0, 0, 103));
        book_package.setForeground(Color.white);
        book_package.setFont(new Font("Tahoma", Font.PLAIN, 18));
        book_package.addActionListener(this);

        view_package = new JButton("View Package");
        view_package.setBounds(0, 300, 300, 60);
        view_package.setBackground(new Color(0, 0, 103));
        view_package.setForeground(Color.white);
        view_package.setFont(new Font("Tahoma", Font.PLAIN, 18));
        view_package.addActionListener(this);

        view_hotels = new JButton("View Hotels");
        view_hotels.setBounds(0, 350, 300, 60);
        view_hotels.setBackground(new Color(0, 0, 103));
        view_hotels.setForeground(Color.white);
        view_hotels.setFont(new Font("Tahoma", Font.PLAIN, 18));
        view_hotels.addActionListener(this);

        book_hotel = new JButton("Book Hotel");
        book_hotel.setBounds(0, 400, 300, 60);
        book_hotel.setBackground(new Color(0, 0, 103));
        book_hotel.setForeground(Color.white);
        book_hotel.setFont(new Font("Tahoma", Font.PLAIN, 18));
        book_hotel.addActionListener(this);

        view_booked_hotel = new JButton("View Booked Hotel");
        view_booked_hotel.setBounds(0, 450, 300, 60);
        view_booked_hotel.setBackground(new Color(0, 0, 103));
        view_booked_hotel.setForeground(Color.white);
        view_booked_hotel.setFont(new Font("Tahoma", Font.PLAIN, 18));
        view_booked_hotel.addActionListener(this);

        destinations = new JButton("Destinations");
        destinations.setBounds(0, 500, 300, 60);
        destinations.setBackground(new Color(0, 0, 103));
        destinations.setForeground(Color.white);
        destinations.setFont(new Font("Tahoma", Font.PLAIN, 18));
        destinations.addActionListener(this);

        payments = new JButton("Payments");
        payments.setBounds(0, 550, 300, 60);
        payments.setBackground(new Color(0, 0, 103));
        payments.setForeground(Color.white);
        payments.setFont(new Font("Tahoma", Font.PLAIN, 18));
        payments.addActionListener(this);
        
        about = new JButton("About Us");
        about.setBounds(0, 600, 300, 60);
        about.setBackground(new Color(0, 0, 103));
        about.setForeground(Color.white);
        about.setFont(new Font("Tahoma", Font.PLAIN, 18));
        about.addActionListener(this);
        
       calci = new JButton("Calculator");
       calci.setBounds(0, 650, 300, 60);
       calci.setBackground(new Color(0, 0, 103));
       calci.setForeground(Color.white);
       calci.setFont(new Font("Tahoma", Font.PLAIN, 18));
       calci.addActionListener(this);
        
        happy = new JButton("Travel With US !!!");
        happy.setBounds(0, 700, 300, 60);
        happy.setBackground(new Color(0, 0, 103));
        happy.setForeground(Color.white);
        happy.setFont(new Font("Tahoma", Font.BOLD, 20));
   

        
        buttonp.add(add_details);
		buttonp.add(update_details);
		buttonp.add(view_details);
		buttonp.add(delete_details);
		buttonp.add(view_package);
		buttonp.add(book_package);
		buttonp.add(check_package);
		buttonp.add(view_hotels);
		buttonp.add(book_hotel);
		buttonp.add(view_booked_hotel);
		buttonp.add(destinations);
		buttonp.add(payments);
		buttonp.add(about);
		buttonp.add(calci);
		buttonp.add(happy);
		
		add(buttonp);	
		
		
		ImageIcon ii1 = new ImageIcon(ClassLoader.getSystemResource("home.jpg"));
		Image ii2 = ii1.getImage().getScaledInstance(1650, 1000,Image.SCALE_DEFAULT);
		ImageIcon ii3 = new ImageIcon(ii2);
		JLabel ii4 = new JLabel(ii3);
		ii4.setBounds(300 , 75 , 1300 , 770);
		add(ii4);
		
		setExtendedState(JFrame.MAXIMIZED_BOTH);
		setLayout(null);
		setVisible(true);
		
		
		
	}
	public static void main(String[] args) {
		Dashboard obj = new Dashboard("");
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(add_details == e.getSource()) {
			new Add_Personal_Details(username);
			}
		if(view_details == e.getSource()) {
			new View_Page(username);
		}
		if(update_details == e.getSource()){
		   new Update_Details_Page(username);
	}
		if(delete_details == e.getSource()) {
			new Delete_Page(username);
}
		if(check_package == e.getSource()) {
			new Check_Package();
		}
		if(book_package == e.getSource()) {
			new Book_Package(username);
		}
		if(calci ==e.getSource()) {
			try {
				Runtime.getRuntime().exec("calc.exe");
			} catch (IOException e1) {
				e1.printStackTrace();
			}
		}
		if(view_package == e.getSource()) {
			new View_Booked_Package(username);
		}
		
		if(about == e.getSource()) {
			new About_us();
		}
		if(view_hotels == e.getSource()) {
			new View_Hotels();
		}
		if(book_hotel == e.getSource()) {
			new Book_Hotel(username);
		}
		if(view_booked_hotel == e.getSource()) {
			new View_Booked_Hotel(username);
		}
		if(payments == e.getSource()) {
			new Payment();
		}
	}
}
