public class CaseVide extends Piece{
	
	public CaseVide(){
		super();
	}
	
	public CaseVide(int coul, int rang, char col)
	{
		if(coul == 1){
			couleur=1;
		    colonne=col;
		    rangee=rang;
		    nom=" ";
		    unicode=" ";
		}
		else{
			couleur=0;
			colonne=col;
			rangee=rang;
			nom=" ";
			unicode=" ";
		}
	}
	public boolean seDeplacerN(Piece tab[][], int j, int i){

		return true;
	}
	public boolean seDeplacerB(Piece tab[][], int j, int i, int k, int l){
		
	return false;
	}

}