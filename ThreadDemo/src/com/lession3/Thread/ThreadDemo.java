package com.lession3.Thread;

public class ThreadDemo extends Thread
{
	public void run()
	{
	 System.out.println("concurrent thread started running..");
	}

	public static void main(String[] args) {
		ThreadDemo thread = new ThreadDemo();
		  thread.start();

	}

}
