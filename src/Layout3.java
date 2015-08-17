import java.awt.*;

import javax.swing.*;

public class Layout3 extends JFrame {

Container contentPane;
	
	int Width = 240;
	int Height = 260;
	
	Layout3(){
		
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		contentPane = this.getContentPane();
		
		Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
		this.setBounds((int)((screenSize.getWidth()-Width)*0.5), (int)((screenSize.getHeight()-Height)*0.5), Width, Height);
				
		setLayout(null);
		
		JButton jbtin= new JButton("��");
		jbtin.setFont(new Font("�з���", Font.PLAIN, 25));
		jbtin.setBounds(30, 30, 60, 40);
		contentPane.add(jbtin);
		
		JButton jbt= new JButton("�H");
		jbt.setFont(new Font("�з���", Font.PLAIN, 25));
		jbt.setBounds(130, 30, 60, 40);
		contentPane.add(jbt);
		
		JLabel jlbphone = new JLabel("�q�� :");
		jlbphone.setFont(new Font("�з���", Font.PLAIN, 25));
		jlbphone.setBounds(20, 100, 100, 23);
		contentPane.add(jlbphone);
		
		JTextField jtfphone = new JTextField();
		jtfphone.setBounds(105, 100, 110, 25);
		contentPane.add(jtfphone);
		
		JButton jbttake= new JButton("����");
		jbttake.setFont(new Font("�з���", Font.PLAIN, 25));
		jbttake.setBounds(65, 145, 100, 40);
		contentPane.add(jbttake);
		
		setVisible(true);
		
	}
}
