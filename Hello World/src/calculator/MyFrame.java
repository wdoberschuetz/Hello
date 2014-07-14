package calculator;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class MyFrame extends JFrame{

	JPanel firstPanel;
	
	
	public MyFrame(){
		
		createFrameOne();
		
	}
	
	public void createFrameOne(){
		
		JFrame firstFrame = new JFrame();
		firstFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		firstFrame.setVisible(true);	
		
		//		add.firstFrame(firstPanel);
//		JPanel firstPanel = new JPanel();
//		firstPanel.setSize(300, 300);
//		firstPanel.setVisible(true);
		
		
	}//createFrameOne
	
	
}

