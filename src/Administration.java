import java.util.Scanner;

class Administration {


    String geidentificeerd = "\nU bent succesvol geïdentificeerd als een: ";
    static String gegvam = "\nHierbij de gegevens van: ";

    static Patient huidigPatient;

    Patient Lisa = new Patient(71, "Lisa", "Jansen", 12, 11, 1994, 65, 170, medicatie.paracetamol, 150);
    Patient Thomas = new Patient(14, "Thomas", "De Vries", 5, 6, 1988, 80, 185, medicatie.aspirine, 100);
    Patient Sophia = new Patient(32, "Sophia", "Peters", 21, 4, 1981, 70, 160, medicatie.statines, 200);
    Patient Amir = new Patient(19, "Amir", "Khan", 8, 12, 1998, 75, 175, medicatie.lisinopril, 500);
    Patient Elena = new Patient(10, "Elena", "Petrov", 15, 4, 1992, 60, 165, medicatie.metformine, 250);


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
        String answer1;
        String answer2;

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
            default -> {System.out.println("Onjuist invoer (mogelijk gebruikt u een hooftletter) druk op enter om opnieuw te proberen: ");
                answer2 = scanner.nextLine();
                if (answer2.isEmpty()) {
                    menu();}
            }
        }
    }

    void fysiotherapeut() {
        patientSelect("Fysiotherapeut");
        Fysiotherapeut fysiotherapeut = new Fysiotherapeut(huidigPatient);

        printGegevensEdite(huidigPatient);
        fysiotherapeut.printPatientGegevens();
        printGegevens(huidigPatient, 1, "Fysiotherapeut");
    }

    void huisarts() {

        patientSelect("Huisarts");
        Huisarts huisarts = new Huisarts(huidigPatient); // omdat huisarts niet static is en niet kan worden moet je het op deze manier aanpakken

        printGegevensEdite(huidigPatient);
        huisarts.printPatientGegevens();
        printGegevens(huidigPatient, 2, "Huisarts");
    }

    void apotheker() {
        patientSelect("Apotheker");
        Apotheker apotheker = new Apotheker(huidigPatient);

        printGegevensEdite(huidigPatient);
        apotheker.printPatientGegevens();
        printGegevens(huidigPatient, 3, "Apotheker");

    }

    void tandarts() {
        patientSelect("Tandarts");
        Tandarts tandarts = new Tandarts(huidigPatient);

        printGegevensEdite(Administration.huidigPatient);
        tandarts.printPatientGegevens();
        printGegevens(huidigPatient, 4, "Tandarts");
    }

    void patientSelect(String functie) {

        Scanner Fscan = new Scanner(System.in);
        String antwoordt;

        verwijderScherm();
        System.out.println(geidentificeerd + functie);
        Vraagblock();
        antwoordt = Fscan.nextLine();

        switch (antwoordt) {
            case "71" -> huidigPatient = Lisa;
            case "14" -> huidigPatient = Thomas;
            case "32" -> huidigPatient = Sophia;
            case "19" -> huidigPatient = Amir;
            case "10" -> huidigPatient = Elena;

        }

    }


    public void printGegevensEdite(Patient huidigPatient) {

        verwijderScherm();
        System.out.println(gegvam + huidigPatient.voornaam);

    }
    public void printGegevens(Patient huidigPatient, int knop, String huidigZorgverlener) {

        Patient.PatientEditor.editeData(huidigPatient, huidigZorgverlener);
        terugknop(knop);
    }
     static void bmiStatus() {

        verwijderScherm();
        double bmi;
        bmi = huidigPatient.gewicht / ((huidigPatient.lengte / 100)*(huidigPatient.lengte / 100));

        if (bmi < 18.5)
        {System.out.println("U heeft ondergewicht:\n");}

        else if (bmi > 18.5 && bmi < 24.9)
        {System.out.println("U heeft een gezond gewicht:\n");}

        else if (bmi > 25.0 && bmi < 29.9)
        {System.out.println("U heeft overgewicht:\n");}

        else if (bmi > 30)
        {System.out.println("U heeft obesitas:\n");}

        Grafiek.gr(bmi);

    }
}
