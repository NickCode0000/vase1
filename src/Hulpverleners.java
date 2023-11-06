import java.time.LocalDate;
import java.time.Period;

public class Hulpverleners {

    protected Patient huidigPatient;

    int id;
    int berekenleeftijd;
    int dose;
    float gewicht;
    float lengte;
    String voornaam;
    String achternaam;
    LocalDate dateOfBirth;
    LocalDate today = LocalDate.now();
    medicatie medicatie;

    public Hulpverleners(Patient huidigPatient) {
        this.huidigPatient = huidigPatient;
    }

    void printGegevens() {
        System.out.printf("%-15s %d\n", "id:", huidigPatient.id);
        System.out.printf("%-15s %s\n", "Naam:", huidigPatient.voornaam);
        System.out.printf("%-15s %s\n", "Achternaam:", huidigPatient.achternaam);
        System.out.printf("%-15s %b\n", "Geboortedatum:", huidigPatient.dateOfBirth);
        System.out.printf("%-15s %d jaar\n", "Leeftijd", Period.between(huidigPatient.dateOfBirth, today).getYears());

    }
}



