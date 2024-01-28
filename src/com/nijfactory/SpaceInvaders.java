package com.nijfactory;

import javax.swing.JFrame;
import com.nijfactory.ressources.Constantes;

public class SpaceInvaders {
	
/**** VARIABLES ****/
	
	public static Scene scene;
	
	
/**** METHODES ****/
	public static void main(String[] args) {
		// Création de la fenêtre de l'application
		JFrame fenetre = new JFrame("Jeu style Space Invaders");
		fenetre.setSize(Constantes.LONGUEUR_FENETRE, Constantes.LARGEUR_FENETRE);
		fenetre.setResizable(false);
		fenetre.setLocationRelativeTo(null);
		fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fenetre.setAlwaysOnTop(true);	

		// Association du panneau Scene à la fenêtre
		scene = new Scene();		
		fenetre.setContentPane(scene);
		
		fenetre.setVisible(true);
	}

}
