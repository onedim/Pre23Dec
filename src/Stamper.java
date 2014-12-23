import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;



public class Stamper {

	public static void main(String[] args) {
		StampListener stm=new StampListener();
		
		JPanel canvasPanel=new Canvas();
		canvasPanel.addMouseListener(stm);
		canvasPanel.addMouseMotionListener((MouseMotionListener) stm);
		JFrame mainWindow=new JFrame("Sareni pravougaonik");
		mainWindow.setContentPane(canvasPanel);
		mainWindow.setSize(300, 300);
		mainWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainWindow.setVisible(true);
		

	}

	public static class StampListener implements MouseListener,MouseMotionListener{//klasa koja poziva
		private Color selectedColour=Color.RED;
		@Override
		public void mouseClicked(MouseEvent e) {//
			
			Component source=(Component)e.getSource();//dobavljamo kliknuti objekat
			Graphics g=source.getGraphics();//od kliknute komponete dobavljamo njen grafix objekat
			g.drawOval(e.getX(), e.getY(), 10, 10);
			
			
			
		}

		@Override
		public void mousePressed(MouseEvent e) {
			Component source=(Component)e.getSource();
			Graphics g=source.getGraphics();
			int colorPickerSize=30;
			
			
			if (e.getX()>= source.getHeight()-colorPickerSize){
				g.setColor(Color.RED);
			}
			
			
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

		@Override
		public void mouseDragged(MouseEvent e) {
			Component source=(Component)e.getSource();//dobavljamo kliknuti objekat
			Graphics g=source.getGraphics();//od kliknute komponete dobavljamo njen grafix objekat
			g.setColor(selectedColour);
			g.drawOval(e.getX(), e.getY(), 10, 10);
			g.setColor(Color.BLUE);
			g.fillOval(e.getX(), e.getY(), 15, 15);
			
		}

		@Override
		public void mouseMoved(MouseEvent e) {
			
		}

	}
	
	public static class Canvas extends JPanel{
		@Override
		public void paintComponent(Graphics g){
			int colorPickerSize=15;
			g.setColor(Color.RED);
			g.fillRect(colorPickerSize, getHeight()-colorPickerSize,colorPickerSize, colorPickerSize);
			
		}
		public void paintComponent(Graphics g){
			int colorPickerSize=15;
			g.setColor(Color.BLACK);
			g.fillRect(colorPickerSize, getHeight()-colorPickerSize,colorPickerSize, colorPickerSize);
			
		}
	}
	
}
