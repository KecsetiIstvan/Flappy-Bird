package flappyBird;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class Jatekos extends JPanel{
	private static final long serialVersionUID = 1L;
	int px;
	int py;
	int pw;
	int ph;
	private BufferedImage flappy;
	public Jatekos(int x, int y, int width,int height)  {
		py=y;
		px=x;
		pw=width;
		ph=height;
		this.setBounds(px,py,pw,ph);
		try {
			flappy = ImageIO.read(getClass().getResourceAsStream("flappy.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	public int getPh() {
		return ph;
	}
	@Override
	public void paint(Graphics g) {
	    g.drawImage(flappy, 0, 0, flappy.getWidth(),flappy.getHeight(),null);
	}
	public void upedate(){
		this.setLocation(px,py);
	}
	public int getPy() {
		return py;
	}
	public int getPx() {
		return px;
	}
	public void setPy(int py) {
		this.py = py;
	}
	public int getPw() {
		return pw;
	}
	
	
}
