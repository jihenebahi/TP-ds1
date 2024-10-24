package ds1;


public class Pepiniere {
	private Plante inventaire[];
	final private int max=1000;
	private int nombreplante;
	public Pepiniere()
	{
		inventaire=new Plante[max];
	}
	public void ajoutPlante(Plante plante)
	{
		if(nombreplante<max)
		{
			inventaire[nombreplante]=plante;
			nombreplante++;
		}
		else
		{
			System.out.println("errure d'ajout");
		}
	}
	public void afficherInventaire()
	{
		int i;
		for(i=0;i<nombreplante;i++)
		{
			inventaire[i].description();
			if(inventaire[i] instanceof Fleur)
			{
				((Fleur)inventaire[i]).fleurir();
			}
		}
	}
	public double totalAbsorptionTotaleCO2()
	{
		int i;
		double tot=0;
		for(i=0;i<nombreplante;i++)
		{
			if(inventaire[i] instanceof Arbre)
			{
				tot=tot+ ((Arbre)inventaire[i]).absorptionco2();
			}
		}
		return tot;
	} 
	public int compterArbresCaduques()
	{
		int i;
		int nb=0;
		for(i=0;i<nombreplante;i++)
		{
			if(inventaire[i] instanceof Arbre)
			{
				if(((Arbre)inventaire[i]).getTypefeuillage().equalsIgnoreCase("caduque"))
				{
					nb=nb+1;
				}

			}
		}
		return nb;
	}
}
