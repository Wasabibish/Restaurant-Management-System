package Nourriture;

import Enum.Conditionement;
import Enum.Nature;

public abstract class Produit {
	//variables
	protected int reference;
	protected String designation; 
	protected Conditionement conditionement;
	protected Nature nature;
	protected double prix ;
	protected FicheTech fiche;
	protected int nbrCommandeProduit ;
	protected int nbrFois;
	
	
	
	
	public Produit (int reference, String designation, String conditionement, String nature,  FicheTech fiche) {
        this.reference = reference;
        this.designation = designation.trim();
        this.conditionement = Conditionement.valueOf(conditionement);
        this.nature = Nature.valueOf(nature);
        double A=0 ;
        for(int i=0;i<fiche.ListeIngredient.size();i++)
        {
            A=A+fiche.ListeIngredient.get(i).getPrix() ;
        }
        this.prix=A ;
        this.fiche = fiche;
        this.nbrCommandeProduit= 0 ; 


        }
	public Produit () {
		this.reference = 0;
		this.designation = "";
		this.conditionement = Conditionement.RIEN;
		this.nature = Nature.valueOf("RIEN");
		this.prix = 00.0;
		this.fiche=null;
		this.nbrCommandeProduit= 0 ;
	}
	
	
	
	
	// setters et getters
	
	public int getReference() {return this.reference;}
	public void setReference(int reference) {this.reference = reference;}
	public String getDesignation() {return this.designation;}
	public void setDesignation(String designation) {this.designation = designation.trim();}
	public Conditionement getConditionement() {return this.conditionement;}
	public void setConditionement(String conditionement) {this.conditionement = Conditionement.valueOf(conditionement);}
	public Nature getNature() {return this.nature;}
	public void setNature(String nature) {this.nature = Nature.valueOf(nature);}
	public double getPrix() {return this.prix;}
	public void setPrix(double prix) {this.prix = prix;}
	public FicheTech getFiche() {return this.fiche;}
	public void setFiche(FicheTech fiche) {this.fiche = fiche;}
	public int getNbrFois() {return this.nbrFois;}
	public void setNbrFois(int nbr) {this.nbrFois = nbr;}
    
	
	public String ToString () {
		return ("Reference : " +this.reference + "\nNom : "  +this.designation +"\nConditionement : "+
	this.conditionement+ "\nNature : "+this.nature+ "\nPrix :"+this.prix+"DA");
				
	}
	public void Afficher() {
		System.out.println(this.ToString());}
		

	

}
