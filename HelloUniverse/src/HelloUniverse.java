public class HelloUniverse {
    public static void main(String... args){
        int nbrePlaneteToday = 8;
        int nbrePlaneteAvant = 9;
        System.out.println("Aux dernières nouvelles, le nombre de planètes dans le système solaire est de" . nbrePlaneteToday);
        System.out.println("Il ya quelques années cependant, elles étaient au nombre de " . nbrePlaneteAvant);



        System.out.println("Hello Universe");




        //Il est obligatoire de typer une variable
        // tous les types ci-dessous sont dits primitifs car débutent par une minuscule


        // int peut contenir un entier de - 2 milliards etc à + 2 milliards (encodage maxi sur 32 bytes)
        int huitiemeHabitantsDansLeMonde;

        //byte permet de limiter l'encodage sur 8 bytes
        byte ageDuCapitaine;
        //short permet de limiter l'encodage à 16 bytes
        short paleolothiqueSuperieur;
        // long permet d'accueillir l'encodage sur 64 bytes
        long quartHabitantsDansLeMonde;

        //typé nombres à virgules
        float temperatureActuelle; //encodé sur 32 bytes
        double megaFloat; //sur 64 bytes

        //type booléen
        boolean vraiOuFaux;

        //variable de type caractère
        char initialePrenom;


        //variable de type long - le L en fin de valeur permet de dire à Java que ce nombre est bien un nombre (malgré sa taille)
        long milliSecondesDepuisle01_01_1970=160992061800L;

        //même chose pour signaler à Java que c'est bien un float
        float prixEssence=1.43f;
        //sinon l'initialiser en double

        // les char doivent se trouver entre simple quotes
        char initialPrenom='bob';

        //Exercice de niveau :
        int nbrePlaneteToday = 8;
        System.out.println("Aux dernières nouvelles, le nombre total de planètes dans le système solaire est de : " + nbrePlaneteToday);
        nbrePlaneteToday = 9;
        System.out.println("Il y a quelques années cependant, elles étaient au nombre de : " + nbrePlaneteToday);

    }
}
