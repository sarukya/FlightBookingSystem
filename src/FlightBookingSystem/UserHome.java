package FlightBookingSystem;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;

public class UserHome extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    UserHome frame = new UserHome();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public UserHome() {

    }

    /**
     * Create the frame.
     */
    public UserHome(String userSes) {
    	
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(450, 190, 1014, 597);
        setResizable(false);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);
        final JButton btnNewButton = new JButton("Logout");
        btnNewButton.setForeground(new Color(0, 0, 0));
        btnNewButton.setBackground(UIManager.getColor("Button.disabledForeground"));
        btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 39));
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int a = JOptionPane.showConfirmDialog(btnNewButton, "Are you sure?");
                // JOptionPane.setRootFrame(null);
                if (a == JOptionPane.YES_OPTION) {
                    dispose();
                    UserLogin obj = new UserLogin();
                    obj.setTitle("User Login");
                    obj.setVisible(true);
                }
                dispose();
                UserLogin obj = new UserLogin();

                obj.setTitle("User Login");
                obj.setVisible(true);

            }
        });
        btnNewButton.setBounds(207, 90, 491, 114);
        contentPane.add(btnNewButton);
        
        JButton button = new JButton("Search Flight Information\r\n");
        button.setBackground(UIManager.getColor("Button.disabledForeground"));
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                UserSearch a1 = new UserSearch();
                a1.setTitle("Search Flight");
                a1.setVisible(true);

            }
        });
        button.setFont(new Font("Tahoma", Font.PLAIN, 35));
        button.setBounds(207, 200, 491, 114);
        contentPane.add(button);
       
        JButton button1 = new JButton("Book Ticket\r\n");
        button1.setBackground(UIManager.getColor("Button.disabledForeground"));
        button1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                UserBooking a1 = new UserBooking();
                a1.setTitle("Book Ticket");
                a1.setVisible(true);

            }
        });
        button1.setFont(new Font("Tahoma", Font.PLAIN, 35));
        button1.setBounds(207, 300, 491, 114);
        contentPane.add(button1);
        
        JButton button2 = new JButton("View Bookings\r\n");
        button2.setBackground(UIManager.getColor("Button.disabledForeground"));
        button2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                UserBookingView a1 = new UserBookingView();
                a1.setTitle("View Bookings");
                a1.setVisible(true);

            }
        });
        button2.setFont(new Font("Tahoma", Font.PLAIN, 35));
        button2.setBounds(207, 400, 491, 114);
        contentPane.add(button2);
        
    }
        
}