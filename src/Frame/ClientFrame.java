package Frame;
import java.awt.*;

import javax.swing.*;

public class ClientFrame extends JFrame {

	Container contentPane;
	int Width = 300;
	int Height = 350;
	
	public ClientFrame () {
		Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
		this.setBounds((int)((screenSize.getWidth()-Width)*0.5), (int)((screenSize.getHeight()-Height)*0.5), Width, Height);	
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		this.setTitle("客戶端連線");
		
		setLayout(null);
		contentPane = this.getContentPane();
		
		JLabel jplIP = new JLabel("IP  :");
		jplIP.setBounds(65, 15, 100, 23);
		jplIP.setFont(new Font("標楷體", Font.PLAIN, 20));
		contentPane.add(jplIP);
		
		JLabel jplPORT = new JLabel("PORT :");
		jplPORT.setBounds(55, 55, 100, 23);
		jplPORT.setFont(new Font("標楷體", Font.PLAIN, 20));
		contentPane.add(jplPORT);
				
		JTextField jtfIP = new JTextField("127.0.0.1");
		jtfIP.setBounds(120, 15, 120, 25);
		contentPane.add(jtfIP);
		
		JTextField jtfPORT = new JTextField("8765");
		jtfPORT.setBounds(120, 55, 120, 25);
		contentPane.add(jtfPORT);
		
		JButton jbtcon = new JButton("Connection");
		jbtcon.setBounds(70, 260, 150, 23);
		jbtcon.setFont(new Font("標楷體", Font.PLAIN, 20));
		contentPane.add(jbtcon);
		
		JTextArea jta = new JTextArea();
		
		JScrollPane jsp = new JScrollPane(jta);
		jsp.setBounds(25, 90, 240, 150);
		contentPane.add(jsp);
		
		this.setVisible(true);
	}
}
