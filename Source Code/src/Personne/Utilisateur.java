package Personne;



import Divers.Panier;
import Nourriture.Boisson;
import Nourriture.Plat;
import Nourriture.Produit;
import Enum.SpecialitéP;
import Enum.TypeBoisson;
public  class Utilisateur {

	public Panier pa = new Panier();
	
    public void VoirPanier() {
    	
    	System.out.println("\nListe des Plats dans le panier") ;
	     for(int i = 0; i<pa.listePlatPanier.size();i++)
	      System.out.println("\nplat"+(i+1)+":"+pa.listePlatPanier.get(i).toString()+"\nQuantité : "+this.pa.ListeQtPlat.get(i)) ;
    	
    	if(pa.listeBoissonPanier == null) {System.out.println("\nListe des boissons  vide !");
    	}else {
	     System.out.println("\nListe des Boissons dans le panier :") ;
	     for(int i = 0; i<pa.listeBoissonPanier.size();i++)
	     { System.out.println("\nBoisson"+(i+1)+":"+this.pa.listeBoissonPanier.get(i).toString()+"\nQuantité : "+this.pa.ListeQtBoisson.get(i)) ;}
	     System.out.println("\nPrix Panier :"+this.PrixPanier()+"DA"  ) ;}

        
    }
	 public void ajouterPlatPanier(Plat p,int Qt){
		 int i = 0;  
		 int val;
		 boolean trouve =false;
         for(i=0;i<this.pa.listePlatPanier.size();i++)  
         {  
            if(this.pa.listePlatPanier.get(i).equals(p))  
            {     val= i ; trouve=true  ;   
              	  trouve = true; 
              	this.pa.ListeQtPlat.set(val,this.pa.ListeQtPlat.get(val)+Qt  ) ;
            }  
         }  
		if (trouve==false) {		this.pa.listePlatPanier.add(p);
										this.pa.ListeQtPlat.add(Qt); }
	System.out.println("\nLe plat a bien été Ajouté Au panier") ;	
	}
	  public void ajouterBoissonPanier(Boisson b,int Qt){
		 int i = 0;  
		 int val;
		 boolean trouve =false;
         for(i=0;i<this.pa.listeBoissonPanier.size();i++)  
         {  
            if(this.pa.listeBoissonPanier.get(i).equals(b))  
            {     val= i ; trouve=true  ;   
              	  trouve = true; 
              	
              	this.pa.ListeQtBoisson.set(val,this.pa.ListeQtPlat.get(val)+Qt  ) ;
            }  
         }  
		if (trouve==false) {		this.pa.listeBoissonPanier.add(b) ;
										this.pa.ListeQtBoisson.add(Qt); }
		System.out.println("\nLe plat a bien été Ajouté Au panier") ;	
		
	}
	  public void afficherProduit(String s) { 
	         boolean trouve =false ;
	         
	         
	         for(int i = 0; i<ChefRestau.listePlat.size();i++)
	         { if(ChefRestau.listePlat.get(i).getDesignation()==s)
	    {trouve=true ;System.out.println("/////Produit/////\n") ;ChefRestau.listePlat.get(i).Afficher() ;  }}

	         for(int i = 0; i<ChefRestau.listeBoisson.size();i++) {
	         if(ChefRestau.listeBoisson.get(i).getDesignation()==s )
	        {trouve=true ;System.out.println("/////Produit/////\n") ;ChefRestau.listeBoisson.get(i).Afficher() ;  }

	         }
	if (trouve==false ) { System.out.println("\nLa produit n'existe pas!! "+s+"n'existe pas") ; } 
	     }
    
	  public void afficherPlatParSpecialite(String s) {
		  System.out.println("\nLa specialité : "+s+"\n\t---------") ;
	         for(int i = 0; i<ChefRestau.listePlat.size();i++)
	         { 
	        	 if(ChefRestau.listePlat.get(i).getSpecialité()==SpecialitéP.valueOf(s))
	    {ChefRestau.listePlat.get(i).Afficher() ;  }
	        	 

	         } System.out.println("\nIl n'ya pas de plat dans cette specialité");
	         }

   


    public double PrixPanier() {double a,prix=0 ;int b;
        for(int i = 0; i<pa.listePlatPanier.size();i++)
        { a=pa.listePlatPanier.get(i).getPrix();      
        b=	pa.ListeQtPlat.get(i) ;
        prix=prix+(a*b) ;  }
        for(int i = 0; i<pa.listeBoissonPanier.size();i++)
        {   a=pa.listeBoissonPanier.get(i).getPrix();      
        b=	pa.ListeQtBoisson.get(i) ;
        prix=prix+(a*b) ;                            
        }
        return prix ;
        
    }

