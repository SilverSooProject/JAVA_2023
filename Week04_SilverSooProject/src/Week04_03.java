import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

class MyFrame extends JFrame{
	private JPanel p;
	private JLabel l1;
	private JLabel l2;
	
	public MyFrame() {
				
		p = new JPanel();
		l1 = new JLabel();
		l2 = new JLabel("김은수");
		ImageIcon icon = new ImageIcon("한교동.jpg");
		l1.setIcon(icon);
		
		p.add(l1);
		p.add(l2);

		add(p);
		
		setSize(1000, 1000);
		setTitle("BusinessCard");
		setVisible(true);
	}
}

public class Week04_03 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyFrame F = new MyFrame(); 
	}
}