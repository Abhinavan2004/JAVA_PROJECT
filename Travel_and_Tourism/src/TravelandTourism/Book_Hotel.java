package TravelandTourism;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

import javax.swing.*;


public class Book_Hotel extends JFrame implements ActionListener {
	
	JLabel heading, user , hotel , persons , days , ac_nac , food , id , number , phone , tprice, image ;
	JTextField  usert , personst , dayst , idt, numbert , phonet , tpricet ;
	JButton check, book ,back;
	Choice tempc ,hotelsc , foodc;
	Conn co ;
	String usernamehotel;
	
	
	Book_Hotel(String usernamehotel){
		this.usernamehotel = usernamehotel;
		
		heading = new JLabel("BOOK  HOTEL");
		heading.setFont(new Font("Tahoma" , Font.BOLD ,26));
		heading.setBounds(350,0,600,50);
		add(heading);
		
		user = new JLabel("Username");
        user.setBounds(50, 80, 180, 25);
        user.setFont(new Font("Tahoma", Font.BOLD, 16));
        
		hotel = new JLabel("Select Hotel");
        hotel.setBounds(50, 130, 180, 25);
        hotel.setFont(new Font("Tahoma", Font.BOLD, 16));
		
        persons = new JLabel("Total Persons");
        persons.setBounds(50, 180, 180, 25);
        persons.setFont(new Font("Tahoma", Font.BOLD, 16));
		
        days = new JLabel("No. of Days");
	    days.setBounds(50, 230, 180, 25);
        days.setFont(new Font("Tahoma", Font.BOLD, 16));
		
        ac_nac = new JLabel("AC / Non-AC");
	    ac_nac.setBounds(50, 280, 180, 25);
        ac_nac.setFont(new Font("Tahoma", Font.BOLD, 16));
        
		food = new JLabel("Food Included");
	    food.setBounds(50, 330, 180, 25);
       food.setFont(new Font("Tahoma", Font.BOLD, 16));
		id = new JLabel("Id");
	    id.setBounds(50, 380, 180, 25);
        id.setFont(new Font("Tahoma", Font.BOLD, 16));
		number = new JLabel("Number");
	    number.setBounds(50, 430, 180, 25);
        number.setFont(new Font("Tahoma", Font.BOLD, 16));
		phone = new JLabel("Phone");
	    phone.setBounds(50, 480, 180, 25);
       phone.setFont(new Font("Tahoma", Font.BOLD, 16));
		tprice = new JLabel("Total Price");
	    tprice.setBounds(50, 530, 180, 25);
        tprice.setFont(new Font("Tahoma", Font.BOLD, 16));
		
	    
		usert = new JTextField(20);
		 usert.setBounds(230, 80, 180, 25);
	        usert.setFont(new Font("Tahoma", Font.BOLD, 16));
	        
	        hotelsc = new Choice();
	         hotelsc.add("HOTEL 1");
	         hotelsc.add("HOTEL 2");
	         hotelsc.add("HOTEL 3");
	    hotelsc.setBounds(230, 130, 180, 25);
        hotelsc.setFont(new Font("Tahoma", Font.BOLD, 16));
        
		personst = new JTextField(20);
		 personst.setBounds(230, 180, 180, 25);
	        personst.setFont(new Font("Tahoma", Font.BOLD, 16));
	        
		dayst = new JTextField(20);
		 dayst.setBounds(230, 230, 180, 25);
	        dayst.setFont(new Font("Tahoma", Font.BOLD, 16));
	        
	        tempc = new Choice();
	         tempc.add("AC");
	         tempc.add("NON-AC");
	    tempc.setBounds(230, 280, 180, 25);
        tempc.setFont(new Font("Tahoma", Font.BOLD, 16));
        
        foodc = new Choice();
        foodc.add("INCLUDED");
        foodc.add("NON _ INCLUDED");
	    foodc.setBounds(230, 320, 180, 25);
        foodc.setFont(new Font("Tahoma", Font.BOLD, 16));
        
		idt = new JTextField(20);
		 idt.setBounds(230, 380, 180, 25);
	        idt.setFont(new Font("Tahoma", Font.BOLD, 16));
	        
		numbert = new JTextField(20);
		numbert.setBounds(230, 430, 180, 25);
	       numbert.setFont(new Font("Tahoma", Font.BOLD, 16));
	        
		phonet = new JTextField(20);
		phonet.setBounds(230, 480, 180, 25);
	       phonet.setFont(new Font("Tahoma", Font.BOLD, 16));
	        
		tpricet = new JTextField(20);
		 tpricet.setBounds(230, 530, 180, 25);
	        tpricet.setFont(new Font("Tahoma", Font.BOLD, 16));
		
	        
	        
	        
		check = new JButton("Check Price");
		 check.setBounds(120, 590, 130, 25);
	     check.setFont(new Font("Tahoma", Font.BOLD, 16));
	     check.addActionListener(this);
	       check.setBackground(Color.black);
	       check.setForeground(Color.white);

		book = new JButton("Book Hotel");
		 book.setBounds(280, 590, 130, 25);
	      book.setFont(new Font("Tahoma", Font.BOLD, 16));
	      book.addActionListener(this);
	        book.setBackground(Color.black);
	        book.setForeground(Color.white);

	      
		back = new JButton("Back");
		 back.setBounds(440, 590, 130, 25);
	      back.setFont(new Font("Tahoma", Font.BOLD, 16));
	      back.addActionListener(this);
	        back.setBackground(Color.black);
	        back.setForeground(Color.white);

		
		add(user);
		add(usert);
		add(hotel);
		add(hotelsc);
		add(persons);
		add(personst);
		add(days);
		add(dayst);
		add(ac_nac);
		add(tempc);
		add(food);
		add(foodc);
		add(id);
		add(idt);
		add(number);
		add(numbert);
		add(phone);
		add(phonet);
		add(tprice);
		add(tpricet);
		add(check);
	add(book);
		add(back);
		
		
		 ImageIcon hotelImage = new ImageIcon("C:\\\\Users\\\\user\\\\Downloads\\\\Online Registration.jpg"); 
	        Image img = hotelImage.getImage().getScaledInstance(400, 500, Image.SCALE_SMOOTH);
	        hotelImage = new ImageIcon(img);
	        image = new JLabel(hotelImage);
	        image.setBounds(500 , 100 , 400,400);
	        add(image);
		
	        
	        
	        co =new Conn();
	        try {
	        	ResultSet rs = co.s.executeQuery("SELECT * FROM customer WHERE username ='"+usernamehotel+"'");
	        	
	        	if(rs.next()) {
	          usert.setText(rs.getString("username"));
	          idt.setText(rs.getString("id"));
	          numbert.setText(rs.getString("id_number"));
	          phonet.setText(rs.getString("contact_no"));
	        }
	        }
	        catch(Exception e) {
	        	e.printStackTrace();
	        }
	        
		setLayout(null);
	   
		
		
	     
	        setVisible(true);
	        setTitle("Book Hotel");
	        setBounds(350, 150, 870, 690);
	        
	    
	}
	public static void main(String[] args) {
		Book_Hotel obj = new Book_Hotel("");
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(back == e.getSource()) {
			setVisible(false);
		}
		if(check == e.getSource()) {
			  int persons = Integer.parseInt(personst.getText());
              int days = Integer.parseInt(dayst.getText());
              
              String acprice = tempc.getSelectedItem();
              String foodprice = foodc.getSelectedItem();
              
              
              if(persons * days > 0) {
                  int total = 0;
                  total += acprice.equals("AC") ? 950 : 1;
                  total += foodprice.equals("INCLUDED") ? 350 : 1;
                  total += 450;
                  total = total * persons * days;
                  tpricet.setText("Rs "+total);
              }
		}
			
		
		if(book == e.getSource()) {
			try {
				String query2 ="INSERT INTO hotelpackage VALUES('"+usert.getText()+"', '"+hotelsc.getSelectedItem()+"', '"+personst.getText()+"', '"+dayst.getText()+"', '"+tempc.getSelectedItem()+"', '"+foodc.getSelectedItem()+"', '"+idt.getText()+"' , '"+numbert.getText()+"' ,'"+phonet.getText()+"' , '"+tpricet.getText()+"')";
			    co.s.executeUpdate(query2);	
			    JOptionPane.showMessageDialog(null, "Hotel Booked Successfully!!");
			    setVisible(false);
			}catch(Exception ae) {
				 JOptionPane.showMessageDialog(null, "BOOKING FAILED!! PLEASE TRY AGAIN");
				   
				ae.printStackTrace();
			}
		}
	}

}
