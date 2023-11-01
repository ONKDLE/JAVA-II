import java.awt.*;
import java.io.*;
import java.awt.event.*;
import javax.swing.*;

// 1. 처리할 이벤트 종류 결정. - 버튼
// 2. 이벤트에 적합한 이벤트 리스너 인터페이스를 사용하여 클래스 작성
class GUI2 extends JFrame implements ActionListener {
	// 속성으로 텍스트 에어리어와 텍스트 필드를 선언.
	
	private JTextField f_name;
	private JTextArea contents;
	
	// 생성자
	public GUI2() {
		JButton jb = new JButton("파일 읽어오기");
		// 20자 입력 가능한 텍스트 필드 객체 생성.
		f_name = new JTextField("파일이름을 입력하세요",20);
		// 10중 20칸 텍스트 에어리어 객체 생성.
		contents = new JTextArea("파일 내용을 입력하세요",10,20);

		
		// 컨테이너 생성.
		Container ct = getContentPane();
				
		// FlowLayout 설정
		ct.setLayout(new FlowLayout());
				
		// 패널 생성
		JPanel pl = new JPanel();

		// 패널에 파일명,버튼 추가
		pl.add(f_name);
		pl.add(jb);
		
		// 패널과 output을 컨테이너에 추가
		ct.add(pl);
		ct.add(contents);
		
		// 3. 컴퓨넌트에 리스너 등록.
		jb.addActionListener(this);
		
		// 화면에 보이도록... 사이즈:500,300
		setTitle("GUI Test2");
		setSize(500,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
		private class EventProcess implements ActionListener {
		public void actionPerformed(ActionEvent ae) {
			try {
				// 입출력을 위한 예외 처리
				// 파일 이름으로 출력 객체 생성.
				String s = f_name.getText();
				FileInputStream fis = new FileInputStream(s);
				DataInputStream dis = new DataInputStream(fis);
				
				// 텍스트 에어리어의 내용을 파일로 출력
				contents.setText(dis.readUTF());
				// 파일 닫기
				fis.close();
				System.out.print(s + "파일을 읽어오기");
			}
			catch(Exception e) {
			System.out.print("파일이 존재하지 않습니다.");
			}
		}
	}
}
public class GUITest1_2 {
	public static void main(String[] args) {
		new GUI2();

		}
	}
