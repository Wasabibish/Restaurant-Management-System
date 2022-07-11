package Divers;



import Personne.Client;
import Personne.Livreur;


import Nourriture.Boisson;
import Nourriture.FicheTech;
import Nourriture.Ingredient;
import Nourriture.MethodePrep;
import Nourriture.Plat;
import Personne.ChefRestau;
import Personne.Profile;
import Personne.Restaurant;
import Personne.Utilisateur;

public class TestForOld {

	  public static void main(String[] args) {

		  Restaurant Saveur = new Restaurant(); 
		  Profile profileChef = new Profile ("Chef","restau");
		  Profile client = new Profile("ikram","abcd");
		  Profile livreur = new Profile("livreur","abc");
		  ChefRestau chef = new ChefRestau("Chef","Pizzario","Babez",055555,0,0,"chef@gmail.com",profileChef);
		  Client c = new Client("Ikram","Djeghali","alger",0777,0,"ikram@gmail.com",client);
		  Utilisateur u = new Utilisateur();
		  Livreur l = new Livreur("livreur1","ben","kouba", 0556, 0, 0,"livreur@gmail.com", livreur);
		  
		  Ingredient carottes = new Ingredient("carottes",10,50,"kg",50);
		  Ingredient patate = new Ingredient("pomme de terre ",10,50,"kg",60);
		  Ingredient tomate = new Ingredient("tomate",10,50,"kg",40);
		  Ingredient salade = new Ingredient("salade",10,50,"g",70);
		  Ingredient orange = new Ingredient("orange",2,50,"g",80);
		  MethodePrep m = new MethodePrep("friture",15,"Mettres les pommes de terre decoupées dans l'huile");
		  MethodePrep m2 = new MethodePrep("Preparation",10,"Decoupez les legumes en dés");
		  MethodePrep m3 = new MethodePrep("Preparation",30,"\n-Faire bouillir l'eau\n-Decoupez les legumes\nMettre les legumes\nMixez le tout");
		  MethodePrep m4 = new MethodePrep("Preparation",10,"\n-Decoupez les oranges\n-Pressez les\n-Ajouter de leau et du sucre");
		  FicheTech f = new FicheTech(patate, m);
		  FicheTech f2 = new FicheTech(salade, m2);
		  FicheTech f3 = new FicheTech(patate, m3);
		  FicheTech f4 = new FicheTech(orange,m4);
		  f.AjouterMethode(m);
		  f.AjouterIngredient(patate);
		  f2.AjouterIngredient(tomate);
		  f2.AjouterIngredient(carottes);
		  f2.AjouterMethode(m2);
		  f3.AjouterIngredient(tomate);
		  f3.AjouterIngredient(patate);
		  f3.AjouterIngredient(carottes);
		
		  Plat p = new Plat(15555,"frites", "barquette", "chaude", f,"autre");
		  Plat p2 = new Plat(16698,"salade simple", "assiette", "froide", f2,"autre");
		  Plat p3 = new Plat(1215,"soupe", "récipient_avec_couvercle", "chaude", f3,"autre");
		  Boisson b = new Boisson(147,"jus d'orange","gobelet","froide",f4,"jus");
		  
		  chef.AjouterPlat(p); chef.AjouterPlat(p2); chef.AjouterPlat(p3);chef.AjouterBoisson(b);
		  chef.ModifierPlatSpecialité(p3, "occidentale");
		  chef.creeMenuJour();
		  chef.VoirHistroqueCommandeRestaurant();
		  u.ajouterPlatPanier(p3, 2); u.ajouterPlatPanier(p2, 1); u.ajouterBoissonPanier(b, 1);
		  u.VoirPanier();
		  u.consulter_type_boissons();
		  u.ModifierQuantiteBoissonPanier("jus d'orange", 2);
		  u.afficherPlatParSpecialite("autre");
		  u.afficherProduit("frites");
		  u.VoirPanier();
		  chef.AjouterClient(c);chef.AjouterLivreur(l);
		  c.Authentifier("ikram", "abcd");
		  c.afficherHistorique();
		  c.ajouterPlatPanier(p2, 2);c.ajouterBoissonPanier(b, 2);
		  c.PasserCommande("alger");
		  c.suivreCommande(0);
		  chef.AffecterCommandeLivreur(l, 0);
		  l.validerAffectation(0);
		  chef.envoyerMail(c, 0);
		  c.VoirFiche(b);
		  l.VoirMesLivraions();
		  c.PayerCommande(0);
		  c.validerReceptionCommande(0, l);
		 Saveur.statPlat();
		 chef.VoirTop5Plat();
		 c.MettreUnAvis("Super restaurant ! ");
		 c.MettreUneNote("cinq");
		 c.VoirEMail();
		 c.VoirPanier();
		 c.suivreCommande(0);
		 carottes.Afficher();
		 c.ajouterPlatPanier(p3, 4);
		 c.PasserCommande("alger");
		 c.suivreCommande(1);
		  chef.AffecterCommandeLivreur(l, 1);
		  l.validerAffectation(1);
		  carottes.Afficher();

		chef.VoirIngredientsQuantitéFaible(); 
		 
	
		  
		  
	
		  
	}
}