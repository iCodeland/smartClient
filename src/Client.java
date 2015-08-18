import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.InetAddress;
import java.net.Socket;

public class Client extends Thread{
    private static Socket skt;	// �Ȥ�ݳs�uSocket����
    private InetAddress host;	// ���w�����A��IP
    private int port;			// ���w�����A�ݳs����
    private BufferedReader theInputStream;
    private PrintStream theOutputStream;
    private String message;		// ���A�ݶǦ^�����
//    private MainFrame chatBox;	// ��ѵ{������
 
    public Client(String ip, int port) {
        try {
            host = InetAddress.getByName(ip);
            this.port = port;
        }catch (IOException e) {
            System.out.print("Error: "+e+"\n");
        }
    }
//    public void setMessage(MainFrame box) {// ���wSocket���T���[���
//        chatBox = box;
//    }
    public String getMessage() { // ���o�T��
        return message;
    }
    public void run() {
        try {
        	System.out.print("Try to connect...\n");
        	skt = new Socket(host, port);
        	System.out.print("Connect Success!\n");	
            theInputStream = new BufferedReader(new InputStreamReader(skt.getInputStream()));
            theOutputStream = new PrintStream(skt.getOutputStream());
            while((message = theInputStream.readLine()) != null) { // Ū����ưj��
//                chatBox.update();
            }
            if(message == null){
                skt.close();
                System.out.print("Disconnect!\n");
//                chatBox.setGUI(true);
            }
        }
        catch (IOException e){
        	System.out.print("Error: "+e+"\n");
        }
    }
    /*
    private void startClient(int port,String IP){	// �Ȥ��
        clientSkt = new Client(IP, port);
        clientSkt.setMessage(this);
        setGUI(false);
        clientSkt.start();
    } 
    
    public void update() {    // ���o�T��
        String inMessage,Str;
    	if(isServer){
    		inMessage = serverSkt.getMessage();
    		Str=(inMessage!=null) ? inMessage:jtfIn.getText();
        	jtfIn.setText(Str);	//<<<<<<<<<<<<<<<<
        }else{
    		inMessage = clientSkt.getMessage();
    		Str=(inMessage!=null) ? inMessage:jtfIn.getText();
        	jtfIn.setText(Str);	//<<<<<<<<<<<<<<<<
        }
    }
     */
    public void dataOutput(String data){
    	theOutputStream.println(data);
    }
}