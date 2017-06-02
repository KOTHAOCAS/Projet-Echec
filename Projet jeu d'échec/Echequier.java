import java.util.Scanner; 
public class Echequier{


   private Case[][] tabP=new Case[8][8];//Declaration de tableau de piece a remplir plus tard
   private TabCase o = new TabCase();//Variable pour recuperer le tableau de piece contenu dans "Case"
   private Piece t1 =new Piece();//Variable utile pour echanger des cases dans le tableau de piece
   private int x;//Variable pour garder en memoire la ligne du premier bouton clique
   private int y;//Variable pour garder en memoire la colonne du premier bouton clique
   private int b;//Variable pour garder en memoire la ligne du deuxieme bouton clique
   private int e;//Variable pour garder en memoire la colonne du deuxieme bouton clique
   private boolean mange;//Variable pour savoir si la piece est mangeable
   private int tourJoueur = 0;//Variable pour alterner joueur noir et joueur blanc
   private String message = "Bienvenu!";
   private boolean depRoi;
   private int finPartie=1;
   
 
 /*---------------------Constructeur Echequier------------------------*/	  
     public Echequier(){
    	 tabP=o.initCases();
		this.Principal();
	  }
     
/*----------------------Fonction realiser l'affichage----------------*/  
	  

	  public void affiche(){

	    for(int j=0;j<8;j++){	//Parcourir le tableau    	
	    	for(int i=0;i<8;i++){
	    		System.out.print(tabP[j][i].nom + " ");	    	
	    	} 
	    	System.out.print("\n");
	    }
	  }

	  public void Principal(){
		 while(finPartie!=0){
		  this.affiche();//Initialiser l'echequier
		  @SuppressWarnings("resource")
		  Scanner sc = new Scanner(System.in);
		  System.out.println("Veuillez saisir des coordonnés :");
		  String str = sc.nextLine();
		  char l1 = str.charAt(0); 
		  char c1 = str.charAt(1);
		  char l2 = str.charAt(3);
		  char c2 = str.charAt(4);
		  
		  int il1 = Character.getNumericValue(l1) ; 
		  int il2 = Character.getNumericValue(l2) ; 
		  int ic1 = Character.getNumericValue(c1) ; 
		  int ic2 = Character.getNumericValue(c2) ; 
		  il1 = il1 - 10;
		  il2 = il2 - 10;
		  System.out.println("Vous avez saisi les coordonnees : " + il1 + 
		  ic1 + " " + il2 + ic2);	
		 
		  if(tabP[il1][ic1].nom == "P" ){
			  if(tabP[il1][ic1].p.couleur == 1){
				  if(tabP[il1][ic1].p.seDeplacerB(tabP,il1,ic1,il2,ic2)== true){
					  tabP[il2][ic2] = new Case(tabP[il1][ic1].p);
					  tabP[il1][ic1]=new Case();
					  System.out.println("BLANC:");
				  }
			  }
			  else if(tabP[il1][ic1].p.couleur == 0){
				  if(tabP[il1][ic1].p.seDeplacerN(tabP,il1,ic1,il2,ic2)== true){
					  tabP[il2][ic2] = new Case(tabP[il1][ic1].p); 
					  tabP[il1][ic1]=new Case();
					  System.out.println("NOIR:");
				  }
			  }			  
		  }
		 	  
		 }	

	  }

	  
/*-----------------------Execution du programme---------------------*/	  
	  public static void main (String[] args){
			new Echequier();
	  }		
}

