

public class Fysiotherapeut extends Hulpverleners {

    public Fysiotherapeut(Patient huidigPatient) {
        super(huidigPatient);
    }

    public void printPatientGegevens() {

        printGegevens(); // algemene info
        fysioSpecafiek(); // info alleen voor huisart
    }

    public void fysioSpecafiek() {

    // Aanvullende print specifiek voor deze hulpverlener
    System.out.printf("%-15s %.1f kg/m²\n","BMI:", huidigPatient.gewicht /((huidigPatient.lengte /100)*(huidigPatient.lengte /100)));
    System.out.printf("%-15s %.0f kg\n","gewicht:", huidigPatient.gewicht);
    System.out.printf("%-15s %.0f cm\n","Lengte:", huidigPatient.lengte);
    }
}

