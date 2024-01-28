package com.nijfactory.ressources;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import com.nijfactory.SpaceInvaders;

public class Clavier implements KeyListener {

	@Override
	public void keyPressed(KeyEvent e) {
		if(e.getKeyCode() == KeyEvent.VK_RIGHT) {
			SpaceInvaders.scene.vaisseau.setDx(Constantes.DX_VAISSEAU);
		} else if(e.getKeyCode() == KeyEvent.VK_LEFT) {
			SpaceInvaders.scene.vaisseau.setDx(-Constantes.DX_VAISSEAU);
		}
	}
	
	@Override
	public void keyTyped(KeyEvent e) {	
	}

	@Override
	public void keyReleased(KeyEvent e) {
		SpaceInvaders.scene.vaisseau.setDx(0);
	}
}
