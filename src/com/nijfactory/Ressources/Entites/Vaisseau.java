package com.nijfactory.ressources.entites;

import javax.swing.ImageIcon;
import com.nijfactory.ressources.Constantes;

public class Vaisseau extends Entite{

	/*** Variables ***/
	
	/*** Constructeur ***/
	public Vaisseau() {
		
		// initialise des variables de la super classe
		super.xPos = Constantes.X_POS_INIT_VAISSEAU;
		super.yPos = Constantes.Y_POS_VAISSEAU;
		super.longueur = Constantes.LONGUEUR_VAISSEAU;
		super.largeur = Constantes.LARGEUR_VAISSEAU;
		super.dx = Constantes.DX_VAISSEAU;
		super.dy = 0;
		// Adresse des images du vaisseau
		super.strImg1 = "../images/vaisseau_nij.png";
		super.strImg2 = "../images/vaisseauDetruit1.png";
		super.strImg3 = "../images/vaisseauDetruit2.png";
		// Chargement de l'image de vaisseau
		super.ico = new ImageIcon(getClass().getResource(super.strImg1));
		super.img = this.ico.getImage();
	}
	/*** Methodes ***/
	
}
