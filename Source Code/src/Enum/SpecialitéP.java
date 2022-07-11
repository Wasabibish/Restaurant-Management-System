package Enum;



public enum Specialit�P {

	traditionelle,	
	asiatique,
	orientale,
	occidentale,
	autre, RIEN;
	
	
	public static void afficher () {
		for (Specialit�P p : Specialit�P.values()) // parcourir les �l�ments de l��num�ration
			System.out.println (p.ordinal()+1 + "/"+p);
	}
	
	
	public String toString (Specialit�P p ) {
		String s="";
	switch (p.ordinal()) {
	case 0 : 
		 s="Traditionnelle";
		 break;
	case 1 :
		s="Asiatique";
		break;
	case 2 : 
		s = "Orientale";
		break;
	case 3 :
		s = "Occidentale";
		break;
	case 4 : 
		s="Autre";
		break;
	
	
	}return s;
		
		
	}
	
	public void Convert () {
		System.out.println(this.toString());
	}
		
}
