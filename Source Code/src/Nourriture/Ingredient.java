package Nourriture;

public class Ingredient {
	enum Unit�Mesure {kg,g,l}
	
	private String nom;
    private int quantit�;
    private Unit�Mesure unit�Mesure;
    private double prix;
    private int quantit�stock� ;
	public Ingredient(String nom,int quantit�,int qttstock�,String unit�, double prix) {
		this.nom = nom;
		this.quantit� = quantit�;
		this.quantit�stock�=qttstock� ;
		this.prix = prix;
		this.unit�Mesure = Unit�Mesure.valueOf(unit�);
    }
	
	public String getNom() {return this.nom;}
	public void setNome ( String nom) {this.nom = nom;}
	public int getQuantit�() {return this.quantit�;}
	public void setQuantit�(int quantit�) {this.quantit� = quantit�;}
	public int getQuantit�stock�() {return this.quantit�stock� ;}
	public void setQuantit�stock�(int qtt) {this.quantit�stock�=qtt ;}
	public double getPrix() {return this.prix;}
	public void setPrix(double prix) {this.prix = prix;}
	public Unit�Mesure getUnit�() {return this.unit�Mesure;}
	public void setUnit�(String unit�) {this.unit�Mesure = Unit�Mesure.valueOf(unit�);}
	
	public String toString() {
		return ("\nInfos sur l'ingredient : \n\t---------\nNom : "+this.nom+"\nQuantit� : "+this.quantit�+
				"\nUnit� de mesure : "+this.unit�Mesure+
				"\nPrix : "+this.prix+"\nQuantit� Stock� : "+this.quantit�stock�);
	}
	
	public void Afficher () {
		System.out.println(this.toString());
	}


}
