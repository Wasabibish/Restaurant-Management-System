package Divers;

import java.util.ArrayList;
import java.util.List;

import Nourriture.Boisson;
import Nourriture.Plat;

public class Panier {
    public double prix;
	public List<Boisson> listeBoissonPanier = new ArrayList<Boisson>();
	public List<Plat> listePlatPanier = new ArrayList<Plat>(); 
	public ArrayList<Integer> ListeQtPlat= new ArrayList<Integer>();
	public ArrayList<Integer> ListeQtBoisson= new ArrayList<Integer>();
	
	  public Panier() {
		  listeBoissonPanier=new ArrayList<Boisson>(); ;
		  listePlatPanier = new ArrayList<Plat>();  ;
		  ListeQtBoisson = new ArrayList<Integer>(); ;
		  ListeQtPlat =new ArrayList<Integer>(); ;
	      this.prix=0 ;								
	  					}



}

	

