import java.sql.ClientInfoStatus;
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


    Persoon Lisa = new Persoon(71, "Lisa", "Jansen", 12, 11, 1994, 65, 170);
    Persoon Thomas = new Persoon(14, "Thomas", "De Vries", 5, 6, 1988, 80, 185);
    Persoon Sophia = new Persoon(32, "Sophia", "Peters", 21, 4, 1981, 70, 160);
    Persoon Amir = new Persoon(19, "Amir", "Khan", 8, 12, 1998, 75, 175);
    Persoon Elena = new Persoon(10, "Elena", "Petrov", 15, 4, 1992, 60, 165);


    void allenamen() {

        Lisa.volnaam();
        Thomas.volnaam();
        Sophia.volnaam();
        Amir.volnaam();
        Elena.volnaam();
    }


    void menu() {


        var scanner = new Scanner(System.in);  // User input via this scanner.
        String answer1 = "";


        System.out.println("Wat is uw expertise?: ");
        System.out.println("A: Fysio");
        System.out.println("B: Huisarts");
        System.out.println("C: Apotheker");
        System.out.println("D: Tandarts");
        System.out.println(" ");
        System.out.print("Voer hier uw keuzen in: ");
        //int expertise = scanner.nextInt();

        answer1 = scanner.nextLine();
        if (answer1.equals("a")) {
            fysiotherapeut();
        }
        if (answer1.equals("b")) {
            huisarts();
        }
        if (answer1.equals("c")) {
            Apotheker();
        }
        if (answer1.equals("d")) {
            Tandarts();
        }
    }


    void Apotheker() {
        Scanner Aposcan = new Scanner(System.in);
        String Apoantwoordt = "";

        System.out.println("U bent succesvol geïdentificeerd als een: Apotheker");
        System.out.println(" ");
        System.out.println("Van welke patient zou u de gewenste gegevens willen inzien?");
        System.out.println(" ");
        allenamen();
        System.out.println(" ");
        System.out.print("Voer hier de id in: ");
        Apoantwoordt = Aposcan.nextLine();


        if (Apoantwoordt.equals("71")) {
            System.out.println("\nHierbij de gegevens van Lisa\n");
            Lisa.gegevens();
        }
        if (Apoantwoordt.equals("14")) {
            System.out.println("\nHierbij de gegevens van Thomas\n");
            Thomas.gegevens();
        }
        if (Apoantwoordt.equals("32")) {
            System.out.println("\nHierbij de gegevens van Sophia\n");
            Sophia.gegevens();
        }
        if (Apoantwoordt.equals("19")) {
            System.out.println("\nHierbij de gegevens van Amir\n");
            Amir.gegevens();
        }
        if (Apoantwoordt.equals("10")) {
            System.out.println("\nHierbij de gegevens van Elena\n");
            Elena.gegevens();
        }
    }

    void fysiotherapeut() {
        System.out.println("u bent succesvol geïdentificeerd als een: fysiotherapeut");
        Scanner Fscan = new Scanner(System.in);
        String Fantwoordt = "";

        System.out.println("U bent succesvol geïdentificeerd als een: Huisarts");
        System.out.println(" ");
        System.out.println("Van welke patient zou u de gewenste gegevens willen inzien?");
        System.out.println(" ");
        allenamen();
        System.out.println(" ");
        System.out.print("Voer hier de id in: ");
        Fantwoordt = Fscan.nextLine();

        if (Fantwoordt.equals("71")) {
            System.out.println("\nHierbij de gegevens van Lisa\n");
            Lisa.gegevens();
        }
        if (Fantwoordt.equals("14")) {
            System.out.println("\nHierbij de gegevens van Thomas\n");
            Thomas.gegevens();
        }
        if (Fantwoordt.equals("32")) {
            System.out.println("\nHierbij de gegevens van Sophia\n");
            Sophia.gegevens();
        }
        if (Fantwoordt.equals("19")) {
            System.out.println("\nHierbij de gegevens van Amir\n");
            Amir.gegevens();
        }
        if (Fantwoordt.equals("10")) {
            System.out.println("\nHierbij de gegevens van Elena\n");
            Elena.gegevens();
        }
    }


    void huisarts() {

        Scanner huisscan = new Scanner(System.in);
        String huisantwoordt = "";

        System.out.println("U bent succesvol geïdentificeerd als een: Huisarts");
        System.out.println(" ");
        System.out.println("Van welke patient zou u de gewenste gegevens willen inzien?");
        System.out.println(" ");
        allenamen();
        System.out.println(" ");
        System.out.print("Voer hier de id in: ");
        huisantwoordt = huisscan.nextLine();


        if (huisantwoordt.equals("71")) {
            System.out.println("\nHierbij de gegevens van Lisa\n");
            Lisa.gegevens();
        }
        else if (huisantwoordt.equals("14")) {
            System.out.println("\nHierbij de gegevens van Thomas\n");
            Thomas.gegevens();
        }
        else if (huisantwoordt.equals("32")) {
            System.out.println("\nHierbij de gegevens van Sophia\n");
            Sophia.gegevens();
        }
        else if (huisantwoordt.equals("19")) {
            System.out.println("\nHierbij de gegevens van Amir\n");
            Amir.gegevens();
        }
        else if (huisantwoordt.equals("10")) {
            System.out.println("\nHierbij de gegevens van Elena\n");
            Elena.gegevens();
        }
    }

    void setters(){
        String nieweNaam = "jan";
        Lisa.setVoornaam(nieweNaam);
    }
    void Tandarts() {
        Scanner Tscan = new Scanner(System.in);
        String Tantwoordt = "";

        System.out.println("U bent succesvol geïdentificeerd als een: Tandarts");
        System.out.println(" ");
        System.out.println("Van welke patient zou u de gewenste gegevens willen inzien?");
        System.out.println(" ");
        allenamen();
        System.out.println(" ");
        System.out.print("Voer hier de id in: ");
        Tantwoordt = Tscan.nextLine();


        if (Tantwoordt.equals("71")) {
            System.out.println("\nHierbij de gegevens van Lisa\n");
            Lisa.gegevens();
        }
        if (Tantwoordt.equals("14")) {
            System.out.println("\nHierbij de gegevens van Thomas\n");
            Thomas.gegevens();
        }
        if (Tantwoordt.equals("32")) {
            System.out.println("\nHierbij de gegevens van Sophia\n");
            Sophia.gegevens();
        }
        if (Tantwoordt.equals("19")) {
            System.out.println("\nHierbij de gegevens van Amir\n");
            Amir.gegevens();
        }
        if (Tantwoordt.equals("10")) {
            System.out.println("\nHierbij de gegevens van Elena\n");
            Elena.gegevens();
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