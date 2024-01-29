package com.nijfactory;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JPanel;

import com.nijfactory.ressources.Chrono;
import com.nijfactory.ressources.Clavier;
import com.nijfactory.ressources.Constantes;
import com.nijfactory.ressources.entites.GroupeAliens;
import com.nijfactory.ressources.entites.Vaisseau;

public class Scene extends JPanel {
	
/**** VARIABLES ****/	
	
	public Vaisseau vaisseau = new Vaisseau();
	public GroupeAliens groupeALiens = new GroupeAliens();
	
/**** CONSTRUCTEUR ****/
	
	public Scene() {
		super();
		
		// Instanciation du clavier
		this.setFocusable(true);
		this.requestFocusInWindow();
		this.addKeyListener(new Clavier());
		
		// Instanciation du chrono (à la fin du constructeur)
		Thread chronoEcran = new Thread(new Chrono());
		chronoEcran.start();
	}

		
/**** METHODES ****/
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics g2 = (Graphics2D) g;
		
		// Dessin du fond d''écran
		g2.setColor(Color.BLACK);
		g2.fillRect(0, 0, Constantes.LONGUEUR_FENETRE, Constantes.LARGEUR_FENETRE);
		
		// Dessin ligne verte en bas de l'écran
		g2.setColor(Color.GREEN);
		g2.fillRect(30, 530, 535, 5);
		
		// Dessin du vaisseau
		g2.drawImage(this.vaisseau.getImg(), this.vaisseau.deplacementVaisseau(), this.vaisseau.getyPos(), null);
		
		// Dessin des aliens
		this.groupeALiens.dessinAliens(g2);
	}	
}
