public class Pion extends Piece{
	public Pion(){
		super();
	}
	
	public Pion(int coul, int rang, char col)
	{
		if(coul == 1){
			couleur=1;
		    colonne=col;
		    rangee=rang;
		    nom="P";
		    unicode="\u2659";
		    PTour=0;
		}
		else{
			couleur=0;
			colonne=col;
			rangee=rang;
			nom="P";
			unicode="\u265f";
			PTour=0;
		}
	}
	
	public boolean seDeplacerN(Case tabP[][], int j, int i, int k, int l){
		
		if(tabP[k][l].p==tabP[j+1][i].p){
			return true;
		}
		else if(tabP[k][l].p==tabP[j+2][i].p){
			return true;
		}
	return false;
	}
	
	public boolean seDeplacerB(Case tabP[][], int j, int i, int k, int l){
		
		if(tabP[k][l].p==tabP[j-1][i].p)
			return true;
		else if(tabP[k][l].p==tabP[j-2][i].p)
			return true;
		
	return false;
	}

}
