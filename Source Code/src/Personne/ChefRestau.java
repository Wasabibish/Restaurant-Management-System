package Personne;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

import Divers.Commande;

import Nourriture.Boisson;
import Nourriture.FicheTech;
import Nourriture.Ingredient;
import Nourriture.Plat;


public class ChefRestau extends Livreur {
	public static List<Client> listeClient = new ArrayList<Client>();
	public static List<Livreur> listeLivreur = new ArrayList<Livreur>();
	 public static  List<Boisson> listeBoisson = new ArrayList<Boisson>();
	 public static List<Plat> listePlat = new ArrayList<Plat>();
	
	
    public ChefRestau(String nom, String prenom, String adresse,int numero, int nbrCommande,int nbrLivraison,String email ,Profile profile ){
		super (nom,prenom,adresse,numero,nbrCommande,nbrLivraison,email,profile);
		
		}
    

    public void ModifierNomClient(Client c ,String a) {
    	if(ChefRestau.listeClient.isEmpty()==true) {System.out.println("Vous n'avez aucun client dans votre liste") ; }
    	else {
    		if(ChefRestau.listeClient.contains(c)==false) {System.out.println("le client"+c.toString()+" n'existe pas")   ; }
  	  for(int i=0;i<ChefRestau.listeClient.size();i++)
  	  {
  	if(ChefRestau.listeClient.get(i)==c)  
  	{
  	ChefRestau.listeClient.get(i).setNom(a);
  	ChefRestau.listeClient.set(i,this) ;
}}}
    	}
    public void ModifierPrenomClient (Client c ,String a) {
    	if(ChefRestau.listeClient.isEmpty()==true) {System.out.println("Vous n'avez aucun client dans votre liste") ; }
    	else {
    		if(ChefRestau.listeClient.contains(c)==false) {System.out.println("le client"+c.toString()+" n'existe pas")   ; }
    	  for(int i=0;i<ChefRestau.listeClient.size();i++)
    	  {
    	if(ChefRestau.listeClient.get(i)==c)  {
    	ChefRestau.listeClient.get(i).setPrenom(a);
    	ChefRestau.listeClient.set(i,this) ;
       
    }}} }
    public void ModifierAdresseClient (Client c ,String a) {
    	if(ChefRestau.listeClient.isEmpty()==true) {System.out.println("Vous n'avez aucun client dans votre liste") ; }
    	else {
    		if(ChefRestau.listeClient.contains(c)==false) {System.out.println("le client"+c.toString()+" n'existe pas")   ; }
    	  for(int i=0;i<ChefRestau.listeClient.size();i++)
    	  {
    	if(ChefRestau.listeClient.get(i)==c)  {
    	ChefRestau.listeClient.get(i).setAdresse(a);
    	ChefRestau.listeClient.set(i,this) ;
        
    }}} }
    public void ModifierNumeroClient (Client c ,int a) {
    	if(ChefRestau.listeClient.isEmpty()==true) {System.out.println("Vous n'avez aucun client dans votre liste") ; }
    	else {
    		if(ChefRestau.listeClient.contains(c)==false) {System.out.println("le client"+c.toString()+" n'existe pas")   ; }
  	  for(int i=0;i<ChefRestau.listeClient.size();i++)
  	  {
  	if(ChefRestau.listeClient.get(i)==c)  {
  	ChefRestau.listeClient.get(i).setNumero(a);
  	ChefRestau.listeClient.set(i,this) ;
     
  }}} }
    public void ModifiernbrCommandeClient (Client c ,int a) {
    	if(ChefRestau.listeClient.isEmpty()==true) {System.out.println("Vous n'avez aucun client dans votre liste") ; }
    	else {
    		if(ChefRestau.listeClient.contains(c)==false) {System.out.println("le client"+c.toString()+" n'existe pas")   ; }
    	  for(int i=0;i<ChefRestau.listeClient.size();i++)
    	  {
    	if(ChefRestau.listeClient.get(i)==c)  {
    	ChefRestau.listeClient.get(i).setNbrCommande(a);
    	ChefRestau.listeClient.set(i,this) ;
        
    }}}  }


    public void AjouterClient(Client p) {
    	
      if(this.rechercherClient(p)==false) {  
    	  listeClient.add(p); Restaurant.listeProfile.add(p.profile);
    	  System.out.println("-----AJOUT AVEC SUCESS !-----");      
      }
    
 
    }
    public void AjouterLivreur(Livreur l) {
    	if(this.rechercherLivreur(l)==false) {  listeClient.add(l)   ; 
    	 System.out.println("-----AJOUT AVEC SUCESS !-----");   
    	}
    }


