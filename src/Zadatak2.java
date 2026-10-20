import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Zadatak2 {
    public static Double plus (Double broj1, Double broj2){
        return broj1 + broj2;
    }

    public static Double podijeljeno (Double broj1, Double broj2) throws  Exception{
        if (broj2 == 0){
            throw new Exception("Nije dozvoljeno dijeljenje sa nulom!");
        }
        return broj1/broj2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Double> brojevi = new ArrayList<Double>();

        System.out.println ("Unesite operaciju ('plus' za sabiranje, 'podijeljeno' za dijeljenje): ");
        String operacija = sc.nextLine();
        System.out.println("Unesite brojeve i -400 za kraj unosa: ");
        while (true) {
            double broj = sc.nextDouble();
            if (broj == -400){
                break;
            }
            brojevi.add(broj);
        }

        Double rezultat = brojevi.get(0);
        try{
            for (int i = 1; i < brojevi.size(); i++){
                if (operacija.equals("plus")){
                    rezultat = plus (rezultat, brojevi.get(i));
                }else if (operacija.equals("podijeljeno")){
                    rezultat = podijeljeno (rezultat, brojevi.get(i));
                }
            }
            System.out.println("Konacan rezultat: " + rezultat);
        }catch (Exception e){
            System.out.println (e.getMessage());
        }
        sc.close();
    }
}