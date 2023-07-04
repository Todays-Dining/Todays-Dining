package com.dining.start;

import java.awt.CardLayout;
import java.lang.reflect.InvocationTargetException;

import javax.swing.JFrame;
import javax.swing.JPanel;

import com.dining.admin.Admin01_main;
import com.dining.admin.Admin02_AdMember_add;
import com.dining.admin.Admin02_Member;
import com.dining.admin.Admin03_rest;
import com.dining.admin.Admin04_review;

public class Admin_frame extends JFrame{
	
	JPanel admin_pg ;
	CardLayout cardLayout;
	
	
	public Admin_frame() {
		
		admin_pg = new JPanel(); 
		cardLayout = new CardLayout();
		admin_pg.setLayout(cardLayout);
		// 관리자화면
		Admin01_main admin01_main = new Admin01_main(cardLayout,admin_pg); 
		Admin02_AdMember_add admin02_AdMember_add = new Admin02_AdMember_add(cardLayout,admin_pg);
		Admin02_Member admin02_Member = new Admin02_Member(cardLayout,admin_pg);
		Admin03_rest admin03_rest = new Admin03_rest(cardLayout,admin_pg);
		Admin04_review admin04_review = new Admin04_review(cardLayout,admin_pg); 
		// 관리자화면
		admin_pg.add("admin01_main",admin01_main);
		admin_pg.add("admin02_AdMember_add",admin02_AdMember_add);
		admin_pg.add("admin02_Member",admin02_Member);
		admin_pg.add("admin03_rest",admin03_rest);
		admin_pg.add("admin04_review",admin04_review);
		
		add(admin_pg);
		setSize(1200, 840);
		setVisible(true);
		setLocationRelativeTo(null);

	}
	
	public static void main(String[] args) throws InvocationTargetException, InterruptedException {
		new Admin_frame();
	}

}
