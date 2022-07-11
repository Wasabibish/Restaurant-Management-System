package Personne;
import java.util.ArrayList;
import java.util.List;
import Divers.Commande;

import Enum.Note;
import Nourriture.FicheTech;

public class Client extends Utilisateur {
	
	
	private String nom,prenom,adresse;
	private int numero,nbrCommande;
	Profile profile ;
	public ProfileCulinaire p;
	List<Commande> listeCommande = new ArrayList<Commande>();
	List<String> listeMail = new ArrayList<String>();	
	List<String> listeSMS = new ArrayList<String>();
	public static List<Commande> listeAllCommande = new ArrayList<Commande>();
	List <Commande> historique = new ArrayList <Commande>();
	

	public Client (String nom, String prenom, String adresse,int numero, int nbrCommande ,String email,Profile profile) {
		
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = adresse;
		this.numero = numero;
		this.nbrCommande = nbrCommande;
		this.profile=profile ;
		this.listeMail.add(email)  ;
	
	}
	
	public Client() {
		this ("","","",0,0,"", null);
	}
	public String getNom() {return this.nom;}
	public void setNom(String nom) {this.nom = nom;}
	public String getPrenom() {return this.prenom;}
	public void setPrenom(String prenom) {this.prenom = prenom;}
	public String getAdresse() {return this.adresse;}
	public void setAdresse(String adresse) {this.adresse = adresse;}
	public int getNumero() {return this.numero;}
	public void setNumero(int numero) {this.numero = numero;}
	public int getNbrCommande() {return this.nbrCommande;}
	public void setNbrCommande(int nbrCommande) {this.nbrCommande = nbrCommande;}
	
	
	
	public String toString() {
		return ("Le client : "+this.nom+this.prenom+"\nAdresse : "+this.adresse+"\nNumero : "+this.numero+"\nNombre de commandes : "
				+this.nbrCommande);
	}
	
	public void Afficher() {
		System.out.println(this.toString());
	}
	
	  public void ConsulterProfil() {
 System.out.println("Nom d'utilisateur : " +this.profile.getPseudo() + "\nMot De Passe : "  +this.profile.getMotDePasse() +"\nReduction D'achat offert : "+this.profile.gettBonus() ) ;
	    }

	    public void ModifierNomUtilisateur (String a) {
	    	  for(int i=0;i<ChefRestau.listeClient.size();i++)
	    	  {
	    	if(ChefRestau.listeClient.get(i)==this)  {
	    	profile.setPseudo(a);
	    	ChefRestau.listeClient.set(i,this) ;
	    
	     
	    } System.out.println("---Nom utilisateur inexistant !---");
	    	}}
	    
	    
	    public void ModifierMotDePasse (String ancien,String a) { 
	    	   for(int i=0;i<ChefRestau.listeClient.size();i++)
	    	{if(ChefRestau.listeClient.get(i)==this)  {
				if (this.profile.getMotDePasse() == ancien) {
					
					profile.setMotDePasse(a);
					ChefRestau.listeClient.set(i,this) ;
					System.out.println("\n\t--------SUCCES-----------");
					
					
				}else System.out.println("\n\t------------ERREUR DE MOT DE PASSE  !!--------------");
	    		
	    	}}
	    	
	    }
	    
	    
	   

	    public void PayerCommande(int idCommande ) {
	    	boolean trouve = false;
	        Commande c;
	    	for(int i=0;i<this.listeCommande.size();i++)  
	         {  
	            
				if(this.listeCommande.get(i).getIdCommande() == idCommande)
	            {      
	              	  trouve = true;
	              	  c = this.listeCommande.get(i);
	              	  if (c.getMontant() > this.profile.getSolde()) {
	              		  System.out.println("\nCrédit insuffisant !!!");
	              	  }else {
	              		  this.profile.setSolde(this.profile.getSolde() - c.getMontant());
	              		  c.setEtatCommande("terminée");
	              		  System.out.println("Commande Payée ! ");}
	              	  
	              		  
	            } 
	         } 
	    
			if (trouve ==  false) { System.out.println("\nCommande inexistante.");}
	      
	    }
	    
	    public void MettreUneNote(String s) {
	    	Note n = Note.valueOf(s);
	    	System.out.println("\nMerci D'avoir pris le temps de Mettre Une Note") ;
	    	Restaurant.listeNotes.add(n)  ;
	       
	    }

