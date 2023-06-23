package com.dining.db;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTable;

public class Test_01 implements Runnable {

	private JFrame frame;
	private JTable table;
	private String diner_no, diner_name, favorited_number, opening_hours, menu, phone_number,
	parking_or_not, food_category, region, address;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Test_01 window = new Test_01();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Test_01() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 826, 683);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		table = new JTable();
		table.setBounds(12, 59, 786, 487);
		frame.getContentPane().add(table);
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
}
