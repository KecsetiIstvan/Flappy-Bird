package flappyBird;

import java.awt.*;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class JatekTer extends JFrame{
	private static final long serialVersionUID = 1L;
	float speed;
	Boolean fel;
	int playerX;
	int playerY;
	int playerWidth;
	int playerHeight;
	Jatekos player;
	Akadaly akadaly;
	JLabel pontTar;
	public JatekTer() {
		pontTar=new JLabel("0");
		Font f=new Font("Arial", Font.BOLD, 72);
		pontTar.setFont(f);
		pontTar.setLocation(900,300);
		pontTar.setSize(200,100);
		this.add(pontTar);
		this.setLayout(null);
		this.setBackground(Color.BLUE);
		playerX=200;
		playerY=150;
		playerWidth=80;
		playerHeight=50;
		speed=0.3f;
		fel=false;
		
		MozgasKezelo mk=new MozgasKezelo(this);
		
		this.addKeyListener(mk);
		this.setExtendedState(Frame.MAXIMIZED_BOTH);
		this.setUndecorated(true);
		this.setVisible(true);
		
	}
	public Boolean getFel() {
		return fel;
	}
	public void setFel(Boolean fel) {
		this.fel = fel;
	}
	public float getSpeed() {
		return speed;
	}
	public void setSpeed(float speed) {
		this.speed = speed;
	}
	public int getPlayerY() {
		return playerY;
	}
	public int getPlayerX() {
		return playerX;
	}
	public int getPlayerWidth() {
		return playerWidth;
	}
	public int getPlayerHeight() {
		return playerHeight;
	}
	public void setPlayerY(int startY) {
		this.playerY = startY;
	}
	public void setPlayerWidth(int playerWidth) {
		this.playerWidth = playerWidth;
	}
	public void setPlayerHeight(int playerHeight) {
		this.playerHeight = playerHeight;
	}
	public void setPont(int pont) {
		pontTar.setText(""+pont);
	}
}
