import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class JButton2 extends JFrame implements ActionListener {
	private JTextField input;
	public JButton2() {
		// 텍스트 객체 생성
		input = new JTextField(10);
		
		//	이미지 객체 생성
		ImageIcon apple = new ImageIcon("image/apple.jpg");
		ImageIcon banana = new ImageIcon("image/banana.jpg");
		ImageIcon persimmom = new ImageIcon("image/persimmom.jpg");
		ImageIcon pear= new ImageIcon("image/pear.jpg");
		ImageIcon grape = new ImageIcon("image/grape.jpg");
		
		// 버튼 객체 생성
		JButton jb1 = new JButton("사과",apple);
		JButton jb2 = new JButton("바나나",banana);
		JButton jb3 = new JButton("감",persimmom);
		JButton jb4 = new JButton("배",pear);
		JButton jb5 = new JButton("포도",grape);
		
		// 컨테이너 생성.
		Container ct = getContentPane();
		
		// GUI 배치 관리자 생성.
		ct.setLayout(new GridLayout(3,2));
		
		// 컨테이너에 버튼 추가
		ct.add(jb1);
		ct.add(jb2);
		ct.add(jb3);
		ct.add(jb4);
		ct.add(jb5);
		
		// 3. 컴퓨넌트에 리스너 등록.
		jb1.addActionListener(this);
		jb2.addActionListener(this);
		jb3.addActionListener(this);
		jb4.addActionListener(this);
		jb5.addActionListener(this);
		
		// 화면에 보이기 250,300
		setTitle("JButton Test2");
		setSize(250,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
		// 4. 이벤트 처리
		@Override
		public void actionPerformed(ActionEvent e) {
			// 눌러진 버튼 객체 라벨 출력
			input.setText(e.getActionCommand());
	}
}
public class JButtonTest2 {

	public static void main(String[] args) {
		new JButton2();

	}

}
