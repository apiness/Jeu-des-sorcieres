
public class Test {
	public static void main(String[] args){
		Piece[] tab = new Piece[]{ new Piece(2,4,8,1), new Piece(4,2,1,6), new Piece(2,3,7,1),
                new Piece(7,8,3,4),new Piece(6,7,3,1),new Piece(5,7,3,1),
                new Piece(1,2,3,4),new Piece(5,6,7,8),new Piece(8,7,6,5)};
		
		PlateauJeu p = new PlateauJeu(tab);
		//p.afficher();
		//System.out.println("-----------------------------");
		Solveur solution = new Solveur(p);
		solution.resoudre();
        p.afficher();
	}
}
