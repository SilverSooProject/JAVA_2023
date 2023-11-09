import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class CarGame extends JFrame{
	class MyThread extends Thread{
		private JLabel l;
		private int x, y;
		
		public MyThread(String fname, int x, int y) {
			this.x=x;
			this.y=y;
			l=new JLabel();
			l.setIcon(new ImageIcon(fname));
			l.setBounds(x, y, 100, 100);
			add(l);
		}
		public void run() {
			for(int i=0;i<200;i++) {
				x+=10*Math.random();
				l.setBounds(x, y, 100, 100);
				repaint();
				try {
					Thread.sleep(100);
				}catch(InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
	public CarGame() {
		setTitle("CarRace");
		setSize(600, 200);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(null);
		
		(new MyThread("car1.gif", 100, 0)).start();
		(new MyThread("car2.gif", 100, 50)).start();
		(new MyThread("car3.gif", 100, 100)).start();
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CarGame t=new CarGame();
	}

}
