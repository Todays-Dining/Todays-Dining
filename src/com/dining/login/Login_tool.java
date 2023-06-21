package com.dining.login;

import java.awt.Color;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JComponent;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ScrollPaneConstants;
import javax.swing.UIManager;
import javax.swing.table.TableCellRenderer;

import java.awt.Cursor;

public class Login_tool extends JPanel {
	private JTable table;
	 String header[]={"가게","좋아요"};
	 String contents[][]={{"가게이름","좋아요!"},{"가게이름","좋아요!"},{"가게이름","좋아요!"},{"가게이름","좋아요!"}
	 ,{"가게이름","좋아요!"},{"가게이름","좋아요!"},{"가게이름","좋아요!"},{"가게이름","좋아요!"},{"가게이름","좋아요!"},{"가게이름","좋아요!"}
	 ,{"가게이름","좋아요!"},{"가게이름","좋아요!"},{"가게이름","좋아요!"},{"가게이름","좋아요!"}
	 ,{"가게이름","좋아요!"},{"가게이름","좋아요!"},{"가게이름","좋아요!"},{"가게이름","좋아요!"}
	 ,{"가게이름","좋아요!"},{"가게이름","좋아요!"},{"가게이름","좋아요!"},{"가게이름","좋아요!"}
	 ,{"가게이름","좋아요!"},{"가게이름","좋아요!"},{"가게이름","좋아요!"},{"가게이름","좋아요!"}
	 ,{"가게이름","좋아요!"},{"가게이름","좋아요!"},{"가게이름","좋아요!"},{"가게이름","좋아요!"}
	 ,{"가게이름","좋아요!"},{"가게이름","좋아요!"},{"가게이름","좋아요!"},{"가게이름","좋아요!"}
	 ,{"가게이름","좋아요!"},{"가게이름","좋아요!"},{"가게이름","좋아요!"},{"가게이름","좋아요!"}
	 ,{"가게이름","좋아요!"},{"가게이름","좋아요!"},{"가게이름","좋아요!"},{"가게이름","좋아요!"}
	 ,{"가게이름","좋아요!"},{"가게이름","좋아요!"},{"가게이름","좋아요!"},{"가게이름","좋아요!"}
	 ,{"가게이름","좋아요!"},{"가게이름","좋아요!"},{"가게이름","좋아요!"},{"가게이름","좋아요!"}
	 ,{"가게이름","좋아요!"},{"가게이름","좋아요!"},{"가게이름","좋아요!"},{"가게이름","좋아요!"}
	 ,{"가게이름","좋아요!"},{"가게이름","좋아요!"},{"가게이름","좋아요!"},{"가게이름","좋아요!"}
	 ,{"가게이름","좋아요!"},{"가게이름","좋아요!"},{"가게이름","좋아요!"},{"가게이름","좋아요!"}
	 ,{"가게이름","좋아요!"},{"가게이름","좋아요!"},{"가게이름","좋아요!"},{"가게이름","좋아요!"}
	 ,{"가게이름","좋아요!"},{"가게이름","좋아요!"},{"가게이름","좋아요!"},{"가게이름","좋아요!"}
	 ,{"가게이름","좋아요!"},{"가게이름","좋아요!"},{"가게이름","좋아요!"},{"가게이름","좋아요!"}
	 ,{"가게이름","좋아요!"},{"가게이름","좋아요!"},{"가게이름","좋아요!"},{"가게이름","좋아요!"}
	 };
	 
	/**
	 * Create the panel.
	 */
	public Login_tool() {
		setForeground(new Color(0, 0, 0));
		setBackground(new Color(255, 240, 245));
		setBounds(100, 100, 540, 960);
		setLayout(null);
		
		JLabel main_label = new JLabel("");
		main_label.setBounds(0, 0, 516, 210);
		main_label.setIcon(new ImageIcon("D:\\KJH\\teamproject\\Todays-Dining\\src\\image\\label.png"));
		add(main_label);
		
		JLabel main_icon = new JLabel("");
		main_icon.setBounds(51, 654, 446, 306);
		main_icon.setIcon(new ImageIcon("D:\\KJH\\teamproject\\Todays-Dining\\src\\image\\icon_small.png"));
		add(main_icon);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBackground(new Color(255, 128, 192));
		
		scrollPane.setBounds(51, 197, 435, 447);
		add(scrollPane);
		
		table = new JTable(contents, header);
		table.setRowHeight(30);
		table.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		table.setSelectionBackground(new Color(0, 255, 255));
		table.setSelectionForeground(new Color(255, 0, 255));
		table.setFont(new Font("Sandoll 삼립호빵체 TTF Basic", Font.PLAIN, 17));
		table.setBackground(new Color(255, 128, 192));
		scrollPane.setViewportView(table);
	
		
	}
	
	
}
