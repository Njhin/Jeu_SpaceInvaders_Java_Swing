package com.nijfactory.ressources;

public abstract class Constantes {
	/******************************	Fenetre	*****************************/
	// Dimension de la fenetre.
	public static final int LONGUEUR_FENETRE = 600;
	public static final int LARGEUR_FENETRE = 600;
	public static final int MARGE_FENETRE = 50;

	/******************************	Vaisseau *****************************/
	// Dimension du vaisseau.
	public static final int LONGUEUR_VAISSEAU = 39;
	public static final int LARGEUR_VAISSEAU = 24;
	
	// Position initiale du vaisseau
	public static final int X_POS_INIT_VAISSEAU = (LONGUEUR_FENETRE - LONGUEUR_VAISSEAU)/2;
	public static final int Y_POS_VAISSEAU = 490;
	
	// Unite de deplacement du Vaisseau
	public static final int DX_VAISSEAU = 1;
}
