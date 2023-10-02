import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JCheckBox;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Week04_02 extends JPanel implements ItemListener {
    JCheckBox[] buttons = new JCheckBox[4];
    String[] it = {"엔진오일 교환", "자동변속기 오일교환", "에어콘 필터교환", "타이어 교환"};
    int[] prices = {45000, 80000, 30000, 100000};
    int money = 0;
    JLabel label;

    public Week04_02() {
        super();

        for (int i = 0; i < buttons.length; i++) {
            buttons[i] = new JCheckBox(it[i]);
            buttons[i].addItemListener(this);
            add(buttons[i]);
        }

        label = new JLabel("현재까지의 가격은 0원입니다.");
        add(label);
    }

    public static void main(String[] args) {
        JFrame f = new JFrame("CheckBoxDemo");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JComponent newContentPane = new Week04_02();
        newContentPane.setVisible(true);
        f.setContentPane(newContentPane);
        f.setSize(500, 200);
        f.setVisible(true);
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        
        int totalCost = 0;
        for (int i = 0; i < buttons.length; i++) {
            if (buttons[i].isSelected()) {
                totalCost += prices[i];
            }
        }
        label.setText("현재까지의 가격은 " + totalCost + "원입니다.");
    }
}