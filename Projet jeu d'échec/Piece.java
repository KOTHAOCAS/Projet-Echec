 public class Piece{
	protected int couleur;
	protected char colonne;
	protected int rangee;
	protected String nom;
	protected String unicode;
	protected int PTour;
	
	public Piece()
	{
	}
	public Piece(int coul, char col, int rang, String nm, String unic){
		this.setCouleur(coul);
		this.setColonne(col);
		this.setRangee(rang);
		this.setNom(nm);
		this.setUnicode(unic);
	}
	public boolean seDeplacerB(Case tab[][], int j, int i, int k, int l){
		return true;
	}
	public boolean seDeplacerN(Case tab[][], int j, int i, int k, int l){
		System.out.println("coucou");
		return true;
	}
	public String getUnicode(){
		return this.unicode;
	}

	public void setUnicode(String unic){
		this.unicode = unic;
	}
	public String getNom(){
		return this.nom;
	}
	public void setNom(String nom){
		this.nom=nom;
	}
	public int getCouleur(){
		return this.couleur;
	}
	public void setCouleur(int coul){
		this.couleur=coul;
	}
	public char getColonne(){
		return this.colonne;
	}
	public void setColonne(char col){
		this.colonne = col;
	}	
	public int getRangee(){
		return this.rangee;
	}	
	public void setRangee(int rang){
		this.rangee = rang;
	}
	
}
