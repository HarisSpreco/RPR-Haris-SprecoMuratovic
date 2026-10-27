import Izuzeci.PremladStudentException;
import Izuzeci.StudentBuducnostException;
import Klase.Odsjek;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Zadatak2 {

    void main() {
        Scanner scanner = new Scanner(System.in);
        boolean uspjesanUnos = false;
        Student student = null;

        while (!uspjesanUnos) {
            try {
                System.out.print("Datum rođenja (dd/mm/yyyy): ");
                String datumString = scanner.nextLine();

                int godina = Integer.valueOf(datumString.substring(6));
                int mjesec = Integer.valueOf(datumString.substring(3, 5));
                int dan = Integer.valueOf(datumString.substring(0, 2));

                LocalDate datumDate = LocalDate.of(godina, mjesec, dan);

                student = new Student(
                        "Ime", "Prezime", datumDate, "12345", Odsjek.RI, 2
                );

                uspjesanUnos = true;

            } catch (PremladStudentException e) {
                IO.println(e.getMessage());
                return;

            } catch (StudentBuducnostException e) {
                IO.println(e.getMessage());
                IO.println("Molimo ponovite unos datuma rođenja!");
            }
        }

        System.out.println("Unesite ocjene odvojene zarezom: ");
        String unosOcjena = scanner.nextLine();

        String[] nizOcjena = unosOcjena.split(",");
        List<Integer> ocjene = new ArrayList<>();

        for (String ocjena : nizOcjena) {
            ocjene.add(Integer.valueOf(ocjena.trim()));
        }

        student.setOcjene(ocjene);

        IO.println("Unos studenta uspješan! " + student);
    }

}
