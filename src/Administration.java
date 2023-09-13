import java.time.LocalDate;
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


    Persoon pierre= new Persoon(1, "Pierre", "van Puffelen");
    Persoon kees= new Persoon(2, "Kees", "van der Spek");
    Persoon jakop= new Persoon(3, "Jager", "Jakop");


    void allenamen(){
        pierre.volnaam();
        kees.volnaam();
        jakop.volnaam();
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


    if (huisantwoordt.equals("1")){
        pierre.gegevens();
    }


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
            System.out.println("u bent succesvol geïdentificeerd als een: fysiotherapeut");
        }
        if (answer1.equals("b")) {
            huisarts();
        }
        if (answer1.equals("c")) {
            System.out.println("u bent succesvol geïdentificeerd als een: Apotheker");
        }
        if (answer1.equals("d")) {
            System.out.println("u bent succesvol geïdentificeerd als een: Tandarts");
        }

    }}


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