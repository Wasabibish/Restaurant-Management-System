package Divers;

import java.util.Random;

public class DetailCommande {
    private int duréeLivraison;
    Random rd = new Random();
    private int prixLivraison = rd.nextInt(800) + 100;
    private String adrLivraison;
    
    
    
    
    public int getDureeLivraison() {return this.duréeLivraison;}
    public void setDureeLivraison(int l) {this.duréeLivraison = l;}
    public double getPrixLivraison() {return this.prixLivraison;}
    public void setPrixLivraison(int l) {this.prixLivraison = l;}
    public String getAdrLivraison() {return this.adrLivraison;}
    public void setAdrLivraison(String a ) {this.adrLivraison = a;}
    
    
    
    


}
