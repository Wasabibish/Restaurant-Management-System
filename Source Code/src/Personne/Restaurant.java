package Personne;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import Divers.Commande;
import Divers.Statistique;
import Enum.Note;
import Enum.SpecialitéP;
import Enum.TypeBoisson;
import Nourriture.Boisson;
import Nourriture.Plat;

public class Restaurant {
	static ChefRestau chefrestaurant ;
	static Statistique stat = new Statistique(); 

   private String nom;
   private String Adresse;
   static List<String> listeCommentaires = new ArrayList<String>();
   static List<Note> listeNotes = new ArrayList<Note>();
   static List<Profile> listeProfile = new ArrayList<Profile>();
   
   public String getNom() {return this.nom;}
   public String getadr() {return this.Adresse;}
   public void setNom(String s) {this.nom = s;}
   public void setAdr(String s) {this.Adresse = s;}
   
   
   public void ModifierBonus ( Client c ) { 
   	 if ((c.getNbrCommande() % 20) == 0 )
	   c.profile.setBonus(c.profile.gettBonus()+200);
      
   }
   
   public void statClient() {
	   	int max = ChefRestau.listeClient.get(0).getNbrCommande();
	   	Client cmax = null, c = null;
	   	
	   	System.out.println("\nLe nombre total des clients : "+ChefRestau.listeClient.size()+1);
	       for ( int i = 0; i < ChefRestau.listeClient.size(); i ++) {
	       	c = ChefRestau.listeClient.get(i);
	       	System.out.println("\nLe client : "+c.getNom()+c.getPrenom()+" , "+c.getNbrCommande());
	       	if (ChefRestau.listeClient.get(i).getNbrCommande()> max) {
	       		max = ChefRestau.listeClient.get(i).getNbrCommande();
	       		cmax = ChefRestau.listeClient.get(i);
	       		

	       		
	       	}
	       	
	       }Restaurant.stat.cmax=cmax ;
	       System.out.println("\nLe meilleur client est : "+cmax.getNom()+cmax.getPrenom()
			+("Nombre de commandes realisées : "+max));
	      
	   }
   public void statChiffre() { 
   	double prix = 0.0;
       for(int i=0;i<Client.listeAllCommande.size();i++) {
       	prix = prix + Client.listeAllCommande.get(i).getMontant();
       }
       System.out.println("Le chiffre mensuel : "+prix);
   }
	   
	   public void statLivreur() {
	   	int max = ChefRestau.listeLivreur.get(0).getNbrLivraison();
	   	Livreur lmax = null, l = null;
	   	
	   	System.out.println("\nLe nombre total des livreurs : "+ChefRestau.listeLivreur.size()+1);
	       for ( int i = 0; i < ChefRestau.listeLivreur.size(); i ++) {
	       	l = ChefRestau.listeLivreur.get(i);
	       	System.out.println("\nLe Livreur: "+l.getNom()+l.getPrenom()+" , "+l.getNbrLivraison());
	       	if (ChefRestau.listeLivreur.get(i).getNbrLivraison()> max) {
	       		max = ChefRestau.listeLivreur.get(i).getNbrLivraison();
	       		lmax = ChefRestau.listeLivreur.get(i);
	       		
	       	}

	       }Restaurant.stat.lmax=lmax ;
	     
	   }

	   /**
	    * 
	    */
	   public void statBoisson() {
	   	int max = ChefRestau.listeBoisson.get(0).getNbrFois();
	   	Boisson bmax = null ;
	       for(int i = 0; i< ChefRestau.listeBoisson.size();i++) {
	       	if (ChefRestau.listeBoisson.get(i).getNbrFois()>max) {
	       		bmax = ChefRestau.listeBoisson.get(i);
	       		max = ChefRestau.listeBoisson.get(i).getNbrFois();
	       	}
	       	
	       }Restaurant.stat.bmax=bmax ;
	       System.out.println("La meilleure boisson : "+bmax.getDesignation()+" avec<<"+max+">> nombre de commande");
	   }

