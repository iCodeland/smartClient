import java.awt.*;

import javax.swing.*;

public class Layout1 extends JFrame {

	Container contentPane ;
	
	int Width = 350;
	int Height = 210;
	
	Layout1 (){
		
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		contentPane = this.getContentPane();
		
		Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
		this.setBounds((int)((screenSize.getWidth()-Width)*0.5), (int)((screenSize.getHeight()-Height)*0.5), Width, Height);
				
		setLayout(null);
		
		JButton jbtin = new JButton("����");
		jbtin.setFont(new Font("�з���", Font.PLAIN, 30));
		jbtin.setBounds(40, 30, 100, 100);
		contentPane.add(jbtin);
		
		JButton jbtout = new JButton("�~�a");
		jbtout.setFont(new Font("�з���", Font.PLAIN, 30));
		jbtout.setBounds(200, 30, 100, 100);
		contentPane.add(jbtout);
		
		setVisible(true);
		
	}
	
}
