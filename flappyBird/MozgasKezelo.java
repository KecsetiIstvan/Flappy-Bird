package flappyBird;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class MozgasKezelo implements KeyListener {
	JatekTer jatek;
	public MozgasKezelo(JatekTer jatek) {
		this.jatek=jatek;
	}
	@Override
	public void keyPressed(KeyEvent e) {
		if(e.getKeyCode()==32) {
			jatek.setFel(true);
		}//szpéjsz
		if(e.getKeyCode()==27) {
			System.exit(0);
		}//eszk
		
	}	
	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
}
