public class Dame extends Piece{
	
	public Dame(){
		super();
	}
	
	public Dame(int coul, int rang, char col)
	{
		if(coul == 1){
			couleur=1;
		    colonne=col;
		    rangee=rang;
		    nom="D";
		    unicode="\u2655";
		}
		else{
			couleur=0;
			colonne=col;
			rangee=rang;
			nom="D";
			unicode="\u265b";
		}
	}
	public boolean seDeplacerN(Case tab[][], int j, int i){

		return true;
	}
	public boolean seDeplacerB(Case tab[][], int j, int i, int k, int l){
		
	return false;
	}

}
