package com.nijfactory.ressources;

import com.nijfactory.Scene;
import com.nijfactory.SpaceInvaders;

public class Chrono implements Runnable {

	/* Variables */
	private final int PAUSE = 5;
	public static int compteTours = 0;

	/* Methodes */
	
	@Override
	public void run() {
		while(true){
			SpaceInvaders.scene.repaint();
			try {
				Thread.sleep(PAUSE);
			}
			catch (InterruptedException e) {
			}			
		}
	}
}
