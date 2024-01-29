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
	
	// Limite de deplacement du vaisseau
	public static final int LIMITE_GAUCHE_VAISSEAU = 60;
	public static final int LIMITE_DROITE_VAISSEAU = 500;
	
	/******************************	Alien *****************************/	
	// dimension des aliens
	public static final int LONGUEUR_ALIEN = 33;
	public static final int LARGEUR_ALIEN = 25;
	
	// Parametres des positions des aliens
	public final static int ALT_INIT_ALIEN = 120;
	public final static int X_POS_INIT_ALIEN = 29 + MARGE_FENETRE;
	public final static int ECART_LIGNES_ALIEN = 40;
	public final static int ECART_COLONNES_ALIEN = 10;
	
	// Unité de deplacement des aliens
	public final static int DX_ALIEN = 5;
	public final static int DY_ALIEN = 25;
}
