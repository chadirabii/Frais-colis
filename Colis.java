import java.util.*;

public class Colis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Entrer le poid de votre colis : ");
        double poid = sc.nextDouble();

        if (poid < 2) {
            double frais = 2500;
            System.out.print("Le frais est egale a : " + frais);
        } else {
            double poid2 = poid - 2;
            double x = 2500;
            double frais = (poid2 * 1250) + x;
            System.out.print("Le frais est egale a : " + frais);
        }
        sc.close();
    }
}