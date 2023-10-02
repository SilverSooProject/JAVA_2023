import java.awt.EventQueue;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

class Person{
	String name;
	String tel;
	String address;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel=tel;
	}
	public String getAddress() {
		return address;
	}
	public void setAdrress(String address) {
		this.address=address;
	}
	
	public Person(String name, String tel, String address) {
		super();
		this.name=name;
		this.tel=tel;
		this.address=address;
	}
}
public class Week04_01 extends JFrame{
	ArrayList<Person> list = new ArrayList<>();
	private JPanel contentPane;
	private JTextField tf1;
	private JTextField tf2;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Week04_01 f = new Week04_01();
					f.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public Week04_01() {
		setTitle("Address Book");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 360, 252);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel1 = new JLabel("이름");
		lblNewLabel1.setBounds(12, 10, 57, 15);
		contentPane.add(lblNewLabel1);
		
		JLabel lblNewLabel2 = new JLabel("전화번호");
		lblNewLabel2.setBounds(12, 42, 57, 15);
		contentPane.add(lblNewLabel2);
		
		tf1 = new JTextField();
		tf1.setBounds(81, 7, 243, 21);
		contentPane.add(tf1);
		tf1.setColumns(10);
		
		tf2 = new JTextField();
		tf2.setBounds(81, 39, 243, 21);
		contentPane.add(tf2);
		tf2.setColumns(10);
		
		JLabel lblNewLabel3 = new JLabel("주소");
		lblNewLabel3.setBounds(12, 79, 57, 15);
		contentPane.add(lblNewLabel3);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(12, 104, 312, 67);
		contentPane.add(textArea);
		
		JButton btnNewButton1 = new JButton("저장");
		btnNewButton1.setBounds(12, 181, 97, 23);
		contentPane.add(btnNewButton1);
		btnNewButton1.addActionListener(e->{
			String name = tf1.getText();
			String tel = tf2.getText();
			String address = textArea.getText();
			list.add(new Person(name, tel, address));
		});
		
		JButton btnNewButton2 = new JButton("검색");
		btnNewButton2.setBounds(117, 181, 97, 23);
		contentPane.add(btnNewButton2);
		btnNewButton2.addActionListener(e->{
			String name = tf1.getText();
			for(Person p : list) {
				if(p.getName().equals(name)) {
					tf2.setText(p.getTel());
					textArea.setText(p.getAddress());
				}
			}
		});
		
		JButton btnNewButton3 = new JButton("종료");
		btnNewButton3.setBounds(117, 181, 97, 23);
		contentPane.add(btnNewButton3);
		btnNewButton3.addActionListener(e->{
			System.exit(0);
		});
	}
}