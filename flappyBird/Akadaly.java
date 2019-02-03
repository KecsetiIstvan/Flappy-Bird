package flappyBird;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

//FONTOS:  BEMENETI Y 100 és 550 KÖZÖTTI KELL LEGYEN
//JÓHA:	   BEMENETI X-EK KÖZÖTT VAN KB 400

public class Akadaly extends JPanel {
private static final long serialVersionUID = 1L;
	int ax;
	int ay;
	public Akadaly(int x, int y){
		this.setLayout(null);
		this.ax=x;
		this.ay=y;
		this.setSize(168,1400);
		this.setLocation(ax,-y);
		this.add(new Fentcso());
		this.add(new Lentcso());
		
	}
	public class Fentcso extends JPanel{
	private static final long serialVersionUID = 1L;
		private BufferedImage img;
		public Fentcso() {
			try {
				img = ImageIO.read(getClass().getResourceAsStream("/fent.jpg"));
			} catch (IOException e) {
				e.printStackTrace();
			}
			this.setSize(168,600);
			this.setLocation(0,0);
		}
		@Override
		public void paint(Graphics g) {
		    g.drawImage(img, 0, 0, img.getWidth(),img.getHeight(),null);
		}
	
	}
	public class Lentcso extends JPanel{
	private static final long serialVersionUID = 1L;
		private BufferedImage img;
		public Lentcso() {
			try {
				img = ImageIO.read(getClass().getResourceAsStream("/lent.jpg"));
			} catch (IOException e) {
				e.printStackTrace();
			}
			this.setSize(168,600);
			this.setLocation(0,800);
		}
		@Override
		public void paint(Graphics g) {
		    g.drawImage(img, 0, 0, img.getWidth(),img.getHeight(),null);
		}
	}
	public int getAx() {
		return ax;
	}
	public int getAy() {
		return ay;
	}
	public void setAx(int ax) {
		this.ax = ax;
	}
	public void setAy(int ay) {
		this.ay = ay;
	}
	public void upedate() {
		this.setLocation(ax,-ay);
	}
}
