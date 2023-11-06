

public class Huisarts extends Hulpverleners {

    public Huisarts(Patient huidigPatient) {
        super(huidigPatient);
    }

    public void printPatientGegevens() {

        printGegevens(); // algemene info
        huisartSpecafiek(); // info alleen voor huisart
    }

    public void huisartSpecafiek() {

    // Aanvullende print specifiek voor de huisarts
    System.out.printf("%-15s %s %d mg\n","medicatie:", huidigPatient.medicatie, huidigPatient.dose);
    System.out.printf("%-15s %.1f kg/m²\n","BMI:", huidigPatient.gewicht /((huidigPatient.lengte /100)*(huidigPatient.lengte /100)));
    System.out.printf("%-15s %.0f kg\n","gewicht:", huidigPatient.gewicht);
    System.out.printf("%-15s %.0f cm\n","Lengte:", huidigPatient.lengte);
    }
}

