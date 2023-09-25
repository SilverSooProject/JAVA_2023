import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.io.*;

import javax.imageio.ImageIO;
import javax.swing.*;

public class Week03_03 extends JFrame {
	BufferedImage img = null;
	int img_x = 100, img_y = 30;

	class MyPanel extends JPanel {

		public MyPanel() {
			try {
				img = ImageIO.read(new File("cat.png"));

			} catch (IOException e) {
				System.out.println("no image");
				System.exit(1);
			}
			addKeyListener(new KeyListener() {
				public void keyPressed(KeyEvent e) {
					int keycode = e.getKeyCode();
					switch (keycode) {
					case KeyEvent.VK_UP:	img_y -= 10;	break;
					case KeyEvent.VK_DOWN:	img_y += 10;	break;
					case KeyEvent.VK_LEFT:	img_x -= 10;	break;
					case KeyEvent.VK_RIGHT:	img_x += 10;	break;
					}
					repaint();
				}
				public void keyReleased(KeyEvent arg0) {		}
				public void keyTyped(KeyEvent arg0) {			}

			});
			this.requestFocus();
			setFocusable(true);
		}

		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.drawImage(img, img_x, img_y, null);

		}
	}

	public Week03_03() {
		
		add(new MyPanel());
		JPanel p = new JPanel();
		JButton b1 = new JButton("LEFT");
		b1.addActionListener(e->{
			img_x -= 10; 
			repaint();
		});
		JButton b2 = new JButton("RIGHT");
		b2.addActionListener(e->{
			img_x += 10;
			repaint(); 
		});
		p.add(b1);
		p.add(b2);
		
		add(p, "South");
		setVisible(true);
		setSize(350, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		Week03_03 s = new Week03_03();
	}
}