import java.util.Scanner;


/**
 * class Administration represents the core of the application by showing
 * the main menu, from where all other functionality is accessible, either
 * directly or via sub-menus.
 * An Administration instance needs a User as input, which is passed via the
 * constructor to the data member 'Nick'.
 * The patient data is available via the data member currentPatient.
 */
class Administration {

    String geidentificeerd = "U bent succesvol geïdentificeerd als een: ";
    String gegvam = "\nHierbij de gegevens van: ";



    Persoon Lisa = new Persoon(71, "Lisa", "Jansen", 12, 11, 1994, 65, 170, medicatie.paracetamol);
    Persoon Thomas = new Persoon(14, "Thomas", "De Vries", 5, 6, 1988, 80, 185, medicatie.aspirine);
    Persoon Sophia = new Persoon(32, "Sophia", "Peters", 21, 4, 1981, 70, 160, medicatie.statines);
    Persoon Amir = new Persoon(19, "Amir", "Khan", 8, 12, 1998, 75, 175, medicatie.lisinopril);
    Persoon Elena = new Persoon(10, "Elena", "Petrov", 15, 4, 1992, 60, 165, medicatie.metformine);






    void terugknop(int beroep){

        Scanner editeScan = new Scanner(System.in);
        String terugknop;

        System.out.print("\nDruk op enter om een andere gebruiker te selecteren:");
        terugknop = editeScan.nextLine();
        System.out.print(" ");
        if (terugknop.isEmpty()) {
            if (beroep == 1){fysiotherapeut();}
            if (beroep == 2){huisarts();}
            if (beroep == 3){apotheker();}
            if (beroep == 4){tandarts();}
        }
    }

    void alleNamen() {
        Lisa.volnaam();
        Thomas.volnaam();
        Sophia.volnaam();
        Amir.volnaam();
        Elena.volnaam();
    }
    void Vraagblock(){
        System.out.println("Van welke patient zou u de gewenste gegevens willen inzien?\n");
        alleNamen();
        System.out.print("\nVoer hier de id in: ");
    }

