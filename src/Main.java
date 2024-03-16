import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class AddNum extends JFrame implements ActionListener {

    JLabel l1, l2, l3;
    JTextField t1, t2, t3;
    JButton B1;

    AddNum() {
        super("ADD Numbers"); // Set the title of the JFrame
        l1 = new JLabel("first number");
        l2 = new JLabel("second number");
        l3 = new JLabel("result");

        t1 = new JTextField(10);
        t2 = new JTextField(10);
        t3 = new JTextField(10);
        B1 = new JButton("add");

        // Add action listener to the button
        B1.addActionListener(this);

        setLayout(new FlowLayout(FlowLayout.LEFT, 150, 10));
        add(l1);
        add(t1);
        add(l2);
        add(t2);
        add(l3);
        add(t3);
        add(B1);
        setSize(400, 300);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == B1) {
            int x = Integer.parseInt(t1.getText());
            int y = Integer.parseInt(t2.getText());
            int sum = x + y;
            t3.setText(String.valueOf(sum));
        }
    }

    public static void main(String[] args) {
        AddNum obj = new AddNum();
    }
}
