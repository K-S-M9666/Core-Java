package server;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ReverseEcheo2 extends Thread{

	Socket stk;
	public ReverseEcheo2 (Socket st)
	{
		stk=st;
	}
	public void run()
	{
		try
		{
			BufferedReader br=new BufferedReader(new InputStreamReader(stk.getInputStream()));
			PrintStream ps=new PrintStream(stk.getOutputStream());
			
			String msg;
			StringBuilder sb;
			do
			{
				msg=br.readLine();
				sb=new StringBuilder();
				sb.reverse();
				msg=sb.toString();
				ps.println(msg);
			}while(!msg.equals("dne"));
			stk.close();
		}
		
		catch(Exception e) {}
		}
	
	public static void main(String[] args) throws Exception {
		ServerSocket ss=new ServerSocket(2000);
		
		Socket stk;
		ReverseEcheo2 re;
		int count=1;
		do {
			stk=ss.accept();
			System.out.println("Client Connected :"+count++);
			re=new ReverseEcheo2(stk);
			re.start();
			
		}while(true);
		
		
		

	}

}
