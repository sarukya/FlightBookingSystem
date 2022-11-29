package FlightBookingSystem;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

import javax.swing.JInternalFrame;
import javax.swing.*;


public class UserBooking extends JFrame implements ActionListener {

    JLabel customer_name, seat_number, numberofseats;
    JTextField txt_c_name;
    JPanel seat_panel;
    JPanel p;
    JLabel Id, source, destination, seatnumber, name, price;
    JTextField tf_id, tf_source, tf_destination, tf_seatnumber, tf_name, tf_price;
    JButton btn_book;
    String ID;

    public UserBooking() {
    	String id = null;
    	String Source = null;
    	String Destination = null; 
    	String totalseats = null;
        p = new JPanel();
        Id = new JLabel("Flight name");
        tf_id = new JTextField();
        tf_id.setText(id);
        source = new JLabel("From : ");
        destination = new JLabel("To : ");
        name = new JLabel("Customer Name");
        seatnumber = new JLabel(" Enter Seat Number ");
        price = new JLabel("Price : ");
        tf_source = new JTextField();
        tf_name = new JTextField();
        tf_source.setText(Source);
        tf_destination = new JTextField();
        tf_destination.setText(Destination);
        tf_seatnumber = new JTextField();
        tf_price = new JTextField();
        String y = "1000";
        tf_price.setText(y);
        btn_book = new JButton("Book Ticket");
        Id.setBounds(20, 20, 100, 30);
        source.setBounds(20, 60, 100, 30);
        destination.setBounds(20, 100, 100, 30);
        seatnumber.setBounds(20, 140, 100, 30);
        name.setBounds(20, 180, 100, 30);
        price.setBounds(20, 220, 100, 30);
        tf_id.setBounds(140, 20, 100, 30);
        tf_source.setBounds(140, 60, 100, 30);
        tf_destination.setBounds(140, 100, 100, 30);
        tf_seatnumber.setBounds(140, 140, 100, 30);
        tf_name.setBounds(140, 180, 100, 30);
        tf_price.setBounds(140, 220, 100, 30);

        btn_book.setBounds(80, 280, 120, 30);
        p.add(Id);
        p.add(source);
        p.add(destination);
        p.add(seatnumber);
        p.add(tf_id);
        p.add(tf_source);
        p.add(tf_destination);
        p.add(tf_seatnumber);
        p.add(btn_book);
        p.add(name);
        p.add(tf_name);
        p.add(price);
        p.add(tf_price);
        btn_book.addActionListener(this);
        add(p);
        p.setLayout(null);
        setVisible(true);
        setSize(600, 600);
        //JInternalFrame f = new JInternalFrame();

        setVisible(true);
        setSize(600, 600);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btn_book) {

            int x = 0;
            String id = tf_id.getText();
            String Price = tf_price.getText();
            String SeatNumber = tf_seatnumber.getText();
            String CName = tf_name.getText();

            try {
            	Class.forName("com.mysql.jdbc.Driver");  
    			Connection con=DriverManager.getConnection(  
    			"jdbc:mysql://localhost:3306/admin","root","@Root1230");  
    			Statement st=con.createStatement(); 
                PreparedStatement ps = con.prepareStatement("insert into ticket(flightname,seatNumber,cName,total_price) values(?,?,?,?)");

                ps.setString(1, id);
                ps.setString(2, SeatNumber);
                ps.setString(3, CName);
                ps.setString(4, Price);

                ps.executeUpdate();
                x++;
                if (x > 0) {
                    JOptionPane.showMessageDialog(btn_book, "Ticket Book");
                }
            } catch (Exception ex) {
                System.out.println(ex);
            }
        } else {
            JOptionPane.showMessageDialog(btn_book, "Something went Wrong");
        }

    }
    
    public static void main(String s[])  
    {  

		UserBooking frame = new UserBooking();
        
    }  

}
