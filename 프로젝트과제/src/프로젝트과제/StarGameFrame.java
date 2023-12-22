import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class StarGameFrame extends JFrame {
	private static StarGameFrame instance;
    private JLabel l1, c;

    public StarGameFrame() {
        instance = this;

        setTitle("하트게임");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        GamePanel p = new GamePanel();
        setContentPane(p);
        
        ImageIcon icon = new ImageIcon("hangyodon.png");
        Image icon2 = icon.getImage().getScaledInstance(500, 100, Image.SCALE_SMOOTH);
        icon = new ImageIcon(icon2);
        c = new JLabel(icon);
        c.setBounds(0, 360, 500, 100);
        p.add(c);

        setSize(500, 500);
        setVisible(true);
    }
    
    public static StarGameFrame getInstance() {
        if (instance == null) {
            instance = new StarGameFrame();
        }
        return instance;
    }
    
    public static void main(String[] args) {
        new StarGameFrame();
    }
}

class GamePanel extends JPanel {
    private int starCount = 0;

    public GamePanel() {
        setLayout(null);

        addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                new starThread(e.getX(), e.getY()).start();
            }
        });
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        ImageIcon backgroundIcon = new ImageIcon("bg.png");
        Image backgroundImage = backgroundIcon.getImage().getScaledInstance(getWidth(), getHeight(), Image.SCALE_SMOOTH);
        backgroundIcon = new ImageIcon(backgroundImage);
        g.drawImage(backgroundIcon.getImage(), 0, 0, this);
    }

    class starThread extends Thread {
        private JLabel star;

        public starThread(int starX, int starY) {
            ImageIcon originalIcon = new ImageIcon("star.png");
            Image originalImage = originalIcon.getImage();
            Image scaledImage = originalImage.getScaledInstance(50, 50, Image.SCALE_SMOOTH);
            ImageIcon scaledIcon = new ImageIcon(scaledImage);

            star = new JLabel(scaledIcon);
            star.setSize(50, 50);
            star.setLocation(starX, starY);
            add(star);
            repaint();

            return;
        }

        public void run() {
            while (true) {
                int x = star.getX();
                int y = star.getY() + 5;

                if (y>360) {
                	remove(star);
                    repaint();
                    
                    starCount++;
                    System.out.println("POINT: "+starCount);
                    if(starCount>=15) {
                    	System.out.println("GAME OVER!");
                    	StarGameFrame.getInstance().dispose();
                    	System.exit(0);
                    }
                    return;
                }
                star.setLocation(x, y);
                repaint();
                try {
                    sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
