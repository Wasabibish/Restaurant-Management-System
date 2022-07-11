package Personne;

import java.util.Random;

public class Profile {

    private String pseudo;

  
    private String mdp;
    Random rd = new Random();
    private double solde = rd.nextInt(10000) + 100;
    private double bonus;

    
    public Profile(String pseudo,String motdepasse ) {
    	this.mdp=motdepasse ;
    	this.pseudo=pseudo ;
    	this.bonus=0 ;
    	
    }


    public void setPseudo(String pseudo) {this.pseudo=pseudo ;    }
    public void setMotDePasse(String mdp) {this.mdp=mdp ;    }
    public void setBonus(double bonus) {this.bonus=bonus ;    }
    public void setSolde(double solde) {this.solde = solde;}
    public String getPseudo() {return this.pseudo ;    }
    public String getMotDePasse() {return this.mdp ;    }
    public double gettBonus() {return this.bonus ;    }
    public double getSolde() {return this.solde;}
 
    
    

}
