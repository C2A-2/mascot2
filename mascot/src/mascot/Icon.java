package mascot;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Icon extends JFrame implements MouseMotionListener, MouseListener{
	
	ImageIcon icon2 = new ImageIcon("zako.png");
	JLabel label2 = new JLabel(icon2);
	
	int y=0;
	
	Icon() {
		
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
		//GraphicsDevice gd = ge.getDefaultScreenDevice();
		//gd.setFullScreenWindow(frame);
		// 3, 画面のウィンドウサイズ指定はこの位置で。
		setSize(1920, 1080);
		getContentPane().setLayout(null);
		// 4, 回答の原因:aの対策
		//label指定
		label2.setBounds(950, 350, 306, 150);
		// 枠を外す。
        setUndecorated(true);
        // 背景色を透明にする。
        setBackground(new Color(0, 0, 0, 0));
        // タスクバーのアイコンを非表示
        setType(Type.UTILITY) ;
		// 5, 回答の原因:bの対策
		getContentPane().add(label2); //引数label
		addMouseMotionListener(this);
		addMouseListener(this);
	}
	
	

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO 自動生成されたメソッド・スタブ
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO 自動生成されたメソッド・スタブ
		new Pulldown().setVisible(true);
		new Search().setVisible(true);
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO 自動生成されたメソッド・スタブ
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO 自動生成されたメソッド・スタブ
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO 自動生成されたメソッド・スタブ
		label2.setIcon(null);
		
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO 自動生成されたメソッド・スタブ
		
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO 自動生成されたメソッド・スタブ
		
	}

}
