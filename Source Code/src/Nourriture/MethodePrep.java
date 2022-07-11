package Nourriture;

public class MethodePrep {
	private String nomEtape;
    private int temps;
    private String description;

    public MethodePrep(String nom, int temps,String description) {
    	this.nomEtape = nom;
    	this.temps = temps;
    	this.description = description;
    }
    
    public String getNomEtape() {return this.nomEtape;}
    public void setNomEtape(String nom) {this.nomEtape = nom;}
    public String getDescription() {return this.description;}
    public void setDescription(String desc) {this.description = desc ;}
    public int getTemps() {return this.temps;}
    public void setTemps(int temps) {this.temps = temps;}
   
    public void Afficher(){
    	System.out.println("\nNom : "+this.nomEtape+"\nTemps : "+this.temps+"\nDescription : "+this.description);
    	
    }
    

}
