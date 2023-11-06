import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Patient {


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

    public Patient(int id, String voornaam, String achternaam, int day, int month, int year, int gewicht, int lengte, medicatie medicatie, int dose) {
        this.id = id;
        this.voornaam = voornaam;
        this.achternaam = achternaam;
        this.dateOfBirth = LocalDate.of(year, month, day);
        this.gewicht = gewicht;
        this.lengte = lengte;
        this.medicatie = medicatie;
        this.dose = dose;
    }

    void berekenleeftijd() {
        System.out.println("Leeftijd\t\t" + Period.between(this.dateOfBirth, today).getYears() + " jaar");
    }

    void bmiberekenen() {System.out.println("BMI:\t\t\t" + this.gewicht / (this.lengte / 100) + " kg/m²");}

    void printGegevens() {
        System.out.printf("%-15s %d\n",         "id:", id);
        System.out.printf("%-15s %s\n",         "Naam:", voornaam);
        System.out.printf("%-15s %s\n",         "Achternaam:", achternaam);
        System.out.printf("%-15s %b\n",         "Geboortedatum:", dateOfBirth);
        System.out.printf("%-15s %d jaar\n",    "Leeftijd", Period.between(dateOfBirth, today).getYears());

    }

    void gegevenshuisarts() {

    }

    void volnaam() {
        System.out.println(this.id + ":\t" + this.voornaam + " " + this.achternaam);
    }

    String fullName() {
        return String.format("%s %s", voornaam, achternaam);
    }

    public void editeName(String newVoornaam) {
        this.voornaam = newVoornaam;
    }

    public void editeAchternaam(String newAchternaam) {
        this.achternaam = newAchternaam;
    }

    public void editeDateOfBirth(int newYear, int newMonth, int newDay) {
        this.dateOfBirth = LocalDate.of(newYear, newMonth, newDay);
    }

    public void editeGewicht(int newGewicht) {
        this.gewicht = newGewicht;
    }

    public void editeLengte(int newLengte) {
        this.lengte = newLengte;
    }


    public class PatientEditor {

        public static void editeData(Patient huidigPatient) {
            Scanner editeScan = new Scanner(System.in);
            String scanwordt;

            System.out.println("\nWelke gegevens wilt u zien of aanpassen?");
            System.out.println("[1: Naam] [2: Achternaam] [3: Geboortedatum] [4: Gewicht] [5: Lengte] [6: show BMI grafiek]");
            System.out.print("Vul hier uw antwoord in: ");
            scanwordt = editeScan.nextLine();

            switch (scanwordt) {
                case "1" -> editeNaam(huidigPatient);
                case "2" -> editeAchternaam(huidigPatient);
                case "3" -> editeGeboortedatum(huidigPatient);
                case "4" -> editeGewicht(huidigPatient);
                case "5" -> editeLengte(huidigPatient);
                case "6" -> Administration.bmiStatus();
                default -> System.out.println("Ongeldige keuze.");
            }

        }

        private static void editeNaam(Patient huidigPatient) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("\nVul hier de nieuwe naam in: ");
            String nieuweNaam = scanner.nextLine();

            huidigPatient.editeName(nieuweNaam);

            System.out.println("Naam is succesvol veranderd naar: " + nieuweNaam);
            printNieuweGegevens(huidigPatient);
        }

        private static void editeAchternaam(Patient huidigPatient) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("\nVul hier de nieuwe achternaam in: ");
            String nieuweAchternaam = scanner.nextLine();

            huidigPatient.editeAchternaam(nieuweAchternaam);

            System.out.println("Achternaam is succesvol veranderd naar: " + nieuweAchternaam);
            printNieuweGegevens(huidigPatient);
        }

        private static void editeGeboortedatum(Patient huidigPatient) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("\nVul hier het nieuwe geboortejaar in: ");
            int jaar = scanner.nextInt();

            System.out.print("Vul hier de nieuwe geboortemaand in: ");
            int maand = scanner.nextInt();

            System.out.print("Vul hier de nieuwe geboortedag in: ");
            int dag = scanner.nextInt();

            huidigPatient.editeDateOfBirth(jaar, maand, dag);

            System.out.printf("Geboortedatum is succesvol veranderd naar: %d/%d/%d%n", jaar, maand, dag);
            printNieuweGegevens(huidigPatient);
        }

        private static void editeGewicht(Patient huidigPatient) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("\nVul hier het nieuwe gewicht in: ");
            int nieuwGewicht = scanner.nextInt();

            huidigPatient.editeGewicht(nieuwGewicht);

            System.out.println("Gewicht is succesvol veranderd naar: " + nieuwGewicht);
            printNieuweGegevens(huidigPatient);
        }

        private static void editeLengte(Patient huidigPatient) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("\nVul hier de nieuwe lengte in: ");
            int nieuweLengte = scanner.nextInt();

            huidigPatient.editeLengte(nieuweLengte);

            System.out.println("Lengte is succesvol veranderd naar: " + nieuweLengte);
            printNieuweGegevens(huidigPatient);
        }

        private static void printNieuweGegevens(Patient huidigPatient) {
            Administration.verwijderScherm();
            System.out.println("Hier komen de nieuwe gegevens:\n");
            huidigPatient.printGegevens();

        }
    }
}
