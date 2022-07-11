package Nourriture;
import Enum.TypeBoisson;
import java.util.Date;

public class Boisson extends Produit{
 

	
	private TypeBoisson type;
	
	public Date date;
	public Boisson(int reference, String designation, String conditionement, String nature,FicheTech fiche,String type) {
		super(reference, designation, conditionement, nature,fiche);
		this.type = TypeBoisson.valueOf(type);
	}
		
		public Boisson() {
			super();
			this.type=TypeBoisson.RIEN;
		}
		
		public TypeBoisson getTypeBoisson() {return this.type;}
		public void setTypeBoisson (String type) {this.type=TypeBoisson.valueOf(type);}
		
        public String toString() {
			return ("\nInfos sur la boisson : \n"+super.ToString()+ "\nType : "+this.type );
		}
		
		public void Afficher () {
			System.out.println(this.toString());
			
		}
		
		
		
		

}
  