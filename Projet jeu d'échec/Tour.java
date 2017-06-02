import java.awt.Color;

public class Tour extends Piece {
	
	public Tour(){
		super();
	}
	
	public Tour(int coul, int rang, char col)
	{
		if(coul == 1){
			couleur=1;
		    colonne=col;
		    rangee=rang;
		    nom="T";
		    unicode="\u2656";
		}
		else{
			couleur=0;
			colonne=col;
			rangee=rang;
			nom="T";
			unicode="\u265c";
		}
	}
	public boolean seDeplacer(Piece tab[][], int j, int i){
		
		for(int z=1;z<8;z++){//Parcourir toute les cases du dessus
				 if(j-z>=0){
					if(tab[j-z][i].getText()==" "){//Si les cases sont vides
						tab[j-z][i].setBackground(Color.green);//Les mettres en vert
					} 
					if(tab[j-z][i].getText()!=" "){//Si elles ne sont pas vide
						if(tabP[j-z][i].couleur == 1 && mange == false){//Si la case est blanche et que la premiere case
							tab[j-z][i].setBackground(Color.green);	    //clique est de couleur noir alors la case est mangeable
						}												//voir ligne 127 pour comprendre "mange"
						
						if(tabP[j-z][i].couleur == 0 && mange == true){//Si la case est noir et que la premiere case
							tab[j-z][i].setBackground(Color.green);	   //clique est de couleur blanche alors la case est mangeable
						}											   //voir ligne 127 pour comprendre "mange"
						break;
					}
				 }
				}
				for(int t=1;t<8;t++){//Meme principe pour les cases de droite
			  if(i+t<8){	
					if(tab[j][i+t].getText()==" "){
							tab[j][i+t].setBackground(Color.green);
					} 
					if(tab[j][i+t].getText()!=" "){
						if(tabP[j][i+t].couleur == 1 && mange == false){//
							tab[j][i+t].setBackground(Color.green);	
						}
						if(tabP[j][i+t].couleur == 0 && mange == true){
							tab[j][i+t].setBackground(Color.green);	
						}
						break;
					}
			  }	
				}
				
				for(int t=1;t<8;t++){//Meme principe pour les cases du dessous
				  if(j+t<8){	
					if(tab[j+t][i].getText()==" "){
							tab[j+t][i].setBackground(Color.green);
					} 
					if(tab[j+t][i].getText()!=" "){
					if(tabP[j+t][i].couleur == 0 && mange == true){
							tab[j+t][i].setBackground(Color.green);	
						}
					if(tabP[j+t][i].couleur == 1 && mange == false){
							tab[j+t][i].setBackground(Color.green);	
						}
						break;
					}
				  }	
			}
				for(int t=1;t<8;t++){//Meme principe pour les cases de gauche
				  if(i-t>=0){	
						if(tab[j][i-t].getText()==" "){
								tab[j][i-t].setBackground(Color.green);
						} 
						if(tab[j][i-t].getText()!=" "){
							if(tabP[j][i-t].couleur == 1 && mange == false){
								tab[j][i-t].setBackground(Color.green);	
							}
							if(tabP[j][i-t].couleur ==0 && mange == true){
								tab[j][i-t].setBackground(Color.green);	
							}       									
							break;
						}
				  }	
				}
				this.x=i;
			this.y=j;
			

		return true;
	}


}
