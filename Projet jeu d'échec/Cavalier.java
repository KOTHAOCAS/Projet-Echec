public class Cavalier extends Piece {
	
	public Cavalier(){
		super();
	}
	
	public Cavalier(int coul, int rang, char col)
	{
		if(coul == 1){
			couleur=1;
		    colonne=col;
		    rangee=rang;
		    nom="C";
		    unicode="\u2658";
		}
		else{
			couleur=0;
			colonne=col;
			rangee=rang;
			nom="C";
			unicode="\u265e";
		}			
	}
	public boolean seDeplacerN(Case tab[][], int j, int i){

		return true;
	}
	public boolean seDeplacerB(Case tab[][], int j, int i, int k, int l){
		
	return false;
	}
}
