
import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.xml.bind.Marshaller.Listener;
public class Pre23Dec {

	public static void main(String[] args) {
		Canvas canvasPanel=new Canvas();
		canvasPanel.addMouseListener(listener);//za upotrebu misa unutar canvas panela
		
		JFrame mainWindow=new JFrame("Sareni pravougaonik");
		mainWindow.setContentPane(canvasPanel);
		mainWindow.setSize(300, 300);
		mainWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainWindow.setVisible(true);
	}
	public static class RepaintListener implements MouseListener{//klasa koja poziva

		@Override
		public void mouseClicked(MouseEvent e) {//
			RepaintListener listener=new RepaintListener();
			Component source=(Component)e.getSource();
			source.repaint();
			
		}

		@Override
		public void mousePressed(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseReleased(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseEntered(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseExited(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}
		
	}
	public static class Canvas extends JPanel{
		@Override
		public void paintComponent(Graphics g){
			super.paintComponent(g);
			
			//g.setColor(new Color(0.3f,0.2f,0.9f));//miksanje vlastitih boja
			//g.setColor(new Color((int)Math.random()*255,(int)Math.random()*255,(int)Math.random()*255));//random int boja
			
			g.setColor(new Color((float)Math.random(),(float)Math.random(),(float)Math.random()));
			
			g.fillRect(10, 10, getWidth()-20,getHeight()-20);//crtanje ispunjenog pravougla
		}

	
		
	}

}
