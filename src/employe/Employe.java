package employe;

public class Employe {

	private final String nom;
	private final String adresse;
	
	public Employe(String nom, String adresse)
	{
		this.nom = nom;
		this.adresse = adresse;

	}
	
	public String getAll()
	{
		return nom + " " + adresse + " ";
	}
	
	public int CalculSalaire()
	{
		return 500;
	}
}