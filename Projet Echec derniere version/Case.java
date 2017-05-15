public class Case{
	
	public Case(){
	}
	public Piece[][] getCase(){
				
		  		Piece tabP[][];
		  		tabP = new Piece[8][8];
			
				tabP[0][0] = new Tour(1,0,'A');
				tabP[0][1] = new Cavalier(1,0,'B');
				tabP[0][2] = new Fou(1,0,'C');
				tabP[0][3] = new Dame(1,0,'D');
				tabP[0][4] = new Roi(1,0,'E');
				tabP[0][5] = new Fou(1,0,'F');
				tabP[0][6] = new Cavalier(1,0,'G');
				tabP[0][7] = new Tour(1,0,'H');
				
				tabP[1][0] = new Pion(1,1,'A');
				tabP[1][1] = new Pion(1,1,'B');
				tabP[1][2] = new Pion(1,1,'C');
				tabP[1][3] = new Pion(1,1,'D');
				tabP[1][4] = new Pion(1,1,'E');
				tabP[1][5] = new Pion(1,1,'F');
				tabP[1][6] = new Pion(1,1,'G');
				tabP[1][7] = new Pion(1,1,'H');
				
				for (int j=2; j<6; j++){
					for(int i=0; i<8;i++){
						tabP[j][i]= new CaseVide(1,1,'E');
					}
				}

				
				tabP[6][0] = new Pion(0,1,'A');
				tabP[6][1] = new Pion(0,1,'B');
				tabP[6][2] = new Pion(0,1,'C');
				tabP[6][3] = new Pion(0,1,'D');
				tabP[6][4] = new Pion(0,1,'E');
				tabP[6][5] = new Pion(0,1,'F');
				tabP[6][6] = new Pion(0,1,'G');
				tabP[6][7] = new Pion(0,1,'H');
				
				tabP[7][0] = new Tour(0,0,'A');
				tabP[7][1] = new Cavalier(0,0,'B');
				tabP[7][2] = new Fou(0,0,'C');
				tabP[7][3] = new Dame(0,0,'D');
				tabP[7][4] = new Roi(0,0,'E');
				tabP[7][5] = new Fou(0,0,'F');
				tabP[7][6] = new Cavalier(0,0,'G');
				tabP[7][7] = new Tour(0,0,'H');

			return tabP;
	  }
}