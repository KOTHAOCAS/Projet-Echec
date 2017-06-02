public class Fou extends Piece {
	
	public Fou(){
		super();
	}

	public Fou(int coul, int rang, char col)
	{
		if(coul == 1){
			couleur=1;
		    colonne=col;
		    rangee=rang;
		    nom="F";
		    unicode="\u2657";
		}
		else{
			couleur=0;
			colonne=col;
			rangee=rang;
			nom="F";
			unicode="\u265d";
		}
	}
	public boolean seDeplacer(Case tab[][], int j, int i){

		return true;
	}
}
