package Divers;

import java.util.Random;

public class DetailCommande {
    private int dur�eLivraison;
    Random rd = new Random();
    private int prixLivraison = rd.nextInt(800) + 100;
    private String adrLivraison;
    
    
    
    
    public int getDureeLivraison() {return this.dur�eLivraison;}
    public void setDureeLivraison(int l) {this.dur�eLivraison = l;}
    public double getPrixLivraison() {return this.prixLivraison;}
    public void setPrixLivraison(int l) {this.prixLivraison = l;}
    public String getAdrLivraison() {return this.adrLivraison;}
    public void setAdrLivraison(String a ) {this.adrLivraison = a;}
    
    
    
    


}
