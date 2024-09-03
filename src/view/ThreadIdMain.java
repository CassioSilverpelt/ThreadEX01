package view;

import controller.ThreadIdController;

public class ThreadIdMain {
	public static void main(String[] args) {
		
		for (int i = 0; i < 5; i++) {
			ThreadIdController tcon = new ThreadIdController();
			tcon.start();
		}
		
	}	
}