    public void AjouterPlat(Plat p) {
    	if(this.rechercherPlat(p)==false) {  listePlat.add(p) ; 
    	 System.out.println("-----AJOUT AVEC SUCESS !-----");   
    	}
    }


    public void AjouterBoisson(Boisson b) {
    	if(this.rechercherBoisson(b)==false) {  listeBoisson.add(b); 
    	 System.out.println("-----AJOUT AVEC SUCESS !-----");   }
    }
    public boolean rechercherClient(Client p) {
        if(listeClient.contains(p)==true) {  return true  ;    }
        else return false ;
      }
    public boolean rechercherLivreur(Livreur p) {
        if(listeLivreur.contains(p)==true) {  return true  ;    }
        else return false ;
    }
    public boolean rechercherBoisson(Boisson b) {
        if(listeBoisson.contains(b)==true) {  return true  ;    }
        else return false ;
    }
    public boolean rechercherPlat(Plat p) {
        if(listePlat.contains(p)==true) {  return true  ;    }
        else return false ;
    }    
    public void SuppClient(Client p) {
    	if(ChefRestau.listeClient.isEmpty()==true) {System.out.println("\nVous N'avez Aucun Client Dans Votre Liste") ; }
    	
    	if(this.rechercherClient(p)==true) {  listeClient.remove(p); 
    	 System.out.println("-----SUPPRESSION AVEC SUCESS !-----");   }
    	else {System.out.println("\nLe Client"+p.toString()+" N'existe Pas"); }
    }


    public void SuppLivreur(Livreur l) {
    	if(ChefRestau.listeLivreur.isEmpty()==true) {System.out.println("\nVous N'avez Aucun Livreur Dans Votre Liste") ; }
    	if(this.rechercherLivreur(l)==true) {  listeClient.remove(l); 
    	System.out.println("-----SUPPRESSION AVEC SUCESS !-----"); }
    	else {System.out.println("\nLe livreur"+l.toString()+" N'existe Pas"); }
    }

    public void SuppPlat(Plat p) {
    	if(ChefRestau.listePlat.isEmpty()==true) {System.out.println("\nVous N'avez Aucun Plat Dans Votre Liste") ; }
    	if(this.rechercherPlat(p)==true) {  listePlat.remove(p)   ;
    	System.out.println("-----SUPPRESSION AVEC SUCESS !-----"); }
    	else {System.out.println("\nLe Plat"+p.toString()+" N'existe Pas"); }
    }

    public void SuppBoisson(Boisson b) {
    	if(ChefRestau.listeBoisson.isEmpty()==true) {System.out.println("\nVous N'avez Aucunne Boisson Dans Votre Liste") ; }
    	if(this.rechercherBoisson(b)==true) {  listeBoisson.remove(b)   ;
    	System.out.println("-----SUPPRESSION AVEC SUCESS !-----"); }
    	else {System.out.println("\nLa Boisson"+b.toString()+" N'existe Pas"); }
    }


