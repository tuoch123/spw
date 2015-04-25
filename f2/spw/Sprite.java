package f2.spw;

import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;
import java.awt.geom.Rectangle2D.Double;

public abstract class Sprite {
	int x;
	int y;
	int width;
	int height;
	
	public Sprite(int x, int y, int width, int height) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}

	//Abstract for draw picture must @Overwrite in children
	abstract public void draw(Graphics2D g);
	
	//Function for get Area to check intersection
	public Double getRectangle() {
		return new Rectangle2D.Double(x, y, width, height);
	}
}
