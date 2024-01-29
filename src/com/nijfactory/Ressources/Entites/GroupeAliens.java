package com.nijfactory.ressources.entites;

import java.awt.Graphics;

import com.nijfactory.ressources.Constantes;

public class GroupeAliens {
	
/** Variables **/
	
	// Tableau contenant tous les aliens (50)
	private Alien tabAlien[][] = new Alien [5][10];
	
/** Constructeur **/
	
	public GroupeAliens() {
		this.initTableauAliens();
	}	
	
/** Methodes **/
	private void initTableauAliens() {
		// Methode qui remplit le tableau complet
		for(int colonne = 0; colonne < 10; colonne++) {
			this.tabAlien[0][colonne] = 
				new Alien(Constantes.X_POS_INIT_ALIEN + (Constantes.LONGUEUR_ALIEN + Constantes.ECART_COLONNES_ALIEN) * colonne
					, Constantes.ALT_INIT_ALIEN, "../images/alienHaut1.png", "../images/alienHaut2.png");
			for(int ligne=1; ligne<=3; ligne++) {
				this.tabAlien[ligne][colonne] = 
					new Alien(Constantes.X_POS_INIT_ALIEN + (Constantes.LONGUEUR_ALIEN + Constantes.ECART_COLONNES_ALIEN) * colonne
						, Constantes.ALT_INIT_ALIEN + Constantes.ECART_LIGNES_ALIEN * ligne, "../images/alienMilieu1.png", "../images/alienMilieu2.png");
			}
			for(int ligne=3; ligne<5; ligne++) {
				this.tabAlien[ligne][colonne] = 
					new Alien(Constantes.X_POS_INIT_ALIEN + (Constantes.LONGUEUR_ALIEN + Constantes.ECART_COLONNES_ALIEN) * colonne
						, Constantes.ALT_INIT_ALIEN + Constantes.ECART_LIGNES_ALIEN * ligne, "../images/alienBas1.png", "../images/alienBas2.png");
			}		
		}
	}
	public void dessinAliens(Graphics g) {
		// Dessin des aliens contenu dans le tableau tabAlien
		for(int colonne = 0; colonne <10; colonne ++) {
			for(int ligne = 0; ligne < 5; ligne++) {
				g.drawImage(this.tabAlien[ligne][colonne].getImg()
						, this.tabAlien[ligne][colonne].getxPos()
						, this.tabAlien[ligne][colonne].getyPos()
						, null);
			}
		}
	}
}