    public void ModifierPlatReference(Plat p ,int reference) {boolean trouve=false ;
    	if(ChefRestau.listePlat.isEmpty()==true) {System.out.println("\nVous N'avez Aucun Plat Dans Votre Liste") ; }
      	for(int i = 0; i<ChefRestau.listePlat.size();i++)
    	{ if(ChefRestau.listePlat.get(i)==p) {trouve=true ;p.setReference(reference);ChefRestau.listePlat.set(i,p) ;
    	System.out.println("\nLe Plat apres modification : \n"+p.toString());	}
    	    }
		if(trouve==false) { System.out.println("\nLe Plat"+p.toString()+" N'existe Pas");  }

    }
    public void ModifierPlatDesignation(Plat p,String designation ) {boolean trouve=false ;
    if(ChefRestau.listePlat.isEmpty()==true) {System.out.println("\nVous N'avez Aucun Plat Dans Votre Liste") ; }
     	for(int i = 0; i<ChefRestau.listePlat.size();i++)
    	{ if(ChefRestau.listePlat.get(i)==p) {trouve=true ;p.setDesignation(designation);ChefRestau.listePlat.set(i,p) ;
    	System.out.println("\nLe Plat apres modification : \n"+p.toString());}}
    	    
    			if(trouve==false) { System.out.println("\nLe Plat"+p.toString()+" N'existe Pas");  }
	
    }
    public void ModifierPlatConditionement(Plat p, String conditionement) {boolean trouve=false ;
    if(ChefRestau.listePlat.isEmpty()==true) {System.out.println("\nVous N'avez Aucun Plat Dans Votre Liste") ; }
    	for(int i = 0; i<ChefRestau.listePlat.size();i++)
    	{ if(ChefRestau.listePlat.get(i)==p) {trouve=true ;p.setConditionement(conditionement);ChefRestau.listePlat.set(i,p) ;
    	System.out.println("\nLe Plat apres modification : \n"+p.toString());}}
    	    
    			if(trouve==false) { System.out.println("\nLe Plat"+p.toString()+" N'existe Pas");  }
    }
    public void ModifierPlatNature(Plat p, String nature) {boolean trouve=false ;
    	 if(ChefRestau.listePlat.isEmpty()==true) {System.out.println("\nVous N'avez Aucun Plat Dans Votre Liste") ; }
    	for(int i = 0; i<ChefRestau.listePlat.size();i++)
    	{ if(ChefRestau.listePlat.get(i)==p) {trouve=true ;p.setNature(nature);ChefRestau.listePlat.set(i,p) ;
    	System.out.println("\nLe Plat apres modification : \n"+p.toString());}}
    			if(trouve==false) { System.out.println("\nLe Plat"+p.toString()+" N'existe Pas");  }	    
    }
    public void ModifierPlatPrix(Plat p, double prix) {boolean trouve=false ;
    	if(ChefRestau.listePlat.isEmpty()==true) {System.out.println("\nVous N'avez Aucun Plat Dans Votre Liste") ; }
		for(int i = 0; i<ChefRestau.listePlat.size();i++)
{ if(ChefRestau.listePlat.get(i)==p) {trouve=true;p.setPrix(prix);ChefRestau.listePlat.set(i,p) ;
	System.out.println("\nLe Plat apres modification : \n"+p.toString());}}
		if(trouve==false) { System.out.println("\nLe Plat"+p.toString()+" N'existe Pas");  }	
    }
    public void ModifierPlatSpecialité(Plat p, String specialité ) {boolean trouve=false ;
    	if(ChefRestau.listePlat.isEmpty()==true) {System.out.println("\nVous N'avez Aucun Plat Dans Votre Liste") ; }
		for(int i = 0; i<ChefRestau.listePlat.size();i++)
{ if(ChefRestau.listePlat.get(i)==p) {trouve=true ;p.setSpecialité(specialité);ChefRestau.listePlat.set(i,p) ;
		System.out.println("\nLe Plat apres modification : \n"+p.toString());	}}
    
		if(trouve==false) { System.out.println("\nLe Plat"+p.toString()+" N'existe Pas");  }	
    }
    public void ModifierBoissonReference(Boisson b ,int reference) {boolean trouve=false ;
    	if(ChefRestau.listeBoisson.isEmpty()==true) {System.out.println("\nVous N'avez Aucunne Boisson Dans Votre Liste") ; }
		for(int i = 0; i<ChefRestau.listeBoisson.size();i++)
{ if(ChefRestau.listeBoisson.get(i)==b) {trouve=true ;b.setReference(reference);ChefRestau.listeBoisson.set(i,b) ;
	System.out.println("\nLa Boisson apres modification : \n"+b.toString());}}
		if(trouve==false) { System.out.println("\nLa Boisson"+b.toString()+" N'existe Pas");  }	
    }
    public void ModifierBoissonDesignation(Boisson b,String designation ) {boolean trouve=false ;
    	if(ChefRestau.listeBoisson.isEmpty()==true) {System.out.println("\nVous N'avez Aucunne Boisson Dans Votre Liste") ; }
		for(int i = 0; i<ChefRestau.listeBoisson.size();i++)
{ if(ChefRestau.listeBoisson.get(i)==b) {trouve=true ;b.setDesignation(designation);ChefRestau.listeBoisson.set(i,b) ;
		System.out.println("\nLa Boisson apres modification : \n"+b.toString());}}
		if(trouve==false) { System.out.println("\nLa Boisson"+b.toString()+" N'existe Pas");  }	
    }
    public void ModifierBoissonConditionement(Boisson b, String conditionement) {boolean trouve=false ;
    if(ChefRestau.listeBoisson.isEmpty()==true) {System.out.println("\nVous N'avez Aucunne Boisson Dans Votre Liste") ; }
		for(int i = 0; i<ChefRestau.listeBoisson.size();i++)
{ if(ChefRestau.listeBoisson.get(i)==b) {trouve=true ;b.setConditionement(conditionement);ChefRestau.listeBoisson.set(i,b) ;
		System.out.println("\nLa Boisson apres modification : \n"+b.toString());}}
		if(trouve==false) { System.out.println("\nLa Boisson"+b.toString()+" N'existe Pas");  }
    }
    public void ModifierBoissonNature(Boisson b, String nature) {boolean trouve=false ;
    if(ChefRestau.listeBoisson.isEmpty()==true) {System.out.println("\nVous N'avez Aucunne Boisson Dans Votre Liste") ; }
    	for(int i = 0; i<ChefRestau.listeBoisson.size();i++)
    	{ if(ChefRestau.listeBoisson.get(i)==b) {b.setNature(nature);ChefRestau.listeBoisson.set(i,b) ;
		System.out.println("\nLa Boisson apres modification : \n"+b.toString());}}
		if(trouve==false) { System.out.println("\nLa Boisson"+b.toString()+" N'existe Pas");  }
    }
    public void ModifierBoissonPrix(Boisson b, double prix) {boolean trouve=false ;
    	if(ChefRestau.listeBoisson.isEmpty()==true) {System.out.println("\nVous N'avez Aucunne Boisson Dans Votre Liste") ; }
    	for(int i = 0; i<ChefRestau.listeBoisson.size();i++)
    	{ if(ChefRestau.listeBoisson.get(i)==b) {trouve=true ;b.setPrix(prix);ChefRestau.listeBoisson.set(i,b) ;
    	System.out.println("\nLa Boisson apres modification : \n"+b.toString());}}

		if(trouve==false) { System.out.println("\nLa Boisson"+b.toString()+" N'existe Pas");  }
    }
    
