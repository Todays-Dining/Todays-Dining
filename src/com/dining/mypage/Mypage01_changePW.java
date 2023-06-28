package com.dining.mypage;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Font;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class Mypage01_changePW extends JPanel {
	private JTextField textField;
	private JTextField new_pw_tf;
	private JTextField old_pw_tf;
	CardLayout cardLayout;
	JPanel main_pg;
	

	/**
	 * Create the panel.
	 */
	public Mypage01_changePW(CardLayout cardLayout, JPanel main_pg) {
		this.cardLayout = cardLayout ;
		this.main_pg = main_pg ;
		
		setForeground(new Color(0, 0, 0));
		setBackground(new Color(255, 240, 245));
		setBounds(100, 100, 540, 960);
		setLayout(null);
		
		JLabel mypage_lb = new JLabel("MY PAGE");
		mypage_lb.setBounds(145, 76, 250, 72);
		mypage_lb.setBackground(new Color(255, 240, 245));
		mypage_lb.setFont(new Font("Sandoll 삼립호빵체 TTF Outline", Font.PLAIN, 60));
		mypage_lb.setHorizontalAlignment(SwingConstants.CENTER);
		mypage_lb.setForeground(Color.black);
		add(mypage_lb);
		
		old_pw_tf = new JTextField();
		old_pw_tf.setBounds(201, 380, 250, 35);
		add(old_pw_tf);
		old_pw_tf.setColumns(10);
		
		JLabel old_pw_lb = new JLabel("현재PW");
		old_pw_lb.setOpaque(true);
		old_pw_lb.setForeground(new Color(255, 255, 255));
		old_pw_lb.setBackground(new Color(65, 105, 225));
		old_pw_lb.setFont(new Font("Sandoll 삼립호빵체 TTF Basic", Font.PLAIN, 24));
		old_pw_lb.setHorizontalAlignment(JLabel.CENTER);
		old_pw_lb.setBounds(84, 380, 103, 35);
		add(old_pw_lb);
		
		new_pw_tf = new JTextField();
		new_pw_tf.setBounds(201, 475, 250, 35);
		add(new_pw_tf);
		new_pw_tf.setColumns(10);
		
		
		JLabel new_pw_lb = new JLabel("새로운pw");
		new_pw_lb.setOpaque(true);
		new_pw_lb.setForeground(new Color(255, 255, 255));
		new_pw_lb.setBackground(new Color(65, 105, 225));
		new_pw_lb.setFont(new Font("Sandoll 삼립호빵체 TTF Basic", Font.PLAIN, 24));
		new_pw_lb.setHorizontalAlignment(JLabel.CENTER);
		new_pw_lb.setBounds(84, 475, 103, 35);
		add(new_pw_lb);
		
		RoundedButton_ha0_1 pw_change_bt = new RoundedButton_ha0_1("수정");
		pw_change_bt.setText("pw변경");
		pw_change_bt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		pw_change_bt.setForeground(Color.WHITE);
		pw_change_bt.setFont(new Font("Sandoll 삼립호빵체 TTF Basic", Font.PLAIN, 24));
		pw_change_bt.setBorderPainted(false);
		pw_change_bt.setBackground(new Color(65, 105, 225));
		pw_change_bt.setBounds(84, 629, 148, 50);
		add(pw_change_bt);
		
		RoundedButton_ha0_1 cancle_bt = new RoundedButton_ha0_1();
		cancle_bt.setText("취 소");
		cancle_bt.setForeground(Color.WHITE);
		cancle_bt.setFont(new Font("Sandoll 삼립호빵체 TTF Basic", Font.PLAIN, 24));
		cancle_bt.setBorderPainted(false);
		cancle_bt.setBackground(new Color(65, 105, 225));
		cancle_bt.setBounds(303, 629, 148, 50);
		add(cancle_bt);
		
		JLabel icon_lb = new JLabel("New label");
		icon_lb.setIcon(new ImageIcon(Mypage01_changePW.class.getResource("/image/icon_small.png")));
		icon_lb.setBounds(48, 678, 415, 282);
		add(icon_lb);
		
		// mypage01_main 로 이동
		cancle_bt.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				cardLayout.show(main_pg,"mypage01_main");
			}
		});
	}
}
