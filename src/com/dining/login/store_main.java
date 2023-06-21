package com.dining.login;
import javax.swing.JFrame;

public class store_main extends JFrame {
	
	public store_main() {
		store_home_panel home = new store_home_panel();
		store_map_panel map = new store_map_panel();
		store_review_panel review = new store_review_panel();
	
	add(review);
	setBounds(100, 100, 540, 960);
	setVisible(true);
	setDefaultCloseOperation(EXIT_ON_CLOSE);
	setLocationRelativeTo(null);
	}
	
	public static void main(String[] args) {
		new store_main();
	}
}
