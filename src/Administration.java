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

    String geidentificeerd = "U bent succesvol geïdentificeerd als een: ";


    Persoon Lisa = new Persoon(71, "Lisa", "Jansen", 12, 11, 1994, 65, 170);
    Persoon Thomas = new Persoon(14, "Thomas", "De Vries", 5, 6, 1988, 80, 185);
    Persoon Sophia = new Persoon(32, "Sophia", "Peters", 21, 4, 1981, 70, 160);
    Persoon Amir = new Persoon(19, "Amir", "Khan", 8, 12, 1998, 75, 175);
    Persoon Elena = new Persoon(10, "Elena", "Petrov", 15, 4, 1992, 60, 165);



    void setters() {
        String nieweNaam = "jan";
        Lisa.setVoornaam(nieweNaam);
    }
    void allenamen() {
        Lisa.volnaam();
        Thomas.volnaam();
        Sophia.volnaam();
        Amir.volnaam();
        Elena.volnaam();
    }
    void Vraagblock(){
        System.out.println("Van welke patient zou u de gewenste gegevens willen inzien?\n");
        allenamen();
        System.out.print("\nVoer hier de id in: ");
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
        System.out.println(geidentificeerd+"Apotheker\n");
        Vraagblock();
        Apoantwoordt = Aposcan.nextLine();

        switch (Apoantwoordt) {
            case "71" -> {
                System.out.println("\nHierbij de gegevens van Lisa\n");
                Lisa.gegevens();
            }
            case "14" -> {
                System.out.println("\nHierbij de gegevens van Thomas\n");
                Thomas.gegevens();
            }
            case "32" -> {
                System.out.println("\nHierbij de gegevens van Sophia\n");
                Sophia.gegevens();
            }
            case "19" -> {
                System.out.println("\nHierbij de gegevens van Amir\n");
                Amir.gegevens();
            }
            case "10" -> {
                System.out.println("\nHierbij de gegevens van Elena\n");
                Elena.gegevens();
            }
        }
    }

    void fysiotherapeut() {

        Scanner Fscan = new Scanner(System.in);
        String Fantwoordt = "";

        System.out.println(geidentificeerd+"fysiotherapeut\n");
        System.out.println(" ");
        System.out.println("Van welke patient zou u de gewenste gegevens willen inzien?");
        System.out.println(" ");
        allenamen();
        System.out.println(" ");
        System.out.print("Voer hier de id in: ");
        Fantwoordt = Fscan.nextLine();

        switch (Fantwoordt) {
            case "71" -> {
                System.out.println("\nHierbij de gegevens van Lisa\n");
                Lisa.gegevens();
            }
            case "14" -> {
                System.out.println("\nHierbij de gegevens van Thomas\n");
                Thomas.gegevens();
            }
            case "32" -> {
                System.out.println("\nHierbij de gegevens van Sophia\n");
                Sophia.gegevens();
            }
            case "19" -> {
                System.out.println("\nHierbij de gegevens van Amir\n");
                Amir.gegevens();
            }
            case "10" -> {
                System.out.println("\nHierbij de gegevens van Elena\n");
                Elena.gegevens();
            }
        }
    }


    void huisarts() {

        Scanner huisscan = new Scanner(System.in);
        String huisantwoordt = "";

        System.out.println(geidentificeerd+"huisarts\n");
        System.out.println("Van welke patient zou u de gewenste gegevens willen inzien?");
        System.out.println(" ");
        allenamen();
        System.out.println(" ");
        System.out.print("Voer hier de id in: ");
        huisantwoordt = huisscan.nextLine();


        switch (huisantwoordt) {
            case "71" -> {
                System.out.println("\nHierbij de gegevens van Lisa\n");
                Lisa.gegevens();
            }
            case "14" -> {
                System.out.println("\nHierbij de gegevens van Thomas\n");
                Thomas.gegevens();
            }
            case "32" -> {
                System.out.println("\nHierbij de gegevens van Sophia\n");
                Sophia.gegevens();
            }
            case "19" -> {
                System.out.println("\nHierbij de gegevens van Amir\n");
                Amir.gegevens();
            }
            case "10" -> {
                System.out.println("\nHierbij de gegevens van Elena\n");
                Elena.gegevens();
            }
        }
    }

    void tandarts() {
        Scanner Tscan = new Scanner(System.in);
        String Tantwoordt = "";

        System.out.println(geidentificeerd+"tandarts\n");
        System.out.println(" ");
        System.out.println("Van welke patient zou u de gewenste gegevens willen inzien?");
        System.out.println(" ");
        allenamen();
        System.out.println(" ");
        System.out.print("Voer hier de id in: ");
        Tantwoordt = Tscan.nextLine();


        switch (Tantwoordt) {
            case "71"  -> {
                System.out.println("\nHierbij de gegevens van Lisa\n");
                Lisa.gegevens();
            }
            case "14" -> {
                System.out.println("\nHierbij de gegevens van Thomas\n");
                Thomas.gegevens();
            }
            case "32" -> {
                System.out.println("\nHierbij de gegevens van Sophia\n");
                Sophia.gegevens();
            }
            case "19" -> {
                System.out.println("\nHierbij de gegevens van Amir\n");
                Amir.gegevens();
            }
            case "10" -> {
                System.out.println("\nHierbij de gegevens van Elena\n");
                Elena.gegevens();
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