package Lab2.Challenge1;

import Lab2.Challenge1.BoxingMatch;
import Lab2.Challenge1.Fighter;

public class Main {
    public static void main(String[] args ){
        Fighter f1 = new Fighter( "First", 100,200);
        Fighter f2 = new Fighter( "Second", 120,15);
        BoxingMatch boxingMatch = new BoxingMatch( f1, f2);
        System.out.println("Result = " + boxingMatch.fight());
        System.out.println(f1);
        System.out.println(f2);
        System.out.println("NumberofFighters = " + Fighter.getNumberofFighters());
    }
}
