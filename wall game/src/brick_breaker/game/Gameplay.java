package brick_breaker.game;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JPanel;
import javax.swing.Timer;

public class Gameplay extends JPanel implements KeyListener,ActionListener{
	private boolean play=false;
	private int score=0;
	private int totalBricks=21;
	private Timer timer;
	private int delay=8;
	private int playerx =320;
	private int ballposx=120;
	private int ballposy=350;
	private int ballxdir=-1;
	private int ballydir=-2;
	private  WallGenerate wall;
	
	public Gameplay( ) {
		wall =new WallGenerate(3,7);
		addKeyListener(this);
		setFocusable(true);
		setFocusTraversalKeysEnabled(false);
		timer= new Timer(delay ,this);
		timer.start();
		}
	public void paint(Graphics g)
	{
		// background
		g.setColor(Color.black);
		g.fillRect(1, 1, 692, 590);
		
		//draw wall
		wall.draw((Graphics2D) g);
		
		
		//borders
		g.setColor(Color.yellow);
		g.fillRect(0, 0, 3, 592);
		g.fillRect(0, 0, 692, 3);
		g.fillRect(691, 0, 3, 592);
		//score
		g.setColor(Color.gray);
		g.setFont(new Font("serif",Font.BOLD,25));
		g.drawString(""+score,500,30);
		
		
		// create paddle
		g.setColor(Color.green);
		g.fillRect(playerx, 550, 100,8);
		
		
		//create ball
		g.setColor(Color.red);
		g.fillOval(ballposx,ballposy, 20,20);
		
		if(totalBricks <=0) {
			play=false;
			ballxdir=0;
			ballydir=0;
			g.setColor(Color.yellow);
			g.setFont(new Font("serif",Font.BOLD,30));
			g.drawString("Game Over,scores :",190,30);
			g.setFont(new Font("serif",Font.BOLD,25));
			g.drawString("press enter to restart",230,350);
		}
		
		
		
		if(ballposy>570) {
			play=false;
			ballxdir=0;
			ballydir=0;
			g.setColor(Color.yellow);
			g.setFont(new Font("serif",Font.BOLD,30));
			g.drawString("Game Over,scores :",190,30);
			g.setFont(new Font("serif",Font.BOLD,25));
			g.drawString("press enter to restart",230,350);			
		}	
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		timer.start();
		if(play)
		{                                   //ball speed 8
			if(new Rectangle(ballposx,ballposy,20,20)
					.intersects(new Rectangle(playerx,550,100,8)))
			{
				ballydir =-ballydir;
			}
			A :for(int i=0; i<wall.wall.length; i++) {
				for(int j=0;j<wall.wall[0].length;j++) {
					if(wall.wall[i][j]>0) {
						int brickx= j*wall.brickwidth+80;
						int bricky =i*wall.brickheight+50;
						int brickwidth=wall.brickwidth;
						int brickheight=wall.brickheight;
						Rectangle rect =new Rectangle(brickx,bricky,
								brickwidth,brickheight);
						Rectangle ballRect=new Rectangle(ballposx,ballposy,20,20);
						Rectangle brickRect=rect;
						if(ballRect.intersects(brickRect)) {
							wall.setBrickvalue(0,i,j);
							totalBricks--;
							score +=5;
							if(ballposx +19 <= brickRect.x || ballposx +1 >=brickRect.x+
									brickRect.width) {
								ballxdir= -ballxdir;
							}else {
									ballydir =-ballydir;
								}
								break A;
							}
						}
				}
				
			}
			ballposx +=ballxdir;
			ballposy +=ballydir;
			if(ballposx<0)
			{
				ballxdir =-ballxdir;
			}
			if(ballposy<0)
			{
				ballydir =-ballydir;
			}
			if(ballposx>670)
			{
				ballxdir =-ballxdir;
			}
		}
		repaint();
		
	
}
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void keyPressed(KeyEvent e) 
	{
		if(e.getKeyCode()==KeyEvent.VK_RIGHT) {
			if(playerx >=600) {
				playerx=600;
			}else {
				moveRight();
			}
			}
		
	
	if(e.getKeyCode()==KeyEvent.VK_LEFT) {
		if(playerx <10) {
			playerx= 10;
		}else {
			moveLeft();
		}
		}
	if(e.getKeyCode()== KeyEvent.VK_ENTER) {
		if(!play) {
			play=true;
			ballposx=120;
			ballposy=350;
			ballxdir=-1;
			ballydir=-2;
			playerx=310;
			score=0;
			totalBricks=21;
			wall= new WallGenerate(3,7);
		}
	}
	}
	public void moveRight( ) {
		play=true;
		playerx+=20;
	}
	public void moveLeft( ) {
		play=true;
		playerx-=20;
	}
}
