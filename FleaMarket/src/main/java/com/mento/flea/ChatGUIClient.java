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
	 * ȭ�鱸���� �ʿ��� Field����
	 * */
	JTextArea textArea = new JTextArea();
	JScrollPane jp = new JScrollPane(textArea);
	JTextField text = new JTextField("");
	
	Socket sk;
	BufferedReader br;
	PrintWriter pw;
	
	public ChatGUIClient(){
		super("ChatGUIClient �Դϴ�.");
		
		textArea.setBackground(Color.yellow);
		textArea.setEditable(false);//��Ȱ��ȭ
		
		super.add(jp, "Center");
		super.add(text,"South");
		
		setSize(400, 300);
		setVisible(true);
		
		text.requestFocus();//Ŀ�� ����
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	    text.addActionListener(this);//�̺�Ʈ ���
		
	}//�����ڳ�
	
	/**
	 * �������� ���ӱ�� ����ϴ� �޼ҵ� �ۼ�
	 * */
	 public void serverConnection(){
		 try{
		 sk = new Socket("192.168.0.219", 7011);
		 
		 String name =
				 JOptionPane.showInputDialog
				 (this,"��ȭ�� �Է����ּ���","��ȭ��", JOptionPane.INFORMATION_MESSAGE);
		   
		    pw=new PrintWriter(sk.getOutputStream(), true);
		    pw.println(name);//��ȭ�� ����(��������)
		    
		    new Thread(this).start();
		 
		 }catch(IOException e){
			 System.out.println(e+"=> client Socket fail");
		 }
	 }
	
	public static void main(String[] args) {
		new ChatGUIClient().serverConnection();
	}

	 /**
	  * ActionListner�� �ش��ϴ� �޼ҵ�
	  * textField�� ���� �Է��ϰ� ���͸� ġ�� ȣ��Ǵ� �޼ҵ�
	  * */
	@Override
	public void actionPerformed(ActionEvent e) {
		String data = text.getText();//text�ڽ��� �� ��������
		pw.println(data);////text�ڽ��� �� ������ ����
		text.setText("");//text�ڽ��� �� �����
		
	}

	/**
	 * ������ �������� �����͸� �о TextArea���� �ø���
	 * */
	@Override
	public void run() {
		try{
		br = new BufferedReader(new InputStreamReader(sk.getInputStream()));
		String data=null;
		while((data=br.readLine()) !=null){
			textArea.append(data+"\n");
			
			//text�ڽ��� ��ũ�ѹ��� ��ġ�� �Էµ� text�� ���̸�ŭ ������
			textArea.setCaretPosition(textArea.getText().length());
		}
		
		}catch(IOException e){
			System.out.println(e+"=> client read fail");
		}
	} 
	
	
}

//////////////////////////////








