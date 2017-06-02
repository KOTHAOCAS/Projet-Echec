public class Case{
	Piece p;
	String nom;
	public Case(Piece p){
		this.p = p;
		this.nom = p.nom;
	}
	public Case(){
		this.nom = " ";
	}
}