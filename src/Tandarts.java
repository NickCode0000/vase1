public class Tandarts extends Patient {


    public Tandarts(int id, String voornaam, String achternaam, int day, int month, int year, int gewicht, int lengte, medicatie medicatie, int dose) {
        super(id, voornaam, achternaam, day, month, year, gewicht, lengte, medicatie, dose);
    }


    void printGegevens(Patient patient) {
        super.printGegevens(Patient patient);

    }
}