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

public class AdminHomepage extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    AdminHomepage frame = new AdminHomepage();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public AdminHomepage() {

    }

    /**
     * Create the frame.
     */
    public AdminHomepage(String userSes) {
    	
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
                    obj.setTitle("Admin-Login");
                    obj.setVisible(true);
                }
                dispose();
                UserLogin obj = new UserLogin();

                obj.setTitle("Admin-Login");
                obj.setVisible(true);

            }
        });
        btnNewButton.setBounds(247, 118, 491, 114);
        contentPane.add(btnNewButton);
        
        JButton button = new JButton("Add Flight\r\n");
        button.setBackground(UIManager.getColor("Button.disabledForeground"));
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                AdminAddFlight a1 = new AdminAddFlight();
                a1.setTitle("Add Flight");
                a1.setVisible(true);

            }
        });
        button.setFont(new Font("Tahoma", Font.PLAIN, 35));
        button.setBounds(247, 280, 491, 114);
        contentPane.add(button);
        
        JButton button1 = new JButton("Remove Flight\r\n");
        button1.setBackground(UIManager.getColor("Button.disabledForeground"));
        button1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                AdminRemoveFlight a1 = new AdminRemoveFlight();
                a1.setTitle("Remove Flight");
                a1.setVisible(true);

            }
        });
        button1.setFont(new Font("Tahoma", Font.PLAIN, 35));
        button1.setBounds(247, 380, 491, 114);
        contentPane.add(button1);
        
        JButton button2 = new JButton("Flight Bookings\r\n");
        button2.setBackground(UIManager.getColor("Button.disabledForeground"));
        button2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                AdminViewBookings a1 = new AdminViewBookings();
                a1.setTitle("Flight Bookings");
                a1.setVisible(true);

            }
        });
        button2.setFont(new Font("Tahoma", Font.PLAIN, 35));
        button2.setBounds(247, 480, 491, 114);
        contentPane.add(button2);
        
    }
        
}