package Nourriture;

import Enum.Specialit�P;

public class Plat extends Produit {
	
	
    private Specialit�P specialit�;
	
	
	public Plat(int reference, String designation, String conditionement, String nature,FicheTech fiche, String specialit�) {
		super(reference, designation,conditionement,nature,fiche);
		// TODO Auto-generated constructor stub
		this.specialit� = Specialit�P.valueOf(specialit�);
	}
 
	public Plat() {
		super();
		this.specialit� = Specialit�P.RIEN;
	}
	
	public Specialit�P getSpecialit�() {return this.specialit�;}
	public void setSpecialit�(String sp�cialit�) {this.specialit� = Specialit�P.valueOf(sp�cialit�);}
	
	public String toString() {
		return ("\nInfos sur le plat : \n"+super.ToString()+ "\nSpecialit� : "+this.specialit�);
	}
	
	public void Afficher () {
		System.out.println(this.toString());
	}

}