    void menu() {

        var scanner = new Scanner(System.in);  // User input via this scanner.
        String answer1 = "";

        System.out.println("\nWat is uw expertise?:\n");
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
    void apotheker() {
        Scanner Aposcan = new Scanner(System.in);
        String Apoantwoordt = "";
        System.out.println(geidentificeerd+"apotheker\n");
        Vraagblock();
        Apoantwoordt = Aposcan.nextLine();

        switch (Apoantwoordt) {
            case "71" -> {
                System.out.println(gegvam+"Lisa\n");
                Lisa.gegevens();
                Persoon.editeData(Lisa);
                terugknop(3);
            }
            case "14" -> {
                System.out.println(gegvam+"Thomas\n");
                Thomas.gegevens();
                Persoon.editeData(Thomas);
                terugknop(3);
            }
            case "32" -> {
                System.out.println(gegvam+"Sophia\n");
                Sophia.gegevens();
                Persoon.editeData(Sophia);
                terugknop(3);
            }
            case "19" -> {
                System.out.println(gegvam+"Amir\n");
                Amir.gegevens();
                Persoon.editeData(Amir);
                terugknop(3);
            }
            case "10" -> {
                System.out.println(gegvam+"Elena\n");
                Elena.gegevens();
                Persoon.editeData(Elena);
                terugknop(3);
            }
        }
    }

    void fysiotherapeut() {

        Scanner Fscan = new Scanner(System.in);
        String Fantwoordt = "";

        System.out.println(geidentificeerd+"fysiotherapeut\n");
        Vraagblock();
        Fantwoordt = Fscan.nextLine();

        switch (Fantwoordt) {
            case "71" -> {
                System.out.println(gegvam+"Lisa\n");
                Lisa.gegevens();
                Persoon.editeData(Lisa);
                terugknop(1);
            }
            case "14" -> {
                System.out.println(gegvam+"Thomas\n");
                Thomas.gegevens();
                Persoon.editeData(Thomas);
                terugknop(1);

            }
            case "32" -> {
                System.out.println(gegvam+"Sophia\n");
                Sophia.gegevens();
                Persoon.editeData(Sophia);
                terugknop(1);
            }
            case "19" -> {
                System.out.println(gegvam+"Amir\n");
                Amir.gegevens();
                Persoon.editeData(Amir);
                terugknop(1);
            }
            case "10" -> {
                System.out.println(gegvam+"Elena\n");
                Elena.gegevens();
                Persoon.editeData(Elena);
                terugknop(1);
            }
        }
    }


    void huisarts() {

        Scanner huisscan = new Scanner(System.in);
        String huisantwoordt = "";

        System.out.println(geidentificeerd+"huisarts\n");
        Vraagblock();
        huisantwoordt = huisscan.nextLine();


        switch (huisantwoordt) {
            case "71" -> {
                System.out.println(gegvam+"Lisa\n");
                Lisa.gegevens();
                Persoon.editeData(Lisa);
                terugknop(2);
            }
            case "14" -> {
                System.out.println(gegvam+"Thomas\n");
                Thomas.gegevens();
                Persoon.editeData(Thomas);
                terugknop(2);
            }
            case "32" -> {
                System.out.println(gegvam+"Sophia\n");
                Sophia.gegevens();
                Persoon.editeData(Sophia);
                terugknop(2);
            }
            case "19" -> {
                System.out.println(gegvam+"Amir\n");
                Amir.gegevens();
                Persoon.editeData(Amir);
                terugknop(2);
            }
            case "10" -> {
                System.out.println(gegvam+"Elena\n");
                Elena.gegevens();
                Persoon.editeData(Elena);
                terugknop(2);
            }
        }
    }

    void tandarts() {
        Scanner Tscan = new Scanner(System.in);
        String Tantwoordt = "";

        System.out.println(geidentificeerd+"tandarts\n");
        Vraagblock();
        Tantwoordt = Tscan.nextLine();


        switch (Tantwoordt) {
            case "71"  -> {
                System.out.println(gegvam+"Lisa\n");
                Lisa.gegevens();
                Persoon.editeData(Lisa);
                terugknop(4);
            }
            case "14" -> {
                System.out.println(gegvam+"Thomas\n");
                Thomas.gegevens();
                Persoon.editeData(Thomas);
                terugknop(4);
            }
            case "32" -> {
                System.out.println(gegvam+"Sophia\n");
                Sophia.gegevens();
                Persoon.editeData(Sophia);
                terugknop(4);
            }
            case "19" -> {
                System.out.println(gegvam+"Amir\n");
                Amir.gegevens();
                Persoon.editeData(Amir);
                terugknop(4);
            }
            case "10" -> {
                System.out.println(gegvam+"Elena\n");
                Elena.gegevens();
                Persoon.editeData(Elena);
                terugknop(4);
            }
        }
    }
}



/*
        boolean nextCycle = true;
        while (nextCycle) {
            System.out.format("%s\n", "=".repeat(80));
            System.out.format("Pierre van Puffelen: %s\n", currentPatient.fullName());
            System.out.format("Kees van der Spek: %s\n", currentPatient2.fullName());
            System.out.format("Jakop Jager: %s\n", currentPatient3.fullName());

            /*
             Print menu on screen
            *



            System.out.format("%d:  STOP\n", STOP);
            System.out.format("%d:  View patient data\n", VIEW);
            System.out.print("enter #choice: ");
            int choice = scanner.nextInt();



            switch (choice) {
                case STOP: // interrupt the loop
                    nextCycle = false;
                    break;

                case VIEW:
                    currentPatient.viewData();
                    currentPatient2.viewData();
                    currentPatient3.viewData();
                    break;

                default:
                    System.out.println("Please enter a *valid* digit");
                    break;
            }
        }
    }
}
*/