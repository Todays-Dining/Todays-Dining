package com.dining.login;

import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

public class Dining_Canvas2 extends Canvas{
	@Override
	public void paint(Graphics g) {
		Image image = Toolkit.getDefaultToolkit().getImage("src/image/label_1.jpg");
		g.drawImage(image, 10, 230, this); // 원래 크기

	}
}
