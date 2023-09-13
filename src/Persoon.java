import java.time.LocalDate;

public class Persoon {
  //static final int RETURN      = 0;
  // static final int VOORNAAM     = 1;
  // static final int ACHTERNAAM   = 2;
//static final int DATEOFBIRTH = 3;

   int       id;
   String    voornaam;
   String    achternaam;
   //LocalDate dateOfBirth;

    /**
     * Constructor
     */

     public Persoon(int id, String voornaam, String achternaam) {
        this.id = id;
        this.voornaam = voornaam;
        this.achternaam = achternaam;
        //this.dateOfBirth = dateOfBirth;
    }

void gegevens() {
    System.out.println("Naam is:\t\t" + this.voornaam);
    System.out.println("Achternaam is:\t\t" + this.achternaam);
    //System.out.println("Achternaam is:\t" + this.dateOfBirth);
}


void volnaam(){
    System.out.println(this.id +" "+ this.voornaam +" "+ this.achternaam);
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
