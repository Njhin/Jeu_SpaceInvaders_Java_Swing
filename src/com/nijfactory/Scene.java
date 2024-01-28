package com.nijfactory;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JPanel;

import com.nijfactory.ressources.Constantes;
import com.nijfactory.ressources.entites.Vaisseau;

public class Scene extends JPanel {
	
	/* Variables */
	public Vaisseau vaisseau = new Vaisseau();
	
	/* Constructeur */
	public Scene() {
		super();	
	}
	
	/* Methodes */
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics g2 = (Graphics2D) g;
		
		// Dessin du fond d'ecran
		g2.setColor(Color.black);
		g2.fillRect(0, 0, Constantes.LONGUEUR_FENETRE, Constantes.LARGEUR_FENETRE);
		
		// Dessin ligne verte en bas de l'ecran
		g2.setColor(Color.green);
		g2.fillRect(30, 530, 535, 5);
		
		// Dessin du vaisseau
		g2.drawImage(this.vaisseau.getImg(), 
					 this.vaisseau.getxPos(), 
					 this.vaisseau.getyPos(), 
					 null);
	}
}
