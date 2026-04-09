import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        final Bike bike =new Bike();
        bike.zmieńPrzerzutkęWGore();
        Citizen citizen=new Citizen(9, "Mateusz", "Baścik");
        System.out.println(citizen.id);

        int[][] liczbyKupona= new int[3][6];
        int t=0;
        while (t!=3){
            System.out.println("tablica "+t);
            for (int j = 0; j < 6; j++) {
                System.out.println("wprowadź " + (j + 1) + " liczbe ");




                if (sc.hasNextInt()){
                    int liczba = sc.nextInt();


                    int i;
                    for (i = 0; i < j; i++) {
                        if (liczba == liczbyKupona[t][i]) {
                            System.out.println("liczba została podana");
                            j--;
                        }
                    }
                    if (liczba > 0 && liczba < 50) {
                        liczbyKupona[t][j] = liczba;


                    } else {
                        System.out.println("liczba spoza zakresu");
                        j--;
                    }

                }
                else {
                    j--;
                    System.out.println("Podany ciąg znaków nie jest liczbą");
                    sc.next();
                }

            }
            t++;
        }

        KuponTotolotka kuponTotolotka1=new KuponTotolotka(liczbyKupona[0][0],liczbyKupona[0][1],liczbyKupona[0][2],liczbyKupona[0][3],liczbyKupona[0][4],liczbyKupona[0][5]);
        KuponTotolotka kuponTotolotka2=new KuponTotolotka(liczbyKupona[1][0],liczbyKupona[1][1],liczbyKupona[1][2],liczbyKupona[1][3],liczbyKupona[1][4],liczbyKupona[1][5]);
        KuponTotolotka kuponTotolotka3=new KuponTotolotka(liczbyKupona[2][0],liczbyKupona[2][1],liczbyKupona[2][2],liczbyKupona[2][3],liczbyKupona[2][4],liczbyKupona[2][5]);
        KuponTotolotka[] tablice = {kuponTotolotka1, kuponTotolotka2, kuponTotolotka3};

        for (KuponTotolotka tablica : tablice) {
            for (KuponTotolotka kupon : tablice) {
                System.out.print(kupon.liczba1+"  ");
                System.out.print(kupon.liczba2+"  ");
                System.out.print(kupon.liczba3+"  ");
                System.out.print(kupon.liczba4+"  ");
                System.out.print(kupon.liczba5+"  ");
                System.out.print(kupon.liczba6);
            }
        }
    }
}
