import java.util.Scanner;

class Administration {


    String geidentificeerd = "\nU bent succesvol geïdentificeerd als een: ";
    static String gegvam = "\nHierbij de gegevens van: ";

    private Persoon huidigPersoon;

    Persoon Lisa = new Persoon(71, "Lisa", "Jansen", 12, 11, 1994, 65, 170, medicatie.paracetamol, 150);
    Persoon Thomas = new Persoon(14, "Thomas", "De Vries", 5, 6, 1988, 80, 185, medicatie.aspirine, 100);
    Persoon Sophia = new Persoon(32, "Sophia", "Peters", 21, 4, 1981, 70, 160, medicatie.statines, 200);
    Persoon Amir = new Persoon(19, "Amir", "Khan", 8, 12, 1998, 75, 175, medicatie.lisinopril, 500);
    Persoon Elena = new Persoon(10, "Elena", "Petrov", 15, 4, 1992, 60, 165, medicatie.metformine, 250);


    void terugknop(int beroep) {

        Scanner editeScan = new Scanner(System.in);
        String terugknop;

        System.out.print("\nDruk op enter om een andere gebruiker te selecteren:");
        terugknop = editeScan.nextLine();
        System.out.print(" ");
        if (terugknop.isEmpty()) {
            if (beroep == 1) {fysiotherapeut();}
            if (beroep == 2) {huisarts();}
            if (beroep == 3) {apotheker();}
            if (beroep == 4) {tandarts();}
        }
    }

    void alleNamen() {
        Lisa.volnaam();
        Thomas.volnaam();
        Sophia.volnaam();
        Amir.volnaam();
        Elena.volnaam();
    }

    void Vraagblock() {
        System.out.println("Van welke patient zou u de gewenste gegevens willen inzien?\n");
        alleNamen();
        System.out.print("\nVoer hier de id in: ");
    }
    public static void verwijderScherm(){
        System.out.println("\n".repeat(100));
        System.out.println("\n"+"=".repeat(250));
    }

    void menu() {

        var scanner = new Scanner(System.in);  // User input via this scanner.
        String answer1 = "";

        verwijderScherm();
        System.out.println("\n======================================");
        System.out.println(  "=====   Wat is uw expertise?:   ======");
        System.out.println(  "======================================\n");
        System.out.println("A: Fysio");
        System.out.println("B: Huisarts");
        System.out.println("C: Apotheker");
        System.out.println("D: Tandarts\n");
        System.out.print("Voer hier uw keuzen in: ");
        //int expertise = scanner.nextInt();

        answer1 = scanner.nextLine();
        switch (answer1) {
            case "a" -> fysiotherapeut();
            case "b" -> huisarts();
            case "c" -> apotheker();
            case "d" -> tandarts();
        }
    }

    void fysiotherapeut() {
        huidigepassent();
        printGegevensEdite(huidigPersoon, 1);
    }

    void huisarts() {
        huidigepassent();
        printGegevensEdite(huidigPersoon, 2);
    }

    void apotheker() {
        huidigepassent();
        printGegevensEdite(huidigPersoon, 3);
    }

    void tandarts() {
        huidigepassent();
        printGegevensEdite(huidigPersoon, 4);
    }

    void huidigepassent() {

        Scanner Fscan = new Scanner(System.in);
        String antwoordt = "";

        verwijderScherm();
        System.out.println(geidentificeerd + "fysiotherapeut\n");
        Vraagblock();
        antwoordt = Fscan.nextLine();

        switch (antwoordt) {
            case "71" -> huidigPersoon = Lisa;
            case "14" -> huidigPersoon = Thomas;
            case "32" -> huidigPersoon = Sophia;
            case "19" -> huidigPersoon = Amir;
            case "10" -> huidigPersoon = Elena;
        }

    }


    public void printGegevensEdite(Persoon momenteelpersoon, int knop) {

        verwijderScherm();
        System.out.println(gegvam + momenteelpersoon.voornaam);
        momenteelpersoon.gegevens();
        Persoon.PersoonEditor.editeData(momenteelpersoon);
        terugknop(knop);
    }
}