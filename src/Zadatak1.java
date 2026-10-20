import java.util.Scanner;

public class Zadatak1 {

        public static boolean DaLiJeProst (int n){
            if (n < 2) {
                return false;
            }
            for (int i=2;i*i <=n; i++){
                if (n % i == 0){
                    return false;
                }
            }
            return true;
        }

        public static void main (String[] args) {
            Scanner sc = new Scanner(System.in);
            int n;

            while (true) {
                System.out.print ("Unesi broj n: ");
                n = sc.nextInt();

                if (n < 2){
                    System.out.println ("Nije moguce izvrsiti izracunavanje prostih brojeva.");
                    sc.close();
                    return;
                }
                if (n > 500){
                    System.out.println ("Uneseni broj je prevelik!");

                }else{
                    break;
                }
            }
            System.out.println ("Prosti brojevi izmedju 2 i " + (2 * n) + ":");
            for (int i = 2; i <= 2 * n; i++ ){
                if (DaLiJeProst(i)){
                    System.out.print(i + " ");
                }
            }
            sc.close();
        }
    }

