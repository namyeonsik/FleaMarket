package com.mento.flea;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ChatGUIClient extends JFrame 
implements ActionListener,Runnable{

	/**
	 * 화면구성에 필요한 Field선언
	 * */
	JTextArea textArea = new JTextArea();
	JScrollPane jp = new JScrollPane(textArea);
	JTextField text = new JTextField("");
	
	Socket sk;
	BufferedReader br;
	PrintWriter pw;
	
	public ChatGUIClient(){
		super("ChatGUIClient 입니다.");
		
		textArea.setBackground(Color.yellow);
		textArea.setEditable(false);//비활성화
		
		super.add(jp, "Center");
		super.add(text,"South");
		
		setSize(400, 300);
		setVisible(true);
		
		text.requestFocus();//커서 놓기
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	    text.addActionListener(this);//이벤트 등록
		
	}//생성자끝
	
	/**
	 * 서버측에 접속기능 담당하는 메소드 작성
	 * */
	 public void serverConnection(){
		 try{
		 sk = new Socket("192.168.0.219", 7011);
		 
		 String name =
				 JOptionPane.showInputDialog
				 (this,"대화명 입력해주세요","대화명", JOptionPane.INFORMATION_MESSAGE);
		   
		    pw=new PrintWriter(sk.getOutputStream(), true);
		    pw.println(name);//대화명 전송(서버측에)
		    
		    new Thread(this).start();
		 
		 }catch(IOException e){
			 System.out.println(e+"=> client Socket fail");
		 }
	 }
	
	public static void main(String[] args) {
		new ChatGUIClient().serverConnection();
	}

	 /**
	  * ActionListner에 해당하는 메소드
	  * textField에 값을 입력하고 엔터를 치면 호출되는 메소드
	  * */
	@Override
	public void actionPerformed(ActionEvent e) {
		String data = text.getText();//text박스의 값 가져오기
		pw.println(data);////text박스의 값 서버에 전송
		text.setText("");//text박스의 값 지우기
		
	}

	/**
	 * 서버가 보내오는 데이터를 읽어서 TextArea위에 올리기
	 * */
	@Override
	public void run() {
		try{
		br = new BufferedReader(new InputStreamReader(sk.getInputStream()));
		String data=null;
		while((data=br.readLine()) !=null){
			textArea.append(data+"\n");
			
			//text박스의 스크롤바의 위치를 입력된 text의 길이만큼 내리기
			textArea.setCaretPosition(textArea.getText().length());
		}
		
		}catch(IOException e){
			System.out.println(e+"=> client read fail");
		}
	} 
	
	
}

//////////////////////////////








