package Frame;
import java.awt.*;

import javax.swing.*;

public class Layout2 extends JFrame {

	Container contentPane;
	
	int Width = 200;
	int Height = 280;
	
	Layout2 () {
		

		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		contentPane = this.getContentPane();
		
		Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
		this.setBounds((int)((screenSize.getWidth()-Width)*0.5), (int)((screenSize.getHeight()-Height)*0.5), Width, Height);
				
		setLayout(null);
		
		JLabel jlbnum = new JLabel("人數");
		jlbnum.setFont(new Font("標楷體", Font.PLAIN, 30));
		jlbnum.setBounds(60, 10, 100, 23);
		contentPane.add(jlbnum);
		
		JTextField jtfnum = new JTextField();
		jtfnum.setBounds(40, 50, 100, 60);
		contentPane.add(jtfnum);
		
		JButton jbtcheck= new JButton("確定");
		jbtcheck.setFont(new Font("標楷體", Font.PLAIN, 20));
		jbtcheck.setBounds(40, 125, 100, 40);
		contentPane.add(jbtcheck);
		
		JButton jbtreturn= new JButton("上一步");
		jbtreturn.setFont(new Font("標楷體", Font.PLAIN, 20));
		jbtreturn.setBounds(40, 185, 100, 40);
		contentPane.add(jbtreturn);
		
		
		setVisible(true);
	}
	
	
}
