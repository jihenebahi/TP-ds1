package ds1;

public class Test {
	public static void main(String[] args) {
			System.out.println("Pépinière GREEN HANDS");
			Pepiniere pepiniere= new Pepiniere();
			Fleur rose = new Fleur (null, 30, 12, 15.99, "Rouge",2);
			Fleur tulipe = new Fleur ("Tulipe", 20, 8, 12.99, "Jaune", 4);
			Arbre chêne = new Arbre( "Chêne", 200, 60,15.00, 89.99, "Caduque");
			Arbre sapin = new Arbre("Sapin", 150, 30, 24.10,59.99, "Persistant");
			rose.setNom ("Rose");
			System.out.println("la"+rose.getNom()+ "a le couleur "+rose.getCouleur());
			pepiniere.ajoutPlante(rose);
			pepiniere.ajoutPlante(tulipe);
			pepiniere.ajoutPlante(chêne);
			pepiniere. ajoutPlante(sapin);
			pepiniere.afficherInventaire();
			System.out.println("Total Aborption CO2 : " + pepiniere.totalAbsorptionTotaleCO2());
			System.out.println("Nombre d'arbres Caduques dans la pépinière : " + pepiniere.compterArbresCaduques());
	}

}
