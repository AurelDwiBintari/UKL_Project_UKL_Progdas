import java.util.Scanner;

public class deteksinegatif {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Masukkan jumlah elemen array: ");
        int elemenarray = s.nextInt(); 
        int[] array = new int[elemenarray];

        System.out.println("Masukan elemen array : ");
        for (int i = 0; i < elemenarray; i++) {
            array[i] = s.nextInt();
        }

        boolean adaNegatif = false;
        System.out.println("Elemen Array mengandung negatif : ");
        for (int num : array) {
            if (num < 0) {
                adaNegatif = true;
                System.out.println(num + " ");
            }
        }

        if (!adaNegatif) {
            System.out.println("Elemen Array tidak mengangdung negatif : ");
        }

    }
}
