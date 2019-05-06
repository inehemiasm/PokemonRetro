package com.herokuapp.sprite;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

import com.herokuapp.misc.GlobalVariables;
import com.herokuapp.player.Camera;

public class SpriteSingle {

	int x;
	int y;
	int width;
	int height;
	String fileName;
	Image img;
		
		
	public SpriteSingle(int x, int y, int width, int height, String fileName){
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
		this.fileName = fileName;
		img = Toolkit.getDefaultToolkit().getImage(fileName);
	}
	public SpriteSingle(int x, int y, String fileName){
		this.x = x;
		this.y = y;
		this.fileName = fileName;
		img = Toolkit.getDefaultToolkit().getImage(fileName);
		this.width = img.getWidth(null);
		this.height = img.getHeight(null);
	}
		
	public void moveBy(int dx, int dy){
		x += dx;
		y += dy;
	}
		
		
	public void moveUp(int dist){
		y -= dist;	
	}
		
	public void moveDown(int dist){
		y += dist;		
	}

	public void moveLeft(int dist){
		x -= dist;
	}
		
	public void moveRight(int dist){
		x += dist;
	}
		
	public void draw(Graphics g){  
		//System.out.println(fileName);
		//System.out.println(x);
		g.drawImage(img, x - (int)Camera.x+GlobalVariables.screenWidth/2,
						y - (int)Camera.y+GlobalVariables.screenHeight/2, width, height, null);
	}

}