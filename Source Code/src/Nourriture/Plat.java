package Nourriture;

import Enum.SpecialitéP;

public class Plat extends Produit {
	
	
    private SpecialitéP specialité;
	
	
	public Plat(int reference, String designation, String conditionement, String nature,FicheTech fiche, String specialité) {
		super(reference, designation,conditionement,nature,fiche);
		// TODO Auto-generated constructor stub
		this.specialité = SpecialitéP.valueOf(specialité);
	}
 
	public Plat() {
		super();
		this.specialité = SpecialitéP.RIEN;
	}
	
	public SpecialitéP getSpecialité() {return this.specialité;}
	public void setSpecialité(String spécialité) {this.specialité = SpecialitéP.valueOf(spécialité);}
	
	public String toString() {
		return ("\nInfos sur le plat : \n"+super.ToString()+ "\nSpecialité : "+this.specialité);
	}
	
	public void Afficher () {
		System.out.println(this.toString());
	}

}
