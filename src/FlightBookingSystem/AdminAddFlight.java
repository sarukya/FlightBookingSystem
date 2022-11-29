package FlightBookingSystem;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class AdminAddFlight extends JFrame {

	private JPanel contentPane;
	private JTextField t1;
	private JTextField t2;
	private JTextField t3;
	private JTextField t4;
	private JTextField t5;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminAddFlight frame = new AdminAddFlight();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public class my_update{
		
		void  my_db_update(String str1, String str2,String str3, String str4, String str5) {
				try{  
			Class.forName("com.mysql.jdbc.Driver");  
			Connection con=DriverManager.getConnection(  
			"jdbc:mysql://localhost:3306/admin","root","@Root1230");  
			Statement st=con.createStatement();  
			//java.util.Date date=new java.util.Date();
			//java.sql.Date sqlDate=new java.sql.Date(date.getTime());
			//java.sql.Timestamp sqlTime=new java.sql.Timestamp(date.getTime());
			// Adding record 
			String query1="INSERT INTO admin.flightinfo"
			 + " (`flightname`, `departure`, `arrival`,`date`,`time`)"
			 + "VALUES('" +str1+"','"+str2+"','"+str3+"','"+str4+"','"+str5+"')";
			st.executeUpdate(query1); // record added. 
			
			con.close();  
			
			}catch(Exception e){ System.out.println(e);} 
			//////////////////////////////
		}
		}

	/**
	 * Create the frame.
	 */
	public AdminAddFlight() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 394, 264);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel l1 = new JLabel("Flight Name");
		l1.setBounds(10, 29, 49, 14);
		contentPane.add(l1);
		
		JLabel l2 = new JLabel("departure");
		l2.setBounds(10, 69, 49, 14);
		contentPane.add(l2);
		
		JLabel l3 = new JLabel("Arrival");
		l3.setBounds(10, 126, 49, 14);
		contentPane.add(l3);
		
		JLabel l4 = new JLabel("Date");
		l4.setBounds(10, 169, 49, 14);
		contentPane.add(l4);
		
		JLabel l5 = new JLabel("Time");
		l5.setBounds(10, 226, 49, 14);
		contentPane.add(l5);
		
		t1 = new JTextField();
		t1.setBounds(66, 26, 96, 20);
		contentPane.add(t1);
		t1.setColumns(10);
		
		t2 = new JTextField();
		t2.setBounds(66, 66, 96, 20);
		contentPane.add(t2);
		t2.setColumns(10);
		
		t3 = new JTextField();
		t3.setBounds(66, 123, 96, 20);
		contentPane.add(t3);
		t3.setColumns(10);
		
		t4 = new JTextField();
		t4.setBounds(66, 166, 96, 20);
		contentPane.add(t4);
		t4.setColumns(10);
		
		t5 = new JTextField();
		t5.setBounds(66, 223, 96, 20);
		contentPane.add(t5);
		t5.setColumns(10);
		
		JButton b1 = new JButton("Submit");
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String flightname=t1.getText();
				String departure=t2.getText();
				String arrival=t3.getText();
				String date=t4.getText();
				String time=t5.getText();
				// creating one object 
				my_update obj=new my_update();
				obj.my_db_update(flightname, departure, arrival, date, time);
				}
		});
		b1.setBounds(212, 223, 89, 23);
		contentPane.add(b1);
	}
}