

public class Apotheker extends Hulpverleners {

    public Apotheker(Patient huidigPatient) {
        super(huidigPatient);
    }

    public void printPatientGegevens() {

        printGegevens(); // algemene info
        apothekerSpecafiek(); // info alleen voor huisart
    }

    public void apothekerSpecafiek() {

    // Aanvullende print specifiek voor deze hulpverlener
    System.out.printf("%-15s %s %d mg\n","medicatie:", huidigPatient.medicatie, huidigPatient.dose);
    System.out.printf("%-15s %.1f kg/m²\n","BMI:", huidigPatient.gewicht /((huidigPatient.lengte /100)*(huidigPatient.lengte /100)));
    System.out.printf("%-15s %.0f kg\n","gewicht:", huidigPatient.gewicht);
    System.out.printf("%-15s %.0f cm\n","Lengte:", huidigPatient.lengte);
    }
}