    public void AjouterQuantitéIngredient(Ingredient ingredient,int qtt)
    {FicheTech f ;
    for (int i=0; i<ChefRestau.listePlat.size();i++)
    {  f=ChefRestau.listePlat.get(i).getFiche() ; 
    for (int j=0; j<f.ListeIngredient.size();j++)
    {  if (f.ListeIngredient.get(j)==ingredient) {f.ListeIngredient.get(j).setQuantitéstocké(f.ListeIngredient.get(j).getQuantitéstocké()+qtt);}   }
   ChefRestau.listePlat.get(i).setFiche(f);
    }
    	
    }
    public void VoirIngredientsQuantitéFaible()
    { ArrayList<String> Liste= new ArrayList<String>();
    FicheTech f ;
    for (int i=0; i<ChefRestau.listePlat.size();i++)
    {  f=ChefRestau.listePlat.get(i).getFiche() ; 
    for (int j=0; j<f.ListeIngredient.size();j++)
    {  if (f.ListeIngredient.get(j).getQuantitéstocké()<4*f.ListeIngredient.get(j).getQuantité()) {Liste.add(f.ListeIngredient.get(j).getNom())  ; }
    
   
    }}  
    
   
    Set<String> set = new HashSet<String>() ;
    set.addAll(Liste) ;
    ArrayList<String> Liste2= new ArrayList<String>(set);
    System.out.println("\nLES PLATS DONT LE STOCK EST BIENTOT EPUISE SONT :") ;
    for(int i=0;i<Liste2.size();i++)
    {   
    	System.out.println(Liste2.get(i) ) ;
    }
    }
    
     public void ModifierBoissonType(Boisson b, String type) {boolean trouve=false ;
    	if(ChefRestau.listeBoisson.isEmpty()==true) {System.out.println("\nVous N'avez Aucunne Boisson Dans Votre Liste") ; }
    	for(int i = 0; i<ChefRestau.listeBoisson.size();i++)
    	{ if(ChefRestau.listeBoisson.get(i)==b) {trouve=true ;b.setTypeBoisson(type);ChefRestau.listeBoisson.set(i,b) ;
    	System.out.println("\nLa Boisson apres modification : \n"+b.toString());}}
		if(trouve==false) { System.out.println("\nLa Boisson"+b.toString()+" N'existe Pas");  }
    }
    
    	public void envoyerMail(Client x , int id) {
           String s = ("La Commande NO "+id+"a été validée.\nVous pouvez laisser une note et un commentaire  ");
           System.out.println("\nLa Commande NO "+id +"a été validée.\nVous pouvez laisser une note et un commentaire  " );
            x.listeMail.add(s);
        }
            


    
    public void envoyerSMS(Commande c, Client x) {
    	String s = ("\nLa Commande NO "+c.getIdCommande() +"a été validée.\nVous pouvez laisser une note et un commentaire  " );
    	 System.out.println("\nLa Commande NO "+c.getIdCommande() +"a été validée.\nVous pouvez laisser une note et un commentaire  " );
    	x.listeSMS.add(s);
       
    }

