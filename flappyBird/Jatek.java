package flappyBird;

import java.awt.Component;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import javax.swing.JOptionPane;
public class Jatek {

	public static void main(String[] args) throws InterruptedException {
		JatekTer screen=new JatekTer();
		Jatekos player=new Jatekos(screen.getPlayerX(),screen.getPlayerY(),screen.getPlayerWidth(),screen.getPlayerHeight());
		screen.add(player);
		screen.repaint();
		Boolean halal=false;
		int fel=0;
		int akadalyKezdoX=1300;
		Random randy=new Random();
		int akadalyY=randy.nextInt(450)+100;
		Akadaly egy=new Akadaly(1200,akadalyY);
		akadalyY=randy.nextInt(450)+100;
		Akadaly ketto=new Akadaly(1700,akadalyY);
		akadalyY=randy.nextInt(450)+100;
		Akadaly harom=new Akadaly(2200,akadalyY);
		screen.add(egy);
		screen.add(ketto);
		screen.add(harom);
		screen.repaint();
		int pontok=0;
		while(!halal) {			
			if(screen.getFel() && fel <=10) {
				player.setPy(player.getPy()-12);
				fel++;
				}
			else {
				fel=0;
				screen.setFel(false);
				player.setPy(player.getPy()+6);
			}
			egy.setAx(egy.getAx()-10);
			if(egy.getAx()+168<=0) {
				akadalyY=randy.nextInt(450)+100;
				egy.setAx(akadalyKezdoX);egy.setAy(akadalyY);
			}
			ketto.setAx(ketto.getAx()-10);
			if(ketto.getAx()+ketto.getWidth()<=0) {
				akadalyY=randy.nextInt(450)+100;
				ketto.setAx(akadalyKezdoX);ketto.setAy(akadalyY);
			}
			harom.setAx(harom.getAx()-10);
			if(harom.getAx()+ketto.getWidth()<=0) {
				akadalyY=randy.nextInt(450)+100;
				harom.setAx(akadalyKezdoX);harom.setAy(akadalyY);
			}
			if(egy.getAx()+player.getPw()==200) {
				pontok++;
				screen.setPont(pontok);
			}
			if(ketto.getAx()+player.getPw()==200) {
				pontok++;
				screen.setPont(pontok);
			}
			if(harom.getAx()+player.getPw()==200 ) {
				pontok++;
				screen.setPont(pontok);
			}
			
			if(player.getPy()+player.getPh()>=screen.getHeight()) halal=true;
			if(player.getPy()<=0) halal=true;
			
			if(player.getPx()>=egy.  getAx() && player.getPx()+player.getPw()<=egy.  getAx()+egy.  getWidth() &&
			   player.getPy() <= (egy.getAy()-600)*-1 ) halal=true;
			
			if(player.getPx()>=egy.  getAx() && player.getPx()+player.getPw()<=egy.  getAx()+egy.  getWidth() &&
				player.getPy()+player.getPh() >= (egy.getAy()-800)*-1 ) halal=true;
			
			if(player.getPx()>=ketto.getAx() && player.getPx()+player.getPw()<=ketto.getAx()+ketto.getWidth() &&
				player.getPy() <= (ketto.getAy()-600)*-1) halal=true;
			if(player.getPx()>=ketto.getAx() && player.getPx()+player.getPw()<=ketto.getAx()+ketto.getWidth() &&
				player.getPy()+player.getPh() >= (ketto.getAy()-800)*-1) halal=true;
			if(player.getPx()>=harom.getAx() && player.getPx()+player.getPw()<=harom.getAx()+harom.getWidth() &&
				player.getPy() <= (harom.getAy()-600)*-1) halal=true;
			if(player.getPx()>=harom.getAx() && player.getPx()+player.getPw()<=harom.getAx()+harom.getWidth() &&
				player.getPy()+player.getPh() >= (harom.getAy()-800)*-1) halal=true;
			
			egy.upedate();
			ketto.upedate();
			harom.upedate();
			player.upedate();
			TimeUnit.MILLISECONDS.sleep((long) (screen.getSpeed()*100));
		}
		Component frame = null;
		JOptionPane.showMessageDialog(frame,   "  Meghaltál :( \n  Dekár érted :( \n  Azért jó játék volt!  Pontszámod: "+pontok, "Game Over :(", JOptionPane.PLAIN_MESSAGE);
		System.exit(0);
	}
}
        