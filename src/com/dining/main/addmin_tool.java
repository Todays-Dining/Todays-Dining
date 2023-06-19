package com.dining.main;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class addmin_tool {

//	private JFrame frame;
	public JPanel jPanel_admin ;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					addmin_tool window = new addmin_tool();
					window.jPanel_admin.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public addmin_tool() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		jPanel_admin = new JPanel();
		jPanel_admin.setBackground(new Color(255, 240, 245));
		jPanel_admin.setBounds(100, 100, 1200, 800);
		jPanel_admin.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("회원정보");
		lblNewLabel.setForeground(new Color(65, 105, 225));
		lblNewLabel.setFont(new Font("Sandoll 삼립호빵체 TTF Basic", Font.PLAIN, 50));
		lblNewLabel.setBounds(36, 41, 207, 89);
		jPanel_admin.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setOpaque(true);
		lblNewLabel_1.setBackground(new Color(65, 105, 225));
		lblNewLabel_1.setBounds(36, 115, 1120, 8);
		jPanel_admin.add(lblNewLabel_1);
		
		JButton backbutton = new JButton("");
		backbutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		backbutton.setBorderPainted(false);
		backbutton.setBackground(new Color(255, 240, 245));
		backbutton.setIcon(new ImageIcon("C:\\javastudy\\teamproject\\src\\image\\backbutton.png"));
		backbutton.setBounds(1075, 50, 97, 71);
		jPanel_admin.add(backbutton);
	}
}