    public void AffecterCommandeLivreur(Livreur l,int idCommande) {
    	boolean trouve = false;
    
    	for(int i = 0 ; i<this.listeCommande.size();i++){
	    	if(this.listeCommande.get(i).getidCommande()== idCommande){
	    		Commande c = this.listeCommande.get(i); trouve = true; 
	    		    	l.listeCommandeAValide.add(c);
    	                Client.listeAllCommande.remove(c);    }
	    	if (trouve == false) {System.out.println("COMMANDE INEXISTANTE");}
    	}
    	
    	 
    	
    	
    }

public void VoirHistroqueCommandeRestaurant()
{if(Client.listeAllCommande.isEmpty()==true) {System.out.println("\nLa Liste Des Commande du Restaurant est vide") ; }
	for(int i=0;i<Client.listeAllCommande.size();i++)
	{   Client.listeAllCommande.get(i).Afficher(); }

}
    public void ValiderTransfertCommande(Commande c, Livreur l) {
    	for(int i=0;i<l.listeCommandeALivree.size();i++)
    	{	if(l.listeCommandeALivree.get(i)==c ) {
    	c.setEtatCommande("Livrée");  l.listeCommandeALivree.remove(c) ;  
	 
	l.setNbrLivraison(l.getNbrLivraison()+1);
	c.setheureLivraisonCommande();
	l.listeCommandeLivree.add(c) ; 
    } }}
    public void VoirCommandeLivreur(Livreur l) {
    	if(l.listeCommandeLivree.isEmpty()==true) {System.out.println("\nLe livreur "+l.toString()+"N'a encore effectué aucunne Livraison") ; }
    	for(int i=0;i<l.listeCommandeLivree.size();i++)
    	{   	listeCommandeLivree.get(i).AfficherCommandeLivree();			}
    }
    public void VoirMeilleurClient()
    {  System.out.println("\nLe meilleur Client est : ");Restaurant.stat.cmax.Afficher();
    System.out.println("\nAvec <<"+Restaurant.stat.cmax.getNbrCommande()+">>Commande ");
			}

    public void VoirMeilleurLivreur()
    {  System.out.println("\nLe meilleur livreur est : ");Restaurant.stat.lmax.Afficher();
    System.out.println("\nAvec <<"+Restaurant.stat.lmax.getNbrLivraison()+">>Livraison ");
			}

    public void VoirMeilleurPlat()
    {  System.out.println("\nLe Plat Le Plus Commandé est : ");Restaurant.stat.pmax.Afficher();
    System.out.println("\nAvec <<"+Restaurant.stat.pmax.getNbrFois()+">>Commande ");
			}
    public void VoirMeilleurBoisson()
    {  System.out.println("\nLa Plat La Plus Commandé est : ");Restaurant.stat.bmax.Afficher();
    System.out.println("\nAvec <<"+Restaurant.stat.bmax.getNbrFois()+">>Commande ");
			}
    public void VoirTop5Boisson()
    {  Restaurant.stat5Boisson();
    System.out.println("Les Boissons les plus Commandé Sont :") ;
    for(int i=0;i<Restaurant.stat.top5boisson.size();i++)
    { Restaurant.stat.top5boisson.get(i).Afficher();}

    } 

    public void VoirTop5Plat()
    {  Restaurant.stat5Plat();
    System.out.println("Les Plats les plus Commandé Sont :") ;
    for(int i=0;i<Restaurant.stat.top5Plat.size();i++)
    { Restaurant.stat.top5Plat.get(i).Afficher();}

    } 
    Plat platJour ;
    Boisson boissonJour ;
    public void creeMenuJour()
    {Random random = new Random();
    int nb,nb2;
    nb = random.nextInt(ChefRestau.listePlat.size())  ;
    nb2 = random.nextInt(ChefRestau.listeBoisson.size());
    
    
   this.platJour=ChefRestau.listePlat.get(nb)  ;
  this.boissonJour=ChefRestau.listeBoisson.get(nb2)  ;


    }
    
   public Plat getPlatJour() {return this.platJour ;}
   public Boisson getBoissonJour() {return this.boissonJour ;}


}
