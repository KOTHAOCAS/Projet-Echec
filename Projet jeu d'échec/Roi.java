public class Roi extends Piece{
	
	public Roi(){
		super();
	}
	
	public Roi(int coul, int rang, char col)
	{
		if(coul == 1){
			couleur=1;
		    colonne=col;
		    rangee=rang;
		    nom="R";
		    unicode="\u2654";
		}
		else{
			couleur=0;
			colonne=col;
			rangee=rang;
			nom="R";
			unicode="\u265a";
		}
	}
	public boolean seDeplacerN(Case tab[][], int j, int i){

		return true;
	}
	public boolean seDeplacerB(Case tab[][], int j, int i, int k, int l){
		
	return false;
	}

}
