package ds1;

public class Arbre extends Plante{
	private String typefeuillage;
	final private double absormoyenne=22.00;
	public String getTypefeuillage() {
		return typefeuillage;
	}
	public void setTypefeuillage(String typefeuillage) {
		this.typefeuillage = typefeuillage;
	}
	public double getAbsorMoyenne() {
		return absormoyenne;
	}
	public Arbre(String nom, double hauteur,int age, double prix,double absormoyenne,String typefeuillage)
	{
		super(nom,hauteur,age,prix);
		this.typefeuillage=typefeuillage;
	}
	@Override
	public String toString() {
		return "Arbre [typefeuillage=" + typefeuillage + ", absorMoyenne=" + absormoyenne + "]";
	}
	public void description()
	{
		System.out.println("c'est une arbra");
		System.out.println(super.toString());
		System.out.println(this);
	}
	public double absorptionco2()
	{
		if(hauteur>50)
		{
			return absormoyenne+3;
		}
		else
		{
			return absormoyenne;
		}
		
	}
	
	
	

}
