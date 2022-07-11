package Divers;



import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

import Enum.EtatCommande;

import Nourriture.Boisson;
import Nourriture.Plat;
public class Commande {
	
	java.util.Date date=java.util.Calendar.getInstance().getTime();  
	 
	  String s = date.toString();
	  String s1 = s.substring(0, 10);
	  String s2 = s.substring(11, 19);
	 
	
		public List<Boisson> listeBoissonCommande = new ArrayList<Boisson>();
		public List<Plat> listePlatCommande = new ArrayList<Plat>(); 
		public ArrayList<Integer> ListeQtPlatcommande= new ArrayList<Integer>();
		public ArrayList<Integer> ListeQtBoissoncommande= new ArrayList<Integer>();
	    public static AtomicInteger id= new AtomicInteger();
	    private int idCommande ;
	    private String dateCommande;
	    private String heureCommande;
	    private String heureLivraisonCommande ;
	    private EtatCommande etatCommande;
	    private double montant;
	    private DetailCommande detail = new DetailCommande() ;
	    
	 
	
	    public Commande( List<Plat> ListePlatCommande,ArrayList<Integer> ListeQtPlatcommande, List<Boisson> ListeBoissonCommande,ArrayList<Integer> ListeQtBoissoncommande,double prix,String adresseLivraison) {
	    	this.setIdCommande(id.getAndIncrement()) ;
	    	this.dateCommande = s1;
	    	this.heureCommande = s2;
	    	this.heureLivraisonCommande=date.toString().substring(11, 19); 
	    	this.etatCommande = EtatCommande.valueOf("en_cours");
	    	this.montant = prix  ;
	    	this.listeBoissonCommande=ListeBoissonCommande ;
	    	this.listePlatCommande=ListePlatCommande ;
	    	this.ListeQtBoissoncommande=ListeQtBoissoncommande ;
	    	this.ListeQtPlatcommande=ListeQtPlatcommande ;
	        this.detail.setAdrLivraison(adresseLivraison);
	    	
	    	
	    }

	   
	    public double getMontant() {return this.montant;}
	    public void setMontant(double mont) {this.montant = mont;}
	    public int getidCommande() {return this.getIdCommande() ;}
	    public int getIdCommande() {return idCommande;}
	    public void setIdCommande(int idCommande) {this.idCommande = idCommande;}
	    public EtatCommande getEtatCommande() {return this.etatCommande;}
	    public void setEtatCommande(String e) {this.etatCommande = EtatCommande.valueOf(e) ;}
	    
	    public void setheureLivraisonCommande() {this.heureLivraisonCommande =date.toString().substring(11, 19); }
	    public DetailCommande getDetail() {return detail;}
		public void setDetail(DetailCommande detail) {this.detail = detail;}
		public double prixTotal( ) {
	    	
		       return this.detail.getPrixLivraison() + this.getMontant();
		        
		    }
		
	    public String toString() {
	    	return ("La Commande NO : "+this.idCommande+"\nDate : "+this.dateCommande+"\nHeure :"+this.heureCommande+"\nEtat : "
	    +this.etatCommande+"\nPrix de commande  : "+this.montant + "\nPrix Totale : "+this.prixTotal()+"DA"); }
	
	    public void Afficher() { System.out.println(this.toString());
	    	
	    }
	    public void AfficherCommandeLivree() { 
	    	System.out.println("La Commande NO : "+this.idCommande+"\nDate : "+this.dateCommande+"\nHeure :"+this.heureCommande+"\nEtat : "+this.etatCommande
	    +"\nHeure :"+this.heureLivraisonCommande+"\nPrix : "+this.montant+"DA"); }  
	    
	


	
	}


