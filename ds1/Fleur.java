package ds1;

public class Fleur extends Plante {
	private String couleur;
	private int moisF;
	public Fleur(String nom, double hauteur,int age, double prix,String couleur,int moisF)
	{
		super(nom,hauteur,age,prix);
		this.couleur=couleur;
		this.moisF=moisF;
	}
	@Override
	public String toString() {
		return "Fleur [couleur=" + couleur + ", moisF=" + moisF + "]";
	}
	public void description()
	{
		System.out.println("c'est un fleur");
		System.out.println(super.toString());
		System.out.println(this);
	}
	public String getCouleur() {
		return couleur;
	}
	public void setCouleur(String couleur) {
		this.couleur = couleur;
	}
	public int getMoisF() {
		return moisF;
	}
	public void setMoisF(int moisF) {
		this.moisF = moisF;
	}
	void fleurir()
	{
		if(moisF>=4 && moisF <=6)
		{
			System.out.println("la fleur est fleurs");
		}
		else
		{
			System.out.println("la fleur est non fleurs");
		}
	}
	

}
