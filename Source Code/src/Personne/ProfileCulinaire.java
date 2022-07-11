package Personne;

import java.util.ArrayList;
import java.util.List;

import Nourriture.Boisson;
import Nourriture.Plat;
import Nourriture.Produit;

public class ProfileCulinaire {
	public List <Plat> PlatFavoris = new ArrayList<Plat>();
	public List<Boisson> BoissonFavoris = new ArrayList<Boisson>();
	public List <Produit> Recommendations = new ArrayList<Produit>();
	
	public void AfficherRecommendation() {
		for (int i=0;i<=this.Recommendations.size();i++) {
			this.Recommendations.get(i).Afficher();
			
		}
	}

}
