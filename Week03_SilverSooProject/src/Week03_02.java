import java.awt.event.*;
import javax.swing.*;

class Myframe extends JFrame
{
	JButton button;
	JTextField a1;
	JTextField a2;
	public Myframe()
	{				
		JPanel panel1=new JPanel();
		JLabel label=new JLabel("마일을 입력하시오");
		a1=new JTextField(10); 
		a2=new JTextField(10);
		button=new JButton("변환");
		button.addActionListener(new MyListener());
		
		a1.setText("1"); //초기값 입력
		
		a2.setEditable(false);
		panel1.add(label);
		panel1.add(a1);
		panel1.add(new JLabel("->"));
		panel1.add(a2);
		panel1.add(button);
		this.add(panel1);

		setVisible(true);
		
		setSize(500,100);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Mile->Km");
	}
	
	private class MyListener implements ActionListener{
		public void actionPerformed(ActionEvent e)
		{
			if(e.getSource()== button)
			{
				int a=Integer.parseInt(a1.getText());
				double k=a*1.609344;
				a2.setText(k+" km");
			}
		}
	}
}

public class Week03_02 {
	public static void main(String[] arge)
	{
		Myframe f=new Myframe();
	}
}