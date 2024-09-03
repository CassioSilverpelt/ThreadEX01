package controller;

public class ThreadIdController extends Thread {
	public ThreadIdController() {
		super();
	}

	@Override
	public void run() {
//		int tId = getId();
		int tId = (int) threadId();
		System.out.println(tId);
	}
	
	
	
}

//extends Thread
//run()
//Passagens de parâmetro via construtor de classes
