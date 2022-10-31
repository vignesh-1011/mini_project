package brick_breaker.game;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;

public class WallGenerate {
	public int wall[][];
	public int brickwidth;
	public int brickheight;
	public  WallGenerate(int row,int col) {
		wall=new int[row][col];
		for(int i=0;i<wall.length;i++)
		{
			for(int j=0;j<wall[0].length;j++) {
				wall[i][j]=1;
			}
		}
		brickwidth=540/col;
		brickheight=150/row;
	}
	public void draw(Graphics2D g) {
		for(int i=0;i<wall.length;i++)
		{
			for(int j=0;j<wall[0].length;j++) {
				if(wall[i][j]>0) {
					g.setColor(Color.white);
					g.fillRect(j * brickwidth +80, i*brickheight+50,
							brickwidth, brickheight);
					g.setStroke(new BasicStroke(3));
					g.setColor(Color.black);
					g.drawRect(j*brickwidth +80, i*brickheight+50, brickwidth,
							brickheight);
				}
				
			}	
		}	
	}

	public void setBrickvalue(int value,int row,int col) {
		wall[row][col]=value;
	}
}