	   /**
	    * 
	    */
	   public void statPlat() {
	   	int max = ChefRestau.listePlat.get(0).getNbrFois();
	   	Plat pmax = new Plat();
	   	if(ChefRestau.listePlat.isEmpty()) {System.out.println("VIDE");}else {
	       for(int i = 0; i< ChefRestau.listePlat.size();i++) {
	       	if (ChefRestau.listePlat.get(i).getNbrFois()>max) {
	       		pmax = ChefRestau.listePlat.get(i);
	       		max = ChefRestau.listePlat.get(i).getNbrFois();
	       	}}
	       	
	       }Restaurant.stat.pmax=pmax ;
	       System.out.println("La meilleur plat : "+pmax.getDesignation()+" avec<<"+max+">> nombre de commande");
	   }
   public void setRecommendation(Client c) {
	   int cpt = 0 ;
	    for(int j = 0; j<c.p.PlatFavoris.size() && j<3;j++ ) {
	SpecialitéP p =  c.p.PlatFavoris.get(0).getSpecialité(); 
	for (int i = 0; i<ChefRestau.listePlat.size();i++) {
		if (ChefRestau.listePlat.get(i).getSpecialité() == p && cpt<2  ) {
			c.p.Recommendations.add(ChefRestau.listePlat.get(i));
			cpt++;
		}}
	}
	    int cpt2 = 0 ;
	    for(int j = 0; j<c.p.BoissonFavoris.size() && j<3;j++ ) {
	TypeBoisson p =  c.p.BoissonFavoris.get(0).getTypeBoisson(); 
	for (int i = 0; i<ChefRestau.listePlat.size();i++) {
		if (ChefRestau.listeBoisson.get(i).getTypeBoisson() == p && cpt2<2  ) { 
			c.p.Recommendations.add(ChefRestau.listePlat.get(i));
			cpt++;
		}}
	}
			  }
		  
   
   public void setPlatFavoris() {

          for (int i = 0; i<ChefRestau.listeClient.size();i++) {
             Client c = ChefRestau.listeClient.get(i);
              for (int j = 0 ; j<c.historique.size();i++ ) {
                Commande cc = c.historique.get(j);


                 for (int z = 0;z<cc.listePlatCommande.size();z++) {int cpt=0 ;Plat p=cc.listePlatCommande.get(z)  ;//mettre chaque plat dans p
                 for(int k=0;k<c.historique.size();k++)  
                 {
                     if( c.historique.get(k).listePlatCommande.contains(p)) {cpt++ ;   }


                 }

                 if(cpt>5) {c.p.PlatFavoris.add(p);


                 }
              }


              } }}
   
   public void setBoissonFavoris() {
	   for (int i = 0; i<ChefRestau.listeClient.size();i++) {
           Client c = ChefRestau.listeClient.get(i);
            for (int j = 0 ; j<c.historique.size();i++ ) {
              Commande cc = c.historique.get(j);


               for (int z = 0;z<cc.listeBoissonCommande.size();z++) {int cpt=0 ;Boisson p=cc.listeBoissonCommande.get(z)  ;//mettre chaque plat dans p
               for(int k=0;k<c.historique.size();k++)  
               {
                   if( c.historique.get(k).listeBoissonCommande.contains(p)) {cpt++ ;   }


               }

               if(cpt>5) {c.p.BoissonFavoris.add(p);


               }
            }


            } }
	   
   }
   
   static public void stat5Plat() {
	   	ArrayList<Integer> listeval = new ArrayList<Integer>();
	       for(int i = 0; i< ChefRestau.listePlat.size();i++) {
	       	listeval.add(ChefRestau.listePlat.get(i).getNbrFois())  ; }
	       Collections.sort(listeval);
	       Collections.reverse(listeval); 
	       do {  
	       	for(int i = 0; i< listeval.size();i++) {
	       		for (int j=0;j<ChefRestau.listePlat.size();j++)
	       		{if (ChefRestau.listePlat.get(j).getNbrFois()==listeval.get(i)   ) 
	       		{if(Restaurant.stat.top5Plat.size()<=5) {Restaurant.stat.top5Plat.add(ChefRestau.listePlat.get(j)) ;  }  }        
	       			
	       		}        			
	       	}
	       	
	       }while (Restaurant.stat.top5Plat.size() <= Math.min(5,ChefRestau.listePlat.size())) ;
	   }
	   static public void stat5Boisson() {
	   	ArrayList<Integer> listeval = new ArrayList<Integer>();
	       for(int i = 0; i< ChefRestau.listeBoisson.size();i++) {
	       	listeval.add(ChefRestau.listeBoisson.get(i).getNbrFois())  ; }
	       Collections.sort(listeval);
	       Collections.reverse(listeval);
	       do {  
	       	for(int i = 0; i< listeval.size();i++) {
	       		for (int j=0;j<ChefRestau.listeBoisson.size();j++)
	       		{if (ChefRestau.listeBoisson.get(j).getNbrFois()==listeval.get(i)   ) 
	       		{if(Restaurant.stat.top5boisson.size()<=5) {Restaurant.stat.top5boisson.add(ChefRestau.listeBoisson.get(j)) ;  }  }        
	       			
	       		}        			
	       	}
	       	
	       }while (Restaurant.stat.top5boisson.size() <= Math.min(5,ChefRestau.listeBoisson.size())) ;
	   }
	 
		public String toString() {
			return ("Le Restaurant : "+this.nom+"\nAdresse : "+this.Adresse );
			
		}
	public  void Afficher() {System.out.println(this.toString() );  }





}
