package chap15_1027_afterMidtTerm;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JTextField;

class JCheckBox1 extends JFrame implements ItemListener{ //<<ItemListener 사용
	JTextField jtf;
	public JCheckBox1() {
		jtf = new JTextField(10);
		JCheckBox jb1 = new JCheckBox("JSP");
		JCheckBox jb2 = new JCheckBox("PHP");
		JCheckBox jb3 = new JCheckBox("ASP");
		JCheckBox jb4 = new JCheckBox("Servlet");
		
		Container ct = getContentPane();
		ct.setLayout(new FlowLayout());
		ct.add(jb1);
		ct.add(jb2);
		ct.add(jb3);
		ct.add(jb4);
		ct.add(jtf);
		jb1.addItemListener(this);
		jb2.addItemListener(this);
		jb3.addItemListener(this);
		jb4.addItemListener(this);
		
		
		setTitle("checkBox");
		setSize(250,100);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
	}
	@Override
	public void itemStateChanged(ItemEvent ae) {
		jtf.setText(((JCheckBox)ae.getItem()).getText()); //텍스트필드 안에 체크박스 내용 넣기
	}
}
public class JCheckBoxTest1 {
	public static void main(String[] args) {
		new JCheckBox1();
	}

}
