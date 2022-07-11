package Nourriture;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class FicheTech {
	MethodePrep methodePrep;
	public List<Ingredient> ListeIngredient = new ArrayList<Ingredient>();
	
	public void AjouterMethode(MethodePrep m) {
       this.methodePrep = m;
       System.out.println("La methode est ajouté!\n");
     
       
    }
	public FicheTech(){}
   public FicheTech(Ingredient  i,MethodePrep methode)
   { 		this.ListeIngredient.add(i);
   			this.methodePrep=methode ;}

    public void ModifierMethodeNom(String nom) {
       methodePrep.setNomEtape(nom);
       System.out.println("\nLa methode apres modification : \n"+methodePrep.toString());
    }
    public void ModifierMethodeTemps(int temps) {
        methodePrep.setTemps(temps);
        System.out.println("\nLa methode apres modification : \n"+methodePrep.toString());
    } 
    public void ModifierMethodeDesc(String desc) {
        methodePrep.setDescription(desc);
        System.out.println("\nLa methode apres modification : \n"+methodePrep.toString());
    }

    

    
    public void AfficherTout() {
    	System.out.println("\nLes ingredients : ");
    	for(int i = 0 ; i < ListeIngredient.size(); i++)
    		   ListeIngredient.get(i).Afficher();
    	System.out.println("\nMethode de preparation : ");
    	methodePrep.Afficher();
    	
    	
    }
    

    public Boolean RechercherIngredient(Ingredient x) {
    	
    	if (ListeIngredient.contains(x)==true) {return true  ;}
    		else {return false  ;}
	
    }
    public void AjouterIngredient(Ingredient i) {
    	if (this.RechercherIngredient(i) == false) {
			ListeIngredient.add(i);
			System.out.println("-Ingredient ajouté : " + i.toString());
		}else{
			System.out.println("L'ingredient existe déjà");
		}
    }

    
    public void ModifierIngredientNom(String nom, Ingredient i) {
       	Iterator<Ingredient> it = ListeIngredient.iterator();
    		while(it.hasNext())
    		{	if( it == i) { i.setNome(nom);}
    		it.next() ;}
       System.out.println("\n\tL'ingredient apres modification : \n\t\t----------"+i.toString());
        }
    public void ModifierIngredientQuantité(int qt,Ingredient i) {
     	Iterator<Ingredient> it = ListeIngredient.iterator();
	
		while(it.hasNext())
		{
		
		if( it == i) {  i.setQuantité(qt);}
		it.next() ;
		} 
       
        System.out.println("\n\tL'ingredient apres modification : \n\t\t----------"+i.toString());
    }
    public void ModifierIngredientUnité(String unitéM,Ingredient i) {
    	
		for(int j=0;j<ListeIngredient.size();j++)
		
		{
		if( ListeIngredient.get(j) == i) {  i.setUnité(unitéM);ListeIngredient.set(j,i) ;}
		
		}
		System.out.println("\n\tL'ingredient apres modification : \n\t\t----------"+i.toString());
    }
    
    
    public void ModifierIngredientPrix(double prix,Ingredient i) {
      
		for(int j=0;j<ListeIngredient.size();j++)
			
		{
		if( ListeIngredient.get(j) == i) {  i.setPrix(prix);ListeIngredient.set(j,i) ;}
		
		}
		System.out.println("\n\tL'ingredient apres modification : \n\t\t----------"+i.toString());
    }

    
    public void SupprimerIngredient(Ingredient x) { 
		 if (this.RechercherIngredient(x) == false) {
	 
		System.out.println("\nL'ingredient n'existe pas!!");}
		else{
		ListeIngredient.remove(x);	
		System.out.println("-Ingredient supprimé  : " + x.toString());
			}
    }
    
}
