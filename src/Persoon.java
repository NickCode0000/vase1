import java.time.LocalDate;
import java.time.Period;

public class Persoon {
  //static final int RETURN      = 0;
  // static final int VOORNAAM     = 1;
  // static final int ACHTERNAAM   = 2;
//static final int DATEOFBIRTH = 3;

   int          id;
   String       voornaam;
   String       achternaam;
   //int        age;
   LocalDate    dateOfBirth;
   int          gewicht;
   int          lengte;
   //LocalDate today = LocalDate.now();
    //int berekendeleeftijd = Period.between(dateOfBirth, today).getYears();




    /**
     * Constructor
     */

     public Persoon(int id, String voornaam, String achternaam,int day,int month,int year, int gewicht, int lengte) {
        this.id = id;
        this.voornaam           = voornaam;
        this.achternaam         = achternaam;
        this.dateOfBirth        = LocalDate.of(year, month, day);
        this.gewicht            = gewicht;
        this.lengte             = lengte;
        //this.berekendeleeftijd  = berekendeleeftijd;


    }

void gegevens() {
    System.out.println("id:\t\t" + this.id);
    System.out.println("Naam:\t\t" + this.voornaam);
    System.out.println("Achternaam:\t\t" + this.achternaam);
    System.out.println("Geboortedatum:\t" + this.dateOfBirth);
    System.out.println("Weegt:\t" + this.gewicht+" kg");
    System.out.println("Lengte:\t" + this.lengte+" cm");
     }
    void gegevenshuisarts() {

    }




void volnaam(){
    System.out.println(this.id +":\t"+ this.voornaam +" "+ this.achternaam);
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
}
