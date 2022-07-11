package Nourriture;

public class Ingredient {
	enum UnitéMesure {kg,g,l}
	
	private String nom;
    private int quantité;
    private UnitéMesure unitéMesure;
    private double prix;
    private int quantitéstocké ;
	public Ingredient(String nom,int quantité,int qttstocké,String unité, double prix) {
		this.nom = nom;
		this.quantité = quantité;
		this.quantitéstocké=qttstocké ;
		this.prix = prix;
		this.unitéMesure = UnitéMesure.valueOf(unité);
    }
	
	public String getNom() {return this.nom;}
	public void setNome ( String nom) {this.nom = nom;}
	public int getQuantité() {return this.quantité;}
	public void setQuantité(int quantité) {this.quantité = quantité;}
	public int getQuantitéstocké() {return this.quantitéstocké ;}
	public void setQuantitéstocké(int qtt) {this.quantitéstocké=qtt ;}
	public double getPrix() {return this.prix;}
	public void setPrix(double prix) {this.prix = prix;}
	public UnitéMesure getUnité() {return this.unitéMesure;}
	public void setUnité(String unité) {this.unitéMesure = UnitéMesure.valueOf(unité);}
	
	public String toString() {
		return ("\nInfos sur l'ingredient : \n\t---------\nNom : "+this.nom+"\nQuantité : "+this.quantité+
				"\nUnité de mesure : "+this.unitéMesure+
				"\nPrix : "+this.prix+"\nQuantité Stocké : "+this.quantitéstocké);
	}
	
	public void Afficher () {
		System.out.println(this.toString());
	}


}
