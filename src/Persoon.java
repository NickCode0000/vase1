import java.time.LocalDate;
import java.time.Period;

public class Persoon {

    //static final int RETURN      = 0;
    // static final int VOORNAAM     = 1;
    // static final int ACHTERNAAM   = 2;
//static final int DATEOFBIRTH = 3;

    int id;
    String voornaam;
    String achternaam;
    //int        age;
    LocalDate dateOfBirth;
    int gewicht;
    int lengte;
    LocalDate today = LocalDate.now();
    int berekenleeftijd;


    /**
     * public void setVoornaam(String voornaam) {
     * this.voornaam = voornaam;
     * }
     * <p>
     * public void setAchternaam(String achternaam) {
     * this.achternaam = achternaam;
     * }
     * <p>
     * public void setDateOfBirth(LocalDate dateOfBirth) {
     * this.dateOfBirth = dateOfBirth;
     * }
     * <p>
     * public void setGewicht(int gewicht) {
     * this.gewicht = gewicht;
     * }
     * <p>
     * public void setLengte(int lengte) {
     * this.lengte = lengte;
     * }
     * <p>
     * /**
     * Constructor
     */

    public Persoon(int id, String voornaam, String achternaam, int day, int month, int year, int gewicht, int lengte) {
        this.id = id;
        this.voornaam = voornaam;
        this.achternaam = achternaam;
        this.dateOfBirth = LocalDate.of(year, month, day);
        this.gewicht = gewicht;
        this.lengte = lengte;
    }

    void berekenleeftijd() {
        System.out.println("Leeftijd\t\t" + Period.between(this.dateOfBirth, today).getYears() + " jaar");
    }

    void bmiberekenen() {
        System.out.println("BMI:\t\t\t" + this.gewicht / (this.lengte / 100));
    }

    void gegevens() {
        System.out.println("id:\t\t\t\t" + this.id);
        System.out.println("Naam:\t\t\t" + this.voornaam);
        System.out.println("Achternaam:\t\t" + this.achternaam);
        System.out.println("Geboortedatum:\t" + this.dateOfBirth);
        this.berekenleeftijd();
        System.out.println("gewicht:\t\t" + this.gewicht + " kg");
        System.out.println("Lengte:\t\t\t" + this.lengte + " cm");
    }

    void gegevenshuisarts() {

    }


    void volnaam() {
        System.out.println(this.id + ":\t" + this.voornaam + " " + this.achternaam);
    }


//    String getvoornaam() {
    //       return voornaam;
    //   }
    //   String getachternaam() {
//return achternaam;
    //  }

    /**
     * Display patient data.
     */
    // void viewData() {
    // System.out.format("===== Patient id=%d ==============================\n", id);
    // System.out.format("%-17s %s\n", "Surname:", voornaam);
    // System.out.format("%-17s %s\n", "firstName:", achternaam);
    //  System.out.format("%-17s %s\n", "Date of birth:", dateOfBirth);
    // }

    /**
     * Shorthand for a Patient's full name
     */
    String fullName() {
        return String.format("%s %s [%s]", voornaam, achternaam);
    }


    //   public static void main(String[] args){
    //      ArrayList persoon = new ArrayList();
    //     persoon.add(persoon1.fullName());
    //     persoon.add("BMW");
    //     persoon.add("Ford");
    //     persoon.add("Mazda");
    //     System.out.println(persoon);
    // }

    public void editData(String newName, String newAchternaam) {
        this.voornaam = newName;
        this.achternaam = newAchternaam;
        
    }

}

