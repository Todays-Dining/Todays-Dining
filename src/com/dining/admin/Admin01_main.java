package com.dining.admin;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.JPanel;

import com.dining.start.Admin_frame;

public class Admin01_main extends JPanel {

	JPanel admin_pg;
	CardLayout cardLayout;
	Admin_frame admin;
	/**
	 * Create the panel.
	 */
	public Admin01_main(CardLayout cardLayout, JPanel admin_pg , Admin_frame admin) {
		this.cardLayout = cardLayout;
		this.admin_pg = admin_pg;

		setBackground(new Color(255, 240, 245));
		setBounds(100, 100, 1200, 800);
		setLayout(null);

		JLabel admin_Label = new JLabel("Admin");
		admin_Label.setForeground(new Color(65, 105, 225));
		admin_Label.setFont(new Font("Sandoll 삼립호빵체 TTF Basic", Font.PLAIN, 60));
		admin_Label.setBounds(498, 50, 207, 89);
		add(admin_Label);

		JLabel line_1 = new JLabel("");
		line_1.setOpaque(true);
		line_1.setBackground(new Color(65, 105, 225));
		line_1.setBounds(33, 136, 1120, 8);
		add(line_1);

		JLabel line_2 = new JLabel("");
		line_2.setOpaque(true);
		line_2.setBackground(new Color(65, 105, 225));
		line_2.setBounds(33, 699, 1120, 8);
		add(line_2);

		RoundedButton_kjhw_1 member_bt = new RoundedButton_kjhw_1("회원정보");
		member_bt.setForeground(new Color(255, 240, 245));
		member_bt.setBackground(new Color(65, 105, 255));
		member_bt.setBorderPainted(false);
		member_bt.setFont(new Font("Sandoll 삼립호빵체 TTF Basic", Font.PLAIN, 40));
		member_bt.setBounds(131, 285, 230, 255);
		add(member_bt);

		RoundedButton_kjhw_1 store_bt = new RoundedButton_kjhw_1("음식점");
		store_bt.setBackground(new Color(65, 105, 255));
		store_bt.setBorderPainted(false);
		store_bt.setForeground(new Color(255, 240, 245));
		store_bt.setFont(new Font("Sandoll 삼립호빵체 TTF Basic", Font.PLAIN, 40));
		store_bt.setBounds(490, 285, 230, 255);
		add(store_bt);

		RoundedButton_kjhw_1 review_bt = new RoundedButton_kjhw_1("리뷰 및 평점");
		review_bt.setBackground(new Color(65, 105, 255));
		review_bt.setBorderPainted(false);
		review_bt.setForeground(new Color(255, 240, 245));
		review_bt.setFont(new Font("Sandoll 삼립호빵체 TTF Basic", Font.PLAIN, 40));
		review_bt.setBounds(849, 285, 230, 255);
		add(review_bt);

		member_bt.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				cardLayout.show(admin_pg, "admin02_Member");
			}
		});

		store_bt.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				cardLayout.show(admin_pg, "admin03_rest");
			}
		});

		review_bt.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				cardLayout.show(admin_pg, "admin04_review");
			}
		});

	}

}
