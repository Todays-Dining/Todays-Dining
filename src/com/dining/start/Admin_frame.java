package com.dining.start;

import java.awt.CardLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;

import com.dining.admin.Admin01_main;
import com.dining.login.Login01_page;
import com.dining.main.Main00_Map;

public class Admin_frame extends JFrame{
	
	JPanel admin_pg ;
	CardLayout cardLayout;
	
	
	public Admin_frame() {
		 ;
		
		admin_pg = new JPanel(); 
		cardLayout = new CardLayout();
		admin_pg.setLayout(cardLayout);
		Admin01_main admin01_main = new Admin01_main(cardLayout,admin_pg); 
		
		admin_pg.add("admin01_main",admin01_main);
		add(admin_pg)	;
		
		setSize(1200, 840);
		setVisible(true);
		setLocationRelativeTo(null);
		cardLayout.show(admin_pg,"admin01_main");

	}

	
}
