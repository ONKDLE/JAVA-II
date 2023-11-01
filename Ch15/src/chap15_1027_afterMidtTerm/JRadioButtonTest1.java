package chap15_1027_afterMidtTerm;

import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

class JRadioButton1 extends JFrame implements ActionListener{
	JLabel jl;//결과
	JRadioButton[] jr=new JRadioButton[5]; //라디오 배열
	String[] hobby= {"걷기","등산","골프","스킨스쿠버","패러글라이딩"};
	JCheckBox[] jc=new JCheckBox[5]; //체크박스 배열
	String[] age= {"20대","30대","40대","50대","60대"};
	public JRadioButton1() {
		jl=new JLabel();
		JLabel jl1=new JLabel("당신의 취미는?");
		JLabel jl2=new JLabel("당신의 나이는?");
		
		JPanel hobbyPanel = new JPanel(); //라벨이랑 붙일 panel
		JPanel agePanel = new JPanel();
		
		ButtonGroup bg = new ButtonGroup();
		
		//배열과 체크박스, 라디오버튼 합쳐서 panel에 각각 추가
		for(int i=0; i<jr.length; i++) {
			jr[i]=new JRadioButton(hobby[i]);
			jc[i]=new JCheckBox(age[i]);
			hobbyPanel.add(jr[i]);
			agePanel.add(jc[i]);
			
			jc[i].addActionListener(this); //배열 객체에 리스너 등록
			bg.add(jc[i]); //버튼그룹에 객체추가
		}
		
		Container ct= getContentPane();
		ct.setLayout(new GridLayout(3,1));
		
		JPanel jp1=new JPanel();
		jp1.add(jl1);
		jp1.add(hobbyPanel);
		JPanel jp2=new JPanel();
		jp2.add(jl2);
		jp2.add(agePanel);
		
		
		JPanel jp3 = new JPanel();
		jp3.add(jl);
		ct.add(jp1);
		ct.add(jp2);
		ct.add(jp3);
		
		setTitle("checkBox");
		setSize(380,200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent ae) {
		String s="당신의 취미 : ";
		for(int i=0; i<5; i++) {
			if(jr[i].isSelected()==true) {
				s=s+hobby[i]+" ";
			}
		}
		s=s+" 당신의 나이 : ";
		jl.setText(s+ae.getActionCommand());
	}
}
public class JRadioButtonTest1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new JRadioButton1();
	}

}
