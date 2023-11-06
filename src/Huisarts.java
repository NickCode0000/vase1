public class Huisarts extends Patient {


    public Huisarts(int id, String voornaam, String achternaam, int day, int month, int year, int gewicht, int lengte, medicatie medicatie, int dose) {
        super(id, voornaam, achternaam, day, month, year, gewicht, lengte, medicatie, dose);
    }

    void printGegevens() {
        super.printGegevens();

        System.out.printf("%-15s %s %d mg\n", "medicatie:", this.medicatie, this.dose);
        System.out.printf("%-15s %.1f kg/m²\n", "BMI:", this.gewicht / ((this.lengte / 100) * (this.lengte / 100)));
        System.out.printf("%-15s %.0f kg\n", "gewicht:", this.gewicht);
        System.out.printf("%-15s %.0f cm\n", "Lengte:", this.lengte);
    }
}