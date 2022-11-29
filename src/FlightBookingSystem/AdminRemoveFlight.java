package FlightBookingSystem;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class AdminRemoveFlight extends JFrame {

	private JPanel contentPane;
	private JTextField t1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminRemoveFlight frame = new AdminRemoveFlight();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public class my_update{
		
		void  my_db_update(String str1) {
				try{  
			Class.forName("com.mysql.jdbc.Driver");  
			Connection con=DriverManager.getConnection(  
			"jdbc:mysql://localhost:3306/admin","root","@Root1230");  
			Statement st=con.createStatement();  
			
			// removing record 
			String query1="DELETE FROM admin.flightinfo"
			 + " WHERE flightname = '" +str1+"'"	;
					
			st.executeUpdate(query1); // record removed. 
			
			con.close();  
			
			}catch(Exception e){ System.out.println(e);} 
			//////////////////////////////
		}
		}

	/**
	 * Create the frame.
	 */
	public AdminRemoveFlight() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 394, 264);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel l1 = new JLabel("Flight Name");
		l1.setBounds(10, 29, 49, 14);
		contentPane.add(l1);
		
		
		t1 = new JTextField();
		t1.setBounds(66, 26, 96, 20);
		contentPane.add(t1);
		t1.setColumns(10);
		
		
		JButton b1 = new JButton("Submit");
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String flightname=t1.getText();
				
				// creating one object 
				my_update obj=new my_update();
				obj.my_db_update(flightname);
				}
		});
		b1.setBounds(212, 165, 89, 23);
		contentPane.add(b1);
	}
}