package Personne;

import java.util.ArrayList;
import java.util.List;

import Divers.Commande;

public class Livreur extends Client{
	private int nbrLivraison;
	List<Commande> listeCommandeLivree = new ArrayList<Commande>();
	List<Commande> listeCommandeAValide = new ArrayList<Commande>();
	List<Commande> listeCommandeValidee = new ArrayList<Commande>();
	List<Commande> listeCommandeALivree = new ArrayList<Commande>();
	static List<Commande> listeCommandeRefusé = new ArrayList<Commande>(); 
	public Livreur (String nom, String prenom, String adresse,int numero, int nbrCommande,int nbrLivraison,String email,Profile profile ){
		super (nom,prenom,adresse,numero,nbrCommande,email,profile);
		this.nbrLivraison = nbrLivraison;
		this.listeCommandeLivree = new ArrayList<Commande>();
		}
	public Livreur() {
		super();
		this.nbrLivraison = 0;
	}
	
    public int getNbrLivraison() {return this.nbrLivraison;}
	public void setNbrLivraison(int nbrLivraison) {this.nbrLivraison = nbrLivraison;}
	
	public String toString() {
		return (super.toString()+"\n Nombre de livraison : "+this.nbrLivraison);
	}
	
	public void Afficher() {
		System.out.println(this.toString());
	}
	
    public void validerAffectation(int idCommande) {
    	  boolean trouve = false;
    	for(int i = 0 ; i<ChefRestau.listeAllCommande.size();i++){
	    	if(ChefRestau.listeAllCommande.get(i).getidCommande()== idCommande){
	    		Commande c = ChefRestau.listeAllCommande.get(i);trouve = true;
    	 c.setEtatCommande("validée");this.listeCommandeAValide.remove(c) ;this.listeCommandeALivree.add(c) ;
    	this.listeCommandeLivree.add(c);
    	System.out.println("\nLa Commande Vous a bien été affécté \nVeuillez Effectué la Livraison au plus vite ") ; 
    	} 
    	}if(trouve == false) { System.out.println("\nCette Commande n'existe pas ou ne vous a pas été Transmise  ") ; }
    	}
    public void VoirMesLivraions() {
    	if(this.listeCommandeLivree.isEmpty()==true) {System.out.println("\nVous N'avez encore effectué aucunne livraison") ;  }
    	for(int i=0;i<this.listeCommandeLivree.size();i++)
    	{   	listeCommandeLivree.get(i).AfficherCommandeLivree();			}
    }
    
    public void RefuséAffectation(Commande c ) {
    	if(listeCommandeAValide.contains(c)) {listeCommandeAValide.remove(c) ;Livreur.listeAllCommande.add(c) ;
    	System.out.println("\nLa Commande a bien été Reffusé et sera affecté a un autre livreur      ");}
    	else { System.out.println("\nCette Commande n'existe pas ou ne vous a pas été Transmise  ") ; }
    	
       
    }
}