	    public void MettreUnAvis(String msg) {
	    	System.out.println("\nMerci D'avoir pris le temps de Metre Un Avis") ;
	    	Restaurant.listeCommentaires.add(msg) ;
	    }

	 
	    public void PasserCommande(String Adresse) {  Commande C ; 
	    if (profile.gettBonus() >0) {
            C= new Commande(this.pa.listePlatPanier,this.pa.ListeQtPlat,this.pa.listeBoissonPanier,this.pa.ListeQtBoisson,(this.PrixPanier()-profile.gettBonus() ),Adresse  ) ;
              profile.setBonus(profile.gettBonus()-20);  } 
            else { C= new Commande(this.pa.listePlatPanier,this.pa.ListeQtPlat,this.pa.listeBoissonPanier,this.pa.ListeQtBoisson,(this.PrixPanier()) ,Adresse ) ;}//n'utilise pas gae le bonus
	    	this.listeCommande.add(C) ;
	    	Client.listeAllCommande.add(C) ;
	    	for(int i=0;i<this.pa.listePlatPanier.size();i++)
	    	{
	    		for(int j=0;j<ChefRestau.listePlat.size();j++)
	    	
	    		{if(this.pa.listePlatPanier.get(i)==ChefRestau.listePlat.get(j) )
	    		{
	    		FicheTech f ;	
	    			f=ChefRestau.listePlat.get(j).getFiche() ;
	    			for(int k=0;k<f.ListeIngredient.size();k++)
	    {f.ListeIngredient.get(k).setQuantitéstocké(Math.max(0,f.ListeIngredient.get(k).getQuantitéstocké()-this.pa.ListeQtPlat.get(i)*f.ListeIngredient.get(k).getQuantité()));    }
	    			ChefRestau.listePlat.get(j).setFiche(f);
	    		} 
	    			
	    			
	    	}
	    	}
	    	for(int i=0;i<this.pa.listeBoissonPanier.size();i++)
	    	{
	    		for(int j=0;j<ChefRestau.listeBoisson.size();j++)
	    	
	    		{if(this.pa.listeBoissonPanier.get(i)==ChefRestau.listeBoisson.get(j) )
	    		{
	    		FicheTech f ;	
	    			f=ChefRestau.listeBoisson.get(j).getFiche() ;
	    			for(int k=0;k<f.ListeIngredient.size();k++)
	    {f.ListeIngredient.get(k).setQuantitéstocké(Math.max(0,f.ListeIngredient.get(k).getQuantitéstocké()-this.pa.ListeQtBoisson.get(i)*f.ListeIngredient.get(k).getQuantité()));    }
	    			ChefRestau.listeBoisson.get(j).setFiche(f);
	    		} 
	    			
	    			
	    	}
	    	}
	    	super.pa.listeBoissonPanier.clear();
	    	super.pa.listePlatPanier.clear() ;

	    	
	    	  for(int i=0;i<ChefRestau.listeClient.size();i++)
	    	  {
	    	if(ChefRestau.listeClient.get(i)==this)  {
	    	ChefRestau.listeClient.get(i).setNbrCommande(this.getNbrCommande()+1);
	    	ChefRestau.listeClient.set(i,this) ;
	    	System.out.println("\nVotre Commande A été Validé Vous Allez Recevoir Une notification Dans quelque Instants \n") ;
	    	System.out.println("\nLe NO de commande :"+C.getidCommande());
	    	System.out.println("\nLe prix a payer A la livraison est de :"+C.getDetail().getPrixLivraison()+"DA") ;
	        
	    }}  
	    }

	    public void AnnulerCommande(int idCommande) {
	    	Commande c ;
	    	for(int i=0;i<listeCommande.size();i++)
	    	  {
	    	if(this.listeCommande.get(i).getidCommande()==idCommande)  
	    		
	    	{System.out.println("\nLa commande "+idCommande+"a été annulé") ;
	    	c=this.listeCommande.get(i);
	    	c.setEtatCommande("annulée");
	    	this.listeCommande.remove(i) ;
	    	this.historique.add(c);
	    	
	        }}}
	    
	    public void afficherHistorique() {
	    	if(this.historique.isEmpty()==true) {System.out.println("\nVous Historque est vide Vous N'avez Encore Passé Aucune Commande" ) ;
	    	}else {
	    	for (int i=0 ; i<=this.historique.size(); i++) {
	    		this.historique.get(i).Afficher();
	    		} }
	    	}
	    public void validerReceptionCommande(int idCommande,Livreur l) {
	    System.out.println("\nsignature Validée") ;
	    System.out.println("\nMerci D'avoir Commandé chez Nous !!");	
	     }
	    public void VoirSMS() { 
	    	if (this.listeSMS.isEmpty()==true) {System.out.println("\nVous N'avez Aucun SMS a Voir");  }
	    	else {for(int i=0;i<listeSMS.size();i++) {System.out.println("\nSMS "+(i+1)+" :"+listeSMS.get(i) ); }
	    }}
		    public void VoirEMail() { 
		    	if (this.listeMail.isEmpty()==true) {System.out.println("\n Vous N'avez Aucun Mail a Voir");  }
		    	else {for(int i=0;i<listeMail.size();i++) {System.out.println("\n"+(i+1)+"/ "+listeMail.get(i) ); }
		    }}

		    public void Authentifier (String pseudo,String mdp) {
		    	for (int i = 0;i<Restaurant.listeProfile.size();i++) {
		    		if(Restaurant.listeProfile.get(i).getPseudo()==pseudo) {
		    			if(Restaurant.listeProfile.get(i).getMotDePasse()==mdp) {
		    			   System.out.println("---AUTHENTIFICATION AVEC SUCCES---");
		    			}else  System.out.println("---MOT DE PASSE INCORRECTE---");
		    		}else  System.out.println("---PSEUDO INCORRECTE---");
		    	}
		    	
		    }
		    
		    public void suivreCommande(int idCommande){
		    	boolean trouve = false;
		    for(int i = 0 ; i<this.listeCommande.size();i++){
		    	if(this.listeCommande.get(i).getidCommande()== idCommande){
		    		Commande c = this.listeCommande.get(i); trouve = true;
		    System.out.println("\nAdresse De Livraison:"+ c.getDetail().getAdrLivraison()+ "\nTemps Restant Livraison:"+c.getDetail().getDureeLivraison() +
		    		"\nPrix De La Livraison : "+c.getDetail().getPrixLivraison()+"\nPrix Total :"+c.prixTotal()+"DA");}
		    }if(trouve == false ) {System.out.println("COMMANDE INTROUVABLE");}
		    }
		    
		    
		   
}
