import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.InetAddress;
import java.net.Socket;

public class Client extends Thread{
    private static Socket skt;	// 客戶端連線Socket物件
    private InetAddress host;	// 指定的伺服端IP
    private int port;			// 指定的伺服端連接埠
    private BufferedReader theInputStream;
    private PrintStream theOutputStream;
    private String message;		// 伺服端傳回的資料
//    private MainFrame chatBox;	// 聊天程式介面
 
    public Client(String ip, int port) {
        try {
            host = InetAddress.getByName(ip);
            this.port = port;
        }catch (IOException e) {
            System.out.print("Error: "+e+"\n");
        }
    }
//    public void setMessage(MainFrame box) {// 指定Socket的訊息觀察者
//        chatBox = box;
//    }
    public String getMessage() { // 取得訊息
        return message;
    }
    public void run() {
        try {
        	System.out.print("Try to connect...\n");
        	skt = new Socket(host, port);
        	System.out.print("Connect Success!\n");	
            theInputStream = new BufferedReader(new InputStreamReader(skt.getInputStream()));
            theOutputStream = new PrintStream(skt.getOutputStream());
            while((message = theInputStream.readLine()) != null) { // 讀取資料迴圈
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
    private void startClient(int port,String IP){	// 客戶端
        clientSkt = new Client(IP, port);
        clientSkt.setMessage(this);
        setGUI(false);
        clientSkt.start();
    } 
    
    public void update() {    // 取得訊息
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