    public void Consulter_liste_produits() { 
        System.out.println("\nListe des Plats :") ;
        
		 for(int i = 0; i<ChefRestau.listePlat.size();i++)
	         
        
        { ChefRestau.listePlat.get(i).Afficher() ;}
		 System.out.println("\nListe des Boissons :") ;
		 for(int i = 0; i<ChefRestau.listeBoisson.size();i++)
        { ChefRestau.listeBoisson.get(i).Afficher() ;}
	 }

    public void consulter_type_boissons() {
    	for(TypeBoisson TypeB : TypeBoisson.values()){
    		
    		System.out.println(TypeB);}
      
    }

    public void VoirFiche(Produit p) {
    	System.out.println("\nLa fiche technique de "+p.getDesignation()+"\n\t--------------\n");
    p.getFiche().AfficherTout();
    }
       
    
    public void SupprimerPlatPanier (String p) {
    	boolean tr=false ;
    	   for(int i = 0; i<this.pa.listePlatPanier.size();i++)
    	   {if(this.pa.listePlatPanier.get(i).getDesignation()==p) 
    	   		{System.out.println("\nLE PLAT SUIVANT A ETE SUPPRIMER:<<"+this.pa.listePlatPanier.get(i).getDesignation()+">> DE QUANTITE :"+this.pa.ListeQtPlat.get(i) ) ;
    		   tr=true ;this.pa.listePlatPanier.remove(i) ;this.pa.ListeQtPlat.remove(i)  ;  }  
    		   
    	   
    	   }
    	if (tr==false) {System.out.println("\nLE PLAT <<"+p+">> N'EXISTE PAS DANS VOTRE PANIER") ;    }
    }
    
    public void SupprimerBoissonPanier (String p) {
    	boolean tr=false ;
    	   for(int i = 0; i<this.pa.listeBoissonPanier.size();i++)
    	   {if(this.pa.listeBoissonPanier.get(i).getDesignation()==p) 
    	   		{System.out.println("LA BOISSON SUIVANT A ETE SUPPRIMER:<<"+this.pa.listeBoissonPanier.get(i).getDesignation()+">> DE QUANTITE :"+this.pa.ListeQtBoisson.get(i) ) ;
    		   tr=true ;this.pa.listeBoissonPanier.remove(i) ;this.pa.ListeQtBoisson.remove(i)  ;  }  
    		   
    	   
    	   }
    	if (tr==false) {System.out.println("\nLA BOISSON<<"+p+">> N'EXISTE PAS DANS VOTRE PANIER") ;    }
    }
    public void ModifierQuantitePlatPanier (String p,int b) {
    	boolean tr=false ;
    	   for(int i = 0; i<this.pa.listePlatPanier.size();i++)
    	   {if(this.pa.listePlatPanier.get(i).getDesignation()==p) 
    	   		{System.out.println("\nLA QUANTITE DU PLAT SUIVANT A ETE MODIFIE:<<"+this.pa.listePlatPanier.get(i).getDesignation()+">> \nAncienne Qantite :"+this.pa.ListeQtPlat.get(i)+"\\Nouvelle Quantite"+b ) ;
    		   tr=true ;this.pa.ListeQtPlat.set(i, b)  ;  }  
    		   
    	   
    	   }
    	if (tr==false) {System.out.println("\nLA BOISSON<<"+p+">> N'EXISTE PAS DANS VOTRE PANIER") ;    }
    }	  
    public void ModifierQuantiteBoissonPanier (String p,int b) {
    	boolean tr=false ;
    	   for(int i = 0; i<this.pa.listeBoissonPanier.size();i++)
    	   {if(this.pa.listeBoissonPanier.get(i).getDesignation()==p) 
    	   		{System.out.println("\nLA QUANTITE DE LA BOISSON SUIVANT A ETE MODIFIE:<<"+this.pa.listeBoissonPanier.get(i).getDesignation()+">> \nAncienne Qantite :"+this.pa.ListeQtBoisson.get(i)+"\\Nouvelle Quantite"+b ) ;
    		   tr=true ;this.pa.ListeQtBoisson.set(i,b)  ;  }  
    		   
    	   
    	   }
    	if (tr==false) {System.out.println("\nLA BOISSON<<"+p+">> N'EXISTE PAS DANS VOTRE PANIER") ;    }
    	
    }
    

   
}
