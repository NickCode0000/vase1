import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Persoon {


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

    public Persoon(int id, String voornaam, String achternaam, int day, int month, int year, int gewicht, int lengte, medicatie medicatie,int dose) {
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

    void gegevens() {
        System.out.printf("%-15s %d\n",         "id:", id);
        System.out.printf("%-15s %s\n",         "Naam:", voornaam);
        System.out.printf("%-15s %s\n",         "Achternaam:", achternaam);
        System.out.printf("%-15s %b\n",         "Geboortedatum:", dateOfBirth);
        System.out.printf("%-15s %d jaar\n",    "Leeftijd", Period.between(dateOfBirth, today).getYears());
        System.out.printf("%-15s %s %d mg\n",         "medicatie:", medicatie, dose);
        System.out.printf("%-15s %.1f kg/m²\n", "BMI:", gewicht / (lengte / 100));
        System.out.printf("%-15s %.0f kg\n",    "gewicht:", gewicht);
        System.out.printf("%-15s %.0f cm\n",    "Lengte:", lengte);
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


    public class PersoonEditor {

        public static void editeData(Persoon momenteelpersoon) {
            Scanner editeScan = new Scanner(System.in);
            String scanwordt;

            System.out.println("\nWelke gegevens wilt u aanpassen?");
            System.out.println("[1: Naam] [2: Achternaam] [3: Geboortedatum] [4: Gewicht] [5: Lengte]");
            System.out.print("Vul hier uw antwoord in: ");
            scanwordt = editeScan.nextLine();

            switch (scanwordt) {
                case "1":
                    editeNaam(momenteelpersoon);
                    break;
                case "2":
                    editeAchternaam(momenteelpersoon);
                    break;
                case "3":
                    editeGeboortedatum(momenteelpersoon);
                    break;
                case "4":
                    editeGewicht(momenteelpersoon);
                    break;
                case "5":
                    editeLengte(momenteelpersoon);
                    break;
                default:
                    System.out.println("Ongeldige keuze.");
            }
        }

        private static void editeNaam(Persoon momenteelpersoon) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("\nVul hier de nieuwe naam in: ");
            String nieuweNaam = scanner.nextLine();
            momenteelpersoon.editeName(nieuweNaam);
            System.out.println("Naam is succesvol veranderd naar: " + nieuweNaam);
            Administration.verwijderScherm();
            printNieuweGegevens(momenteelpersoon);
        }

        private static void editeAchternaam(Persoon momenteelpersoon) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("\nVul hier de nieuwe achternaam in: ");
            String nieuweAchternaam = scanner.nextLine();
            momenteelpersoon.editeAchternaam(nieuweAchternaam);
            System.out.println("Achternaam is succesvol veranderd naar: " + nieuweAchternaam);
            Administration.verwijderScherm();
            printNieuweGegevens(momenteelpersoon);
        }

        private static void editeGeboortedatum(Persoon momenteelpersoon) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("\nVul hier het nieuwe geboortejaar in: ");
            int jaar = scanner.nextInt();
            System.out.print("Vul hier de nieuwe geboortemaand in: ");
            int maand = scanner.nextInt();
            System.out.print("Vul hier de nieuwe geboortedag in: ");
            int dag = scanner.nextInt();
            momenteelpersoon.editeDateOfBirth(jaar, maand, dag);
            System.out.printf("Geboortedatum is succesvol veranderd naar: %d/%d/%d%n", jaar, maand, dag);
            Administration.verwijderScherm();
            printNieuweGegevens(momenteelpersoon);
        }

        private static void editeGewicht(Persoon momenteelpersoon) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("\nVul hier het nieuwe gewicht in: ");
            int nieuwGewicht = scanner.nextInt();
            momenteelpersoon.editeGewicht(nieuwGewicht);
            System.out.println("Gewicht is succesvol veranderd naar: " + nieuwGewicht);
            Administration.verwijderScherm();
            printNieuweGegevens(momenteelpersoon);
        }

        private static void editeLengte(Persoon momenteelpersoon) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("\nVul hier de nieuwe lengte in: ");
            int nieuweLengte = scanner.nextInt();
            momenteelpersoon.editeLengte(nieuweLengte);
            System.out.println("Lengte is succesvol veranderd naar: " + nieuweLengte);
            Administration.verwijderScherm();
            printNieuweGegevens(momenteelpersoon);
        }

        private static void printNieuweGegevens(Persoon momenteelpersoon) {
            System.out.println("Hier komen de nieuwe gegevens:\n");
            momenteelpersoon.gegevens();
        }
    }
}
