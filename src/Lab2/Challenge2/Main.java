package Lab2.Challenge2;

public class Main {
    public static void main(String[] args) {
        //premii
        Premiu p1 = new Premiu("Oscar", 1990);
        Premiu p2 = new Premiu("Oscar", 1980);
        Premiu p3 = new Premiu("Oscar", 2009);
        Premiu p4 = new Premiu("Oscar", 2010);

        //actori
        Premiu[] listaP1 = new Premiu[2];
        listaP1[0] = p1;
        listaP1[1] = p2;
        Actor a1 = new Actor("actor cu 2 oscaruri", 35, listaP1);// ~
        Actor a2 = new Actor("actor cu 1 oscar", 20, new Premiu[]{p3});//the same
        Actor a3 = new Actor("actor cu 3 oscaruri", 20, new Premiu[]{p2, p3, p4});
        Actor a4= new Actor("actor fara premii", 20, new Premiu[]{});

        //filme
        Film f1= new Film(2000, "Film1", new Actor[] {a1,a2});
        Film f2= new Film(2004, "Film2", new Actor[] {a3,a4});
        Film f3= new Film(2006, "Film3", new Actor[] {a2,a3,a4});

        //studio
        Studio s1= new Studio("MGM", new Film[]{f1});
        Studio s2= new Studio("Disney", new Film[]{f1,f2});

        Studio[] stdioDatabase =new Studio[]{s1,s2};

        for(int i=0; i<stdioDatabase.length;i++)
            if(stdioDatabase[i].getNrfilme() > 1){
                System.out.println(stdioDatabase[i].getName());

        }

    }
    for(int i=0;i< stdioDatabase.length;i++){

        Film f=stdioDatabase[i].getFilmByActor("actor cu 2 oscaruri");
        if(f!=null){
            System.out.println(studioDatabase[i] + " contains actor " );
        }
    }


    }

}
