package com.nijfactory;

import javax.swing.JFrame;
import com.nijfactory.Ressources.Constantes;

public class SpaceInvaders {
/* Variables */
	public static Scene scene;
	
/* Methodes */
	public static void main(String[] args) {
		// Creation de la fenetre de l'applicatoin
		JFrame fenetre = new JFrame("Space Invaders");
		fenetre.setSize(Constantes.LONGUEUR_FENETRE, Constantes.LARGEUR_FENETRE);
		fenetre.setResizable(false);
		fenetre.setLocationRelativeTo(null);
		fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fenetre.setAlwaysOnTop(true);
		
		// Association du panneau Scene à la fenetre
		scene = new Scene();
		fenetre.setContentPane(scene);
		
		fenetre.setVisible(true);
	}

}
