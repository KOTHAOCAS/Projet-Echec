
public class TabCase {
	public TabCase(){
		
	}
	public Case[][] initCases(){
		
  		Case tabC[][];
  		tabC = new Case[8][8];
	
		tabC[0][0] = new Case(new Tour(0,0,'A'));
		tabC[0][1] = new Case(new Cavalier(0,0,'B'));
		tabC[0][2] = new Case(new Fou(0,0,'C'));
		tabC[0][3] = new Case(new Dame(0,0,'D'));
		tabC[0][4] = new Case(new Roi(0,0,'E'));
		tabC[0][5] = new Case(new Fou(0,0,'F'));
		tabC[0][6] = new Case(new Cavalier(0,0,'G'));
		tabC[0][7] = new Case(new Tour(0,0,'H'));
		
		tabC[1][0] = new Case(new Pion(0,1,'A'));
		tabC[1][1] = new Case(new Pion(0,1,'B'));
		tabC[1][2] = new Case(new Pion(0,1,'C'));
		tabC[1][3] = new Case(new Pion(0,1,'D'));
		tabC[1][4] = new Case(new Pion(0,1,'E'));
		tabC[1][5] = new Case(new Pion(0,1,'F'));
		tabC[1][6] = new Case(new Pion(0,1,'G'));
		tabC[1][7] = new Case(new Pion(0,1,'H'));
		
		for (int j=2; j<6; j++){
			for(int i=0; i<8;i++){
				tabC[j][i]= new Case();
			}
		}

		
		tabC[6][0] = new Case(new Pion(1,1,'A'));
		tabC[6][1] = new Case(new Pion(1,1,'B'));
		tabC[6][2] = new Case(new Pion(1,1,'C'));
		tabC[6][3] = new Case(new Pion(1,1,'D'));
		tabC[6][4] = new Case(new Pion(1,1,'E'));
		tabC[6][5] = new Case(new Pion(1,1,'F'));
		tabC[6][6] = new Case(new Pion(1,1,'G'));
		tabC[6][7] = new Case(new Pion(1,1,'H'));
		
		tabC[7][0] = new Case(new Tour(1,0,'A'));
		tabC[7][1] = new Case(new Cavalier(1,0,'B'));
		tabC[7][2] = new Case(new Fou(1,0,'C'));
		tabC[7][3] = new Case(new Dame(1,0,'D'));
		tabC[7][4] = new Case(new Roi(1,0,'E'));
		tabC[7][5] = new Case(new Fou(1,0,'F'));
		tabC[7][6] = new Case(new Cavalier(1,0,'G'));
		tabC[7][7] = new Case(new Tour(1,0,'H'));

	return tabC;
}
}
