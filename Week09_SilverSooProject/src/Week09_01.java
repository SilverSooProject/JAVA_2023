import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Week09_01 extends JFrame{
	private JLabel l;
	private JButton b1, b2;
	
	Thread t;
	
	class Counter extends Thread{
		public void run() {
			for(int i=0;i<=100;i++) {
				try {
					Thread.sleep(1000);
				}catch(InterruptedException e) {
					return;
				}
				l.setText(i+" ");
			}
		}
	}
	public Week09_01() {
		setTitle("카운트다운");
		setSize(400, 150);
		setVisible(true);
		getContentPane().setLayout(null);
		
		l=new JLabel("0");
		l.setBounds(0, 0, 384, 111);
		l.setFont(new Font("Serif", Font.BOLD, 100));
		getContentPane().add(l);
		
		b1=new JButton("카운트 중지");
		b1.setBounds(200, 25, 150, 23);
		getContentPane().add(b1);
		
		b2=new JButton("카운트 다시 시작");
		b2.setBounds(200, 50, 150, 23);
		getContentPane().add(b2);
		
		b1.addActionListener(e->t.interrupt());
		getContentPane().add(b1);
		t=new Counter();
		t.start();
		
		b2.addActionListener(e->{
			if(!t.isAlive()) {
				t=new Counter();
				t.start();
			}
		});
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Week09_01 w=new Week09_01();

	}

}
